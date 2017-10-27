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
    <c:if test="${userClickHome=='true'}">   <!-- get the user from the controller -->
    <%@include file="home.jsp"%>
    </c:if>
    
    
    <!--Load only when user click about -->
     <c:if test="${userClickAbout=='true'}">  <!-- get the user from the controller -->
    <%@include file="about.jsp"%>
    </c:if>
    

   <!--Load only when user click contact -->
    
   <c:if test="${userClickContact=='true'}">  <!-- get the user from the controller -->
    <%@include file="contact.jsp"%>
    </c:if>
    
    
   <!--Load only when user click contact -->
    
   <c:if test="${userClickAllProducts=='true' or userClickCategoryProducts=='true'}">  <!-- get the user from the controller -->
    <%@include file="listProducts.jsp"%>
    </c:if> 
    
    
   <!--Load only when user click show product -->
    
   <c:if test="${userClickShowProduct=='true'}">  <!-- get the user from the controller -->
    <%@include file="singleProduct.jsp"%>
    </c:if> 
    
   <!--Load only when user click manage product -->
    
    <c:if test="${userClickManageProducts=='true'}">  <!-- get the user from the controller -->
    <%@include file="manageProducts.jsp"%>
    </c:if> 
    
    
    
   <!--Load only when user click manage product -->
    
    <c:if test="${userClickShowCart=='true'}">  <!-- get the user from the controller -->
    <%@include file="cart.jsp"%>
    </c:if> 
    
    
    <!-- Footer -->
     <%@include file="./shared/footer.jsp"%>
      
   

    <!-- Bootstrap core JavaScript -->
    <script src="${js}/jquery.js"></script>
    <script src="${js}/popper.min.js"></script>
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