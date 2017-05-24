<%@ include file="../common/includes.jsp" %>
<c:url  var="urlloadEdit" value="/admin/loadModulesEdit.htm" />
<c:url  var="urlloadNew" value="/admin/loadModules.htm" />
<c:url  var="urlDel" value="/admin/DeleteEmpType.htm" />
<c:url  var="urlSearch" value="/admin/searchRoleList.htm" />
<c:url  var="urlModList" value="/employee/modulesEditList.htm" />
<c:url  var="urlmainModuleLst" value="/employee/mainModuleLst.htm" />
<c:url  var="urlsubModuleLst" value="/employee/subModuleLst.htm" />
<link media="screen" rel="stylesheet" href="<c:url value="/css/easyui/themes/bootstrap/easyui.css"/>" type="text/css"></link>
<script type="text/javascript" src="<c:url value="/easyui/datagrid-detailview.js"/>" /></script>
<table id="tt"  toolbar="#toolbar" >
	 
</table>
<div id="toolbar" style="padding:5px;height:auto">
  <div style="margin-bottom:5px">
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" id="newEmptype">New Employee Type</a> 
  </div>
   <div>
      Name: <input id="perName" class="easyui-textbox"  style="width:24%;height:22px">
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
	    	perName: $('#perName').val(),
	    	moduleId: $('#cc1').combobox('getValue'),
	    	menuId:$('#cc2').combobox('getValue')
	    });
	}
	
 $(function(){
	    $('#tt').datagrid({
	        title:'Employee Type',
	        iconCls:'icon-edit',
	        width:750,
	        height:510,
	        singleSelect:true,
	        idField:'rId',
	        url:'${urlModList}',
	        columns:[[
                {field:'rId',hidden:'true'},
                {field:'moduleId',hidden:'true'},
                {field:'menuId',hidden:'true'},
	            {field:'perName',title:'Type Name',width:370},
	            {field:'roleDesc',title:'Description',width:300},
	            {field:'action',title:'Action',width:70,align:'center',
	                formatter:function(value,row,index){
	                    if (row.editing){
	                        var s = '<a href="#"  onclick="saverow(this)"><i class="fa fa-trash"></i></a> ';
	                        var c = '<a href="#" onclick="cancelrow(this)">Cancel</a>';
	                        return s+c;
	                    } else {
	                        var e = '<a href="#" onclick="editrow(this)"><i class="fa fa-edit icon-trash"></i></a>';
	                        var d = '<a href="#" onclick="deleterow(this)"><i class="fa fa-trash  icon-trash"></i></a>';
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
			url: '${urlloadEdit}?editVal='+row.rId, 
		   	success: function(data){
		    	$("#contentSection").html(data);
		    }
	});
	 	}
	function deleterow(target){
	    $.messager.confirm('Confirm','Are you sure?',function(r){
	        if (r){
	            var row = $('#tt').datagrid('getRows')[getRowIndex(target)];
	            $.ajax({async: true, 
				    type:'POST',
					url: '${urlDel}?delVal='+row.rId, 
				    success: function(data){  // user of data is not needed
				    	$('#tt').datagrid('reload');
				    }
			    });

	            
	        }
	    });
	}
	function saverow(target){
	    $('#tt').datagrid('endEdit', getRowIndex(target));
	}
	function cancelrow(target){
	    $('#tt').datagrid('cancelEdit', getRowIndex(target));
	}

	

 
		  $(document).ready(function(){
			  
			  $("#newEmptype").click(function(){
				     var idval=this.id.split("_");
	            	$.ajax({async: true, 
						    type:'POST',
							url: '${urlloadNew}', 
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
   
