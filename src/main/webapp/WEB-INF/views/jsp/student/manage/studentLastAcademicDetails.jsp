<%@ include file="../../common/includes.jsp"%>
<c:url  var="calendarImageUrl" value="/images/calendar.jpg" />
	<p>
		<table width="100%" class="table table-bordered table-hover">
			<tr>
				<td width="20%">Name of last school</td>
				<td width="30%"><form:input path="studentLastAcademicDetailsForm.last_school_name" class="fielddecor inputFieldWidth" /></td>
				<td width="20%">Last class passed </td>
				<td width="30%"><form:input path="studentLastAcademicDetailsForm.lastClassPassed" class="fielddecor inputFieldWidth" /></td>
			</tr>
			<tr>
				<td>Last school start date</td>
				<td>
					<div class="input-group input-append date dateRangePicker calendarInputFieldWidth"> 
						<form:input type="text" id="lastSchoolStartDate" class="form-control" path="studentLastAcademicDetailsForm.lastSchoolStartDate" /> 
							<span class="input-group-addon add-on">
								<span class="glyphicon glyphicon-calendar">
								</span>
							</span>
					</div>
				</td>
				<td>Last school end date</td>
				<td>
					<div class="input-group input-append date dateRangePicker calendarInputFieldWidth"> 
						<form:input type="text" id="lastSchoolEndDate" class="form-control" path="studentLastAcademicDetailsForm.lastSchoolEndDate" /> 
							<span class="input-group-addon add-on">
								<span class="glyphicon glyphicon-calendar">
								</span>
							</span>
					</div>
				</td>
			</tr>
			<tr>
				<td>Last class percentage (%)</td>
				<td><form:input path="studentLastAcademicDetailsForm.lastClassPercentage" class="fielddecor inputFieldWidth" /></td>
				<td>Medium of instruction in the last school</td>
				<td><form:input path="studentLastAcademicDetailsForm.lastSchoolMedium" class="fielddecor inputFieldWidth" /></td>
			</tr>
			<tr>
				<td>Last school board</td>
				<td><form:input path="studentLastAcademicDetailsForm.lastSchoolBoard" class="fielddecor inputFieldWidth" /></td>
				<td>Passing year (YYYY)</td>
				<td><form:input path="studentLastAcademicDetailsForm.passingYear" class="fielddecor inputFieldWidth" /></td>
			</tr>
			<tr>
				<td>Reason of leaving</td>
				<td colspan="3"><form:textarea path="studentLastAcademicDetailsForm.reasonOfLeaving" class="fielddecor inputFieldWidth" /></td>
			</tr>
		</table>
	</p>
