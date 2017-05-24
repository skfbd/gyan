<%@ include file="../../common/includes.jsp"%>
<c:url  var="urlempSave" value="/employee/employeeSaveUpdate.htm" />
<link media="screen" rel="stylesheet"
	href="<c:url value="/bootstrap/css/prettify.css"/>" type="text/css"></link>
    <link media="screen" rel="stylesheet"
	href="<c:url value="/bootstrap/css/bootstrap.min.css"/>"
	type="text/css"></link>
	
<link media="screen" rel="stylesheet"
 href="<c:url value="/plugins/validation/css/validationEngine.jquery.css"/>" type="text/css"></link>

 <script src="<c:url value="/jquery/calendar.js"/>"></script> 
<script src="<c:url value="/jquery/calendar-en.js"/>"></script> 
<script src="<c:url value="/jquery/calendar-setup_stripped.js"/>"></script>
<script src="<c:url value="/plugins/validation/jquery.validationEngine-en.js"/>"></script>
<script src="<c:url value="/plugins/validation/jquery.validationEngine.js"/>"></script>
<script src="<c:url value="/jquery/jquery.blockUI.js"/>"></script>
<c:url var="urldesignationId" value="/employee/getDesignationList.htm" />
<style>

.stepwizard-step p {
    margin-top: 20px;
}
.stepwizard-row {
    display: table-row;
}
.stepwizard {
    display: table;
    width: 95%;
    position: relative;
}
.stepwizard-step button[disabled] {
    opacity: 1 !important;
    filter: alpha(opacity=100) !important;
}
.stepwizard-row:before {
    top: 14px;
    bottom: 0;
    position: absolute;
    content: " ";
    width: 100%;
    height: 1px;
    background-color: #fff;
    z-order: 0;
}
.stepwizard-step {
    display: table-cell;
    text-align: center;
    position: relative;
}
.btn-circle {
    width: 60px;
    height: 50px;
    text-align: center;
    padding: 7px 0;
    font-size: 22px;
    line-height: 1.428571429;
    border-radius: 25px;
}

.primary{
background: rgba(255,175,75,1);
background: -moz-linear-gradient(left, rgba(255,175,75,1) 0%, rgba(255,146,10,0.99) 24%, rgba(255,146,10,0.95) 86%);
background: -webkit-gradient(left top, right top, color-stop(0%, rgba(255,175,75,1)), color-stop(24%, rgba(255,146,10,0.99)), color-stop(86%, rgba(255,146,10,0.95)));
background: -webkit-linear-gradient(left, rgba(255,175,75,1) 0%, rgba(255,146,10,0.99) 24%, rgba(255,146,10,0.95) 86%);
background: -o-linear-gradient(left, rgba(255,175,75,1) 0%, rgba(255,146,10,0.99) 24%, rgba(255,146,10,0.95) 86%);
background: -ms-linear-gradient(left, rgba(255,175,75,1) 0%, rgba(255,146,10,0.99) 24%, rgba(255,146,10,0.95) 86%);
background: linear-gradient(to right, rgba(255,175,75,1) 0%, rgba(255,146,10,0.99) 24%, rgba(255,146,10,0.95) 86%);
filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#ffaf4b', endColorstr='#ff920a', GradientType=1 );
}

.inputFieldHeight{
	height:30px;
   width:170px;
}

.selectFieldHeight{
   height:30px;
   width:170px;
}

.calendarinputFieldHeight{
    height:30px;
    width:150px;
}

