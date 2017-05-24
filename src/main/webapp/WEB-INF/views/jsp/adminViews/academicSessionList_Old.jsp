<%@ include file="../common/includes.jsp"%>

<c:url var="urlSearch" value="/lookup/classes.htm" />
<c:url var="urlAcademicSessionEdit" value="/admin/editAcademicSession.htm"/>
<c:url var="urlAcademicSessionSave" value="/admin/saveAcademicSession.htm"/>
<c:url var="urlAcademicSessionList" value="/admin/listAcademicSessions.htm"/>
<c:url var="urlAcademicSessionDelete" value="/admin/deleteAcademicSession.htm"/>


<link media="screen" rel="stylesheet" href="<c:url value="/plugins/datepicker/datepicker3.css"/>" type="text/css"></link>
<link media="screen" rel="stylesheet" href="<c:url value="/plugins/datepicker/datepicker.min.css"/>" type="text/css"></link>
<script src="<c:url value="/plugins/datepicker/bootstrap-datepicker.js"/>"></script>
<script type="text/javascript" src="<c:url value="/easyui/datagrid-groupview.js"/>"/></script>
<style type="text/css">
#dateRangeForm .form-control-feedback {
    top: 0;
    right: -15px;
}
</style>
<table id="tt" style= "width:100%">
</table>
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
		var months = [
		    		    {id:'1',name:'Janauary'},
		    		    {id:'2',name:'February'},
		    		    {id:'3',name:'March'},
		    		    {id:'4',name:'April'},
		    		    {id:'5',name:'May'},
		    		    {id:'6',name:'June'},
		    		    {id:'7',name:'July'},
		    		    {id:'8',name:'August'},
		    		    {id:'9',name:'September'},
		    		    {id:'10',name:'October'},
		    		    {id:'11',name:'November'},
		    		    {id:'12',name:'December'},
		    		];
		
		$('#tt').datagrid({
			title : 'Academic Sessions',
			iconCls : 'icon-edit',
			view:groupview,
			groupField:'schoolId',
			singleSelect : true,
			idField : 'id',
			url : '${urlAcademicSessionList}',
			rowStyler: function(index,row){
					return 'background-color:#fff;color:#6293BB;'; 
			},
			columns : [	 [ 
				 			{ field : 'id', hidden : 'true'}, 
				 			{ field : 'session', title : 'Session', width : '15%', align : 'center'}, 
				 			{ field : 'sessionStartDate', title : 'Session Start Date', width : '17%', align : 'center',
				 				formatter : function(value, row, index) {
										return '<div class="input-group input-append date dateRangePicker"> <input type="text" class="form-control" name="sessionStartDate" /> <span class="input-group-addon add-on"><span class="glyphicon glyphicon-calendar"></span></span> </div>'
								}
							 }, 
				 			{ field : 'sessionEndDate', title : 'Session End Date', align : 'center', width : '17%', 
								 formatter : function(value, row, index) {
										return '<div class="input-group input-append date dateRangePicker"> <input type="text" class="form-control" name="sessionEndDate" /> <span class="input-group-addon add-on"><span class="glyphicon glyphicon-calendar"></span></span> </div>'
								}
						 	},
				 			{ field : 'subjectWiseAttendance', title : 'Subject-wise Attendance', align : 'center', width : '15%', 
					 			editor:{
									type:'checkbox',
									options:{
										on: 'true',
									}
								}
							}, 
				 			{ field : 'feeStartMonth', title : 'Fee Start Month', align : 'center', width : '15%', 
					 			formatter:function(value){
									for(var i=0; i<months.length; i++){
										if (months[i].id == value) return months[i].name;
									}
									return value;
								},
								editor:{
									type:'combobox',
									options:{
										valueField:'id',
										textField:'name',
										data:months,
										required:true
									}
								}
							},
				 			{ field : 'prospectusString', title : 'ProspectusStrings', align : 'center', width : '12%', editor:{
								type:'datetimebox',
								options:{
									required:true
								}
							} },
				 			{ field : 'action', title : 'Action', align : 'center', width : '10%', align : 'center', 
					 			formatter : function(value, row, index) {
									if (row.editing) {
										var s = '<a href="#" onclick="saverow(this)"><i class="fa fa-floppy-o bg-green fa-2x" style="margin: 5px;"></i></a> ';
										var c = '<a href="#" onclick="cancelrow(this)"><i class="fa fa-undo fa-2x" style="margin: 5px;"></i></a>';
										return s + c;
									} else {
										var e = '<a href="#" onclick="editrow(this)"><i class="fa fa-edit fa-2x" style="margin: 5px;"></i></a> ';
										var d = '<a href="#" onclick="deleterow(this)"><i class="fa fa-trash-o bg-red fa-2x" style="margin: 5px;"></a>';
										return e + d;
									}
								}
							} 
					] 	],

			onBeforeEdit : function(index, row) {
				row.editing = true;
				updateActions(index);
				$('.dateRangePicker').datepicker({
					format : 'mm/dd/yyyy',
					startDate : '01/01/2010',
					endDate : '12/30/2020'
				})
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

				var index = getRowIndex(target);
				var row = $('#tt').datagrid('getRows')[index];
				var url = '${urlAcademicSessionDelete}';

				$.post(url, row, function(data) {

					data.isNewRecord = null;
					$(target).datagrid('updateRow', {
						index : index,
						row : data
					});
				}, 'json');
				$('#tt').datagrid('deleteRow', getRowIndex(target));
			}
		});
	}
	function saverow(target) {

		var index = getRowIndex(target);
		var row = $('#tt').datagrid('getRows')[index];alert(row);
		var url = '${urlAcademicSessionSave}';

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
	<div id="AcademicSession" style="color: #5cb85c; font-size: 20px;">
		<b>Academic Session Section
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

<table class="table table-hover table-striped table-bordered table-responsive ">
	<tr class="searchResults">
	</tr>
	<tr>
	</tr>
</table>

<div class="box-header with-border bg-yellow ribbon ">
	<div id="newAcademicSession" class="btn btn-success" onclick="insert()">
		<i class="fa fa-plus-o fa-lg" style="margin: 5px;">Add Academic Session</i>
	</div>
</div>

	