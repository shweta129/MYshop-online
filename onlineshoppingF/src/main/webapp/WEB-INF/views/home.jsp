<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	
<%-- <img src="${images}/download1.jpg"> --%>

	

<div class="container">

      <div class="row">

        <div class="col-lg-2">
        
       <%@include file="./shared/sidebar.jsp"%>
       
         </div>
        <!-- /.col-lg-3 -->

        <div class="col-lg-10">
 
          <!-- carousel -->
          <div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner">
    <div class="item active">
      <img class="d-block img-fluid" src="${images}/1.jpg" alt="First slide">
    </div>

    <div class="item">
     <img class="d-block img-fluid" src="${images}/22.jpg" alt="First slide">
             </div>

    <div class="item">
     <img class="d-block img-fluid" src="${images}/3.jpg" alt="First slide">
              </div>
  </div>

  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
<br><br>
          <!-- caroussel end -->

          <div class="row">

            <div class="col-lg-4 col-md-6 mb-4">
              <div class="card h-100">
                <a href="#"><img class="card-img-top" src="${images}/p8.jpg" alt=""></a>
                <div class="card-body">
                  <h4 class="card-title">
                    <a href="${contextRoot}/show/12/product">Tvs</a>
                  </h4>
                  <h5>11111.0</h5>
                  <p class="card-text">Atractive TV here, consectetur adipisicing elit. Amet numquam aspernatur!</p>
                
                    
                </div>
                <div class="card-footer">
                  <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
                </div>
              </div>
            </div>

            <div class="col-lg-4 col-md-6 mb-4">
              <div class="card h-100">
                <a href="#"><img class="card-img-top" src="${images}/p2.jpg" alt=""></a>
                <div class="card-body">
                  <h4 class="card-title">
                    <a href="${contextRoot}/show/13/product">Mobile</a>
                  </h4>
                  <h5>50000.0</h5>
                  <p class="card-text">this is fastract watchActractive mobile here, consectetur adipisicing elit. Amet numquam aspernatur! Lorem ipsum dolor sit amet.</p>
               
                  
                </div>
                <div class="card-footer">
                  <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
                </div>
              </div>
            </div>

            <div class="col-lg-4 col-md-6 mb-4">
              <div class="card h-100">
                <a href="#"><img class="card-img-top" src="${images}/p3.jpg" alt=""></a>
                <div class="card-body">
                  <h4 class="card-title">
                    <a href="${contextRoot}/show/11/product">watch</a>
                  </h4>
                  <h5>66666.0</h5>
                  <p class="card-text">this is fastract watch</p>
                
                    
                </div>
                <div class="card-footer">
                  <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
                </div>
              </div>
            </div>

            <div class="col-lg-4 col-md-6 mb-4">
              <div class="card h-100">
                <a href="#"><img class="card-img-top" src="${images}/p4.jpg" alt=""></a>
                <div class="card-body">
                  <h4 class="card-title">
                    <a href="${contextRoot}/show/14/product">mobile s5</a>
                  </h4>
                  <h5>56000.0 </h5>
                  <p class="card-text">Atractive galaxy s5 here, consectetur adipisicing elit. Amet numquam aspernatur!

                 </p>
                    
                </div>
                <div class="card-footer">
                  <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
                </div>
              </div>
            </div>

            <div class="col-lg-4 col-md-6 mb-4">
              <div class="card h-100">
                <a href="#"><img class="card-img-top" src="${images}/f1.jpg" alt=""></a>
                <div class="card-body">
                  <h4 class="card-title">
                    <a href="${contextRoot}/show/15/product">watchs</a>
                  </h4>
                  <h5>45000.0</h5>
                  <p class="card-text">Atractive watch here, consectetur adipisicing elit. Amet numquam aspernatur! Lorem ipsum dolor sit amet.</p>
                   
                    
                </div>
                <div class="card-footer">
                  <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
                
                 
                </div>
              </div>
            </div>

            <div class="col-lg-4 col-md-6 mb-4">
              <div class="card h-100">
                <a href="#"><img class="card-img-top" src="${images}/p7.jpg" alt=""></a>
                <div class="card-body">
                  <h4 class="card-title">
                    <a href="${contextRoot}/show/16/product">tvz</a>
                  </h4>
                  <h5>87000.0 </h5>
                  <p class="card-text">Atractive tv here, consectetur adipisicing elit. Amet numquam aspernatur!</p>
                
                  
                </div>
                <div class="card-footer">
                  <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
                </div>
              </div>
            </div>

          </div>
          <!-- /.row -->

        </div>
        <!-- /.col-lg-9 -->

      </div>
      <!-- /.row -->

    </div>
    <!-- /.container -->