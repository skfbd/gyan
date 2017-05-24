<%@ include file="../../common/includes.jsp"%>
<c:url  var="calendarImageUrl" value="/images/calendar.jpg" />
	<p>
	<table width="100%" class="table table-bordered table-hover">
			<tr>
				<td width="20%">Date of admission *</td>
				<td width="30%">
					<div class="input-group input-append date dateRangePicker calendarInputFieldWidth"> 
						<form:input type="text" id="admissionDatePicker" class="form-control" path="studentAcademicDetailsForm.studentAdmissionDate" /> 
							<span class="input-group-addon add-on">
								<span class="glyphicon glyphicon-calendar">
								</span>
							</span>
					</div>
				</td>
				<td width="20%">School *</td>
				<td width="30%"><form:select id="academicSchools" path="studentAcademicDetailsForm.studentSchool" items="${schools}" itemLabel="name" itemValue="id" class="fielddecor inputFieldWidth  select-input" /></td>
			</tr>
			<tr>
				<td>Admission Session *</td>
				<td><form:select id="academicSessions" path="studentAcademicDetailsForm.studentAdmissionSession" items="${sessions}" itemLabel="name" itemValue="id" class="fielddecor inputFieldWidth  select-input"/></td>
				<td>First day in session</td>
				<td><form:input path="studentAcademicDetailsForm.studentFistDaySession"  class="fielddecor inputFieldWidth" /></td>
			</tr>
			<tr>
				<td>Currently in session </td>
				<td><form:select id="academicCurrentSession" path="studentAcademicDetailsForm.studentCurrentlyInSession" items="${sessions}" itemLabel="name" itemValue="id" class="fielddecor inputFieldWidth"/></td>
				<td>Class *</td>
				<td><form:select id="academicClass" path="studentAcademicDetailsForm.studentClass" items="${classes}" itemLabel="name" itemValue="id" class="fielddecor inputFieldWidth  select-input"/></td>
			</tr>
			<tr>
				<td>Currently in section </td>
				<td><form:select id="academicCurrentSection" path="studentAcademicDetailsForm.studentSection" items="${sections}" itemLabel="name" itemValue="id" class="fielddecor inputFieldWidth"/></td>
				<td>Class in which student got admitted in school *</td>
				<td><form:select id="academicAdmitClass" path="studentAcademicDetailsForm.classStudentGotAdmitted" items="${classes}" itemLabel="name" itemValue="id" class="fielddecor inputFieldWidth  select-input"/></td>
			</tr>
			<tr>
				<td>Second Language</td>
				<td><form:select id="academicSecondLang" path="studentAcademicDetailsForm.studentSecondLanguage" items="${languages}" itemLabel="name" itemValue="id" class="fielddecor inputFieldWidth"/></td>
				<td>Third Language</td>
				<td><form:select id="academicThirdLang" path="studentAcademicDetailsForm.studentThirdLanguage" items="${languages}" itemLabel="name" itemValue="id" class="fielddecor inputFieldWidth"/></td>
			</tr>		
			<tr>
				<td>Student house</td>
				<td><form:input path="studentAcademicDetailsForm.studentHouse" class="fielddecor inputFieldWidth" /></td>
				<td>Scholar number (if any)</td>
				<td><form:input path="studentAcademicDetailsForm.studentScholarNumber" class="fielddecor inputFieldWidth " /></td>
			</tr>
			<tr>
				<td>Registration Number</td>
				<td><form:input path="studentAcademicDetailsForm.studentRegistrationNumber" class="fielddecor inputFieldWidth" /></td>
				<td>Admission Number</td>
				<td><form:input path="studentAcademicDetailsForm.studentAdmissionNumber" class="fielddecor inputFieldWidth " /></td>
			</tr>
			<tr>
				<td>Student's passport size image</td>
				<td><form:input path="studentAcademicDetailsForm.studentImagePath" class="fielddecor inputFieldWidth" /></td>
				<td>Remark</td>
				<td><form:textarea path="studentAcademicDetailsForm.studentRemark" class="fielddecor inputFieldWidth " /></td>
			</tr>
			<tr>
				<td>Device Id</td>
				<td><form:input path="studentAcademicDetailsForm.studentDeviceId" class="fielddecor inputFieldWidth" /></td>
				<td>RF Id</td>
				<td><form:input path="studentAcademicDetailsForm.studentRFID" class="fielddecor inputFieldWidth " /></td>
			</tr>
		</table>
</p>