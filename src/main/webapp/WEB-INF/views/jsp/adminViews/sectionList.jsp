<%@ include file="../common/includes.jsp"%>
<c:url var="urlSearch" value="/lookup/classes.htm" />
<c:url var="urlSectionNew" value="/admin/newSection.htm" />
<c:url var="urlSectionEdit" value="/admin/editSection.htm" />
<c:url var="urlSectionSave" value="/admin/saveSection.htm" />
<c:url var="urlSectionList" value="/admin/listSections.htm" />
<c:url var="urlSectionDelete" value="/admin/deleteSection.htm" />


<!--Easy UI inclusion  -->
<link media="screen" rel="stylesheet" href="<c:url value="/plugins/datepicker/datepicker3.css"/>" type="text/css"></link>
<link media="screen" rel="stylesheet" href="<c:url value="/plugins/datepicker/datepicker.min.css"/>" type="text/css"></link>
<script src="<c:url value="/plugins/datepicker/bootstrap-datepicker.js"/>"></script>
<script type="text/javascript" src="<c:url value="/easyui/datagrid-groupview.js"/>"/></script>

<section class="content-header"></section>
<div class="box-header with-border bg-yellow ribbon ">
	<div id="Section" style="color:#5cb85c; font-size: 20px;">Class Sections</div>
</div>

<div class="box-header with-border bg-yellow ribbon ">
	<div id="newSection" class="btn btn-success" ><i class="fa fa-plus-o fa-lg" style="margin: 5px;">Add Section</i></div>
</div>

<table id="mg" class="easyui-datagrid"  
            data-options="
                singleSelect:true,
                collapsible:true,
                rownumbers:true,
                fitColumns:true,
                url:'${urlSectionList}',
                view:groupview,
                groupField:'schoolIdName',
                groupFormatter:function(value,rows){
                    var name=value.split('-');
                    return name[1] +  ' - ' + rows.length + ' Item(s)' ;
                }">
        <thead>
            <tr>
                <th data-options="field:'id',width:80,hidden:true">Section ID</th>
                <th data-options="field:'name',width:100">Class</th>
                <th data-options="field:'name',width:100">Class Teacher</th>
                <th data-options="field:'priority',width:100">Second Class Teacher</th>
                <th data-options="field:'description',width:100">Section Name</th>
                <th data-options="field:'description',width:100">Description</th>
               <th field="listprice" width="40" align="right" formatter="formatPrice">Action</th>
             </tr>
        </thead>
    </table>
 
<script>

  function formatPrice(val,row){
	  
	  if(null != row.id){
	    var e = '<a href="#" onclick="editrow(this)"><i class="fa fa-edit icon-trash fa-2x"></i></a>';
        var d = '<a href="#" onclick="deleterow(this)"><i class="fa fa-trash  icon-trash fa-2x"></i></a>';
        return e+d;
     }
  }

  $(document).ready(function(){
		
		sprout('OrganizationLOV');
		$('#OrganizationLOV').change(function() {
			sprout('schoolLOV', this.id)
		});
		
		
	});	
	
	
	function getRowIndex(target) {
		var tr = $(target).closest('tr.datagrid-row');
		return parseInt(tr.attr('datagrid-row-index'));
	}
	function editrow(target){
		  var row = $('#mg').datagrid('getRows')[getRowIndex(target)];
             $.ajax({async: true, 
			    type:'POST',
			    url: '${urlSectionEdit}?id='+row.id, 
			   	success: function(data){
			    	$("#contentSection").html(data);
			    }
		});
		 	}
	function deleterow(target){
	    var row = $('#mg').datagrid('getRows')[getRowIndex(target)];
		$.messager.confirm('Confirm', 'Are you sure you want to remove?', function(r) {
			if (r) {
				var index = $('#mg').datagrid('getRowIndex', row);
				var url = '/Gyaan/admin/deleteSection.htm?id=' + row.id;
				$.post(url, {
					id : row.id
				}, function() {
					$('#mg').datagrid('deleteRow', index);
				});

			}
		});
     }
	
	

	

$(document).ready(function(){
	 $("#newSection").click(function(){
		   $.ajax({async: true, 
				    type:'POST',
					url: '${urlSectionNew}', 
				    success: function(data){
				    	$("#contentSection").html(data);
				   }
			});
		  
	  });
 });
</script>	

