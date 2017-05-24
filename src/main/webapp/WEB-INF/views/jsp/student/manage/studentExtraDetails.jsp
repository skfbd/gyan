<%@ include file="../../common/includes.jsp"%>

	<p>
		<table width="100%" class="table table-bordered table-hover">
			<tr>
				<td width="30%">Does your child have any known allergy to food or medicine?</td>
				<td width="20%">
					<form:radiobutton id="studentHostelFacility" path="studentExtraDetailsForm.allergicToFood" value="Y" class="fielddecor" />&nbsp;Yes
					<form:radiobutton id="studentHostelFacility" path="studentExtraDetailsForm.allergicToFood" value="N" class="fielddecor" />&nbsp;No
				</td>
				<td width="20%">If YES, please specify:</td>
				<td width="30%"><form:input path="studentExtraDetailsForm.allergyToFoodStr" class="fielddecor inputFieldWidth" /></td>
			</tr>
			<tr>
				<td>Does your child wear glasses?</td>
				<td>
					<form:radiobutton id="studentHostelFacility" path="studentExtraDetailsForm.wearGlasses" value="Y" class="fielddecor" />&nbsp;Yes
					<form:radiobutton id="studentHostelFacility" path="studentExtraDetailsForm.wearGlasses" value="N" class="fielddecor" />&nbsp;No
				</td>
				<td>If YES, please specify:</td>
				<td><form:input path="studentExtraDetailsForm.wearGlassesStr" class="fielddecor inputFieldWidth" /></td>
			</tr>
			<tr>
				<td>Does your child have a speech difficulty?</td>
				<td>
					<form:radiobutton id="studentHostelFacility" path="studentExtraDetailsForm.speechDifficulty" value="Y" class="fielddecor" />&nbsp;Yes
					<form:radiobutton id="studentHostelFacility" path="studentExtraDetailsForm.speechDifficulty" value="N" class="fielddecor" />&nbsp;No
				</td>
				<td>If YES, please specify:</td>
				<td><form:input path="studentExtraDetailsForm.speechDifficultyStr" class="fielddecor inputFieldWidth" /></td>
			</tr>
			<tr>
				<td>Does your child have a hearing difficulty?</td>
				<td>
					<form:radiobutton id="studentHostelFacility" path="studentExtraDetailsForm.hearDifficulty" value="Y" class="fielddecor" />&nbsp;Yes
					<form:radiobutton id="studentHostelFacility" path="studentExtraDetailsForm.hearDifficulty" value="N" class="fielddecor" />&nbsp;No
				</td>
				<td>If YES, please specify:</td>
				<td><form:input path="studentExtraDetailsForm.hearingDifficultyStr" class="fielddecor inputFieldWidth" /></td>
			</tr>
			<tr>
				<td>Does your child have to take regular medicine?</td>
				<td>
					<form:radiobutton id="studentHostelFacility" path="studentExtraDetailsForm.regularMedicine" value="Y" class="fielddecor" />&nbsp;Yes
					<form:radiobutton id="studentHostelFacility" path="studentExtraDetailsForm.regularMedicine" value="N" class="fielddecor" />&nbsp;No
				</td>
				<td>If YES, please specify:</td>
				<td><form:input path="studentExtraDetailsForm.regularMedicineStr" class="fielddecor inputFieldWidth" /></td>
			</tr>
			<tr>
				<td>Is there any medicine that your child must avoid?</td>
				<td>
					<form:radiobutton id="studentHostelFacility" path="studentExtraDetailsForm.avoidMedicine" value="Y" class="fielddecor" />&nbsp;Yes
					<form:radiobutton id="studentHostelFacility" path="studentExtraDetailsForm.avoidMedicine" value="N" class="fielddecor" />&nbsp;No
				</td>
				<td>If YES, please specify:</td>
				<td><form:input path="studentExtraDetailsForm.avoidMedicineStr" class="fielddecor inputFieldWidth" /></td>
			</tr>
			<tr>
				<td>Does your child have any history of convulsions?</td>
				<td>
					<form:radiobutton id="studentHostelFacility" path="studentExtraDetailsForm.historyOfConvulsions" value="Y" class="fielddecor" />&nbsp;Yes
					<form:radiobutton id="studentHostelFacility" path="studentExtraDetailsForm.historyOfConvulsions" value="N" class="fielddecor" />&nbsp;No
				</td>
				<td>If YES, please specify:</td>
				<td><form:input path="studentExtraDetailsForm.historyOfConvulsionsStr" class="fielddecor inputFieldWidth" /></td>
			</tr>
			<tr>
				<td>Does your child require any special care?</td>
				<td>
					<form:radiobutton id="studentHostelFacility" path="studentExtraDetailsForm.specialCareRequired" value="Y" class="fielddecor" />&nbsp;Yes
					<form:radiobutton id="studentHostelFacility" path="studentExtraDetailsForm.specialCareRequired" value="N" class="fielddecor" />&nbsp;No
				</td>
				<td>If YES, please specify:</td>
				<td><form:input path="studentExtraDetailsForm.specialCareStr" class="fielddecor inputFieldWidth" /></td>
			</tr>
			<tr>
				<td>Does your child have any history of blood transfusion?</td>
				<td>
					<form:radiobutton id="studentHostelFacility" path="studentExtraDetailsForm.bloodTranfusion" value="Y" class="fielddecor" />&nbsp;Yes
					<form:radiobutton id="studentHostelFacility" path="studentExtraDetailsForm.bloodTranfusion" value="N" class="fielddecor" />&nbsp;No
				</td>
				<td>If YES, please specify:</td>
				<td><form:input path="studentExtraDetailsForm.bloodTranfusionStr" class="fielddecor inputFieldWidth" /></td>
			</tr>
			<tr>
				<td>Does your child have any history of hospitalization?</td>
				<td>
					<form:radiobutton id="studentHostelFacility" path="studentExtraDetailsForm.hospitalized" value="Y" class="fielddecor" />&nbsp;Yes
					<form:radiobutton id="studentHostelFacility" path="studentExtraDetailsForm.hospitalized" value="N" class="fielddecor" />&nbsp;No
				</td>
				<td>If YES, please specify:</td>
				<td><form:input path="studentExtraDetailsForm.historyOfHospitalization" class="fielddecor inputFieldWidth" /></td>
			</tr>
			<tr>
				<td>Is there a family history of </br>Diabetes/Hypertension/Mental</br> Disorders/Stroke/tuberculosis/Others.</td>
				<td>
					<form:radiobutton id="studentHostelFacility" path="studentExtraDetailsForm.familyDiseased" value="Y" class="fielddecor" />&nbsp;Yes
					<form:radiobutton id="studentHostelFacility" path="studentExtraDetailsForm.familyDiseased" value="N" class="fielddecor" />&nbsp;No
				</td>
				<td>If YES, please specify:</td>
				<td><form:input path="studentExtraDetailsForm.familyHistory" class="fielddecor inputFieldWidth" /></td>
			</tr>
			<tr>
				<td>Does your child has any disorder of colour vision?</td>
				<td>
					<form:radiobutton id="studentHostelFacility" path="studentExtraDetailsForm.colourVision" value="Y" class="fielddecor" />&nbsp;Yes
					<form:radiobutton id="studentHostelFacility" path="studentExtraDetailsForm.colourVision" value="N" class="fielddecor" />&nbsp;No
				</td>
				<td>If YES, please specify:</td>
				<td><form:input path="studentExtraDetailsForm.colourVisionStr" class="fielddecor inputFieldWidth" /></td>
			</tr>
			<tr>
				<td>Does your child has any affinity to take </br>particular medicine or other substance in </br>excess?</td>
				<td>
					<form:radiobutton id="studentHostelFacility" path="studentExtraDetailsForm.excessSubstance" value="Y" class="fielddecor" />&nbsp;Yes
					<form:radiobutton id="studentHostelFacility" path="studentExtraDetailsForm.excessSubstance" value="N" class="fielddecor" />&nbsp;No
				</td>
				<td>If YES, please specify:</td>
				<td><form:input path="studentExtraDetailsForm.excessSubstanceStr" class="fielddecor inputFieldWidth" /></td>
			</tr>
			<tr>
				<td>Does your child has any defective milestone of growth?</td>
				<td>
					<form:radiobutton id="studentHostelFacility" path="studentExtraDetailsForm.growthDefective" value="Y" class="fielddecor" />&nbsp;Yes
					<form:radiobutton id="studentHostelFacility" path="studentExtraDetailsForm.growthDefective" value="N" class="fielddecor" />&nbsp;No
				</td>
				<td>If YES, please specify:</td>
				<td><form:input path="studentExtraDetailsForm.growthDefectiveMilestone" class="fielddecor inputFieldWidth" /></td>
			</tr>
			<tr>
				<td>Does your child suffer from any communicable disease in the past?</td>
				<td>
					<form:radiobutton id="studentHostelFacility" path="studentExtraDetailsForm.anyPastDisease" value="Y" class="fielddecor" />&nbsp;Yes
					<form:radiobutton id="studentHostelFacility" path="studentExtraDetailsForm.anyPastDisease" value="N" class="fielddecor" />&nbsp;No
				</td>
				<td>If YES, please specify:</td>
				<td><form:input path="studentExtraDetailsForm.pastDisease" class="fielddecor inputFieldWidth" /></td>
			</tr>
		</table>
	</p>
