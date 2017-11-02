<!-- Container (The Band Section) -->
 <div id="band" class="container mt-50">
       
       <c:if test="${not empty message}">
       <div class="col-xs-12">
          <div class="alert alert-success alert-dismissible">
                <button type="button" class="close" data-dismiss="alert">&times;</button>
                  
                  ${message}
          </div>
       </div>
    </c:if>   
  <h5 class="text-center">SIGN UP</h5>
  <p class="text-center"><em>Please Register Your Details..!</em></p>
  <br>
	
  <%-- <div class="row text-center z-depth-4">
	    
		<div class="col-md-12 pt-30 pb-20">
			<form class="col s12" method="POST" action="${contextRoot}/register/user">
				<div class="row">
					<div class="input-field col col-md-6">
					  <input id="firstName" name="firstName"type="text" class="validate"required >
					  <label for="firstName"  class="active">First Name</label>
					  <p style="color:red">${duplicatefirstName}</p>
					</div>
					<br>
					
					<div class="input-field col col-md-6">
					  <input name="lastName" id="lastName" type="text" class="validate" required>
					  <label for="lastName" class="active">last Name</label>
					  <p style="color:red">${duplicatelastName}</p>
					</div>
				</div>
				<br>
				<div class="row">
					<div class="input-field col col-md-6">
					  <input id="email" name="email"type="email" class="validate"required >
					  <label for="email"  class="active">Email</label>
					  <p style="color:red">${duplicateemail}</p>
					</div>
					</div>
					<br>
					<div class="row">
					<div class="input-field col col-md-12">
					  <input id="contactNumber" name="contactNumber"type="text" class="validate"required >
					  <label for="contactNumber"  class="active">Contact Number.</label>
				 	</div>
				 	<br>
				 	<div class="row">
					<div class="input-field col col-md-6">
					  <input id="password" name="password" type="password" class="validate" required>
					  <label for="password" class="active">Password</label>
					</div>
				   </div>
				   <br>
				
				</div> 
			  <div class="row">
				<div class="input-field col s12">
				 <textarea id="address" placeholder="Address" name="address"class="materialize-textarea" required></textarea>
                  
				</div>
			  </div>
			  <br>
			  
			  
			  <div class="row text-center">
				<div class="col-md-3 ">
				</div>
				<div class="input-field col-md-6  text-center">
					<input type="submit" class="btn1" value="SIGN UP">
					<input type="hidden" name="role"/>	
				
				</div>
				<div class="col-md-3 ">
				</div>
				
			  </div>
			</form>	
			
        </div>	
       		
  </div> --%>
  
  
  
  
  <form action="${contextRoot}/register/user" method="POST" class="form-horizontal" ">
       
       <div class="form-group">
        <label for="firstName" class="col-md-4 control-label">First Name</label>
         <div class="col-md-8">
          <input type="text" name="firstName" id="firstName" class="form-control" />
         </div>
       </div>
       
       
       <div class="form-group">
        <label for="lastName" class="col-md-4 control-label">last Name</label>
         <div class="col-md-8">
          <input type="text" name="lastName" id="lastName" class="form-control" />
         </div>
       </div>
       
       <div class="form-group">
        <label for="email" class="col-md-4 control-label">Email</label>
         <div class="col-md-8">
          <input type="text" name="email" id="email" class="form-control" />
         </div>
       </div>
       
       <div class="form-group">
        <label for="contactNumber" class="col-md-4 control-label">Contact Number</label>
         <div class="col-md-8">
          <input type="text" name="contactNumber" id="contactNumber" class="form-control" />
         </div>
       </div>
       
       
       <div class="form-group">
        <label for="password" class="col-md-4 control-label">Password:</label>
         <div class="col-md-8">
          <input type="password" name="password" id="password" class="form-control" />
         </div>
       </div>
       
      
       
       
       <div class="form-group">
        <label for="address" class="col-md-4 control-label">Address</label>
         <div class="col-md-8">
          <input type="text" name="address" id="address" class="form-control" />
         </div>
       </div>
       
      <!--  <div class="form-group">
        <label for="confirmPassword" class="col-md-4 control-label">Confirm Password:</label>
         <div class="col-md-8">
          <input type="password" name="confirmPassword" id="confirmPassword" class="form-control" />
         </div>
       </div> -->
       
       
        <div class="form-group">
        <div class="col-md-offset-4 col-md-8">
          <input type="submit" value="sign up" class="btn btn-primary" />
      <!--      <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" /> -->
         </div>
       </div>
       
        </form>
</div>

