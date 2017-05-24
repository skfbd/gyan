<%@ include file="../../common/includes.jsp"%>
<c:url  var="calendarImageUrl" value="/images/calendar.jpg" />
	<p>
		<table width="100%" class="table table-bordered table-hover">
			<tr>
				<td width="20%">Student first name *</td>
				<td width="30%"><form:input path="studentPersonalDetailsForm.studentFirstName" class="fielddecor inputFieldWidth "  /></td>
				<td width="20%">Student middle name </td>
				<td width="30%"><form:input path="studentPersonalDetailsForm.studentMiddleName" class="fielddecor inputFieldWidth "  /></td>
			</tr>
			<tr>
				<td>Student last name *</td>
				<td><form:input path="studentPersonalDetailsForm.studentLastName" class="fielddecor inputFieldWidth "  /></td>
				<td>Gender  *</td>
				<td><form:select id="gender" path="studentPersonalDetailsForm.studentGender" items="${genders}" itemLabel="name" itemValue="id" class="fielddecor inputFieldWidth " required="required"/></td>
			</tr>
			<tr>
				<td>Date of birth *</td>
				<td>
					<div class="input-group input-append date dateRangePicker calendarInputFieldWidth"> 
						<form:input type="text" id="birthDatePicker" class="form-control" path="studentPersonalDetailsForm.studentDob" /> 
							<span class="input-group-addon add-on">
								<span class="glyphicon glyphicon-calendar">
								</span>
							</span>
					</div>
				</td>
				<td>Birth place</td>
				<td><form:input path="studentPersonalDetailsForm.studentBirthPlace" class="fielddecor inputFieldWidth "  /></td>
			</tr>
			<tr>
				<td>Nationality</td>
				<td><form:select id="nationalities" path="studentPersonalDetailsForm.studentNationality" items="${nationalities}" itemLabel="name" itemValue="id" class="fielddecor inputFieldWidth " required="required"/></td>
				<td>Mother tongue</td>
				<td><form:input path="studentPersonalDetailsForm.studentMotherTongue" class="fielddecor inputFieldWidth" /></td>
			</tr>
			<tr>
				<td>Student fee category </td>
				<td><form:select id="studentFeeCategory" path="studentPersonalDetailsForm.studentFeeCategory" items="${feeCategories}" itemLabel="name" itemValue="id" class="fielddecor inputFieldWidth"/></td>
				<td>Student caste category *</td>
				<td><form:select id="studentCasteCategories" path="studentPersonalDetailsForm.studentCasteCategory" items="${casteCategories}" itemLabel="name" itemValue="id" class="fielddecor inputFieldWidth " required="required"/></td>
			</tr>
			<tr>
				<td>Religion</td>
				<td><form:input path="studentPersonalDetailsForm.studentReligion" class="fielddecor inputFieldWidth" /></td>
				<td>Religion caste</td>
				<td><form:input path="studentPersonalDetailsForm.studentReligionCaste" class="fielddecor inputFieldWidth" /></td>
			</tr>
			<tr>
				<td>Belong to locality</td>
				<td> 
					<form:radiobutton path="studentPersonalDetailsForm.studentLocality" value="R" class="fielddecor radioButtonInputFieldWidth" />&nbsp;Rural
					<form:radiobutton path="studentPersonalDetailsForm.studentLocality" value="U" class="fielddecor radioButtonInputFieldWidth" />&nbsp;Urban
				</td>
				<td>Blood Group *</td>
				<td><form:select id="studentBloudGroup" path="studentPersonalDetailsForm.studentBloodGroup" items="${bloodGroups}" itemLabel="name" itemValue="id" class="fielddecor inputFieldWidth"/></td>
			</tr>
			<tr>
				<td>Email-id</td>
				<td><form:input path="studentPersonalDetailsForm.studentEmailId" class="fielddecor inputFieldWidth" /></td>
				<td>Alternative email-id</td>
				<td><form:input path="studentPersonalDetailsForm.studentAltEmailId" class="fielddecor inputFieldWidth" /></td>
			</tr>
			<tr>
				<td>Student Age</td>
				<td><form:input path="studentPersonalDetailsForm.studentAge" class="fielddecor inputFieldWidth" /></td>
				<td>Fee Receipt No.</td>
				<td><form:input path="studentPersonalDetailsForm.studentFeeReciept" class="fielddecor inputFieldWidth" /></td>
			</tr>
		</table>
	</p>
