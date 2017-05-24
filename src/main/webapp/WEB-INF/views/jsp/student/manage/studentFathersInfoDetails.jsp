<%@ include file="../../common/includes.jsp"%>
<c:url  var="calendarImageUrl" value="/images/calendar.jpg" />
	<p>
		<table width="100%" class="table table-bordered table-hover">
			<tr>
				<td width="20%">Father's name *</td>
				<td width="30%"><form:input path="studentFathersInfoForm.name" class="fielddecor inputFieldWidth " /></td>
				<td width="20%">Father's DOB</td>
				<td width="30%">
					<div class="input-group input-append date dateRangePicker calendarInputFieldWidth"> 
						<form:input type="text" id="fathersDOB" class="form-control" path="studentFathersInfoForm.dob" /> 
							<span class="input-group-addon add-on">
								<span class="glyphicon glyphicon-calendar">
								</span>
							</span>
					</div>
				</td>
			</tr>
			<tr>
				<td>Father's mobile number</td>
				<td><form:input path="studentFathersInfoForm.mobileNumber" class="fielddecor inputFieldWidth"/></td>
				<td>Father's qualifications</td>
				<td><form:input path="studentFathersInfoForm.qualification" class="fielddecor inputFieldWidth"/></td>
			</tr>
			<tr>
				<td>Father's profession</td>
				<td><form:input path="studentFathersInfoForm.profession" class="fielddecor inputFieldWidth"/></td>
				<td>Father's designation (if in service)</td>
				<td><form:input path="studentFathersInfoForm.designation" class="fielddecor inputFieldWidth"/></td>
			</tr>
			<tr>
				<td>Father's office address (if in service)</td>
				<td><form:input path="studentFathersInfoForm.officeAddress" class="fielddecor inputFieldWidth"/></td>
				<td>Father's  office tel. no. (if in service)</td>
				<td><form:input path="studentFathersInfoForm.officePhoneNumber" class="fielddecor inputFieldWidth"/></td>
			</tr>
			<tr>
				<td>Father's office Fax. No. (if in service)</td>
				<td><form:input path="studentFathersInfoForm.officeFaxNumber" class="fielddecor inputFieldWidth"/></td>
				<td>Father's Email ID</td>
				<td><form:input path="studentFathersInfoForm.emailId" class="fielddecor inputFieldWidth"/></td>
			</tr>
			<tr>
				<td>Belongs to country</td>
				<td><form:select id="fathersCountry" path="studentFathersInfoForm.country" items="${countries}" itemLabel="name" itemValue="id" class="fielddecor inputFieldWidth " /></td>
				<td>Father identity document type</td>
				<td><form:select id="fathersDocumentType" path="studentFathersInfoForm.idDocumentType" items="${documentTypes}" itemLabel="name" itemValue="id" class="fielddecor inputFieldWidth " /></td>
			</tr>
			<tr>
				<td>Identity document number</td>
				<td><form:input path="studentFathersInfoForm.idDocumentNumber" class="fielddecor inputFieldWidth" /></td>
				<td>Father's Identity document scan copy</td>
				<td><form:input path="studentFathersInfoForm.idDocumentPath" class="fielddecor inputFieldWidth" /></td>
			</tr>
			<tr>
				<td>Father's annual income</td>
				<td><form:input path="studentFathersInfoForm.annualIncome" class="fielddecor inputFieldWidth" /></td>
				<td>Father's passport size image</td>
				<td><input type="file" name="studentFathersInfoForm.imagePathFile" class="fielddecor fileUpload" /></td>
			</tr>
		</table>
	</p>
