<%@ include file="../../common/includes.jsp"%>
<script src="<c:url value="/jquery/calendar.js"/>"></script> 
<script src="<c:url value="/jquery/calendar-en.js"/>"></script> 
<script src="<c:url value="/jquery/calendar-setup_stripped.js"/>"></script> 
<c:url  var="updateStudent" value="/StudentUpdate/studentUpdateSave.htm" />

<script>
	$.extend($.fn.validatebox.defaults.rules, {
		notEquals : {
			validator : function(value, param) {
				return value !== $(param[0]).val();
			},
			message : 'Please select a value.'
		}
	});
	(function($) {
		$.fn.serializefiles = function() {
		    var obj = $(this);
		    /* ADD FILE TO PARAM AJAX */
		    var formData = new FormData();
		    $.each($(obj).find("input[type='file']"), function(i, tag) {
		        $.each($(tag)[0].files, function(i, file) {
		            formData.append(tag.name, file);
		        });
		    });
		    var params = $(obj).serializeArray();
		    $.each(params, function (i, val) {
		        formData.append(val.name, val.value);
		    });
		    return formData;
		};
	})(jQuery);
	$('.updateStudent').click(function() {
		$('#mothersDOB').attr('value',$('#mothersDOB').val());
		$('#fathersDOB').attr('value',$('#fathersDOB').val());
		$('#lastSchoolStartDate').attr('value',$('#lastSchoolStartDate').val());
		$('#lastSchoolEndDate').attr('value',$('#lastSchoolEndDate').val());
		$('#birthDatePicker').attr('value',$('#birthDatePicker').val());
		$('#admissionDatePicker').attr('value',$('#admissionDatePicker').val());
		$.ajax({
			type: "POST",
			url: "${updateStudent}",
			data: $('#studentMasterFormUpdateId').serializefiles(),
		    contentType: false,
		    processData: false,
			success: function(response){
				$("#contentSection").html(response);
			}
		});
	});
	

	$('#countries').change(function() {
		sprout('states', this.id)
	});

	$('#states').change(function() {
		sprout('cities', this.id)
	});
	
	$('#orgTypes').change(function() {
		if(this.value=='organization'){
			$('#orgHeadLabel, #orgHeadValue').removeClass('hide')
		}else{
			$('#orgHeadLabel, #orgHeadValue').addClass('hide')		
		}
	});

	
	 function getFormattedDate(dt) {
			dtArr=dt.split('/');
			return dtArr[1] + '/' + dtArr[0] + '/' + dtArr[2];
		}
	$(window).scroll(function(){
		if(($("#studentSaveDiv").height()<256))
		{
			$("#studentSaveDiv").stop().animate({"marginTop": "10px"} , "slow" );
		}
	});
	$('.dateRangePicker').datepicker({
		format : 'mm/dd/yyyy',
		startDate : '01/01/1900',
		endDate : '30/12/2050'
	});
	$('#studentCollapseAll').click(function(){
		$('.panel-body').css('display','none');
		$('.accordion-header').removeClass('accordion-header-selected');
		$('.panel-tool-collapse').addClass('panel-tool-expand');
		$('.accordion-collapse').addClass('accordion-expand');
	});
	$('#studentExpandAll').click(function(){
		$('.panel-body').css('display','block');
		$('.accordion-header').addClass('accordion-header-selected');
		$('.panel-tool-collapse').removeClass('panel-tool-expand');
		$('.accordion-collapse').removeClass('accordion-expand');
	});
</script>