.grad23 {
	background: rgba(134,174,204,1);
background: -moz-linear-gradient(left, rgba(134,174,204,1) 0%, rgba(212,228,239,1) 0%, rgba(212,228,239,1) 100%);
background: -webkit-gradient(left top, right top, color-stop(0%, rgba(134,174,204,1)), color-stop(0%, rgba(212,228,239,1)), color-stop(100%, rgba(212,228,239,1)));
background: -webkit-linear-gradient(left, rgba(134,174,204,1) 0%, rgba(212,228,239,1) 0%, rgba(212,228,239,1) 100%);
background: -o-linear-gradient(left, rgba(134,174,204,1) 0%, rgba(212,228,239,1) 0%, rgba(212,228,239,1) 100%);
background: -ms-linear-gradient(left, rgba(134,174,204,1) 0%, rgba(212,228,239,1) 0%, rgba(212,228,239,1) 100%);
background: linear-gradient(to right, rgba(134,174,204,1) 0%, rgba(212,228,239,1) 0%, rgba(212,228,239,1) 100%);
filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#86aecc', endColorstr='#d4e4ef', GradientType=1 );}





</style>
<div id="mainModule">
<div id="subMod">
 <script>
  $(document).ready(function () {
	  var navListItems = $('div.setup-panel div a'),
      allWells = $('.setup-content'),
      allNextBtn = $('.nextBtn'),
		  allPrevBtn = $('.prevBtn');

allWells.hide();

navListItems.click(function (e) {
  e.preventDefault();
  var $target = $($(this).attr('href')),
          $item = $(this);

  if (!$item.hasClass('disabled')) {
      navListItems.removeClass('btn-warning').addClass('btn-default');
      $item.addClass('btn-warning');
      allWells.hide();
      $target.show();
      $target.find('input:eq(0)').focus();
  }
});

allPrevBtn.click(function(){
  var curStep = $(this).closest(".setup-content"),
      curStepBtn = curStep.attr("id"),
      prevStepWizard = $('div.setup-panel div a[href="#' + curStepBtn + '"]').parent().prev().children("a");

      prevStepWizard.removeAttr('disabled').trigger('click');
});

allNextBtn.on('click',function(){
  var curStep = $(this).closest(".setup-content"),
      curStepBtn = curStep.attr("id"),
      nextStepWizard = $('div.setup-panel div a[href="#' + curStepBtn + '"]').parent().next().children("a"),
      curInputs = curStep.find("input[type='text'],input[type='url']"),
      isValid = true;

  $(".form-group").removeClass("has-error");
  for(var i=0; i<curInputs.length; i++){
      if (!curInputs[i].validity.valid){
          isValid = false;
          $(curInputs[i]).closest(".form-group").addClass("has-error");
      }
  }

  if (isValid)
      nextStepWizard.removeAttr('disabled').trigger('click');
});

$('div.setup-panel div a.btn-warning').trigger('click');

	});

  </script>


	
<script type="text/javascript"
	src="<c:url value="/bootstrap/js/jquery.bootstrap.wizard.min.js"/>" /></script>
<script type="text/javascript"
	src="<c:url value="/multiRow/jquery.dynamiclist.min.js"/>" /></script>

<div  style="width:100%;padding-top:5px; border-radius: 25px;
    border: 2px solid #8AC007;
    padding: 20px;height: 120px; ">

    <div class="stepwizard-row setup-panel" >
     <div class="stepwizard-step" style="padding-right:25px;overflow:auto;">
        <a href="#step-1" type="button" class="btn btn-warning" style="border-radius: 200px 200px 200px 200px;
-moz-border-radius: 200px 200px 200px 200px;
-webkit-border-radius: 200px 200px 200px 200px;
border: 0px solid #000000;">1</a>
        <p>Personal</p>
      </div>
      <div class="stepwizard-step" style="padding-right:25px;overflow:auto;">
        <a href="#step-2" type="button" class="btn btn-default" disabled="disabled" style="border-radius: 200px 200px 200px 200px;
-moz-border-radius: 200px 200px 200px 200px;
-webkit-border-radius: 200px 200px 200px 200px;
border: 0px solid #000000;">2</a>
        <p>Communication</p>
      </div>
      <div class="stepwizard-step" style="padding-right:25px;">
        <a href="#step-3" type="button" class="btn btn-default" disabled="disabled" style="border-radius: 200px 200px 200px 200px;
-moz-border-radius: 200px 200px 200px 200px;
-webkit-border-radius: 200px 200px 200px 200px;
border: 0px solid #000000;">3</a>
        <p>Educational</p>
      </div>
       <div class="stepwizard-step" style="padding-right:25px;">
        <a href="#step-4" type="button" class="btn btn-default" disabled="disabled" style="border-radius: 200px 200px 200px 200px;
-moz-border-radius: 200px 200px 200px 200px;
-webkit-border-radius: 200px 200px 200px 200px;
border: 0px solid #000000;">4</a>
        <p>Past Experience</p>
      </div>
       <div class="stepwizard-step" style="padding-right:25px;">
        <a href="#step-5" type="button" class="btn btn-default" disabled="disabled" style="border-radius: 200px 200px 200px 200px;
-moz-border-radius: 200px 200px 200px 200px;
-webkit-border-radius: 200px 200px 200px 200px;
border: 0px solid #000000;">5</a>
        <p>Past Project</p>
      </div>
	 <div class="stepwizard-step" style="padding-right:25px;">
        <a href="#step-6" type="button" class="btn btn-default" disabled="disabled" style="border-radius: 200px 200px 200px 200px;
-moz-border-radius: 200px 200px 200px 200px;
-webkit-border-radius: 200px 200px 200px 200px;
border: 0px solid #000000;">6</a>
        <p>Payroll Related</p>
      </div>
       <div class="stepwizard-step" style="padding-right:25px;">
        <a href="#step-7" type="button" class="btn btn-default" disabled="disabled" style="border-radius: 200px 200px 200px 200px;
-moz-border-radius: 200px 200px 200px 200px;
-webkit-border-radius: 200px 200px 200px 200px;
border: 0px solid #000000;">7</a>
        <p>Official</p>
      </div>
    </div>
</div>
 
  <form:form id="employeedtl" class="saveEmployee" name="employeefrm" method="post" modelAttribute="employeefrm" enctype="multipart/form-data">
    <div  class="row setup-content" style="padding-left:15px;padding-top:5px;" id="step-1">
         
        <div id="personaldivId">
            <div id="personalId" style="width:98%;padding-top:5px; border-radius: 25px;border: 2px solid #8AC007;padding: 20px;">
              <jsp:include page="empPersonalDtl.jsp"></jsp:include>
            </div>
       </div>
       
       <table>
				<tr >
					<td style="padding-top:10px;padding-left:130px;">
						<div  class="btn-group btn-group-lg personalclass">
						    <button type="button"  id="savePersonaldtl" class="btn  btn-primary  btn-xs">Save</button>
	 						 <button type="button"  class="btn  btn-primary  nextBtn btn-xs">Save and Continue</button>
	 						 <button type="button" class="btn  btn-primary  nextBtn btn-xs">Next</button>
					    </div>
					</td>
				</tr>	
        </table>
		
    </div>
   <div  class="row setup-content" id="step-2" style="padding-left:15px;padding-top:5px;">
        <div id="communicationDivId">
         <div  style="width:98%;padding-top:5px; border-radius: 25px;border: 2px solid #8AC007;padding: 20px;">
           <jsp:include page="empCommunctionDtl.jsp"></jsp:include>
         </div>
        </div>
         <table>
				<tr>
					<td style="padding-top:10px;padding-left:120px;">
						<div class="btn-group btn-group-lg">
						     <button type="button"  class="btn prevBtn btn-primary">Previous</button>
	 						 <button type="button" class="btn  btn-primary" id="saveCommunitcation">Save and Continue</button>
							 <button type="button" class="btn  btn-primary nextBtn">Next</button>
					    </div>
					</td>
					</tr>	
			</table>
   </div>
   
    <div  class="row setup-content" id="step-3" style="padding-left:20px;">
          <div id="educationDivId">
            <div  style="width:98%;padding-top:5px; border-radius: 25px;border: 2px solid #8AC007;padding: 20px;">
             <jsp:include page="empEduDtl.jsp"></jsp:include>
            </div>
          </div>
           <table>
				<tr >
					<td style="padding-top:10px;padding-left:120px;">
						<div class="btn-group btn-group-lg">
						     <button type="button"  class="btn prevBtn btn-primary">Previous</button>
	 						 <button type="button"  id="saveEdudtl" class="btn  btn-primary nextBtn">Save and Continue</button>
	 						 <button type="button" class="btn  btn-primary nextBtn">Next</button>
					    </div>
					</td>
					</tr>	
			</table>
    </div>
    <div  class="row setup-content " id="step-4" style="padding-left:20px;">
           <div id="empPastExpDivId">
            <div  style="width:98%;padding-top:10px; border-radius: 25px;border: 2px solid #8AC007;padding: 20px;">
              <jsp:include page="empPastExpDtl.jsp"></jsp:include>
            </div>
           </div>
           <table>
				<tr >
					<td style="padding-top:10px;padding-left:160px;">
						<div class="btn-group btn-group-lg">
						     <button type="button"  class="btn prevBtn btn-primary">Previous</button>
	 						 <button type="button"  id="saveEmpPastExp" class="btn  btn-primary nextBtn">Save and Continue</button>
	 						 <button type="button" class="btn  btn-primary nextBtn">Next</button>
					    </div>
					</td>
					</tr>	
            </table>
           
    </div>
    <div  class="row setup-content" id="step-5" style="padding-left:20px;">
         <div id="empPastProjectDivId">
            <div  style="width:98%;padding-top:10px; border-radius: 25px;border: 2px solid #8AC007;padding: 20px;">
                <jsp:include page="empPastProjDtl.jsp"></jsp:include>
            </div>
         </div>
          <table>
				<tr >
					<td style="padding-top:10px;padding-left:150px;">
						<div class="btn-group btn-group-lg">
						     <button type="button"  class="btn prevBtn  btn-primary">Previous</button>
	 						 <button type="button"  id="saveEmpPastProject" class="btn   btn-primary nextBtn">Save and Continue</button>
	 					     <button type="button" class="btn   btn-primary nextBtn">Next</button>
					    </div>
					</td>
					</tr>	
            </table>
    </div>
    <div  class="row setup-content" id="step-6" style="padding-left:20px;">
           <div id="empPayRollDivId">
            <div  style="width:98%;padding-top:10px; border-radius: 25px;border: 2px solid #8AC007;padding: 20px;">
             <jsp:include page="empPayRollDtl.jsp"></jsp:include>
            </div>
          </div>
          <table>
				<tr >
					<td style="padding-top:10px;padding-left:130px;">
						<div class="btn-group btn-group-lg">
						     <button type="button"  class="btn prevBtn btn-primary">Previous</button>
	 						 <button type="button"  id="savePayRoll" class="btn  btn-primary nextBtn">Save and Continue</button>
	 						 <button type="button" class="btn  btn-primary nextBtn">Next</button>
					    </div>
					</td>
					</tr>	
            </table>
    </div>
     <div class="row setup-content" id="step-7" style="padding-left:20px;">
         <div id="empOfficalDivId">
         <div  style="width:98%;padding-top:10px; border-radius: 25px;border: 2px solid #8AC007;padding: 20px;">
          <jsp:include page="empOfficialDtl.jsp"></jsp:include>
         </div>
         </div>
          <table>
				<tr >
					<td style="padding-top:10px;padding-left:200px;">
						<div class="btn-group btn-group-lg">
						     <button type="button"  class="btn prevBtn btn-primary">Previous</button>
	 						 <button type="button" id="saveOffical" class="btn  btn-primary">Save and Continue</button>
	 				    </div>
					</td>
					</tr>	
            </table>
    </div>
    <form:hidden id="employeeid" path="empId"/>
  </form:form>

<script type="text/javascript">
// This is file and rest of data plugin this in common file
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


    jQuery(document).ready(function(){
    	$('.dateRangePicker').datepicker({
    		format : 'mm/dd/yyyy',
    		startDate : '01/01/2010',
    		endDate : '12/30/2020'
    	})

		  $("#employeedtl").validationEngine('attach', {promptPosition : "topRight"}); 	    
          $("#savePersonaldtl,#saveEdudtl,#saveCommunitcation,#saveEmpPastExp,#saveEmpPastProject,#savePayRoll,#saveOffical").click(function(evt){
        	     evt.preventDefault();
				 var curid = $(evt.currentTarget).attr('id');


				 if(curid=='savePersonaldtl'){
					 $("#employeedtl").validationEngine('validate')
					//for each feild tobe validated mention the name of that filed so eaach can be validated
			     	if(!$("#empFirstName").validationEngine('validate')){
			     		
			     	   	   return false;
			      	}

			     	if(!$("#empLastName").validationEngine('validate')){
			     	   	   return false;
			      	}
			     	if(!$("#employTypeId").validationEngine('validate')){
			     	   	   return false;
			      	}
			     	if(!$("#designationId").validationEngine('validate')){
			     	   	   return false;
			      	}
			     	if(!$("#schoolIds").validationEngine('validate')){
			     	   	   return false;
			      	}
      	
				 }


				 if(curid=='saveCommunitcation'){
					 if(!$("#address").validationEngine('validate')){
					   	   return false;
				      	}
			      }

				 
				    
				  $.ajax({
					async: true, 
				    type:'POST',
					url: '${urlempSave}', 
				   	data: $('#employeedtl').serializefiles(),
				    contentType: false,
				    processData: false,
				    beforeSend: function() {
				    	$('div#personalId').block({ 
			                message: '<img src="/Gyaan/Login/assets/img/ajax-modal-loading.gif"/>', 
			                css: { border: '3px solid #a00' } 
			            });
				     },
				     complete: function(){
				    	 $('div#personalId').unblock(); 
				     },
				    success: function(data){

					    
					   if(curid=='savePersonaldtl'){
						   	//$("#mainModule").html($(data).find("#subMod").html());
						   $("#employeeid").val($(data).find("#employeeid").val());
							}

					   if(curid=='saveCommunitcation'){
					    	//$("#communicationDivId").html($(data).find("#communicationDivId").html());
						   $("#communicationId").val($(data).find("#communicationId").val());
						    }
						
				    	if(curid=='saveEdudtl'){
					    	//$("#educationDivId").html($(data).find("#educationDivId").html());
					    	$("#nextv").html($(data).find("#nextv").html());
				    	    }
				        
				    	if(curid=='saveEmpPastExp'){
					    	//$("#empPastExpDivId").html($(data).find("#empPastExpDivId").html());
				    		 $("#empPastExperiencId").val($(data).find("#empPastExperiencId").val());
							    }


                        if(curid=='saveEmpPastProject')
                        {
                        	 $("#empPastProjectId").val($(data).find("#empPastProjectId").val());
					    	//$("#empPastProjectDivId").html($(data).find("#empPastProjectDivId").html());
					    }

                        if(curid=='savePayRoll')
                        {
                        	 $("#empPayrollId").val($(data).find("#empPayrollId").val());
					    	//$("#empPayRollDivId").html($(data).find("#empPayRollDivId").html());
					    }

                        if(curid=='saveOffical')
                        {
                        	 $("#communicationId").val($(data).find("#communicationId").val());
					    	//$("#empOfficalDivId").html($(data).find("#empOfficalDivId").html());
					    }
					  
				          
					}
			});
		  
	     });
     // });
     	  
  });

          
            $(document).ready( function() {
            	   $("#list1").dynamiclist({
                	   itemClass:"list-item1",
                	   addClass :"list-add1",
                	   removeClass:"list-remove1",
                	   withEvents:true
                   });

            	   $("#pastExp").dynamiclist({
                	   itemClass:"list-Pastlst",
                	   addClass :"list-pastadd",
                	   removeClass:"list-pastremove",
                	   withEvents:true
                   });

            	   $("#pastExpFileUpload").dynamiclist({
                	   itemClass:"list-PastFileUpload",
                	   addClass :"list-pastaddfileupload",
                	   removeClass:"list-pastremovefileupload",
                	   withEvents:true
                   });
            	
            	   $("#pastProj").dynamiclist({
                	   itemClass:"list-projlst",
                	   addClass :"list-projadd",
                	   removeClass:"list-projremove",
                	   withEvents:true
                   });

            	   $("#pastProjFileUpload").dynamiclist({
                	   itemClass:"list-projFileUpload",
                	   addClass :"list-projaddfileupload",
                	   removeClass:"list-projremovefileupload",
                	   withEvents:true
                   });

                	
     	         //how to  get the parent element?
            	$('div#educationDivId').on('click','span.list-add',function() {
                	var fileIndex = parseInt($(this).closest('table').children().find('input').last().attr('name').charAt(35))+1;
                    var eduIndex =  $(this).closest('table').children().find('input').last().attr('name').charAt(18);
                    $(this).closest('table').append(
                    		'<tr><td>'+
                    		 ' <input type="text"	name="empeducationaldtl['+ eduIndex +'].fileUploadLst['+ fileIndex +'].fileName" '+
                    		 ' style="height:25px;width:100px;border:1px solid #ccc;  border-radius: 4px;" /> ' +
                    		 ' </td><td>'+
                    		 ' <input type="file" name="empeducationaldtl['+ eduIndex +'].fileUploadLst['+ fileIndex +'].files" style="width:130px;"/>'+
                    		 ' </td><td>'+
                    		 ' <div class="btn-group btn-group-lg">'+ 
                    		 ' <span class="glyphicon glyphicon-minus-sign list-remove"></span>'+
                    		 //' <span class="glyphicon glyphicon-plus-sign list-add"></span>'+
                    		 ' </div></td></tr>');
                      });

     	         $('div#educationDivId').on('click','span.list-remove',function() {
            			$(this).closest('tr').remove();
            		});

            		   
           });

           
            
 </script>
<script>
         $(document).ready(function(){
                 
                	  $("#designationId").empty();

              		  $.ajax({
                	    	async: true, 
                		    type:'POST',
                			url: '${urldesignationId}', 
                			data: {emptypeId:'${employeefrm.empofficialdtl.employee_Type}'},
                		    success: function(data){
                		        var desilist= '<option value="">Please Select</option>' ;
                		    	$.each(data, function(i, item) {
                                   if(item.empDesigId=='${employeefrm.empofficialdtl.designation}'){
                                        desilist=desilist+ '<option  selected="selected"  value='+item.empDesigId+'>'+item.desig_Name+'</option>';
                                   }else{
                                	desilist=desilist+ '<option value='+item.empDesigId+'>'+item.desig_Name+'</option>';
                                       }
                                    	  });
                		    	$("#designationId").append(desilist);
                  			}
                	     });

                     
         });

</script>
<script>
         $(document).ready(function(){
                  $("#employTypeId").change(function(){
                	  $("#designationId").empty();

              		  $.ajax({
                	    	async: true, 
                		    type:'POST',
                			url: '${urldesignationId}', 
                			data: {emptypeId:$(this).val()},
                		    success: function(data){
                                var desilist= '<option value="">Please Select</option>' ;
                		    	$.each(data, function(i, item) {
                		    	       desilist=desilist+ '<option value='+item.empDesigId+'>'+item.desig_Name+'</option>'
                                   	  });
                		    	$("#designationId").append(desilist);
                  			}
                	     });

                   });
         });

		</script>

</div>
</div>