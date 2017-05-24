<%@ include file="../../common/includes.jsp"%>

	<p>
		<table width="100%" class="table table-bordered table-hover">
			<tr>
				<td width="40%"><form:checkbox path="studentEnclosedDocumentsForm.birthCertificatePathBool"/>Birth Certificate</td>
				<td width="60%">
					<input type="file" name="studentEnclosedDocumentsForm.birthCertificatePathFile" class="fileUpload">
				</td>
			</tr>
			<tr>
				<td><form:checkbox path="studentEnclosedDocumentsForm.transferCertiPathBool"/>Transfer Certificate</td>
				<td>
					<input type="file" name="studentEnclosedDocumentsForm.transferCertiPathFile" class="fileUpload">
				</td>
			</tr>
			<tr>
				<td><form:checkbox path="studentEnclosedDocumentsForm.casteCertiPathBool"/>Caste Certificate</td>
				<td>
					<input type="file" name="studentEnclosedDocumentsForm.casteCertiPathFile" class="fileUpload">
				</td>
			</tr>
			<tr>
				<td><form:checkbox path="studentEnclosedDocumentsForm.characterCertiPathBool"/>Character Certificate</td>
				<td>
					<input type="file" name="studentEnclosedDocumentsForm.characterCertiPathFile" class="fileUpload">
				</td>
			</tr>
			<tr>
				<td><form:checkbox path="studentEnclosedDocumentsForm.marksheetPathBool"/>Report Card OR Marksheet</td>
				<td>
					<input type="file" name="studentEnclosedDocumentsForm.marksheetPathFile" class="fileUpload">
				</td>
			</tr>
			<tr>
				<td><form:checkbox path="studentEnclosedDocumentsForm.medicalCertiPathBool"/>Medical Form OR Certificate</td>
				<td>
					<input type="file" name="studentEnclosedDocumentsForm.medicalCertiPathFile" class="fileUpload">
				</td>
			</tr>
			<tr>
				<td><form:checkbox path="studentEnclosedDocumentsForm.ITRPathBool"/>ITR</td>
				<td>
					<input type="file" name="studentEnclosedDocumentsForm.ITRPathFile" class="fileUpload">
				</td>
			</tr>
			<tr>
				<td><form:checkbox path="studentEnclosedDocumentsForm.addressProofPathBool"/>Address Proof</td>
				<td>
					<input type="file" name="studentEnclosedDocumentsForm.addressProofPathFile" class="fileUpload">
				</td>
			</tr>
			<tr>
				<td><form:checkbox path="studentEnclosedDocumentsForm.progressReportPathBool"/>Progress Report</td>
				<td>
					<input type="file" name="studentEnclosedDocumentsForm.progressReportPathFile" class="fileUpload">
				</td>
			</tr>
			<tr>
				<td><form:checkbox path="studentEnclosedDocumentsForm.fatherPhotoPathBool"/>Father Photograph</td>
				<td>
					<input type="file" name="studentEnclosedDocumentsForm.fatherPhotoPathFile" class="fileUpload">
				</td>
			</tr>
			<tr>
				<td><form:checkbox path="studentEnclosedDocumentsForm.motherPhotoPathBool"/>Mother Photograph</td>
				<td>
					<input type="file" name="studentEnclosedDocumentsForm.motherPhotoPathFile" class="fileUpload">
				</td>
			</tr>
			<tr>
				<td><form:checkbox path="studentEnclosedDocumentsForm.guardianPhotoPathBool"/>Guardian Photograph</td>
				<td>
					<input type="file" name="studentEnclosedDocumentsForm.guardianPhotoPathFile" class="fileUpload">
				</td>
			</tr>
			<tr>
				<td><form:checkbox path="studentEnclosedDocumentsForm.NRIVisaDetailPathBool"/>NRI Visa Details</td>
				<td>
					<input type="file" name="studentEnclosedDocumentsForm.NRIVisaDetailPathFile" class="fileUpload">
				</td>
			</tr>
			<tr>
				<td><form:checkbox path="studentEnclosedDocumentsForm.migrationCertiPathBool"/>Migration Certificate</td>
				<td>
					<input type="file" name="studentEnclosedDocumentsForm.migrationCertiPathFile" class="fileUpload">
				</td>
			</tr>
			<tr>
				<td><form:checkbox path="studentEnclosedDocumentsForm.localGuardianUndertakingCertiPathBool"/>Local Guardian Undertaking Certificate</td>
				<td>
					<input type="file" name="studentEnclosedDocumentsForm.localGuardianUndertakingCertiPathFile" class="fileUpload">
				</td>
			</tr>
			<tr>
				<td><form:checkbox path="studentEnclosedDocumentsForm.parentUndertakingPathBool"/>Parents Undertaking & Immunization Certificate</td>
				<td>
					<input type="file" name="studentEnclosedDocumentsForm.parentUndertakingPathFile" class="fileUpload">
				</td>
			</tr>
			<tr>
				<td><form:checkbox path="studentEnclosedDocumentsForm.bondOfIndemnityPathBool"/>Bond of Indemnity</td>
				<td>
					<input type="file" name="studentEnclosedDocumentsForm.bondOfIndemnityPathFile" class="fileUpload">
				</td>
			</tr>
		</table>
	</p>
