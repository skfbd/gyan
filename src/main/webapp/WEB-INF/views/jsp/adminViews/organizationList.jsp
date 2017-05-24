<%@ include file="../common/includes.jsp"%>
<c:url var="urlOrgEdit" value="/admin/orgEdit.htm" />
<c:url var="urlOrgNew" value="/admin/orgNew.htm" />
<c:url var="urlOrgSave" value="/admin/saveOrg.htm" />
<c:url var="urlOrgList" value="/admin/getOrgs.htm" />
<c:url var="urlOrgDelete" value="/admin/deleteOrg.htm" />
<link media="screen" rel="stylesheet" href="<c:url value="/css/easyui/themes/bootstrap/easyui.css"/>" type="text/css"></link>
<script type="text/javascript" src="<c:url value="/easyui/datagrid-detailview.js"/>" /></script>
 
<div id="toolbar" style="padding:5px;">
  <div style="margin-bottom:5px">
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" id="newOrganisation">New Organisation</a> 
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" id="btnExport">Export to Excel</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" id="btnExport">Print</a>
  </div>
</div>
<table id="dg"  toolbar="#toolbar" >
	 
</table>

 <script>
   $("#btnExport").click(function(e){
	   window.open('data:application/vnd.ms-excel,' + $('#dg').html());
       e.preventDefault();
	   });
 
 function doSearch(){
	  
	    $('#dg').datagrid('load',{
	    	desig_Name: $('#desName').val(),
	    	moduleId: $('#cc1').combobox('getValue'),
	    	menuId:$('#cc2').combobox('getValue')
	    });
	}

 $(function(){
	    $('#dg').datagrid({
	        title:'Organsation',
	        iconCls:'icon-edit',
	        view: detailview,
	        detailFormatter: function(rowIndex, rowData){
	        	var cc = [];
	        	var hasLogo = rowData.logo;
				var imageDiv = 'imageDiv' + rowIndex;
				if (hasLogo !== null && typeof hasLogo !== 'undefined' && hasLogo.length > 0) {
					var imageId = rowData.orgId;
					var img = "imageOrgLogo.htm?id=" + imageId;
					cc.push('<img src="/Gyaan/images/' + img + '" style="width: 100px;height:100px;padding: 10px;">');
				}
						return '<table><tr>' +
	                    '<td rowspan=5 style="border:0"></td>' +
	                    '<td style="border:0">' +
	                    '<p><b>Org Name:</b>' + rowData.orgName + '</p>' +
	                    '</td>' +
	                    '<td style="border:0;padding-left:40px;">' +
	                    '<p><b>Address:</b>' + rowData.address1 + '</p>' +
	                    '</td></tr>'+
	                    '<tr>' +
	                    '<td style="border:0">' +
	                    '<p><b>Org Name:</b>' + rowData.orgName + '</p>' +
	                    '</td>' +
	                    '<td style="border:0;padding-left:40px;">' +
	                    '<p><b>Logo:</b>'+ cc +'</p>' +
	                    '</td></tr>'+
	                    '</table>';
	        },
	        width:750,
	        height:620,
	        singleSelect:true,
	        idField:'orgId',
	        url:'${urlOrgList}',
	        columns:[[
	                  {field:'orgId',hidden:'true'},
	                  {field:'orgName',title:'Orgnisation Name',width:80},
	                  {field:'employeeIdPrefix',title:'Orgnisation Name',width:80},
	                  {field:'address1',title:'Address ',width:80},
	  	              {field:'stateString',title:'State String',width:80},
	  	              {field:'districtString',title:'District String',width:80},
	  	              {field:'pincode',title:'Pin code',width:70},
	  	              {field:'emailId',title:'email',width:80},
	  	              {field:'website',title:'website',width:100},
	  	              {field:'logo',hidden:'true'},
	  	              {field:'action',title:'Action',width:70,align:'center',
	  	                formatter:function(value,row,index){
	  	                    if (row.editing){
	  	                        var s = '<a href="#"  onclick="saverow(this)"><i class="fa fa-trash"></i></a> ';
	  	                        var c = '<a href="#" onclick="cancelrow(this)">Cancel</a>';
	  	                        return s+c;
	  	                    } else {
	  	                        var e = '<a href="#" onclick="editrow(this)"><i class="fa fa-edit icon-trash fa-2x"></i></a>';
	  	                        var d = '<a href="#" onclick="deleterow(this)"><i class="fa fa-trash  icon-trash fa-2x"></i></a>';
	  	                        return e+d;
	  	                    }
	  	                }
	  	            }
	        ]],
	        onBeforeEdit:function(index,row){
	            row.editing = true;
	            updateActions(index);
	        },
	        onAfterEdit:function(index,row){
	            row.editing = false;
	            updateActions(index);
	        },
	        onCancelEdit:function(index,row){
	            row.editing = false;
	            updateActions(index);
	        }
	    });
	});


 function updateActions(index){
	    $('#dg').datagrid('updateRow',{
	        index: index,
	        row:{}
	    });
	}




 function getRowIndex(target){
	    var tr = $(target).closest('tr.datagrid-row');
	    return parseInt(tr.attr('datagrid-row-index'));
	}

 function editrow(target){
	  var row = $('#dg').datagrid('getRows')[getRowIndex(target)];
		  $.ajax({async: true, 
		    type:'POST',
		    url: '${urlOrgEdit}?orgId='+row.orgId, 
		    contentType: false,
		    processData: false,
		   	success: function(data){
		    	$("#contentSection").html(data);
		    }
	});
	 	}
	function deleterow(target){
		    var row = $('#dg').datagrid('getRows')[getRowIndex(target)];
			$.messager.confirm('Confirm', 'Are you sure you want to remove?', function(r) {
				if (r) {
					var index = $('#dg').datagrid('getRowIndex', row);
					var url = '/Gyaan/admin/deleteOrg.htm?orgId=' + row.orgId;
					$.post(url, {
						id : row.orgId
					}, function() {
						$('#dg').datagrid('deleteRow', index);
					});

				}
			});
		
	}
	
	function cancelrow(target){
	    $('#dg').datagrid('cancelEdit', getRowIndex(target));
	}
	$(document).ready(function(){
		
	 $("#newOrganisation").click(function(){
		   $.ajax({async: true, 
				    type:'POST',
					url: '${urlOrgNew}', 
				    success: function(data){
				    	$("#contentSection").html(data);
				   }
			});
		  
	  });

     $("#search").click(function(){
     	
         $.ajax({async: true, 
				    type:'POST',
					url: '${urlSearch}', 
				   	data: $('#searchForm').serialize(),
				    success: function(data){
				    	$("#contentSection").html(data);
				          
					}
			});
		  
	  });


	  
	 });	 
</script>
