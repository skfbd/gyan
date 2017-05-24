<%@ include file="../common/includes.jsp" %>
<c:url  var="urlbnkBrnchAccEdit" value="/bankEdit.htm" />
<div data-options="region:'center',title:'Bank Branch Account',iconCls:'icon-ok'">
		    
		     <table id="dg" class="easyui-datagrid" toolbar="#toolbar"
                    data-options="url:'datagrid_data1.json',method:'get',border:false,singleSelect:true,fit:true,fitColumns:true">
                <thead>
                    <tr> 
                        <th data-options="field:'schoolName',align:'center'" width="80">Bank </th>
                        <th data-options="field:'parentOrganization',align:'center'" width="100">Branch</th>
                        <th data-options="field:'address',align:'center'" width="80">Account</th>
                        <th data-options="field:'state',align:'center'" width="80">State</th>
                        <th data-options="field:'district',align:'center'" width="80">District</th>
                        <th data-options="field:'pincode',align:'center'" width="80">Pin Code</th>
                        <th data-options="field:'email',align:'center'" width="80">Email</th>
                        <th data-options="field:'website',align:'center'" width="80">Website</th>
                    </tr>
                </thead>
            </table>
		    
		    <div id="toolbar">
            <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newItem()">New</a>
            <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyItem()">Destroy</a>
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
                        href:'${urlbnkBrnchAccEdit}',
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
                        $.post('schoolForm.jsp',{id:row.id},function(){
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