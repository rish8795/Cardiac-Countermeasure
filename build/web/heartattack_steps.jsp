<%-- 
    Document   : heartattack_steps
    Created on : 27 Apr, 2016, 2:51:37 PM
    Author     : Dell
--%>

<!DOCTYPE html>
<html lang="en">
  <head>
   

    <!-- Basic Page Needs
    ================================================== -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
     <title>CARDIAC COUNTERMEASURE: Features</title>

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
    <link href="style.css" rel="stylesheet">
   
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
<%@include file="header_patient.jsp" %>
    <!--=========== END HEADER SECTION ================-->
    <section id="blogArchive">      
      <div class="row">
        <div class="col-lg-12 col-md-12">
          <div class="blog-breadcrumbs-area">
            <div class="container">
              <div class="blog-breadcrumbs-left">
                <h2>Heart-Attack Detection</h2>
              </div>
              <div class="blog-breadcrumbs-right">
                <ol class="breadcrumb">
                  <li>You are here</li>
                  <li><a href="#">Home</a></li>                  
                  <li class="active">Heart-Attack Detection</li>
                </ol>
              </div>
            </div>
          </div>
        </div>        
      </div>      
    </section>
       <!--=========== BEGIN Service SECTION ================-->
    <section id="whychooseSection">
      <div class="container">
        <div class="row">
          <div class="col-lg-12 col-md-12">
            <div class="service-area">
              <!-- Start Service Title -->
              <div class="section-heading">
                <h2>How it Works</h2>
                <div class="line"></div>
              </div>              
            </div>
          </div>
          <div class="col-lg-12 col-md-12">
            <div class="row">
              <div class="col-lg-5 col-md-6 col-sm-6 col-xs-12">
                 <div class="how-works-area">
             <div class="section-heading">     
              </div>
              <div class="how-works">
                <ul class="nav nav-tabs" id="myTab">
                  <li class="active"><a href="#experiment" data-toggle="tab">Step-1</a></li>
                  <li><a href="#monitor" data-toggle="tab">Step-2</a></li>
                  <li><a href="#clean" data-toggle="tab">Step-3</a></li>
                  <li><a href="#fast" data-toggle="tab">Step-4</a></li>  
                </ul>
                <!-- Tab panes -->
                <div class="tab-content">
                  <div class="tab-pane fade in active" id="experiment">
                      <p style="font-size: large;color: #CE522C;font-weight: 600;">Answer the qustionnaire to estimate your risk of having a heart-attack or dying from coronary heart disease over the next 10 years.</p>
                      <img class="img-center" src="images/finalpic1.png" alt="img">
                  </div>
                  <div class="tab-pane fade " id="monitor">
                    <p style="font-size: large;color: #CE522C;font-weight: 600;">Discover your chances of occurring heart attack through system generated report.</p>
                    <img class="img-center" src="images/meter.png" alt="img">
                  </div>
                  <div class="tab-pane fade " id="clean">
                    <p style="font-size: large;color: #CE522C;font-weight: 600;">Learn if your pattern of risk factors puts you in a high-risk category and discover how small improvements in different    risk factors may lessen your chances of cardiac arrest.</p>
                    <img class="img-center" src="images/modify.png" alt="img">
                  </div>
                  <div class="tab-pane fade " id="fast">
                    <p style="font-size: large;color: #CE522C;font-weight: 600";>Know Laboratory test to be conducted according to the chances depicted in system generated report.</p>
                    <img class="img-center" src="images/testconduct.png" alt="img">
                  </div>
              </div>
              </div>
              </div>
              </div>
              <div class="col-lg-7 col-md-6 col-sm-6 col-xs-12">
                  <div class="whyChoose-right" style="margin-left: 100px;">
                  <div class="media">
                    <div class="media-left">
                      <a href="#" class="media-icon">
                        <span class="fa fa-info"></span>
                      </a>
                    </div>
                    <div class="media-body">
                        <h4 class="media-heading"><a href="ha_calculator_goal.jsp">More information about the calculator goals.</a></h4>
                    </div>
                  </div>
                  <div class="media">
                    <div class="media-left">
                      <a href="#" class="media-icon">
                        <span class="fa fa-question"></span>
                      </a>
                    </div>
                    <div class="media-body">
                        <h4 class="media-heading"><a href="ha_needto_know.jsp">What you need to know to use this calculator</a></h4>
                    </div> 
                  </div>
                  <div class="media">
                    <div class="media-left">
                      <a href="#" class="media-icon">
                        <span class="fa fa-play"></span>
                      </a>
                    </div>
                    <div class="media-body">
                        <h4 class="media-heading"><a href="calculatefactorrisk">Begin your test here</a></h4>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>          
        </div>
      </div>
    </section>

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
