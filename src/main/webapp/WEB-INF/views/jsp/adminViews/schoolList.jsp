<%@ include file="../common/includes.jsp"%>
<c:url var="urlSchoolEdit" value="/admin/editSchool.htm" />
<c:url var="urlSchoolNew" value="/admin/newSchool.htm" />
<c:url var="urlSchoolList" value="/admin/getSchools.htm" />
<c:url var="urlSchoolDelete" value="/admin/deleteSchool.htm" />

<!--Easy UI inclusion  -->
<link media="screen" rel="stylesheet" href="<c:url value="/css/easyui/themes/default/easyui.css"/>" type="text/css"></link>
<!--<link media="screen" rel="stylesheet" href="<c:url value="/css/easyui/themes/icon.css"/>" type="text/css"></link>
<link media="screen" rel="stylesheet" href="<c:url value="/css/jquery/jquery-ui-1.9.2.css"/>" type="text/css"></link>
<script src="<c:url value="/jquery/jquery-1.11.3.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/easyui/jquery.easyui.min.js"/>" /></script>-->
<script type="text/javascript" src="<c:url value="/easyui/datagrid-detailview.js"/>" /></script>

<div id="toolbar" style="padding:5px;height:auto">
  <div style="margin-bottom:5px">
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add"  id="newSchool">New School</a> 
  </div>
</div>
<table id="dg"  toolbar="#toolbar" >
	 
</table>
 <script>
 function doSearch(){
	  
	    $('#dg').datagrid('load',{
	    	desig_Name: $('#desName').val(),
	    	moduleId: $('#cc1').combobox('getValue'),
	    	menuId:$('#cc2').combobox('getValue')
	    });
	}

 $(function(){
	    $('#dg').datagrid({
	        title:'School',
	        iconCls:'icon-edit',
	        view: detailview,
	        detailFormatter: function(rowIndex, rowData){
	        	var cc = [];
	        	var hasLogo = rowData.logo;
				var imageDiv = 'imageDiv' + rowIndex;
				if (hasLogo !== null && typeof hasLogo !== 'undefined' && hasLogo.length > 0) {
					var imageId = rowData.schoolId;
					var img = "imageSchoolLogo.htm?id=" + imageId;
					cc.push('<img src="/Gyaan/images/' + img + '" style="width: 100px;height:100px;padding: 10px;">');
				}
						            return '<table><tr>' +
	                    '<td rowspan=5 style="border:0"></td>' +
	                    '<td style="border:0">' +
	                    '<p><b>School Name:</b>' + rowData.schoolName + '</p>' +
	                    '</td>' +
	                    '<td style="border:0;padding-left:40px;">' +
	                    '<p><b>Address:</b>' + rowData.address1 + '</p>' +
	                    '</td></tr>'+
	                    '<tr>' +
	                    '<td style="border:0">' +
	                    '<p><b> School Pincode:</b>' + rowData.pincode + '</p>' +
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
	        url:'${urlSchoolList}',
	        columns:[[
	                  {field:'schoolId',hidden:'true'},
	                  {field:'orgId',hidden:'true'},
	                  {field:'schoolName',title:'School Name',width:100},
	                  {field:'orgName',title:'Orgnisation Name',width:100},
	                  {field:'address1',title:'Address ',width:100},
	  	              {field:'pincode',title:'Pin code',width:100},
	  	              {field:'emailId',title:'Email',width:120},
	  	              {field:'website',title:'website',width:120},
	  	              {field:'action',title:'Action',width:70,align:'center',
	  	                formatter:function(value,row,index){
	  	                    if (row.editing){
	  	                        var s = '<a href="#"  onclick="saverow(this)"><i class="fa fa-trash fa-2x"></i></a> ';
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
		    url: '${urlSchoolEdit}?schoolId='+row.schoolId, 
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
					var url = '/Gyaan/admin/deleteSchool.htm?schoolId=' + row.schoolId;
					$.post(url, {
						id : row.orgId
					}, function() {
						$('#dg').datagrid('deleteRow', index);
					});

				}
			});
		
	}
	function saverow(target){
	    $('#dg').datagrid('endEdit', getRowIndex(target));
	}
	function cancelrow(target){
	    $('#dg').datagrid('cancelEdit', getRowIndex(target));
	}
	$(document).ready(function(){
	    $("#newSchool").click(function(){
		   $.ajax({async: true, 
				    type:'POST',
					url: '${urlSchoolNew}', 
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
