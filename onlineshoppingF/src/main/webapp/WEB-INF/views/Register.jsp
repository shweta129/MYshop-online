<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
  
   <%@include file="shared/navbar.jsp" %>
<head>
<title>Login</title>
<%-- <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
--%>
</head>

    
	<!-- Basic Page Needs -->
	<meta charset="utf-8">
	<title>Sign Up</title>
	
	<meta name="author" content="2code.info">
	
	<!-- Mobile Specific Metas -->
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	
	<!-- Main Style -->
	<link rel="stylesheet" href="resources/style.css">
	
	<!-- Skins -->
	<link rel="stylesheet" href="resources/css/skins/skins.css">
	
 
	
	<!-- Dark -->
	<link rel="stylesheet" href="resources/css/dark.css">
	
	<!-- Responsive Style -->
	<link rel="stylesheet" href="resources/css/responsive.css">
	
	<!-- Favicons -->
	<link rel="shortcut icon" href="resources/images/favicon.png">
  
</head>
<body class="dark-s">

<div class="loader"><div class="loader_html"></div></div>

<div id="wrap" class="fixed-enabled grid_1200">
	
	<div class="breadcrumbs">
		<div class="container">
			<div class="row">
				<div class="col-md-6">
					<h4>My Account</h4>
					<span>Sign Up | Login</span>
				</div>
				<div class="col-md-6">
					<div class="crumbs">You are here: <a href="page.jsp">Home</a><span class="crumbs-span">&raquo;</span><span>My Account - Sign Up | Login</span></div>
				</div>
			</div><!-- End row -->
		</div><!-- End container -->
	</div><!-- End breadcrumbs -->
	
	<div class="sections sections-padding-t-0">
		
	
		<div class="container">
			<div class="row">
				<div class="col-md-12 main-content">
					<div class="row">
						<div class="col-md-6">
							<div class="section-title section-title-2 section-title-3"><h6>Sign Up :</h6></div>
							<div class="comment-form">
								<form method="post" class="form-js" action="contact_us.php">
									<div class="row">
										<div class="col-md-12">
											<div class="form-input">
												<i class="fa fa-user"></i>
												<input name="firstName" id="firstName" type="text" placeholder="First Name">
											</div>
										</div>
										
										<div class="col-md-12">
											<div class="form-input">
												<i class="fa fa-user"></i>
												<input name="lastName" id="lastName" type="text" placeholder="Last Name">
											</div>
										</div>
										
										
										<div class="col-md-12">
											<div class="form-input">
												<i class="fa fa-envelope"></i>
												<input name="email" id="email" type="email" placeholder="Email">
											</div>
										</div>
										
										<div class="col-md-12">
											<div class="form-input">
												<i class="fa fa-phone"></i>
												<input name="contactNumber" id="contactNumber" type="text" placeholder="Contact No.">
											</div>
										</div>
										
										<div class="col-md-12">
											<div class="form-input">
												<i class="fa fa-phone"></i>
												<input name="password" id="password" type="password" placeholder="Password">
											</div>
										</div>
										
										<div class="col-md-12">
											<div class="form-input">
												<i class="fa fa-home"></i>
												<textarea name="address" id="address" placeholder="Address"></textarea>
											</div>
										</div>
										
										<div class="col-md-12">
											<div class="form-input">
												<i class="fa fa-lock"></i>
												<input name="confirmPassword" id="confirmPassword" type="confirmPassword" placeholder="Confirm Password">
											</div>
										</div>
										
										<div class="col-md-12 sections-padding-b-25" >
											<div class="form-group">
												<label style="display:inline" for="year">Role :</label>
													  <select class="form-control" style="display:inline"id="role" name="role">
													   <option>--Select--</option>
														<option>Admin</option>
														<option>User</option>
														
														
													  </select>
											</div>
										</div>
										
										<div class="col-md-4 col-sm-12 centered" >
											
										</div>
										
										
										<div class="col-md-4 col-sm-12 centered" >
											<input type="submit" class="button-3" value="SIGN UP">
										</div>
										<div class="col-md-4 col-sm-12 centered" >
											
										</div>
										
										
									</div><!-- End row -->
								</form>
							</div><!-- End comment-form -->
						</div>
						
						
						<div class="col-md-6">
							<div class="section-title section-title-2 section-title-3"><h6>Log In :</h6></div>
							<div class="comment-form">
								<form method="post" class="form-js" action="contact_us.php">
									<div class="row">
										<div class="col-md-12">
											<div class="form-input">
												<i class="fa fa-envelope"></i>
												<input name="email" id="email" type="email" placeholder="Your Email">
											</div>
										</div>
										
										
										<div class="col-md-12">
											<div class="form-input">
												<i class="fa fa-lock"></i>
												<input name="password" id="password" type="password" placeholder="Password">
											</div>
										</div>
										
										
										<div class="col-md-4 col-sm-12 centered" >
											
										</div>
										
										<div class="col-md-4 col-sm-12 centered" >
											<input type="submit" class="button-3" value="LOG IN">
										</div>
										<div class="col-md-4 col-sm-12 centered" >
											
										</div>
										
									</div><!-- End row -->
								</form>
							</div><!-- End comment-form -->
						</div>
						
					</div><!-- End row -->
				</div><!-- End main-content -->
			</div><!-- End row -->
			
		</div><!-- End container -->
		
		
	</div><!-- End sections -->
	<footer class="py-4 bg-dark">
      <div class="container">
        <p class="m-0 text-center text-white">Copyright &copy; SHWETA  | 2017</p>
      </div>
						<div class="widget-about">
							<p>ECOM shopping is your one stop shop for buying best Electronics product in India. We are B2C now, open for all to buy Electronics products at an extremely affordable price for all sports like Tv, Mobile, Laptop etc</p>
							<div class="social-ul">
								<ul>
									<li class="social-facebook"><a href="#"><i class="fa fa-facebook"></i></a></li>
									<li class="social-twitter"><a href="#"><i class="fa fa-twitter"></i></a></li>
									<li class="social-google"><a href="#"><i class="fa fa-google-plus"></i></a></li>
									<li class="social-pinterest"><a href="#"><i class="fa fa-pinterest"></i></a></li>
									<li class="social-vimeo"><a href="#"><i class="fa fa-vimeo-square"></i></a></li>
									<li class="social-linkedin"><a href="#"><i class="fa fa-linkedin"></i></a></li>
								</ul>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="footer-widget">
						<div class="widget-title"><h6>Get In Touch</h6></div>
						<div class="widget-about-2">
							<ul>
								<li>
									<i class="fa fa-map-marker"></i>
									<div>ECOM shopping , Opposite Alok hotel , Thane, Mumbai.</div>
								</li>
								<li>
									<i class="fa fa-phone"></i>
									<div> Telephone No : 022 34567899</div>
								</li>
								<li>
									<i class="fa fa-envelope"></i>
									<div> Email Account : Sales@ECOMshopping.com</div>
								</li>
							</ul>
						</div>
					</div>
				</div>
				
				</div>
				<div class="col-md-3">
					<div class="footer-widget">
						<div class="widget-title"><h6>Locate Us</h6></div>
						<div class="widget-twitter">
							<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3768.170594320852!2d72.97329121446982!3d19.187749887023937!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3be7b920c9f39551%3A0xf945af6df994a80!2sNIIT!5e0!3m2!1sen!2sin!4v1498773636228" width="100%" height="180" frameborder="0" style="border:0" allowfullscreen></iframe>
						</div>
					</div>
				</div>
			</div><!-- End row -->
		</div><!-- End container -->
	</footer><!-- End footer -->
