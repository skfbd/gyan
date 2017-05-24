<%@ include file="../common/includes.jsp"%>
<c:url var="calendarImageUrl" value="/images/calendar.jpg" />
<p>
<table width="100%" class="table table-bordered table-hover">
	<tr>
		<td width="20%">Stage Name *</td>
		<td><form:select id="nationalities" path="prospectusConfigurationForm.stageName" items="${nationalities}" itemLabel="name" itemValue="id" class="fielddecor inputFieldWidth "
				required="required" /></td>
		<td width="20%">priority</td>
		<td width="30%"><form:input path="prospectusConfigurationForm.priority" class="fielddecor inputFieldWidth " /></td>
	</tr>
	<tr>
		<td>Fee Required</td>
		<td colspan="3"><form:checkbox path="prospectusConfigurationForm.testFeeForAdmission" label="Test Fee For Adm" /> <form:checkbox
				path="prospectusConfigurationForm.prospectFee" label="Prospectus Fee" /></td>
	</tr>
	<tr>
		<td>Documents Required</td>
		<td colspan="3"><form:checkbox path="prospectusConfigurationForm.testFeeForAdmission" label="Test Fee For Adm" /> <form:checkbox
				path="prospectusConfigurationForm.testFeeForAdmission" label="Prospectus Fee" /></td>
	</tr>
	<tr>
		<td>Prospect Required</td>
		<td colspan="3"><form:checkbox path="prospectusConfigurationForm.prospectusRequired" label="Prospectus Required" /></td>
	</tr>
	<tr>
		<td>SMS</td>
		<td colspan="3"><form:checkbox path="prospectusConfigurationForm.sms" label="sms" /></td>
		<td>SMS Format</td>
		<td colspan="3"><form:textarea path="prospectusConfigurationForm.smsFormat" class="fielddecor inputFieldWidth" /></td>

	</tr>
	<tr>
		<td>Email</td>
		<td colspan="3"><form:checkbox path="prospectusConfigurationForm.email" label="email" /></td>
		<td>Email Format</td>
		<td colspan="3"><form:textarea path="prospectusConfigurationForm.emailFormat" class="fielddecor inputFieldWidth" /></td>
	</tr>

	<tr>
		<td width="20%">Form</td>
		<td><form:select id="formNames" path="prospectusConfigurationForm.formNames" items="${formNames}" itemLabel="name" itemValue="id" class="fielddecor inputFieldWidth "
				required="required" /></td>
		<td width="20%">priority</td>
		<td width="30%"><form:input path="prospectusConfigurationForm.formNames" class="fielddecor inputFieldWidth " /></td>
	</tr>

	<tr>
		<td width="20%">Exam Applicable</td>
		<td width="30%"><form:radiobutton path="prospectusConfigurationForm.examApplicable" value="true" class="fielddecor" />&nbsp;Yes <form:radiobutton
				path="prospectusConfigurationForm.examApplicable" value="false" class="fielddecor" />&nbsp;No</td>
		<td width="20%">Confirm Student</td>
		<td width="30%"><form:radiobutton path="prospectusConfigurationForm.confirmStudent" value="true" class="fielddecor" />&nbsp;Yes <form:radiobutton
				path="prospectusConfigurationForm.confirmStudent" value="false" class="fielddecor" />&nbsp;No</td>
	</tr>
	<tr>
		<td width="20%">Activate Fee</td>
		<td width="30%"><form:radiobutton path="prospectusConfigurationForm.activateFee" value="true" class="fielddecor" />&nbsp;Yes <form:radiobutton
				path="prospectusConfigurationForm.activateFee" value="false" class="fielddecor" />&nbsp;No</td>
		<td width="20%">Admission Criteria Applicable</td>
		<td width="30%"><form:radiobutton path="prospectusConfigurationForm.admissionCriteriaApplicable" value="true" class="fielddecor" />&nbsp;Yes <form:radiobutton
				path="prospectusConfigurationForm.admissionCriteriaApplicable" value="false" class="fielddecor" />&nbsp;No</td>
	</tr>

</table>
</p>
