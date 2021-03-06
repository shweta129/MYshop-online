<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>



<spring:url var="css" value="/resources/css"/>
<spring:url var="js" value="/resources/js"/>
<spring:url var="images" value="/resources/images"/>

<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">

  <head>


    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    
    <meta name="_csrf" content="${_csrf.token}">
    <meta name="_csrf_header" content="${_csrf.headerName}">

    <title>ECOM Shopping - ${title}</title>
    <script>
    window.menu = '${title}';
    window.contextRoot = '${contextRoot}'
    </script>
    

    <!-- Bootstrap core CSS -->
    <link href="${css}/bootstrap.min.css" rel="stylesheet"> 

    <!-- bootstrap-readable theam -->
    <link href="${css}/bootstrap-readable-theme.css" rel="stylesheet">
    
    
    <!-- Bootstrap DataTables -->
    <link href="${css}/dataTables.bootstrap.css" rel="stylesheet">
    
    <!-- Custom styles for this template -->
    <link href="${css}/myapp.css" rel="stylesheet">

  </head>

  <body>
  
 

     <!-- Navigation -->
    <%@include file="./shared/navbar.jsp"%>

    <!--Loading home Content -->
    <!-- get the user from the controller -->
    <c:if test="${userClickHome=='true'}">   
    <%@include file="home.jsp"%>
    </c:if>
    
    
    <!--Load only when user click about -->
    <!-- get the user from the controller -->
     <c:if test="${userClickAbout=='true'}">  
    <%@include file="about.jsp"%>
    </c:if>
    

   <!--Load only when user click contact -->
   <!-- get the user from the controller --> 
   <c:if test="${userClickContact=='true'}">  
    <%@include file="contact.jsp"%>
    </c:if>
    
    
    <!--Load only when user click contact -->
    <!-- get the user from the controller -->
    <c:if test="${userClickAllProducts=='true' or userClickCategoryProducts=='true'}">  
     <%@include file="listProducts.jsp"%>
    </c:if> 
    
    
    <!--Load only when user click show product -->
    <!-- get the user from the controller -->
   <c:if test="${userClickShowProduct=='true'}">  
    <%@include file="singleProduct.jsp"%>
    </c:if> 
    
    <!--Load only when user click manage product -->
    <!-- get the user from the controller -->
    <c:if test="${userClickManageProducts=='true'}">  
    <%@include file="manageProducts.jsp"%>
    </c:if> 
    
    
    
    <!--Load only when user click Show cart -->
    <!-- get the user from the controller -->
    <c:if test="${userClickCart=='true'}">  
    <%@include file="cart.jsp"%>
    </c:if> 
    
    
    
    <!--Load only when user click Register -->
    
   <%--  <c:if test="${userClickShowRegister=='true'}">  <!-- get the user from the controller -->
    <%@include file="Register.jsp"%>
    </c:if>  --%>
    
   
    <!--Load only when user click Signup -->
    <!-- get the user from the controller -->
    <c:if test="${userClickSignup=='true'}">  
    <%@include file="signup.jsp"%>
    </c:if>  
    
    
    <!--Load only when user click Order -->
    <!-- get the user from the controller -->
    <c:if test="${userClickOrder=='true'}">  
    <%@include file="Order.jsp"%>
    </c:if>  
    
     <!--Load only when user click Order confirm -->
     <!-- get the user from the controller -->
    <c:if test="${userClickConfirmOrder=='true'}"> 
    <%@include file="visitagain.jsp"%>
    </c:if>  
    
    
    <!-- Footer -->
     <%@include file="./shared/footer.jsp"%>
      
   

    <!-- Bootstrap core JavaScript -->
    <script src="${js}/jquery.js"></script>
    
           <!-- JQuery validation -->
    <script src="${js}/jquery.validate.js"></script>

    
    <script src="${js}/popper.min.js"></script>
    

    <!-- Bootstrap Core javaScript -->
     <script src="${js}/bootstrap.min.js"></script>
     
    <script src="${js}/jquery.dataTables.js"></script>
    
     <!-- DataTable Bootstrap Script -->
	<script src="${js}/dataTables.bootstrap.js"></script>
	
	  <!-- Bootbox -->
	<script src="${js}/bootbox.min.js"></script>
    
    <!-- self coded javascript -->
    <script src="${js}/myapp.js"></script>
  </body>

</html>