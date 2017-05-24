<%@ include file="../../common/includes.jsp" %>
<c:url  var="urlempEdit" value="/employee/employeeEdit.htm"/>
<c:url  var="urlempNew" value="/employee/employeeNew.htm"/>
<c:url  var="urlempDel" value="/employee/employeeDelete.htm" />
<c:url  var="urlempSearch" value="/employee/empNewListing.htm" />
<c:url  var="urlempLst" value="/employee/empNewListingPage.htm" />
<c:url  var="urlexpanderData" value="/employee/empExpanderData.htm"/>
<c:url  var="urlmainModuleLst" value="/employee/mainModuleLst.htm" />
<c:url  var="urlsubModuleLst" value="/employee/subModuleLst.htm" />
<script src="<c:url value="/jquery/jquery.blockUI.js"/>"></script>

<table id="tt"  toolbar="#toolbar" style="width:100%" >
</table>
 <div id="toolbar" style="padding:5px;height:auto">
  <div style="margin-bottom:5px">
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" id="newEmp">New Employee Type</a> 
  </div>
  <div>
      Name: <input id="desName" class="easyui-textbox"  style="width:24%;height:22px">
      Model: <input id="cc1"     class="easyui-combobox" data-options="
        valueField: 'moduleValue',
        textField: 'moduleCaption',
        onLoadSuccess: function(rec){
                 $('#cc1').combobox('setValue','-1');
        },
        url: '${urlmainModuleLst}',
        onSelect: function(rec){
            var url = '${urlsubModuleLst}?id='+rec.moduleValue;
            $('#cc2').combobox('reload', url);
             $('#cc2').combobox('setValue','-1');
        }">
        Menu:<input id="cc2"  class="easyui-combobox" data-options="valueField:'moduleValue',textField:'moduleCaption',onLoadSuccess:function(){
         $('#cc2').combobox('setValue','-1');
        }">      
        <a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="doSearch()">Search</a>
        </div>
 </div>

    
 <script>
 function doSearch(){
	  
	    $('#tt').datagrid('load',{
	    	desig_Name: $('#desName').val(),
	    	moduleId: $('#cc1').combobox('getValue'),
	    	menuId:$('#cc2').combobox('getValue')
	    });
	}
  $(function(){
	    $('#tt').datagrid({
	        title:'Employee',
	        iconCls:'icon-edit',
	        fitColumns:true,
	        view: detailview,
	        detailFormatter: function(rowIndex, rowData){
	        	var cc = [];
	        	var hasLogo = rowData.uploadImageName;
                var imageDiv = 'imageDiv' + rowIndex;
				if (hasLogo !== null && typeof hasLogo !== 'undefined' && hasLogo.length > 0) {
					var imageId = rowData.empId;
					var img = "imageEmployee.htm?id=" + imageId + '&fileName='+ rowData.uploadImageName;
					cc.push('<img src="/Gyaan/images/' + img + '" style="width: 100px;height:100px;padding: 10px;">');
				}
	            return '<table><tr>' +
	                    '<td rowspan=2 style="border:0"></td>' +
	                    '<td style="border:0">' +
	                    '<p>Employee Id: ' + rowData.empId + '</p>' +
	                    '<p>Employee First Name: ' + rowData.empFirstName + '</p>' +
	                    '</td>' +
	                    '<td style="border:0;padding-left:40px;">' +
	                    '<p><b>Logo:</b>'+ cc +'</p>' +
	                    '</td></tr>'+
	                    '</table>';
	        },
	        
	        height:560,
	        singleSelect:true,
	        idField:'empId',
	        url:'${urlempLst}',
	        columns:[[
              {field:'empId',hidden:'true'},
                {field:'empFirstName',title:'First Name',width:120,height:50},
	            {field:'empGender',title:'Employee Type',width:120},
	            {field:'empLastName',title:'Staff Type',width:70},
	            {field:'empMiddelName',title:'Priority',width:120},
	            {field:'dateOfBirth',title:'Description',width:220},
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
	    $('#tt').datagrid('updateRow',{
	        index: index,
	        row:{}
	    });
	}




function getRowIndex(target){
	    var tr = $(target).closest('tr.datagrid-row');
	    return parseInt(tr.attr('datagrid-row-index'));
	}

    function editrow(target){
	  var row = $('#tt').datagrid('getRows')[getRowIndex(target)];
		  $.ajax({async: true, 
		    type:'POST',
		    url: '${urlempEdit}?employeeId='+row.empId, 
		   	success: function(data){
		    	$("#contentSection").html(data);
		    }
	});
	 	}
	function deleterow(target){
	    $.messager.confirm('Confirm','Are you sure?',function(r){
	       // if (r){
	            var row = $('#tt').datagrid('getRows')[getRowIndex(target)];
	            $.ajax({async: true, 
				    type:'POST',
				    url: '${urlempDel}?employeeId='+row.empId, 
				    success: function(data){  // user of data is not needed
				    	$('#tt').datagrid('reload');
				    }
			    });

	            
	        //}
	    });
	}
	function saverow(target){
	    $('#tt').datagrid('endEdit', getRowIndex(target));
	}
	function cancelrow(target){
	    $('#tt').datagrid('cancelEdit', getRowIndex(target));
	}
		  $(document).ready(function(){


			  $("#newEmp").click(function(){
				    
				    var idval=this.id.split("_");
	            	$.ajax({async: true, 
						    type:'POST',
							url: '${urlempNew}', 
							 beforeSend: function() {
							    	$('div#tt').block({ 
						                message: '<img src="/Gyaan/Login/assets/img/ajax-modal-loading.gif"/>', 
						                css: { border: '3px solid #a00' } 
						            });
							     },
							     complete: function(){
							    	 $('div#tt').unblock(); 
							     },
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
   
