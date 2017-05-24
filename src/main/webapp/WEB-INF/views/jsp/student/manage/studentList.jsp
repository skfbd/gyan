<%@ include file="../../common/includes.jsp"%>
<c:url var="urlStudentList" value="/StudentList/studentList.htm" />
<c:url var="urlStudentEdit" value="/StudentUpdate/studentEdit.htm" />
<c:url var="urlStudentDelete" value="/StudentUpdate/studentDelete.htm" />
<script>
	 $(document).ready(function() {
		sprout('OrganizationLOV');
		sprout('StatusLOVEntity');
		sprout('GenderLOVEntity');
		sprout('ReservationCategoryLOVEntity');
		sprout('StudentFeeCategoryLOVEntity');
	});

	 $("#search").click(function() {
		 $('#tt').datagrid('load',{
			 schoolId: $('#schoolLOV').val(),
			 session: $('#AcademicSessionLOVEntity').val(),
			 classes: $('#ClassLOVEntity').val(),
			 section: $('#SectionLOVEntity').val(),
			 status: $('#StatusLOVEntity').val(),
			 gender: $('#GenderLOVEntity').val(),
			 house: $('#HouseLOVEntity').val(),
			 reservationCategory: $('#ReservationCategoryLOVEntity').val(),
			 feeCategory: $('#StudentFeeCategoryLOVEntity').val(),
			 name:$('#studentName').val()
		 });	
	});

	$('#OrganizationLOV').change(function() {
		sprout('schoolLOV', this.id);
	});
	$('#schoolLOV').change(function() {
		sprout('AcademicSessionLOVEntity', this.id);
		//sprout('HouseLOVEntity', this.id);
	});
	$('#AcademicSessionLOVEntity').change(function() {
		sprout('ClassLOVEntity', this.id);
	});
	 
	$(function() {
		$('#tt').datagrid({
			title : 'Students',
			iconCls : 'icon-edit',
			
			/* width : 660,
			height : 250, */
			singleSelect : true,
			idField : 'id',
			url : '${urlStudentList}',
			columns : [ [ {
				field : 'studentId',
				title : 'Student ID',
				align : 'center',
				width : 0
			}, {
				field : 'name',
				title : 'Name',
				width : '20%',
				align : 'center',
				editor : 'text'
			}, {
				field : 'class',
				title : 'Class',
				width : '20%',
				align : 'center',
				editor : 'numberBox'
			}, {
				field : 'description',
				title : 'Description',
				align : 'center',
				width : '35%',
				editor : 'text'
			}, {
				field : 'action',
				title : 'Action',
				align : 'center',
				width : '20%',
				align : 'center',
				formatter : function(value, row, index) {
						var e = '<a href="#" onclick="editrow(this)"><i class="fa fa-edit fa-2x" style="margin: 5px;"></i></a> ';
						var d = '<a href="#" onclick="deleterow(this)"><i class="fa fa-trash-o bg-red fa-2x" style="margin: 5px;"></a>';
						return e + d;
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
	function editrow(target) {
		$('#tt').datagrid('beginEdit', getRowIndex(target));
	}
	function deleterow(target) {
		$.messager.confirm('Confirm', 'Are you sure?', function(r) {
			if (r) {
				$('#tt').datagrid('deleteRow', getRowIndex(target));
			}
		});
	}
	
	function insert() {
		var row = $('#tt').datagrid('getSelected');
		if (row) {
			var index = $('#tt').datagrid('getRowIndex', row);
		} else {
			index = 0;
		}
		$('#tt').datagrid('insertRow', {
			index : index,
			row : {
				status : 'P'
			}
		});
		$('#tt').datagrid('selectRow', index);
		$('#tt').datagrid('beginEdit', index);
	}
</script>

<section class="content-header"></section>
	
<div class="box-header with-border bg-yellow ribbon ">
	<div id="studentList" style="color:#5cb85c; font-size: 20px;"> <b>Students</div>
</div>


<form:form id="studentListForm" action="${urlSearch}" method="post" modelAttribute="studentListForm">
	<div class="box searchbox  box-solid box-default">
		<div class="box-body ">
			<table>
				<tr>
					<td width="13%" style="text-align: right; padding-right: 20px; height: 50px;">Organization</td>
					<td width="20%">
						<form:select id="OrganizationLOV" path="orgId" class="inputFieldWidth"/>
					</td>

					<td width="13%" style="text-align: right; padding-right: 20px;">School *</td>
					<td width="20%">
						<form:select id="schoolLOV" path="schoolId" class="inputFieldWidth"/>
					</td>
					<td width="13%" style="text-align: right; padding-right: 20px;">Session *</td>
					<td width="20%">
						<form:select id="AcademicSessionLOVEntity" path="session" class="inputFieldWidth"/>
					</td>
				</tr>
				<tr>
					<td width="13%" style="text-align: right; padding-right: 20px;">Class</td>
					<td width="20%">
						<form:select id="ClassLOVEntity" path="classes" class="inputFieldWidth"/>
					</td>
					<td width="13%" style="text-align: right; padding-right: 20px; height: 50px;">Section</td>
					<td width="20%">
						<form:select id="SectionLOVEntity" path="section" class="inputFieldWidth"/>
					</td>

					<td width="13%" style="text-align: right; padding-right: 20px;">Status</td>
					<td width="20%">
						<form:select id="StatusLOVEntity" path="status" class="inputFieldWidth"/>
					</td>
				</tr>
				<tr>
					<td width="13%" style="text-align: right; padding-right: 20px;height: 50px;">Gender</td>
					<td width="20%">
						<form:select id="GenderLOVEntity" path="gender" class="inputFieldWidth"/>
					</td>
					<td width="13%" style="text-align: right; padding-right: 20px;">House</td>
					<td width="20%">
						<form:select id="HouseLOVEntity" path="house" class="inputFieldWidth"/>
					</td>
					<td width="13%" style="text-align: right; padding-right: 20px;">Reservation<br/> Category</td>
					<td width="20%">
						<form:select id="ReservationCategoryLOVEntity" path="reservationCategory" class="inputFieldWidth"/>
					</td>
				</tr>
				<tr>
					<td width="13%" style="text-align: right; padding-right: 20px;height: 50px;">Fee Category</td>
					<td width="20%">
						<form:select id="StudentFeeCategoryLOVEntity" path="feeCategory" class="inputFieldWidth"/>
					</td>
					<td width="13%" style="text-align: right; padding-right: 20px;">Student Name</td>
					<td width="20%">
						<form:input id="studentName" path="name" class="inputFieldWidth"/>
					</td>
					<td colspan="2" width="34%"><div id="search" class="btn btn-success"  style="float: right;"><i class="fa fa-search fa-lg" style="margin: 5px;"> Search</i></div></td>
				</tr>
			</table>
		</div>
	</div>
</form:form>

<table class="table table-hover table-striped table-bordered table-responsive ">
	<tr class="searchResults">
	</tr>
	<tr>
	</tr>
</table>

<table id="tt" style: "width=100%"></table>