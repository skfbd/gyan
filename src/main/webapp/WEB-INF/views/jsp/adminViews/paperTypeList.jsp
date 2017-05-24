<%@ include file="../common/includes.jsp" %>
<c:url  var="urlpaperTypeEdit" value="/paperTypeEdit.htm" />
<div data-options="region:'center',title:'Academic Session',iconCls:'icon-ok'">
		    
		     <table id="dg" class="easyui-datagrid" toolbar="#toolbar"
                    data-options="url:'datagrid_data1.json',method:'get',border:false,singleSelect:true,fit:true,fitColumns:true">
                <thead>
                    <tr> 
                        <th data-options="field:'onganizationName',align:'center'" width="80">Paper Type</th>
                        <th data-options="field:'employeeIdPrefix',align:'center'" width="100">Employee ID Prefix</th>
                        <th data-options="field:'address',align:'center'" width="80">Address</th>
                        <th data-options="field:'state',align:'center'" width="80">State</th>
                        <th data-options="field:'district',align:'center'" width="80">District</th>
                        <th data-options="field:'pincode',align:'center'" width="80">Pin Code</th>
                        <th data-options="field:'email',align:'center'" width="80">Email</th>
                        <th data-options="field:'website',align:'center'" width="80">Website</th>
                        <th data-options="field:'status',align:'center'" width="80">Status</th>
                    </tr>
                </thead>
            </table>
		   
		    <div id="toolbar">
		      <table><tr><td>
               <span>School Name:</span>
               <select class="easyui-combogrid" style="width:250px" data-options="
			            panelWidth: 500,
			            idField: 'itemid',
			            textField: 'productname',
			            url: 'datagrid_data1.json',
			            method: 'get',
			            columns: [[
			                {field:'itemid',title:'Org Name',width:80},
			                {field:'productname',title:'School Name',width:120},
			                {field:'listprice',title:'Country',width:80,align:'right'},
			                {field:'unitcost',title:'State',width:80,align:'right'},
			                {field:'attr1',title:'Mb No.',width:200}
			            ]],
			            fitColumns: true
                     ">
                 </select>
                  <a href="#" class="easyui-linkbutton" plain="true" onclick="doSearch()">Search</a>
                 </td></tr>
               <tr><td>
               <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newItem()">New</a>
               <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyItem()">Destroy</a>
              </td></tr> </table>
            </div>    
</div>  


 <script type="text/javascript">
        $(function(){
        	
            $('#dg').datagrid({ 
                view: detailview,
                detailFormatter:function(index,row){
                    return '<div class="ddv"></div>';
                },
                rowStyler: function(index,row){
            			return 'background-color:#ffffad;'; // return inline style
            			// the function can return predefined css class and inline style
            			// return {class:'r1', style:{'color:#fff'}};	
            		
            	},
                onExpandRow: function(index,row){
                    var ddv = $(this).datagrid('getRowDetail',index).find('div.ddv');
                    ddv.panel({
                        border:false,
                        cache:true,
                        href:'${urlpaperTypeEdit}',
                        onLoad:function(){
                            $('#dg').datagrid('fixDetailRowHeight',index);
                            $('#dg').datagrid('selectRow',index);
                            $('#dg').datagrid('getRowDetail',index).find('form').form('load',row);
                        }
                    });
                    $('#dg').datagrid('fixDetailRowHeight',index);
                },onClickRow : function(index,row){
                
                }
                
            	
            });
            $('#dg').datagrid('getPanel').removeClass('lines-both lines-no lines-right lines-bottom').addClass('lines-both');
        });
        function saveItem(index){
            var row = $('#dg').datagrid('getRows')[index];
            var url = row.isNewRecord ? 'save_user.php' : 'update_user.php?id='+row.id;
            $('#dg').datagrid('getRowDetail',index).find('form').form('submit',{
                url: url,
                onSubmit: function(){
                    return $(this).form('validate');
                },
                success: function(data){
                    data = eval('('+data+')');
                    data.isNewRecord = false;
                    $('#dg').datagrid('collapseRow',index);
                    $('#dg').datagrid('updateRow',{
                        index: index,
                        row: data
                    });
                }
            });
        }
        function cancelItem(index){
            var row = $('#dg').datagrid('getRows')[index];
            if (row.isNewRecord){
                $('#dg').datagrid('deleteRow',index);
            } else {
                $('#dg').datagrid('collapseRow',index);
            }
        }
        function destroyItem(){
            var row = $('#dg').datagrid('getSelected');
            if (row){
                $.messager.confirm('Confirm','Are you sure you want to remove this user?',function(r){
                    if (r){
                        var index = $('#dg').datagrid('getRowIndex',row);
                        $.post('organisationForm.jsp',{id:row.id},function(){
                            $('#dg').datagrid('deleteRow',index);
                        });
                    }
                });
            }
        }
        function newItem(){
            $('#dg').datagrid('appendRow',{isNewRecord:true});
            var index = $('#dg').datagrid('getRows').length - 1;
            $('#dg').datagrid('expandRow', index);
            $('#dg').datagrid('selectRow', index);
        }
       
      
        
    </script>