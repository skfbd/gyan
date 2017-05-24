<%@ include file="../../common/includes.jsp" %>
<style type="text/css">
#grad1 {
	background: rgba(179, 220, 237, 1);
	background: -moz-linear-gradient(top, rgba(179, 220, 237, 1) 0%, rgba(41, 184, 229, 1) 85%, rgba(188, 224, 238, 1) 100%);
	background: -webkit-gradient(left top, left bottom, color-stop(0%, rgba(179, 220, 237, 1)), color-stop(85%, rgba(41, 184, 229, 1)), color-stop(100%, rgba(188, 224, 238, 1)));
	background: -webkit-linear-gradient(top, rgba(179, 220, 237, 1) 0%, rgba(41, 184, 229, 1) 85%, rgba(188, 224, 238, 1) 100%);
	background: -o-linear-gradient(top, rgba(179, 220, 237, 1) 0%, rgba(41, 184, 229, 1) 85%, rgba(188, 224, 238, 1) 100%);
	background: -ms-linear-gradient(top, rgba(179, 220, 237, 1) 0%, rgba(41, 184, 229, 1) 85%, rgba(188, 224, 238, 1) 100%);
	background: linear-gradient(to bottom, rgba(179, 220, 237, 1) 0%, rgba(41, 184, 229, 1) 85%, rgba(188, 224, 238, 1) 100%);
	filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#b3dced', endColorstr='#bce0ee', GradientType=0);
}
</style>

<c:url  var="urlempSave" value="/employee/empDesigSaveUpdate.htm" />
<form:form id="empDesigForm"  name="class" method="post" modelAttribute="designationFrm" >
<table id="grad1" class="table table-bordered">
	 <tr>
		<td colspan="2" class="head">
		 <div class="box-header with-border bg-yellow ribbon ">
              Add Designation
         </div>
	    </td>
	 </tr>
	 <tr>
		<td> Designation Name <samp class="MandatoryField">*</samp></td>
		<td> <form:input path="desig_Name"  type="text" style="width:350px;" class="validate[required] text-input"	placeholder="Enter.."/> </td>	
	 </tr>
	 <tr>
		<td > Employee Type <samp class="MandatoryField">*</samp></td>
		<td >
			<form:select path="emp_type"  style="width:350px;" >
		          <c:forEach var="itemMod" items="${roleList}" varStatus="rows">     
                        <c:if test="${itemMod.rId eq emp_type}">
                            <option value="${itemMod.rId}" selected>${itemMod.perName}</option>
                        </c:if>
                        <c:if test="${itemMod.rId  ne emp_type}">
                          <option value="${itemMod.rId}">${itemMod.perName}</option>
                        </c:if>
                  </c:forEach>
			</form:select>
		</td>	
	 </tr>
	  <tr>
		<td > Staff Type <samp class="MandatoryField">*</samp></td>
		<td >
		<form:select path="staff_type" style="width:350px;">
		        <option  value="1">Teaching</option>
				<option  value="2">Non Teaching</option>
		</form:select> 
		
		
		</td>	
	 </tr>
	  <tr>
		<td > Priority <samp class="MandatoryField">*</samp></td>
		<td >
		<form:input path="priority"  type="text" style="width:350px;" class="validate[required] text-input"
		placeholder="Enter ..." />
		 </td>	
	 </tr>
	  <tr>
		<td > Description</td>
		<td >
		 <form:input type="text" path="description"   style="width:350px;" /> 
		</td>	
	 </tr>
	 
	 
	  <tr> <td> 
	  <div class="box-header with-border bg-yellow ribbon ">
              <div id="newEmpDesig" class="btn btn-success">Add Designation</div>
        </div>
	 </td>
	 </tr>
	  <form:hidden id="empDesiId" path="empDesigId"/>
</table>
</form:form>
<script>
   
		  $(document).ready(function(){
			      <c:if test="${not empty designationFrm.staff_type}">
				   $('#staff_type option[value='+"${designationFrm.staff_type}"+']').attr('selected', 'selected');
                  </c:if>
					   $("#newEmpDesig").click(function(){
					    /*   if(!$('#empDesigForm').validationEngine('validate')){
						       return false;
					      } */
						  var desigVal=$("#empDesiId").val();
		                $.ajax({async: true, 
						    type:'POST',
							url: '${urlempSave}', 
						   	data: $('#empDesigForm').serialize(),
						    success: function(data){
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