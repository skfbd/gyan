<%@ include file="../../common/includes.jsp"%>
<c:url  var="calendarImageUrl" value="/images/calendar.jpg" />
	<p>
		<table width="100%" class="table table-bordered table-hover">
			<tr>
				<td width="20%">Mother's name *</td>
				<td width="30%"><form:input path="studentMothersInfoForm.name" class="fielddecor inputFieldWidth "/></td>
				<td width="20%">Mother's DOB</td>
				<td width="30%">
					<div class="input-group input-append date dateRangePicker calendarInputFieldWidth"> 
						<form:input type="text" id="mothersDOB" class="form-control" path="studentMothersInfoForm.dob" /> 
							<span class="input-group-addon add-on">
								<span class="glyphicon glyphicon-calendar">
								</span>
							</span>
					</div>
				</td>
			</tr>
			<tr>
				<td>Mother's mobile number</td>
				<td><form:input path="studentMothersInfoForm.mobileNumber" class="fielddecor inputFieldWidth"/></td>
				<td>Mother's qualifications</td>
				<td><form:input path="studentMothersInfoForm.qualification" class="fielddecor inputFieldWidth"/></td>
			</tr>
			<tr>
				<td>Mother's profession</td>
				<td><form:input path="studentMothersInfoForm.profession" class="fielddecor inputFieldWidth"/></td>
				<td>Mother's designation (if in service)</td>
				<td><form:input path="studentMothersInfoForm.designation" class="fielddecor inputFieldWidth"/></td>
			</tr>
			<tr>
				<td>Mother's office address (if in service)</td>
				<td><form:input path="studentMothersInfoForm.officeAddress" class="fielddecor inputFieldWidth"/></td>
				<td>Mother's  office tel. no. (if in service)</td>
				<td><form:input path="studentMothersInfoForm.officePhoneNumber" class="fielddecor inputFieldWidth"/></td>
			</tr>
			<tr>
				<td>Mother's office Fax. No. (if in service)</td>
				<td><form:input path="studentMothersInfoForm.officeFaxNumber" class="fielddecor inputFieldWidth"/></td>
				<td>Mother's Email ID</td>
				<td><form:input path="studentMothersInfoForm.emailId" class="fielddecor inputFieldWidth"/></td>
			</tr>
			<tr>
				<td>Belongs to country</td>
				<td><form:select id="mothersCountry" path="studentMothersInfoForm.country" items="${countries}" itemLabel="name" itemValue="id" class="fielddecor inputFieldWidth "/></td>
				<td>Mother identity document type</td>
				<td><form:select id="mothersDocumentType" path="studentMothersInfoForm.idDocumentType" items="${documentTypes}" itemLabel="name" itemValue="id" class="fielddecor inputFieldWidth "/></td>
			</tr>
			<tr>
				<td>Identity document number</td>
				<td><form:input path="studentMothersInfoForm.idDocumentNumber" class="fielddecor inputFieldWidth" /></td>
				<td>Mother's Identity document scan copy</td>
				<td><form:input path="studentMothersInfoForm.idDocumentPath" class="fielddecor inputFieldWidth" /></td>
			</tr>
			<tr>
				<td>Mother's annual income</td>
				<td><form:input path="studentMothersInfoForm.annualIncome" class="fielddecor inputFieldWidth" /></td>
				<td>Mother's passport size image</td>
				<td><input type="file" name="studentMothersInfoForm.imagePathFile" class="fielddecor fileUpload" /></td>
			</tr>
		</table>
	</p>
