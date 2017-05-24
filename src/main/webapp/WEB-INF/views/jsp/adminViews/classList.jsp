<%@ include file="../common/includes.jsp"%>
<c:url var="urlSearch" value="/lookup/classes.htm" />
<c:url var="urlClassEdit" value="/admin/editClasses.htm" />
<c:url var="urlnewClasses" value="/admin/newClasses.htm"/>
<c:url var="urlClassList" value="/admin/classList.htm" />
<c:url var="urlClassDelete" value="/admin/deleteClass.htm" />

<link media="screen" rel="stylesheet" href="<c:url value="/plugins/datepicker/datepicker3.css"/>" type="text/css"></link>
<link media="screen" rel="stylesheet" href="<c:url value="/plugins/datepicker/datepicker.min.css"/>" type="text/css"></link>
<script src="<c:url value="/plugins/datepicker/bootstrap-datepicker.js"/>"></script>
<script type="text/javascript" src="<c:url value="/easyui/datagrid-groupview.js"/>"/></script>
<section class="content-header"></section>

<div class="box-header with-border bg-yellow ribbon ">
	<div id="AcademicSession" style="color: #5cb85c; font-size: 20px;">
		<b>Class Section
	</div>
</div>
<div class="box-header with-border bg-yellow ribbon ">
	<div id="newClass" class="btn btn-success">
		<i class="fa fa-plus-o fa-lg" style="margin: 5px;">Add Class</i>
	</div>
</div>
 
<form:form id="searchForm" action="${urlSearch}" method="post" modelAttribute="searchForm">
	<div class="box searchbox  box-solid box-default">
		<div class="box-body ">
			<table>
				<tr>
					<td width="20%" style="text-align: right; padding-right: 20px; height: 50px;">Organization</td>
					<td width="20%"><form:select id="OrganizationLOV" path="orgId" style="height: 25px; width: 200px;padding-right: 20px;" /></td>

					<td width="20%" style="text-align: right; padding-right: 20px;">School</td>
					<td width="20%"><form:select id="schoolLOV" path="schoolId" style="height: 25px; width: 200px;padding-right: 20px;" /></td>

					<td width="20%"><div id="search" class="btn btn-success" style="float: right;">
							<i class="fa fa-search fa-lg" style="margin: 5px;"> Search</i>
						</div></td>
				</tr>
			</table>
		</div>
	</div>
</form:form>


<table id="mg" class="easyui-datagrid"  
            data-options="
                singleSelect:true,
                collapsible:true,
                rownumbers:true,
                fitColumns:true,
                url:'${urlClassList}',
                view:groupview,
                groupField:'schoolIdName',
                groupFormatter:function(value,rows){
                    var name=value.split('-');
                    return name[1] +  ' - ' + rows.length + ' Item(s)' ;
                }">
        <thead>
            <tr>
                <th data-options="field:'id',width:80">Class Id</th>
                <th data-options="field:'schoolId',hidden:true,width:100"></th>
                <th data-options="field:'name',width:100">Class Name</th>
                <th data-options="field:'priority',width:100">Class Priority</th>
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
			    url: '${urlClassEdit}?id='+row.id, 
			    contentType: false,
			    processData: false,
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
				var url = '/Gyaan/admin/deleteClass.htm?id=' + row.id;
				$.post(url, {
					id : row.id
				}, function() {
					$('#mg').datagrid('deleteRow', index);
				});

			}
		});
     }
	
	

	

$(document).ready(function(){
	 $("#newClass").click(function(){
		   $.ajax({async: true, 
				    type:'POST',
					url: '${urlnewClasses}', 
				    success: function(data){
				    	$("#contentSection").html(data);
				   }
			});
		  
	  });
 });
</script>	

