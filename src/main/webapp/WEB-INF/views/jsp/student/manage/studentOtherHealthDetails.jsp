<%@ include file="../../common/includes.jsp"%>

	<p>
		<table width="100%" class="table table-bordered table-hover">
			<tr>
				<td width="20%">Any Other Infectious Diseases</td>
				<td width="30%"><form:input path="studentHealthDetailsForm.infectiousDisease" class="fielddecor inputFieldWidth" /></td>
				<td width="20%">Any Other Non Infectious Diseases </td>
				<td width="30%"><form:input path="studentHealthDetailsForm.nonInfectiousDisease" class="fielddecor inputFieldWidth" /></td>
			</tr>
			<tr>
				<td>Eyes</td>
				<td><form:input path="studentHealthDetailsForm.eyes" class="fielddecor inputFieldWidth" /></td>
				<td>Ears</td>
				<td><form:input path="studentHealthDetailsForm.ears" class="fielddecor inputFieldWidth" /></td>
			</tr>
			<tr>
				<td>Teeth</td>
				<td><form:input path="studentHealthDetailsForm.teeth" class="fielddecor inputFieldWidth" /></td>
				<td>General Health</td>
				<td><form:input path="studentHealthDetailsForm.generalHealth" class="fielddecor inputFieldWidth" /></td>
			</tr>
			<tr>
				<td>Doctor's Remark</td>
				<td><form:input path="studentHealthDetailsForm.doctorsRemark" class="fielddecor inputFieldWidth" /></td>
				<td>Upload Report</td>
				<td><form:input path="studentHealthDetailsForm.reportPath" class="fielddecor inputFieldWidth" /></td>
			</tr>
			<tr>
				<td>Doctor's Name </td>
				<td><form:input path="studentHealthDetailsForm.doctorsName" class="fielddecor inputFieldWidth" /></td>
				<td>Doctor's Phone No.</td>
				<td><form:input path="studentHealthDetailsForm.doctorsPhoneNumber" class="fielddecor inputFieldWidth" /></td>
			</tr>
			<tr>
				<td>Doctor's Email Id</td>
				<td><form:input path="studentHealthDetailsForm.doctorsEmailId" class="fielddecor inputFieldWidth" /></td>
				<td>Doctor's Address</td>
				<td><form:textarea path="studentHealthDetailsForm.doctorsAddress" class="fielddecor inputFieldWidth" /></td>
			</tr>
		</table>
	</p>
