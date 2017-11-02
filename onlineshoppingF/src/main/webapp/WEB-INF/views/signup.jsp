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
	
  <div class="row text-center z-depth-4">
	    
		<div class="col-md-12 pt-30 pb-20">
			<form class="col s12" method="POST" action="${contextRoot}/register/user">
				<div class="row">
					<div class="input-field col col-md-6">
					  <input id="firstName" name="firstName"type="text" class="validate"required >
					  <label for="firstName"  class="active">First Name</label>
					  <p style="color:red">${duplicatefirstName}</p>
					</div>
					<div class="input-field col col-md-6">
					  <input name="lastName" id="lastName" type="text" class="validate" required>
					  <label for="lastName" class="active">last Name</label>
					  <p style="color:red">${duplicatelastName}</p>
					</div>
				</div>
				<div class="row">
					<div class="input-field col col-md-6">
					  <input id="email" name="email"type="email" class="validate"required >
					  <label for="email"  class="active">Email</label>
					  <p style="color:red">${duplicateemail}</p>
					</div>
					</div>
					
					<div class="row">
					<div class="input-field col col-md-12">
					  <input id="contactNumber" name="contactNumber"type="text" class="validate"required >
					  <label for="contactNumber"  class="active">Contact Number.</label>
				 	</div>
				 	
				 	<div class="row">
					<div class="input-field col col-md-6">
					  <input id="password" name="password" type="password" class="validate" required>
					  <label for="password" class="active">Password</label>
					</div>
				   </div>
				
				
				</div> 
			  <div class="row">
				<div class="input-field col s12">
				 <textarea id="address" placeholder="Address" name="address"class="materialize-textarea" required></textarea>
                  
				</div>
			  </div>
			  
			  <div class="row text-center">
				<div class="col-md-3 ">
				</div>
				<div class="input-field col-md-6  text-center">
					<input type="submit" class="btn1" value="SIGN UP">
				<%-- 	<input type="hidden" name="role"/>	--%>
				
				</div>
				<div class="col-md-3 ">
				</div>
				
			  </div>
			</form>	
			
        </div>	
       		
  </div>
</div>

