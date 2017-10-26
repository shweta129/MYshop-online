<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">

      <div class="container">
       
        
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        
        <a class="navbar-brand" href="${contextRoot}/home">ECOM Shopping</a>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
           <!--   <li class="nav-item active" id="home">
              <a class="nav-link" href="#">Home
                <span class="sr-only">(current)</span>
              </a>
            </li>-->
            <li class="nav-item" id="about">
              <a class="nav-link" href="${contextRoot}/about">About Us</a>
            </li>
            
            
            
            <li class="nav-item" id="contact">
              <a class="nav-link" href="${contextRoot}/contact">Contact</a>
            </li>
            
            <li class="nav-item" id="ListProducts">
              <a class="nav-link" href="${contextRoot}/show/all/products">View Products</a>
            </li>
            
            <security:authorize access="hasAuthority('ADMIN')">
             <li class="nav-item" id="manageProducts">
              <a class="nav-link" href="${contextRoot}/manage/products">Manage Products</a>
            </li>
            </security:authorize>
           </ul>
          
          <ul class="nav navbar-nav navbar-right">
            <security:authorize access="isAnonymous()">
            <li class="nav-item" id="register">
              <a class="nav-link" href="${contextRoot}/register">Sign Up</a>
            </li>
            <li class="nav-item" id="login">
              <a class="nav-link" href="${contextRoot}/login">Login</a>
            </li>
            </security:authorize>
            
            <security:authorize access="isAuthenticated()">
            
            <li class="dropdown">
            
               <a href="javascript:void(0)"
                  class="btn btn-default dropdown-toggle"
                  id="dropdownMenu1"
                  data-toggle="dropdown">
                  
                 ${userModel.fullName}
                  <span class="caret"></span>
                  
                </a>
            
            <ul class="dropdown-menu">
            <!-- display the cart -->
            <security:authorize access="hasAuthority('USER')">
            <li>
               <a href="${contextRoot}/cart">
                 <span class="glyphicon glyphicon-shopping-cart"></span>
                 <span class="badge">${userModel.cart.cartLines}</span>
                 - &#8377; ${userModel.cart.grantTotal}
              
               </a>
            </li>
            
            
            <!-- this is for divider -->
            <li class="divider" role="separator" ></li>
            </security:authorize>
            <!--  this is for logout-->
            <li>
               <a href="${contextRoot}/perform-logout">Logout</a>
            
            </li>
            
            </ul>
            </li>
            
            </security:authorize>
           
          </ul>
        </div>
      </div>
    </nav>
    
    <script>
    
    window.userRole = '${userModel.role}';
    
    </script>