<%@ page language="java" contentType="text/html; charset=ISO-8859-1"	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<script>
var products = [
    		    {productid:'FI-SW-01',name:'Superuser'},
    		    {productid:'K9-DL-01',name:'Admin'},
    		    {productid:'RP-SN-01',name:'Student'},
    		    {productid:'RP-LI-02',name:'Employee'}
    		    
    		];
    		$(function(){
    			$('#tt').datagrid({
    				title:'Editable DataGrid',
    				iconCls:'icon-edit',
    				width:660,
    				height:250,
    				singleSelect:false,
    				url:'data/datagrid_data.json',
    				columns:[[
    					
    					{field:'Role',title:'Role',width:100,
    						formatter:function(value){
    							for(var i=0; i<products.length; i++){
    								if (products[i].productid == value) return products[i].name;
    							}
    							return value;
    						},
    						editor:{
    							type:'combobox',
    							options:{
    								valueField:'productid',
    								textField:'name',
    								data:products,
    								required:true
    							}
    						}
    					},
    					{field:'permission1',title:'Read',
    						width:50,align:'center',
    						editor:{
    							type:'checkbox',
    							options:{
    								on: 'P',
    								off: 'Y'
    							}
    						}
    					},
    					{field:'permission2',title:'write',width:50,align:'center',
    						editor:{
    							type:'checkbox',
    							options:{
    								on: 'P',
    								off: 'Y'
    							}
    						}
    					},
    					{field:'permission3',title:'execute',width:50,align:'center',
    						editor:{
    							type:'checkbox',
    							options:{
    								on: 'P',
    								off: 'Y'
    							}
    						}
    					},
    					{field:'status',title:'Status',width:50,align:'center',
    						editor:{
    							type:'checkbox',
    							options:{
    								on: 'P',
    								off: 'Y'
    							}
    						}
    					},
    					{field:'action',title:'Action',width:80,align:'center',
    						formatter:function(value,row,index){
    							if (row.editing){
    								var s = '<a href="#" onclick="saverow(this)">Save</a> ';
    								var c = '<a href="#" onclick="cancelrow(this)">Cancel</a>';
    								return s+c;
    							} else {
    								var e = '<a href="#" onclick="editrow(this)">Edit</a> ';
    								var d = '<a href="#" onclick="deleterow(this)">Delete</a>';
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
    			$('#tt').datagrid('beginEdit', getRowIndex(target));
    		}
    		function deleterow(target){
    			$.messager.confirm('Confirm','Are you sure?',function(r){
    				if (r){
    					$('#tt').datagrid('deleteRow', getRowIndex(target));
    				}
    			});
    		}
    		function saverow(target){
    			$('#tt').datagrid('endEdit', getRowIndex(target));
    		}
    		function cancelrow(target){
    			$('#tt').datagrid('cancelEdit', getRowIndex(target));
    		}
    		function insert(){
    			var row = $('#tt').datagrid('getSelected');
    			if (row){
    				var index = $('#tt').datagrid('getRowIndex', row);
    			} else {
    				index = 0;
    			}
    			$('#tt').datagrid('insertRow', {
    				index: index,
    				row:{
    					status:'P'
    				}
    			});
    			$('#tt').datagrid('selectRow',index);
    			$('#tt').datagrid('beginEdit',index);
    		}
    		
        		
</script>
<div style="margin:10px 0">
    		<a href="javascript:void(0)" class="easyui-linkbutton" onclick="insert()">Insert Row</a>
    	</div>
 <table id="tt">
   
</table>