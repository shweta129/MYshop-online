<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
              <a class="nav-link" href="${contextRoot}/contact">Contact Us</a>
            </li>
            
            
            <li class="nav-item" id="ListProducts">
               <a class="nav-link" href="${contextRoot}/show/all/products">View Products</a>
               <c:if test = "${pageContext.request.userPrincipal.name!=null}">
               </c:if>
            </li>
            
            
             <!-- this is for cart -->
          
           <security:authorize access="hasAuthority('USER')">
            <li id="cart"><a class="nav-link" href="${contextRoot}/cart/getcart">Cart</a></li> 
      	   </security:authorize>
            
            
            <!-- manage Product -->
            <c:if test = "${pageContext.request.userPrincipal.name!=null}">
            <security:authorize access="hasAuthority('ADMIN')">
            
             <li class="nav-item" id="manageProducts">
              <a class="nav-link" href="${contextRoot}/manage/products">Manage Products</a>
            </li>
            </security:authorize>
            </c:if>
           </ul>
          
         <%--  <!-- this is for cart -->
          
          <security:authorize access="hasAuthority('USER')">
       <li id="cart"><a href="${contextRoot}/cart/getcart"><i class="glyphicon glyphicon-cart"> welcome </i></a></li> 
      	</security:authorize> --%>
          
          <!-- this is for login -->
          
          <ul class="nav navbar-nav navbar-right">
		<c:if test="${pageContext.request.userPrincipal.name==null }">
		<li id=myaccount class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">My Account
          <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li id=signup><a href="${contextRoot}/register/user">Sign Up</a></li>
            <li id=login><a href="${contextRoot}/login">Login</a></li>
          </ul>
        </li>
       </c:if> 
        
        <c:if test="${pageContext.request.userPrincipal.name!=null }">
        <li id=logout><a href="${contextRoot}/j_spring_security_logout">Logout</a></li>
        </c:if>
        </ul>
        
            
             <security:authorize access="isAuthenticated()">
            
            <li class="dropdown" id="userCart">
            
               <c:if test = "${pageContext.request.userPrincipal.name!=null}">
               <a href="">Hello ${pageContext.request.userPrincipal.name}</a>
               </c:if>
            
            <ul class="dropdown-menu">
            <!-- display the cart -->
            <security:authorize access="hasAuthority('USER')">
            <li>
               <a href="${contextRoot}/cart/getcart">
               <span class="glyphicon glyphicon-shopping-cart"></span>
            
               </a>
            </li>
            
            
           <!--  <!-- this is for divider
            <li class="divider" role="separator" ></li> -->
            </security:authorize>
            <!--  this is for logout-->
           
            <%-- <c:if test = "${pageContext.request.userPrincipal.name!=null}">
            <li id = logout><a href="${contextRoot}/j_spring_security_logout">Logout</a> </li>
            </c:if> --%>
           
            
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