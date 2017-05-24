<%@ include file="../common/includes.jsp"%>
<c:url var="calendarImageUrl" value="/images/calendar.jpg" />
<p>
<table width="100%" class="table table-bordered table-hover">
	<tr>
		<td width="20%">Admission Document Name *</td>
		<td><form:select id="nationalities" path="prospectusConfigurationForm.documentName" items="${nationalities}" itemLabel="name" itemValue="id"
				class="fielddecor inputFieldWidth " required="required" /></td>
		<td width="20%">Description *</td>
		<td width="30%"><form:input path="prospectusConfigurationForm.documentDescription" class="fielddecor inputFieldWidth " /></td>
	</tr>
</table>
</p>
