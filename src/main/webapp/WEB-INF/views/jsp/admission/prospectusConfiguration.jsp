<%@ include file="../common/includes.jsp"%>
<c:url var="calendarImageUrl" value="/images/calendar.jpg" />
<p>
<table width="100%" class="table table-bordered table-hover">
	<tr>
		<td width="20%">Academic Session *</td>
		<td><form:select id="nationalities" path="prospectusConfigurationForm.academicSession" items="${nationalities}" itemLabel="name" itemValue="id"
				class="fielddecor inputFieldWidth " required="required" /></td>
		<td width="20%">Prospectus Count</td>
		<td width="30%"><form:input path="prospectusConfigurationForm.prospectusCount" class="fielddecor inputFieldWidth " /></td>
	</tr>
	<tr>
		<td>Date of Purchase *</td>
		<td>
			<div class="input-group input-append date dateRangePicker calendarInputFieldWidth">
				<form:input type="text" id="birthDatePicker" class="form-control" path="prospectusConfigurationForm.dateOfPurchase" />
				<span class="input-group-addon add-on"> <span class="glyphicon glyphicon-calendar"> </span>
				</span>
			</div>
		</td>
		<td>Price Per Unit</td>
		<td><form:input path="prospectusConfigurationForm.pricePerUnit" class="fielddecor inputFieldWidth " /></td>
	</tr>
</table>
</p>
