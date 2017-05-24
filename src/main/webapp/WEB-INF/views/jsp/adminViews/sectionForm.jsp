<%@ include file="../common/includes.jsp"%>
<c:url var="urlsaveSection" value="/admin/saveSection.htm" />
<div  style="width:90%;padding-top:5px; border-radius: 25px;border: 2px solid #8AC007;padding: 20px;">
<div class="box-header with-border bg-yellow ribbon ">
	<div id="classheader" style="color: #5cb85c; font-size: 20px;">
		<b>Section</b>
	</div>
</div>
<form:form id="sectionfrmid"  method="post" modelAttribute="sectionForm">
<table style="width:100%;">
	<tr>
		<td>School </td>
		<td>
			 <form:select path="schoolId" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;">
				    <c:forEach items="${schoolLst}" var="s" varStatus="status">
				        <c:choose>
				            <c:when test="${s.schoolId eq sectionfrm.schoolId}">
				                 <option value="${s.schoolId}" selected="selected">${s.schoolName}</option>
				            </c:when>
				            <c:otherwise>
				                <option value="${s.schoolId}">${s.schoolName}</option>
				            </c:otherwise>
				        </c:choose> 
				    </c:forEach>
				</form:select>
                 </td>
		<td><form:input type="hidden" path="schoolName" value="${sectionfrm.schoolName}"/></td>
		
	</tr>
	<tr>
		<td>Academic Session</td>
		<td> <form:input path="academicSessionName" value="${sectionfrm.academicSessionName}" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
		<td> <form:input type="hidden" path="academicSessionId" value="${sectionfrm.academicSessionId}"/></td>
	</tr>
	<tr>
		<td>Class*</td>
		<td><form:select path="classId" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;">
		<option value="">Select Class</option>
					<option value="1962">8th</option>
					<option value="970">I</option>
					<option value="971">II</option>
					<option value="972">III</option>
					<option value="973">IV</option>
					<option value="974">V</option>
					<option value="975">VI</option>
					<option value="976">VII</option>
					<option value="977">VIII</option>
					<option value="978">IX</option>
					<option value="979">X</option>
				</form:select></td>
	</tr>
	<tr>
		<td>Class Teacher </td>
		<td><form:select path="classTeacherId" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;">
		<option value="">Select</option>
				<option value="7131">a s s(7131)</option>
				<option value="3598">Aadarsh  K(3598)</option>
				<option value="6783">Abhay  Kumar(6783)</option>
				<option value="3591">Abhilasha  (3591)</option>
				<option value="3665">Abhilasha Pandit  (3665)</option>
				<option value="3225">Abhinandan  Kumar(3225)</option>
				<option value="3599">Abhiram  (3599)</option>
				<option value="3672">Abhishek Murthy  (3672)</option>
				<option value="3600">Abhishek Patel  (3600)</option>
				<option value="4250">abhuuyt  (4250)</option>
				<option value="3670">Adarsh Jain  (3670)</option>
				<option value="3614">Adeep Jain  (3614)</option>
				<option value="3592">Aditi  (3592)</option>
				<option value="3666">Aditi Nair  (3666)</option>
				<option value="3676">Aditya Gupta  (3676)</option>
				<option value="3605">Aditya Gupta  (3605)</option>
				<option value="8125">AKANKSHA  SHARMA(8125)</option>
				<option value="4153">alekhya  (4153)</option>
				<option value="3593">Ambika  k(3593)</option>
				<option value="3668">Ambika  Tripati(3668)</option>
				<option value="8227">Amit  Rana(8227)</option>
				<option value="3594">Arpita  (3594)</option>
				<option value="6777">Atreyee  Chatterjee(6777)</option>
				<option value="3673">Bhumika Pandit  (3673)</option>
				<option value="3953">Carol  Sharawy(3953)</option>
				<option value="3619">Chaitanya  (3619)</option>
				<option value="8075">dc  d(8075)</option>
				<option value="3222">DemoSuperAdmin  .(3222)</option>
				<option value="6778">Dibyendu  Roy(6778)</option>
				<option value="8124">DIGI  SHARMA(8124)</option>
				<option value="7165">dipanshu  sharma(7165)</option>
				<option value="8126">DIPTI  SHARMA(8126)</option>
				<option value="3616">Esha Chatterji  (3616)</option>
				<option value="3683">Gita Devdarsh  (3683)</option>
				<option value="3691">Jatin  Varma(3691)</option>
				<option value="8345">Kamla  Prasad(8345)</option>
				<option value="3690">Karuna Pillai  (3690)</option>
				<option value="3687">Kaushik  (3687)</option>
				<option value="3689">Kavyasri  (3689)</option>
				<option value="8242">KOMAL  RAWAT(8242)</option>
				<option value="6776">Koushik  Mandol(6776)</option>
				<option value="3686">Lakshya Reddy  (3686)</option>
				<option value="4155">likith  (4155)</option>
				<option value="3685">Lokesh Naidu  (3685)</option>
				<option value="4140">madhusudan  (4140)</option>
				<option value="3635">Mahesh Kumar Dhanuka  (3635)</option>
				<option value="4208">manish  (4208)</option>
				<option value="8259">Manju  Sharma(8259)</option>
				<option value="8455">Manoj  Sharma(8455)</option>
				<option value="4209">mayank  (4209)</option>
				<option value="3682">Meera chowdary  (3682)</option>
				<option value="6780">Milee  Golmes(6780)</option>
				<option value="8240">MOHAN  SHARMA(8240)</option>
				<option value="3684">Monisha pandit  (3684)</option>
				<option value="3677">Mritul Kapoor  (3677)</option>
				<option value="3609">Naagendra  (3609)</option>
				<option value="3612">Nachiket  (3612)</option>
				<option value="3613">Nakul Chandra  (3613)</option>
				<option value="3671">Nakul Pandit  (3671)</option>
				<option value="3679">Nalini naik  (3679)</option>
				<option value="4143">naresh  (4143)</option>
				<option value="4152">neelakant  (4152)</option>
				<option value="3681">Neeraj sigh  (3681)</option>
				<option value="8123">neha  chaudhary(8123)</option>
				<option value="3680">Nikhil varma  (3680)</option>
				<option value="4148">niranjan  (4148)</option>
				<option value="3667">Pallavi  (3667)</option>
				<option value="6773">Papri  Basu(6773)</option>
				<option value="3664">Parveen  (3664)</option>
				<option value="6781">Peter  Clark(6781)</option>
				<option value="3678">Pragati singh  (3678)</option>
				<option value="8304">Radha  Verma(8304)</option>
				<option value="8127">RAJ  KUMAR(8127)</option>
				<option value="8346">Rajkumar  (8346)</option>
				<option value="4147">rakesh  (4147)</option>
				<option value="8241">RAM  KUMAR(8241)</option>
				<option value="3617">Ramana  (3617)</option>
				<option value="4156">rampaul  (4156)</option>
				<option value="4154">ravi charan  (4154)</option>
				<option value="8309">Rekha  Raghav(8309)</option>
				<option value="3674">Renuka nayak  (3674)</option>
				<option value="4142">reshmi  (4142)</option>
				<option value="4144">riju singh  (4144)</option>
				<option value="8243">ROHIT  KUMAR(8243)</option>
				<option value="3223">Rupesh  Singh(3223)</option>
				<option value="6775">Saikat  Basu(6775)</option>
				<option value="3245">Sanjay  (3245)</option>
				<option value="3620">Sheethal  (3620)</option>
				<option value="4141">shekar  k(4141)</option>
				<option value="3596">Shrivalli  (3596)</option>
				<option value="3597">Shruti  (3597)</option>
				<option value="3602">Shweta Murthy  (3602)</option>
				<option value="3603">Sibani Kulkarni  (3603)</option>
				<option value="3636">Siddhika Patel  (3636)</option>
				<option value="3604">Siddhika Sharma  (3604)</option>
				<option value="3669">Siddhika Shetty  (3669)</option>
				<option value="3606">Sonal  Kapoor(3606)</option>
				<option value="3675">Sonal  Dasgupta  (3675)</option>
				<option value="7167">Sonu  yadav(7167)</option>
				<option value="3607">Soumya  (3607)</option>
				<option value="3692">Spoorthi  Chatterjee(3692)</option>
				<option value="3611">Spoorthi Dasgupta  (3611)</option>
				<option value="3615">Subhashini Chatterjee  (3615)</option>
				<option value="6779">Sudakshina  Kundu(6779)</option>
				<option value="4207">surana  (4207)</option>
				<option value="4145">swarna  (4145)</option>
				<option value="3622">Swaroop Krishnan  Sharma(3622)</option>
				<option value="3618">Venkatesh  (3618)</option>
				</form:select></td>
	</tr>
	<tr>
		<td>Second Class Teacher </td>
		<td><form:select path="secondClassTeacherId" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;">
		<option value="">Select</option>
				<option value="7131">a s s(7131)</option>
				<option value="3598">Aadarsh  K(3598)</option>
				<option value="6783">Abhay  Kumar(6783)</option>
				<option value="3591">Abhilasha  (3591)</option>
				<option value="3665">Abhilasha Pandit  (3665)</option>
				<option value="3225">Abhinandan  Kumar(3225)</option>
				<option value="3599">Abhiram  (3599)</option>
				<option value="3672">Abhishek Murthy  (3672)</option>
				<option value="3600">Abhishek Patel  (3600)</option>
				<option value="4250">abhuuyt  (4250)</option>
				<option value="3670">Adarsh Jain  (3670)</option>
				<option value="3614">Adeep Jain  (3614)</option>
				<option value="3592">Aditi  (3592)</option>
				<option value="3666">Aditi Nair  (3666)</option>
				<option value="3676">Aditya Gupta  (3676)</option>
				<option value="3605">Aditya Gupta  (3605)</option>
				<option value="8125">AKANKSHA  SHARMA(8125)</option>
				<option value="4153">alekhya  (4153)</option>
				<option value="3593">Ambika  k(3593)</option>
				<option value="3668">Ambika  Tripati(3668)</option>
				<option value="8227">Amit  Rana(8227)</option>
				<option value="3594">Arpita  (3594)</option>
				<option value="6777">Atreyee  Chatterjee(6777)</option>
				<option value="3673">Bhumika Pandit  (3673)</option>
				<option value="3953">Carol  Sharawy(3953)</option>
				<option value="3619">Chaitanya  (3619)</option>
				<option value="8075">dc  d(8075)</option>
				<option value="3222">DemoSuperAdmin  .(3222)</option>
				<option value="6778">Dibyendu  Roy(6778)</option>
				<option value="8124">DIGI  SHARMA(8124)</option>
				<option value="7165">dipanshu  sharma(7165)</option>
				<option value="8126">DIPTI  SHARMA(8126)</option>
				<option value="3616">Esha Chatterji  (3616)</option>
				<option value="3683">Gita Devdarsh  (3683)</option>
				<option value="3691">Jatin  Varma(3691)</option>
				<option value="8345">Kamla  Prasad(8345)</option>
				<option value="3690">Karuna Pillai  (3690)</option>
				<option value="3687">Kaushik  (3687)</option>
				<option value="3689">Kavyasri  (3689)</option>
				<option value="8242">KOMAL  RAWAT(8242)</option>
				<option value="6776">Koushik  Mandol(6776)</option>
				<option value="3686">Lakshya Reddy  (3686)</option>
				<option value="4155">likith  (4155)</option>
				<option value="3685">Lokesh Naidu  (3685)</option>
				<option value="4140">madhusudan  (4140)</option>
				<option value="3635">Mahesh Kumar Dhanuka  (3635)</option>
				<option value="4208">manish  (4208)</option>
				<option value="8259">Manju  Sharma(8259)</option>
				<option value="8455">Manoj  Sharma(8455)</option>
				<option value="4209">mayank  (4209)</option>
				<option value="3682">Meera chowdary  (3682)</option>
				<option value="6780">Milee  Golmes(6780)</option>
				<option value="8240">MOHAN  SHARMA(8240)</option>
				<option value="3684">Monisha pandit  (3684)</option>
				<option value="3677">Mritul Kapoor  (3677)</option>
				<option value="3609">Naagendra  (3609)</option>
				<option value="3612">Nachiket  (3612)</option>
				<option value="3613">Nakul Chandra  (3613)</option>
				<option value="3671">Nakul Pandit  (3671)</option>
				<option value="3679">Nalini naik  (3679)</option>
				<option value="4143">naresh  (4143)</option>
				<option value="4152">neelakant  (4152)</option>
				<option value="3681">Neeraj sigh  (3681)</option>
				<option value="8123">neha  chaudhary(8123)</option>
				<option value="3680">Nikhil varma  (3680)</option>
				<option value="4148">niranjan  (4148)</option>
				<option value="3667">Pallavi  (3667)</option>
				<option value="6773">Papri  Basu(6773)</option>
				<option value="3664">Parveen  (3664)</option>
				<option value="6781">Peter  Clark(6781)</option>
				<option value="3678">Pragati singh  (3678)</option>
				<option value="8304">Radha  Verma(8304)</option>
				<option value="8127">RAJ  KUMAR(8127)</option>
				<option value="8346">Rajkumar  (8346)</option>
				<option value="4147">rakesh  (4147)</option>
				<option value="8241">RAM  KUMAR(8241)</option>
				<option value="3617">Ramana  (3617)</option>
				<option value="4156">rampaul  (4156)</option>
				<option value="4154">ravi charan  (4154)</option>
				<option value="8309">Rekha  Raghav(8309)</option>
				<option value="3674">Renuka nayak  (3674)</option>
				<option value="4142">reshmi  (4142)</option>
				<option value="4144">riju singh  (4144)</option>
				<option value="8243">ROHIT  KUMAR(8243)</option>
				<option value="3223">Rupesh  Singh(3223)</option>
				<option value="6775">Saikat  Basu(6775)</option>
				<option value="3245">Sanjay  (3245)</option>
				<option value="3620">Sheethal  (3620)</option>
				<option value="4141">shekar  k(4141)</option>
				<option value="3596">Shrivalli  (3596)</option>
				<option value="3597">Shruti  (3597)</option>
				<option value="3602">Shweta Murthy  (3602)</option>
				<option value="3603">Sibani Kulkarni  (3603)</option>
				<option value="3636">Siddhika Patel  (3636)</option>
				<option value="3604">Siddhika Sharma  (3604)</option>
				<option value="3669">Siddhika Shetty  (3669)</option>
				<option value="3606">Sonal  Kapoor(3606)</option>
				<option value="3675">Sonal  Dasgupta  (3675)</option>
				<option value="7167">Sonu  yadav(7167)</option>
				<option value="3607">Soumya  (3607)</option>
				<option value="3692">Spoorthi  Chatterjee(3692)</option>
				<option value="3611">Spoorthi Dasgupta  (3611)</option>
				<option value="3615">Subhashini Chatterjee  (3615)</option>
				<option value="6779">Sudakshina  Kundu(6779)</option>
				<option value="4207">surana  (4207)</option>
				<option value="4145">swarna  (4145)</option>
				<option value="3622">Swaroop Krishnan  Sharma(3622)</option>
				<option value="3618">Venkatesh  (3618)</option>
				</form:select></td>
	</tr>
	<tr>
		<td>Section Name *</td>
		<td><form:input path="name" value="${sectionfrm.name}" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
	</tr>
	<tr>
		<td>Description </td>
		<td><form:input path="description" value="${sectionfrm.description}" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
	</tr>
	<tr><td><div id="succussMange" class="alert alert-success" role="alert" style="display: none">You successfully saved message.</div>
				</td>
				<td colspan="4" align="center">
					<input type="button" value="Save" class="btn-small saveExpandForm" id="saveButton" /> 
				</td></tr>
	<tr><td>
	<form:input id="sectionId" type="hidden" path="id" value="${sectionfrm.id}"/>
	</td></tr>
</table>
</form:form>
</div>
<script>



$(document).ready(function(){

$("#saveButton,#updateButton").click(function(){
		  
 	$.ajax({
	    	async: true, 
		    type:'POST',
			url: '${urlsaveSection}', 
			data: $('#sectionfrmid').serialize(),
		    success: function(data){
			    $("#sectionId").val($(data).find("#sectionId").val());
			   	$("#succussMange" ).fadeIn( "slow", function() {
		    		$("#succussMange").show();
		    	  });
		    	$("#succussMange" ).fadeOut( "slow", function() {
		    		$("#succussMange").hide();
		    	  });
		          
			}
	     });
 });
});


</script>
