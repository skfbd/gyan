<%@ include file="../../common/includes.jsp"%>

	<p>
		<table width="100%" class="table table-bordered table-hover">
			<tr>
				<td  width="20%">Student height (in cm)</td>
				<td width="30%"><form:input path="studentOtherInfoForm.studentHeight" class="fielddecor inputFieldWidth" /></td>
				<td width="20%">Student weight (in kg) </td>
				<td width="30%"><form:input path="studentOtherInfoForm.studentWeight" class="fielddecor inputFieldWidth" /></td>
			</tr>
			<tr>
				<td>Student right eye vision</td>
				<td><form:input path="studentOtherInfoForm.studentRightEyeVision" class="fielddecor inputFieldWidth" /></td>
				<td>Student left eye vision</td>
				<td><form:input path="studentOtherInfoForm.studentLeftEyeVision" class="fielddecor inputFieldWidth" /></td>
			</tr>
			<tr>
				<td>Medical illness (if any)</td>
				<td><form:input path="studentOtherInfoForm.studentMedicalIllness" class="fielddecor inputFieldWidth" /></td>
				<td>Allergic to (if any)</td>
				<td><form:input path="studentOtherInfoForm.studentAllergicTo" class="fielddecor inputFieldWidth" /></td>
			</tr>
			<tr>
				<td>Student identity document type</td>
				<td><form:select id="studentIdentityDocumentType" path="studentOtherInfoForm.studentIdentityDocumentType" items="${documentTypes}" itemLabel="name" itemValue="id" class="fielddecor inputFieldWidth " /></td>
				<td>Student Identity document number</td>
				<td><form:input path="studentOtherInfoForm.studentDocumentIdentityNo" class="fielddecor inputFieldWidth" /></td>
			</tr>
			<tr>
				<td>Student's Identity document scan copy </td>
				<td><form:input path="studentOtherInfoForm.studentDocumentScanPath" class="fielddecor inputFieldWidth" /></td>
				<td>Other language known</td>
				<td><form:input path="studentOtherInfoForm.studentOtherLanguage" class="fielddecor inputFieldWidth" /></td>
			</tr>
			<tr>
				<td>Hobbies/Special interest</td>
				<td><form:input path="studentOtherInfoForm.studentHobbies" class="fielddecor inputFieldWidth" /></td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
		</table>
	</p>