<form:form method="post" enctype="multipart/form-data" modelAttribute="studentMasterForm" id="studentMasterFormUpdateId">
	<div class="box-header with-border bg-yellow ribbon ">
		<div id="studentUpdateHeader" style="color:#5cb85c; font-size: 20px;"> <b>Edit Student</b><br/>
		Student Id : ${studentMasterForm.studentId} &nbsp;&nbsp;&nbsp;&nbsp;Student Name : 
		</div>
	</div>
	<div id="studentSaveDiv" class="btn-group btn-group-lg SubmitButton" style="padding-left:400px;z-index:1200;position:fixed;">
		 <button type="button" class="btn btn-success updateStudent">Save</button>
		 <button type="button" class="btn btn-success" id="studentCollapseAll">Collapse All</button>
		 <button type="button" class="btn btn-success" id="studentExpandAll">Expand All</button>
	</div>
	<form:hidden path="studentId"/>
	<div class="easyui-accordion" data-options="multiple:true" style="width:100%;">
		<div title="Academic Details" style="overflow:auto;padding:10px;">
			<form:hidden path="studentAcademicDetailsForm.studentId"/>
			<form:hidden path="studentAcademicDetailsForm.id"/>
			<jsp:include page="studentAcademicDetails.jsp"/>
		</div>
		<div title="Student Details" style="padding:10px;">
			<form:hidden path="studentPersonalDetailsForm.studentId"/>
			<form:hidden path="studentPersonalDetailsForm.id"/>
			<jsp:include page="studentPersonalDetails.jsp"/>
		</div>
		<div title="Other Information" style="padding:10px;">
			<form:hidden path="studentOtherInfoForm.studentId"/>
			<form:hidden path="studentOtherInfoForm.id"/>
			<jsp:include page="studentOtherInfoDetails.jsp"/>
		</div>
		<div title="Other Facility" style="padding:10px;">
			<form:hidden path="studentOtherFacilityForm.studentId"/>
			<form:hidden path="studentOtherFacilityForm.id"/>
			<jsp:include page="studentOtherFacilityDetails.jsp"/>
		</div>
		<div title="Extra Details - Please tick the appropriate boxes" style="padding:10px;">
			<form:hidden path="studentExtraDetailsForm.studentId"/>
			<form:hidden path="studentExtraDetailsForm.id"/>
			 <jsp:include page="studentExtraDetails.jsp"/>
		</div> 
		<div title="Infectious Diseases" style="padding:10px;">
			<form:hidden path="studentInfectiousDetailsForm.studentId"/>
			<form:hidden path="studentInfectiousDetailsForm.id"/>
			<jsp:include page="studentInfectiousDetails.jsp"/>
		</div>
		<div title="Non Infectious Diseases" style="padding:10px;">
			<form:hidden path="studentNonInfectiousDetailsForm.studentId"/>
			<form:hidden path="studentNonInfectiousDetailsForm.id"/>
			<jsp:include page="studentNonInfectiousDetails.jsp"/>
		</div>
		<div title="Other Health Information" style="padding:10px;">
			<form:hidden path="studentHealthDetailsForm.studentId"/>
			<form:hidden path="studentHealthDetailsForm.id"/>
			<jsp:include page="studentOtherHealthDetails.jsp"/>
		</div>
		<div title="Last Academic Information" style="padding:10px;">
			<form:hidden path="studentLastAcademicDetailsForm.studentId"/>
			<form:hidden path="studentLastAcademicDetailsForm.id"/>
			<jsp:include page="studentLastAcademicDetails.jsp"/>
		</div>
		<div title="Address Information" style="padding:10px;">
			<form:hidden path="studentAddressForm.studentId"/>
			<form:hidden path="studentAddressForm.id"/>
			<jsp:include page="studentAddressDetails.jsp"/>
		</div>
		<div title="Parental information" style="padding:10px;">
			<form:hidden path="studentSibblingInfoForm.studentId"/>
			<form:hidden path="studentSibblingInfoForm.id"/>
			<jsp:include page="studentSiblingDetails.jsp"/>
		</div>
		<div title="Father's information" style="padding:10px;">
			<form:hidden path="studentFathersInfoForm.studentId"/>
			<form:hidden path="studentFathersInfoForm.id"/>
			<jsp:include page="studentFathersInfoDetails.jsp"/>
		</div>
		<div title="Mother's Information" style="padding:10px;">
		<form:hidden path="studentMothersInfoForm.studentId"/>
			<form:hidden path="studentMothersInfoForm.id"/>
			<jsp:include page="studentMothersInfoDetails.jsp"/>
		</div>
		<div title="Local guardian's information" style="padding:10px;">
			<form:hidden path="studentLocalGuardianInfoForm.studentId"/>
			<form:hidden path="studentLocalGuardianInfoForm.id"/>
			<jsp:include page="studentLocalGuardianDetails.jsp"/>
		</div>
		 <div title="Common Parental Information" style="padding:10px;">
		 	<form:hidden path="studentParentalCommonInfoForm.studentId"/>
			<form:hidden path="studentParentalCommonInfoForm.id"/>
			<jsp:include page="studentCommonParentalDetails.jsp"/>
		</div>
		<div title="Enclosed Document" style="padding:10px;">
			<form:hidden path="studentEnclosedDocumentsForm.studentId"/>
			<form:hidden path="studentEnclosedDocumentsForm.id"/>
			<jsp:include page="studentEnclosedDocument.jsp"/>
		</div>
	</div>
	
</form:form>
<script>
		sproutEntity('countries','CountryEntity');
		sproutEntity('fathersCountry','CountryEntity');
		sproutEntity('mothersCountry','CountryEntity');
		sproutEntity('localGuardianCountry','CountryEntity');
		sproutEntity('academicSchools','schoolLOV');
		sproutEntity('nationalities','NationalityLOV');
		sproutEntity('gender','GenderLOVEntity');
		sproutEntity('studentCasteCategories','CasteCategoryLOVEntity');
		sproutEntity('studentBloudGroup','BloodGroupLOVEntity');
		sproutEntity('academicSecondLang','LanguagesLOVEntity');
		sproutEntity('academicThirdLang','LanguagesLOVEntity');
		sproutEntity('studentIdentityDocumentType','IdentityDocumentLOVEntity');
		sproutEntity('fathersDocumentType','IdentityDocumentLOVEntity');
		sproutEntity('mothersDocumentType','IdentityDocumentLOVEntity');
		sproutEntity('guardiansDocumentType','IdentityDocumentLOVEntity');
		sproutEntity('siblingSchool','schoolLOV');
		$('#countries').change(function() {
			sproutOnChangeEntity('states', this.id,'stateEntity');
		});
		$('#states').change(function() {
			sproutOnChangeEntity('cities', this.id,'cityEntity');
		});
		//sprout('OrganizationLOV');
</script>