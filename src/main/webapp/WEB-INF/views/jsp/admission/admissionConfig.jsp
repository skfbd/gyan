<%@ include file="../../common/includes.jsp"%>
<script src="<c:url value="/jquery/calendar.js"/>"></script> 
<script src="<c:url value="/jquery/calendar-en.js"/>"></script> 
<script src="<c:url value="/jquery/calendar-setup_stripped.js"/>"></script> 
<c:url  var="saveAdmissionConfig" value="/Admission/saveAdmissionConfig.htm"/>

<script>
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
	
	$('.saveConfigDetails').click(function() {
		$('#mothersDOB').attr('value',$('#mothersDOB').val());
		$('#fathersDOB').attr('value',$('#fathersDOB').val());
		$('#lastSchoolStartDate').attr('value',$('#lastSchoolStartDate').val());
		$('#lastSchoolEndDate').attr('value',$('#lastSchoolEndDate').val());
		$('#birthDatePicker').attr('value',$('#birthDatePicker').val());
		$('#admissionDatePicker').attr('value',$('#admissionDatePicker').val());
		$.ajax({
			type: "POST",
			url: "${saveAdmissionConfig}",
			data: $('#admissionMasterFormId').serializefiles(),
		    contentType: false,
		    processData: false,
			success: function(response){
				$("#contentSection").html(response);
			}
		});
	});
	
	$('.dateRangePicker').datepicker({
		format : 'mm/dd/yyyy',
		startDate : '01/01/1900',
		endDate : '30/12/2050'
	});

	$('#countryEntity').change(function() {
		sprout('stateEntity', this.id)
	});

	$('#stateEntity').change(function() {
		sprout('cityEntity', this.id)
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

		if(($("#admissionSaveDiv").height()<256))
		{
			$("#admissionSaveDiv").stop().animate({"marginTop": "10px"} , "slow" );
		}
	});
	
	$('#collapseAll').click(function(){
		$('.panel-body').css('display','none');
		$('.accordion-header').removeClass('accordion-header-selected');
		$('.panel-tool-collapse').addClass('panel-tool-expand');
		$('.accordion-collapse').addClass('accordion-expand');
	});
	$('#expandAll').click(function(){
		$('.panel-body').css('display','block');
		$('.accordion-header').addClass('accordion-header-selected');
		$('.panel-tool-collapse').removeClass('panel-tool-expand');
		$('.accordion-collapse').removeClass('accordion-expand');
	});
</script>

<form:form method="post" enctype="multipart/form-data" id="admissionMasterFormId" modelAttribute="admissionMasterForm">
	<!-- <div class="box-header with-border bg-yellow ribbon ">
		<div id="admissionCreateHeader" style="color:#5cb85c; font-size: 20px;"> <b>Add New admission</b></div>
	</div> -->
	<div id="admissionSaveDiv" class="btn-group btn-group-lg SubmitButton" style="padding-left:400px;z-index:1200;position:fixed;">
		 <button type="button" class="btn btn-success saveConfigDetails">Save</button>
		 <button type="button" class="btn btn-success" id="collapseAll">Collapse All</button>
		 <button type="button" class="btn btn-success" id="expandAll">Expand All</button>
	</div>
	<div class="easyui-accordion" data-options="multiple:true" style="width:100%;">
		<div title="Prospectus Configuration" style="overflow:auto;padding:10px;">
			<jsp:include page="prospectusConfiguration.jsp"/>
		</div>
		<div title="Admission Related Student Document" style="padding:10px;">
			<jsp:include page="admissionRelatedStudentDocument.jsp"/>
		</div>
		<div title="Admission Criteria" style="padding:10px;">
			<jsp:include page="admissionCriteria.jsp"/>
		</div>
		<div title="Admission Stages Configuration" style="padding:10px;">
			<jsp:include page="admissionStagesConfiguration.jsp"/>
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