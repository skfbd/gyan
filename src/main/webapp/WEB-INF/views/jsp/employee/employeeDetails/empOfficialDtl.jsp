<%@ include file="../../common/includes.jsp"%>

<table   style="width:98%"  class="table table-bordered table-hover">
			
				<tr>
					<td>Emp Code</td>
					<td>Date of Join </td>
				</tr>
				<tr>
					<td><form:input path="empofficialdtl.Emp_Code" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
					<td>
					<div class="input-group input-append date dateRangePicker" style="width:260px;height:34px;"> 
						    <form:input type="text" id="probPerAEnDt" class="form-control"
						     path="empofficialdtl.dt_of_Join" style="width:260px;height:34px;"/> 
							<span class="input-group-addon add-on">
								<span class="glyphicon glyphicon-calendar">
							</span>
							</span>
					 </div>
					</td>
				</tr>
				
				
				<tr>
					<td>Staff Type</td>
					<td>Emp Category</td>
		    	</tr>
				<tr>
					<td><form:select
						path="empofficialdtl.staff_Type" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;">
							<form:option value="">Select</form:option>
							<form:option value="1">Teaching</form:option>
							<form:option value="2">Non Teaching</form:option>
					</form:select>
					</td>
					
					<td>
					
					<form:select path="empofficialdtl.emp_Category" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;">
							<form:option value="">Select</form:option>
							<form:option value="1">Permanent</form:option>
							<form:option value="2">Contractual</form:option>
							<form:option value="3">AdHoc</form:option>
							<form:option value="4">Daily Wages</form:option>
							<form:option value="5">On-Rolls</form:option>
							<form:option value="6">Retainers</form:option>
							<form:option value="7">ECA</form:option>
							<form:option value="8">Guest Faculty</form:option>
					</form:select></td>
				</tr>
				<tr>
					<td>Resignation Date</td>
					<td >No. of Month in Probation Period</td>
				</tr>
				
				<tr>
					<td>
					 <div class="input-group input-append date dateRangePicker" style="width:260px;height:34px;"> 
						    <form:input type="text" id="probPerAEnDt" class="form-control" style="width:260px;height:34px;"
						     path="empofficialdtl.resignation_Dt"/> 
							<span class="input-group-addon add-on">
								<span class="glyphicon glyphicon-calendar">
								</span>
							</span>
					    </div>
					 </td>
					<td><form:select
						path="empofficialdtl.no_of_Month_Prob_Per"
						onchange="calculateProvisionalPeriodEndDate()" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;">
							<form:option value="">Select No of Month</form:option>
							<form:option value="1">1</form:option>
							<form:option value="2">2</form:option>
							<form:option value="3">3</form:option>
							<form:option value="4">4</form:option>
							<form:option value="5">5</form:option>
							<form:option value="6">6</form:option>
							<form:option value="7">7</form:option>
							<form:option value="8">8</form:option>
							<form:option value="9">9</form:option>
							<form:option value="10">10</form:option>
							<form:option value="11">11</form:option>
							<form:option value="12">12</form:option>
							<form:option value="13">13</form:option>
							<form:option value="14">14</form:option>
							<form:option value="15">15</form:option>
							<form:option value="16">16</form:option>
							<form:option value="17">17</form:option>
							<form:option value="18">18</form:option>
							<form:option value="19">19</form:option>
							<form:option value="20">20</form:option>
							<form:option value="21">21</form:option>
							<form:option value="22">22</form:option>
							<form:option value="23">23</form:option>
							<form:option value="24">24</form:option>
					</form:select></td>
				</tr>
				
				
				<tr>
					<td>No. of Month in Probation Notice Period</td>
					<td>Probation Period End Date</td>
					
				</tr>
				<tr>
					<td><form:select
						path="empofficialdtl.no_of_Month_Prob_Notice_Per" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;">
							<form:option value="">Select No of Month</form:option>
							<form:option value="1">1</form:option>
							<form:option value="2">2</form:option>
							<form:option value="3">3</form:option>
							<form:option value="4">4</form:option>
							<form:option value="5">5</form:option>
							<form:option value="6">6</form:option>
							<form:option value="7">7</form:option>
							<form:option value="8">8</form:option>
							<form:option value="9">9</form:option>
							<form:option value="10">10</form:option>
							<form:option value="11">11</form:option>
							<form:option value="12">12</form:option>
							<form:option value="13">13</form:option>
							<form:option value="14">14</form:option>
							<form:option value="15">15</form:option>
							<form:option value="16">16</form:option>
							<form:option value="17">17</form:option>
							<form:option value="18">18</form:option>
							<form:option value="19">19</form:option>
							<form:option value="20">20</form:option>
							<form:option value="21">21</form:option>
							<form:option value="22">22</form:option>
							<form:option value="23">23</form:option>
							<form:option value="24">24</form:option>
					</form:select></td>
					<td>
					<div class="input-group input-append date dateRangePicker" style="width:260px;height:34px;"> 
						    <form:input type="text" id="probPerAEnDt" class="form-control" 
						     path="empofficialdtl.prob_Per_End_Dt" style="width:260px;height:34px;"/> 
							<span class="input-group-addon add-on">
								<span class="glyphicon glyphicon-calendar">
								</span>
							</span>
					    </div>
					
					</td>
				</tr>
				<tr>
					<td>Probation Period Actual End	Date 
					</td>
				</tr>
				<tr>
					<td>
					<div class="input-group input-append date dateRangePicker" style="width:260px;height:34px;"> 
						    <form:input type="text" id="probPerAEnDt" class="form-control"
						     path="empofficialdtl.prob_Per_Actual_End_Dt" style="width:260px;height:34px;"/> 
							<span class="input-group-addon add-on">
								<span class="glyphicon glyphicon-calendar">
								</span>
							</span>
					    </div>
			        </td>		
				</tr>
				<tr><td>
				  <form:hidden path="empofficialdtl.empOfficialId"/>
				</td>
				</tr>
				
</table>
			
		