</div><!-- End wrap -->

<div class="go-up"><i class="fa fa-chevron-up"></i></div>
</body>     
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
      
      
 <%--  <div class="container">
       
     <div class="row">
 
 <div class="col-md-6 col-md-offset-3">
  
  <div class="panel panel-primary">
  
   <div class="panel-heading">
    <h4>Sign Up - Personal</h4>
   </div>
   
   <div class="panel-body">
        
    <form>
    
   
      
       
    <div class="form-group">
     <label class="control-label col-md-4">First Name</label>
     <div class="col-md-8">
      <f:input type="text" path="firstName" class="form-control"
       placeholder="First Name" />
		
		<sf:errors path="firstName" cssClass="help-block" element="em"/>        
     
     </div>
    </div>


       <div class="form-group">
        <label class="control-label col-md-4">Last Name</label>
        <div class="col-md-8">
         <sf:input type="text" path="lastName" class="form-control"
          placeholder="Last Name" />
          
			<sf:errors path="lastName" cssClass="help-block" element="em"/> 
          
        </div>
       </div>
      
       <div class="form-group">
        <label class="control-label col-md-4">Email</label>
        <div class="col-md-8">
         <sf:input type="text" path="email" class="form-control"
          placeholder="abc@zyx.com" />
        
			<sf:errors path="email" cssClass="help-block" element="em"/>          
        
        </div>
       </div>

       <div class="form-group">
        <label class="control-label col-md-4">Contact Number</label>
        <div class="col-md-8">
         <sf:input type="text" path="contactNumber" class="form-control"
          placeholder="XXXXXXXXXX" maxlength="10" />
        
        	<sf:errors path="contactNumber" cssClass="help-block" element="em"/> 
        
        
        </div>
       </div>
       
       <div class="form-group">
        <label class="control-label col-md-4">Password</label>
        <div class="col-md-8">
         <sf:input type="password" path="password" class="form-control"
          placeholder="Password" />
          
          <sf:errors path="password" cssClass="help-block" element="em"/> 
          
          
        </div>
       </div>
       
       
       <div class="form-group">
        <label class="control-label col-md-4">address</label>
        <div class="col-md-8">
         <sf:input type="text" path="address" class="form-control"
          placeholder="adress" />
          
          <sf:errors path="address" cssClass="help-block" element="em"/> 
          
          
        </div>
       </div>
       
       
       
        <div class="form-group">
        <label class="control-label col-md-4">Confirm Password</label>
        <div class="col-md-8">
         <sf:input type="password" path="confirmPassword" class="form-control"
          placeholder="Re-enter Password" />
          
          <sf:errors path="confirmPassword" cssClass="help-block" element="em"/> 
          
        </div>
       </div>        
       
       
       <!-- radio button using bootstrap class of radio-inline -->
	   <div class="form-group">
	     <label class="control-label col-md-4">Select Role</label>
	     <div class="col-md-8">
	       <label class="radio-inline">
	        <sf:radiobutton path="role" value="USER" checked="checked"/> User     
	       </label>
	       <label class="radio-inline">
	        <sf:radiobutton path="role" value="SUPPLIER"/> Supplier
	       </label>
	     </div>
	    </div>       

       <div class="form-group">
        <div class="col-md-offset-4 col-md-8">
			<button type="submit" class="btn btn-primary"
				name="_eventId_billing"
			>
				
				Next - Billing <span class="glyphicon glyphicon-chevron-right"></span>
			
			</button>
 
        </div>
       </div>

      </form>   
     </div>
    </div>
   </div>
  </div>  
       
       
       
  </div>
           
    
 --%>