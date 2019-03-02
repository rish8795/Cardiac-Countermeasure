<%-- 
    Document   : Admin_homepage
    Created on : 20 Apr, 2016, 2:29:07 PM
    Author     : Dell
--%>

<%@page import="model.Admin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
  
    <!-- Basic Page Needs
    ================================================== -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
     <title>CARDIAC COUNTERMEASURE: Welcome Admin</title>

    <!-- Mobile Specific Metas
    ================================================== -->
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Favicon -->
    <link rel="shortcut icon" type="image/icon" href="images/favicon.ico"/>

    <!-- CSS
    ================================================== -->       
    <!-- Bootstrap css file-->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- Font awesome css file-->
    <link href="css/font-awesome.min.css" rel="stylesheet">       
    <!-- Default Theme css file -->
    <link id="switcher" href="css/themes/default-theme.css" rel="stylesheet">    
    <!-- Slick slider css file -->
    <link href="css/slick.css" rel="stylesheet"> 

    <!-- Main structure css file -->
    <link href="style_jui.css" rel="stylesheet">
   
    <!-- Google fonts -->
    <link href='http://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>  
    <link href='http://fonts.googleapis.com/css?family=Habibi' rel='stylesheet' type='text/css'>  
    <link href='http://fonts.googleapis.com/css?family=Cinzel+Decorative:900' rel='stylesheet' type='text/css'>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]--> 
  </head>
  <body>    
    <!-- BEGAIN PRELOADER -->
    <div id="preloader">
      <div id="status">&nbsp;</div>
    </div>
    <!-- END PRELOADER -->

    <!-- SCROLL TOP BUTTON -->
    <a class="scrollToTop" href="#"><i class="fa fa-heartbeat"></i></a>
    <!-- END SCROLL TOP BUTTON -->

    <!--=========== BEGIN HEADER SECTION ================-->
    <%@include file="header_admin.jsp" %>
    <!--=========== END HEADER SECTION ================-->        
    <section id="blogArchive">      
      <div class="row">
        <div class="col-lg-12 col-md-12">
          <div class="blog-breadcrumbs-area">
            <div class="container">
              <div class="blog-breadcrumbs-left">
                  
                    <%
                    HttpSession hs = request.getSession();
                    if(hs.getAttribute("admin")!=null)
                    {
                    Admin l =(Admin)hs.getAttribute("admin");
                    String fname=l.getName(); 
                %>
                
                  <h2>Welcome <%=fname%></h2>
                     <%}%>
       
                
              </div>
              <div class="blog-breadcrumbs-right">
                <ol class="breadcrumb">
                  <li>You are here</li>
                  <li><a href="#">Home</a></li>                  
                </ol>
              </div>
            </div>
          </div>
        </div>        
      </div>      
    </section>
    <div class="col-lg-12 col-md-12">
        <div class="col-lg-4 col-md-4">
            <div class="col-lg-1 col-md-1">
            <a href="#" class="media-icon">
                <span class="fa fa-envelope"></span>
            </a>
            </div>
            <div class="col-lg-3 col-md-3">
            
                <div class="panel-heading" style="margin-top: 15px; margin-left: 33px;border-style: groove;border-color: rgb(193, 102, 18);border-radius: 26px;background: #BF4C31;width: 401%;">
                    <h4 class="panel-title" style="font-weight: bold;  font-size: medium; color: white;">
                      <a target='_blank' href="https://mail.google.com/mail/#inbox">
                          MailBox <span class="fa fa-plus" style="margin-left: 176px"></span>
                      </a>
                    </h4>
                  </div>
                  <div id="collapseOne" class="panel-collapse collapse in">
                    <div class="panel-body">
                     <p></p>
                    </div>
                  </div>
                  
            </div>
        </div>
        <div class="col-lg-4 col-md-4">
            <div class="col-lg-1 col-md-1">
            <a href="#" class="media-icon">
                <span class="fa fa-user-md"></span>
            </a>
            </div>
            <div class="col-lg-3 col-md-3">
            
                <div class="panel-heading" style="margin-top: 15px; margin-left: 33px;border-style: groove;border-color: rgb(193, 102, 18);border-radius: 26px;background: #BF4C31;width: 399%;">
                    <h4 class="panel-title" style="font-weight: bold;  font-size: medium; color: white;">
                      <a  href="admin_add_doctors">
                          Doctor Requests <span class="fa fa-plus" style="margin-left: 106px"></span>
                      </a>
                    </h4>
                  </div>
                  <div id="collapseOne" class="panel-collapse collapse in">
                    <div class="panel-body">
                     <p></p>
                    </div>
                  </div>
                  
            </div>
        </div>
        <div class="col-lg-4 col-md-4">
            <div class="col-lg-1 col-md-1">
            <a href="#" class="media-icon">
                <span class="fa fa-user-md"></span>
            </a>
            </div>
            <div class="col-lg-3 col-md-3">
            
                <div class="panel-heading" style="margin-top: 15px; margin-left: 33px;border-style: groove;border-color: rgb(193, 102, 18);border-radius: 26px;background: #BF4C31;width: 399%;">
                    <h4 class="panel-title" style="font-weight: bold;  font-size: medium; color: white;">
                      <a href="admin_add_lab">
                          Lab Requests <span class="fa fa-plus" style="margin-left: 106px"></span>
                      </a>
                    </h4>
                  </div>
                  <div id="collapseOne" class="panel-collapse collapse in">
                    <div class="panel-body">
                     <p></p>
                    </div>
                  </div>
                  
            </div>
        </div>
  </div>
    <section id="blogArchive">      
      <div class="row">
        <div class="col-lg-12 col-md-12">
            <div class="blog-breadcrumbs-area" style="margin-top: -115px;">
            <div class="container">
              <div class="blog-breadcrumbs-left">
              </div>
              <div class="blog-breadcrumbs-right">
                <ol class="breadcrumb">
                                   
                </ol>
              </div>
            </div>
          </div>
        </div>        
      </div>      
    </section>
       <!--=========== BEGIN Service SECTION ================-->
    <section id="service">
      <div class="container">
        <div class="row">
          <div class="col-lg-12 col-md-12">
            <div class="service-area">
              <!-- Start Service Title -->
              <div class="section-heading">
                <h2>Tasks</h2>
                <div class="line"></div>
              </div>
              <!-- Start Service Content -->
              <div class="service-content">
                <div class="row">
                  <!-- Start Single Service -->
                  <div class="col-lg-4 col-md-4">
                    <div class="single-service">
                      <div class="service-icon">
                        <span class="fa fa-stethoscope service-icon-effect"></span>  
                      </div>                      
                        <h3><a href="admin_view_totaldocs.jsp">View List of Doctor in System</a></h3>
                      
                    </div>
                  </div>
                  <!-- Start Single Service -->
                  <div class="col-lg-4 col-md-4">
                    <div class="single-service">
                      <div class="service-icon">
                        <span class="fa fa-heartbeat service-icon-effect"></span>  
                      </div>                      
                        <h3><a href="admin_view_totallab.jsp">View List of Labs in System</a></h3>
                      
                    </div>
                  </div>
                  <!-- Start Single Service -->
                  <div class="col-lg-4 col-md-4">
                    <div class="single-service">
                      <div class="service-icon">
                        <span class="fa fa-h-square service-icon-effect"></span>  
                      </div>                      
                      <h3><a href="https://mail.google.com/mail/#inbox">View Feedback</a></h3>
                      
                    </div>
                  </div>
                  <!-- Start Single Service -->
                  <div class="col-lg-4 col-md-4">
                      <div class="single-service" style="margin-left: -180px; margin-bottom: -5px">
                      <div class="service-icon">
                        <span class="fa fa-medkit service-icon-effect"></span>  
                      </div>                      
                      <h3><a href="admin_add_lab.jsp">Add/Remove Laboratories</a></h3>
                      
                    </div>
                  </div>
                  <!-- Start Single Service -->
                  <div class="col-lg-4 col-md-4">
                      <div class="single-service" style="margin-left: 195px; margin-top: -210px">
                      <div class="service-icon">
                        <span class="fa fa-user-md service-icon-effect"></span>  
                      </div>                      
                      <h3><a href="admin_add_doctors.jsp">Add/Remove Doctors</a></h3>
                      
                    </div>
                  </div>
                  <!-- Start Single Service -->
                  
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    <!--=========== End Service SECTION ================-->
    
    

    <footer id="footer">
      <!-- Start Footer Top -->
      <div class="footer-top">
        <div class="container">
          <div class="row">
            <div class="col-lg-3 col-md-3 col-sm-3">
              <div class="single-footer-widget">
                <div class="section-heading">
                <h2>About Us</h2>
                <div class="line"></div>
              </div>           
              <p> 'Cardiac Countermeasure' is a link between the Artificial Intelligence Cardiac System and the needy patient. It provides the person with a detailed list of Factors and functions related to heart-attack and after the user provides the correct information then System will generate the chances of the person of having heart-attack. Not only that after the system based report is generated it also provides the further asylum to the user for consulting laboratory as well as cardiologist.</p>
              </div>
            </div>
            <div class="col-lg-5 col-md-5 col-sm-5">
              
            </div>
            <div class="col-lg-3 col-md-3 col-sm-3">
              <div class="single-footer-widget">
                <div class="col-lg-3 col-md-3 col-sm-3">
              <div class="single-footer-widget">
                <div class="section-heading">
                <h2>Contact Info</h2>
                <div class="line"></div>
              </div>
              <p>Feel free to contact us at any time for suggestions or complaints</p>
              <address class="contact-info">
                <p><span class="fa fa-home"></span>305 Satyam mall,
                jodhpur,Ahmedabad</p>
                <p><span class="fa fa-phone"></span>+919974911232</p>
                <p><span class="fa fa-envelope"></span>info@Cardiaccountermeasure.com</p>
              </address>
              </div>
            </div>
          </div>
        </div>
      </div>
      <!-- Start Footer Middle -->
      <div class="footer-middle">
        <div class="container">
          <div class="row">
          <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
            <div class="footer-copyright">
              <p>&copy; Copyright 2015 <a href="index.html">R&J</a></p>
            </div>
          </div>
          <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
            <div class="footer-social">              
                <a href="#"><span class="fa fa-facebook"></span></a>
                <a href="#"><span class="fa fa-twitter"></span></a>
                <a href="#"><span class="fa fa-google-plus"></span></a>
                <a href="#"><span class="fa fa-linkedin"></span></a>     
            </div>
          </div>
        </div>
        </div>
      </div>
      <!-- Start Footer Bottom -->
      <div class="footer-bottom">
        <div class="container">
          <div class="row">
            <div class="col-md-12">
              <p>Design & Developed By <a rel="nofollow" href="https://www.facebook.com/rishabh.shah.18"> R&J</a></p>
            </div>
          </div>
        </div>
      </div>
    </footer>
    <!--=========== End Footer SECTION ================-->

    <!-- jQuery Library  -->
    <script src="js/jquery.js"></script>    
    <!-- Bootstrap default js -->
    <script src="js/bootstrap.min.js"></script>
    <!-- slick slider -->
    <script src="js/slick.min.js"></script>    
    <script type="text/javascript" src="js/modernizr.custom.79639.js"></script>    
    <!-- counter -->
    <script src="js/waypoints.min.js"></script>
    <script src="js/jquery.counterup.min.js"></script>
    <!-- Doctors hover effect -->
    <script src="js/snap.svg-min.js"></script>
    <script src="js/hovers.js"></script>
    
    <!-- Custom JS -->
    <script src="js/custom.js"></script>
     
  </body>
</html>