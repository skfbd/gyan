<%@ include file="../common/includes.jsp"%>

<c:url var="urlSearch" value="/lookup/classes.htm" />
<c:url var="urlSchoolOrgGlobalConfigEdit" value="/admin/editSchoolOrgGlobalConfig.htm" />
<c:url var="urlSchoolOrgGlobalConfigSave" value="/admin/saveSchoolOrgGlobalConfig.htm" />
<c:url var="urlSchoolOrgGlobalConfigList" value="/admin/listSchoolOrgGlobalConfigs.htm" />
<c:url var="urlSchoolOrgGlobalConfigDelete" value="/admin/deleteSchoolOrgGlobalConfig.htm" />
<div class="box-header with-border bg-yellow ribbon ">
	<div id="SchoolOrgGlobalConfig" style="color: #5cb85c; font-size: 20px;">
		<b>School Org Global Configuration Section 
	</div>
</div>
<div >
	<table id="tt" ></table>
</div>



<script>
	$(document).ready(function() {
		sprout('OrganizationLOV');
	});

	$("#search").click(function() {
		$('#tt').datagrid('load', {
			schoolId : $('#schoolLOV').val()
		});
	});

	$('#OrganizationLOV').change(function() {
		sprout('schoolLOV', this.id)
	});

	$(function() {
			$('#tt').datagrid( {
			title : 'School Org Global Configurations',
			iconCls : 'icon-edit',
			singleSelect : true,
			idField : 'id',
			url : '${urlSchoolOrgGlobalConfigList}',
			rowStyler : function(index, row) {
				return 'background-color:#fff;color:#6293BB;';
			},
			columns : [ [
					{ field : 'id', hidden : 'true' },
					{ field : 'name', title : 'School/Org Name', width : '10%', align : 'center'},
					{ field : 'shortName', title : 'Short Name	', width : '18%', align : 'center'},
					{ field : 'prefix', title : 'Prefix', width : '18%', align : 'center'},
					{ field : 'regNoPrefix', title : 'Reg No Prefix', width : '10%', align : 'center'},
					{ field : 'admissionNoPrefix', title : 'Admission No Prefix', width : '10%', align : 'center'},
					{ field : 'financialStartMonth', title : 'Finanacial Year Start Month', align : 'center', width : '10%'},
					{ field : 'leaveStartMonth', title : 'Leave Start Month', align : 'center', width : '10%'},
					{ field : 'academicSession', title : 'Academic Sessioon', align : 'center', width : '10%'},
					{ field : 'action', title : 'Action', align : 'center', width : '8%', align : 'center',
						formatter : function(value, row, index) {
							if (row.editing) {
								var s = '<a href="#" onclick="saverow(this)"><i class="fa fa-floppy-o bg-green fa-2x" style="margin: 5px;"></i></a> ';
								var c = '<a href="#" onclick="cancelrow(this)"><i class="fa fa-undo fa-2x" style="margin: 5px;"></i></a>';
								return s + c;
							} else {
								var e = '<a href="#" onclick="editrow(this)"><i class="fa fa-edit fa-2x" style="margin: 5px;"></i></a> ';
								var d = '<a href="#" onclick="deleterow(this)"></a>';
								return e + d;
							}
						}
					} ] ],
	
			onBeforeEdit : function(index, row) {
				row.editing = true;
				updateActions(index);
			},
			onAfterEdit : function(index, row) {
				row.editing = false;
				updateActions(index);
			},
			onCancelEdit : function(index, row) {
				row.editing = false;
				updateActions(index);
			}
		});
	});

	function updateActions(index) {
		$('#tt').datagrid('updateRow', {
			index : index,
			row : {}
		});
	}
	function getRowIndex(target) {
		var tr = $(target).closest('tr.datagrid-row');
		return parseInt(tr.attr('datagrid-row-index'));
	}
	function editrow(target){
		  var row = $('#tt').datagrid('getRows')[getRowIndex(target)];
			  $.ajax({async: true, 
			    type:'POST',
			    url: '${urlSchoolOrgGlobalConfigEdit}?id='+row.id, 
			    contentType: false,
			    processData: false,
			   	success: function(data){
			    	$("#contentSection").html(data);
			    }
		});
		 	}
	
	function saverow(target) {
		var index = getRowIndex(target);
		var row = $('#tt').datagrid('getRows')[index];
		var url = '${urlSchoolOrgGlobalConfigSave}';

		$.post(url, row, function(data) {
			data.isNewRecord = null;
			$(target).datagrid('updateRow', {
				index : index,
				row : data
			});
		}, 'json');
		$('#tt').datagrid('endEdit', getRowIndex(target));
	}
	function cancelrow(target) {
		$('#tt').datagrid('cancelEdit', getRowIndex(target));
	}
	
</script>



