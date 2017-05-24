<%@ include file="../../common/includes.jsp"%>

	<p>
		<table width="100%" class="table table-bordered table-hover">
			<tr>
				<td width="20%">Local guardian's name</td>
				<td width="30%"><form:input path="studentLocalGuardianInfoForm.name" class="fielddecor inputFieldWidth " /></td>
				<td width="20%">Local guardian's mobile no.</td>
				<td width="30%"><form:input path="studentLocalGuardianInfoForm.mobileNumber" class="fielddecor inputFieldWidth"/></td>
			</tr>
			<tr>
				<td>Local guardian's email id</td>
				<td><form:input path="studentLocalGuardianInfoForm.emailId" class="fielddecor inputFieldWidth"/></td>
				<td>Local guardian's address</td>
				<td><form:input path="studentLocalGuardianInfoForm.address" class="fielddecor inputFieldWidth"/></td>
			</tr>
			<tr>
				<td>Local guardian's Office address</td>
				<td><form:input path="studentLocalGuardianInfoForm.officeAddress" class="fielddecor inputFieldWidth"/></td>
				<td>Belongs to country</td>
				<td><form:select id="localGuardianCountry" path="studentLocalGuardianInfoForm.country" items="${countries}" itemLabel="name" itemValue="id" class="fielddecor inputFieldWidth " /></td>
			</tr>
			<tr>
				<td>Guardian identity document type</td>
				<td><form:select id="guardiansDocumentType" path="studentLocalGuardianInfoForm.idDocumentType" items="${documentTypes}" itemLabel="name" itemValue="id" class="fielddecor inputFieldWidth " /></td>
				<td>Identity document number</td>
				<td><form:input path="studentLocalGuardianInfoForm.idDocumentNumber" class="fielddecor inputFieldWidth"/></td>
			</tr>
			<tr>
				<td>Guardian's Identity document scan copy</td>
				<td><form:input path="studentLocalGuardianInfoForm.idDocumentPath" class="fielddecor inputFieldWidth"/></td>
				<td>Local Guardian Occupation</td>
				<td><form:input path="studentLocalGuardianInfoForm.occupation" class="fielddecor inputFieldWidth"/></td>
			</tr>
			<tr>
				<td>Local Guardian Relation To Student</td>
				<td><form:input path="studentLocalGuardianInfoForm.studentRelation" class="fielddecor inputFieldWidth" /></td>
				<td colspan="2">&nbsp;</td>
			</tr>
			
		</table>
	</p>
