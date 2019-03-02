<%@page import="model.Doctor"%>
<%@page import="model.Patient"%>
<!DOCTYPE html>
<html lang="en">
  <head>

    <!-- Basic Page Needs
    ================================================== -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="description" content="Medical Theams">
	<meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
     <title>CARDIAC COUNTERMEASURE: Patient Home</title>

    <!-- Mobile Specific Metas
    ================================================== -->
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Favicon -->
    <link rel="shortcut icon" type="image/icon" href="images/favicon.ico"/>

    <!-- CSS
    
    
    ================================================== -->     
   <!-- <link rel="stylesheet" href="css/bootstrap.min.app.css"> -->
        <link rel="stylesheet" href="css/font-awesome_app.css">
        <link rel="stylesheet" href="css/custom-variation2-app.css"> 
         <link rel="stylesheet" href="css/responsive_app.css"> 
    <!-- Bootstrap css file -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- Font awesome css file-->
    <link href="css/font-awesome.min.css" rel="stylesheet">       
    <!-- Default Theme css file -->
    <link id="switcher" href="css/themes/default-theme.css" rel="stylesheet">   
    <!-- Slick slider css file -->
    <link href="css/slick.css" rel="stylesheet"> 
    <!-- Photo Swipe Image Gallery -->     
    <link rel='stylesheet prefetch' href='css/photoswipe.css'>
    <link rel='stylesheet prefetch' href='css/default-skin.css'>    

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
    <style>
        .appointment_take{
	border-radius: 25px;
        background: #CE522C;
        float: left;
        display: inline;
        width: 90%;
        text-align: center;
        padding: 40px 30px;
        margin-left: 305px;
        }
        .appointment_time{
        border-radius: 25px;
        background: #CE522C;
        float: left;
        display: inline;
        width: 90%;
        text-align: center;
        padding: 51px 30px;
        margin-left: 160px;  
        }
    </style>
     <script type="text/javascript">
            function GetDocNames()
            {
                var sid = document.getElementById("idstate").value;
                var url = "GetCityServ?state="+sid;
                var xmlReq = new XMLHttpRequest();
                xmlReq.onreadystatechange = function ()
                {
                    if(xmlReq.status==200)
                    {
                        document.getElementById("idcity").innerHTML = xmlReq.responseText;
                    }
                    
                }
                xmlReq.open("get",url,true);
               
                xmlReq.send();
                //alert(sid);
            }
        </script>
    
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
    
    

    <%@include file="header_patient.jsp" %> 

     <!--=========== BEGIN SLIDER SECTION ================-->
    
    <section id="blogArchive">      
      <div class="row">
        <div class="col-lg-12 col-md-12">
          <div class="blog-breadcrumbs-area">
            <div class="container">
              <div class="blog-breadcrumbs-left">
         <%
         HttpSession hs = request.getSession();
         if(hs.getAttribute("patient")!=null){
             Patient p =(Patient)hs.getAttribute("patient");
               String fname=p.getPFirstname(); 
               String lname = p.getPLastname();
         %>
         <h2>Welcome <%=fname + " " +lname%></h2>
         <%}%>
              </div>
              <div class="blog-breadcrumbs-right">
                <ol class="breadcrumb">
                  <li>You</li>
                  <li><a href="#">Home</a></li>               
                </ol>
              </div>
            </div>
          </div>
        </div>        
      </div>      
    </section>
 
    <!--=========== END SLIDER SECTION ================-->

    
    <!--=========== BEGIN SLIDER SECTION ================-->
    <section id="sliderArea">
      <!-- Start slider wrapper -->      
      <div class="top-slider">
        <!-- Start First slide -->
        <div class="top-slide-inner">
          <div class="slider-img">
            <img src="images/14.jpg" alt="">
          </div>
          <div class="slider-text">
            <h2> <strong></strong> we provide asylum at your doorsteps</h2>
            <p><strong>Cardiac Countermeasure</strong> One thing you need for your whole cardiac problem</p>
            
          </div>
        </div>
        <!-- End First slide -->

        <!-- Start 2nd slide -->
        <div class="top-slide-inner">
          <div class="slider-img">
              <img src="images/Medical-Touchscreen-Technology-1.jpg" alt="">
          </div>
            <div class="slider-text">
            <h2> <strong> Know Your Heart-attack chances in just one touch </strong></h2>
            
            
          </div>
          
        </div>
        <!-- End 2nd slide -->

        <!-- Start Third slide -->
        <div class="top-slide-inner">
          <div class="slider-img">
            <img src="images/7.jpg" alt="">
          </div>
          <div class="slider-text">
            <h2>A <strong></strong> Best and quick laboratory services for various cardiac tests</h2>
                        <div class="readmore_area">
             
            </div>
          </div>
        </div>
        <!-- End Third slide -->

        <!-- Start Fourth slide -->
        <div class="top-slide-inner">
          <div class="slider-img">
            <img src="images/12.jpg" alt="">
          </div>
          <div class="slider-text">
            <h2><strong>Best Cardiac assistance</strong> For your Cardiovascular problems</h2>
            <p><strong></strong> You can know which cardiac is available and quickly consult an cardiac in emergency</p>
            
          </div>
        </div>
        <!-- End Fourth slide -->

        <!-- Start Fifth slide -->
       
        <!-- End Fifth slide -->
      </div><!-- /top-slider -->
    </section>
    <!--=========== END SLIDER SECTION ================-->

    <!--=========== BEGIN Appointment SECTION ================-->
       <section>
      <div class="row">
          <div class="col-sm-6" style="border-style: solid;border: #CE522C;padding-top: 42px;border-right-style: inset;">
            <!--<div style="margin-left: 15px; margin-right: 15px; border-color: "></div>-->
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
        <!--/.main-page-form-->
      
        <div class="col-sm-6" style="padding-top: 100px;">
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
        </div><!--/.working-times--> 
    </div><!-- /.row -->
    </section>

    <!--=========== END Top Feature SECTION ================-->



    <!--=========== BEGAIN Counter SECTION ================-->
    <section id="counterSection">
      <div class="container">
        <div class="row">
          <div class="col-lg-12 col-md-12">
            <div class="counter-area">
              <div class="col-lg-3 col-md-3 col-sm-6">
                <div class="counter-box">
                  <div class="counter-no counter">
                    200
                  </div>
                  <div class="counter-label">Cardiac Doctors</div>
                </div>
              </div>
              <div class="col-lg-3 col-md-3 col-sm-6">
                 <div class="counter-box">
                  <div class="counter-no counter">
                    300
                  </div>
                  <div class="counter-label">Laboratories</div>
                </div>
              </div>
              <div class="col-lg-3 col-md-3 col-sm-6">
                 <div class="counter-box">
                  <div class="counter-no counter">
                    350
                  </div>
                  <div class="counter-label">Awards</div>
                </div>
              </div>
              <div class="col-lg-3 col-md-3 col-sm-6">
                 <div class="counter-box">
                  <div class="counter-no counter">
                    450
                  </div>
                  <div class="counter-label">Happy Patients</div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    <!--=========== End Counter SECTION ================-->

    <!--=========== BEGAIN Testimonial SECTION ================-->
    <section id="testimonial">
      <div class="container">
        <div class="row">
          <div class="col-lg-12 col-md-12">
            <div class="testimonial-area">
             <!-- Start Service Title -->
              <div class="section-heading">
                <h2>Health Tips</h2>
                <div class="line"></div>
              </div>
              <div class="testimonial-area">
                <ul class="testimonial-nav">
                  <li>
                    <div class="single-testimonial">
                      <div class="testimonial-img">
                        <img src="images/patients-3.jpg" alt="img">
                      </div>
                      <div class="testimonial-cotent">
                        <p class="testimonial-parg">If you are smoker, you are twice more likely to have a heart attack than a non-smoker. Avoid Smoking.</p>
                      </div>
                    </div>
                  </li> 
                  <li>
                    <div class="single-testimonial">
                      <div class="testimonial-img">
                        <img src="images/patients-1.jpg" alt="img">
                      </div>
                      <div class="testimonial-cotent">
                        <p class="testimonial-parg">Laughter anytime will work wonders for you. It is an instant way to unleash the pressure and it makes you feel light.</p>
                      </div>
                    </div>
                  </li> 
                  <li>
                    
                  </li>                 
                </ul>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    <!--=========== End Testimonial SECTION ================-->

    <!--=========== BEGAIN Home Blog SECTION ================-->
    
    <!--=========== End Home Blog SECTION ================-->

    <%@include file="footer.jsp" %>
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
    <!-- Photo Swipe Gallery Slider -->
    <script src='js/photoswipe.min.js'></script>
    <script src='js/photoswipe-ui-default.min.js'></script>    
    <script src="js/photoswipe-gallery.js"></script>

    <!-- Custom JS -->
    <script src="js/custom.js"></script>
     <script src="js/vendor/jquery-min.js"></script>
    <script src="js/vendor/modernizr.custom.68477.js"></script>
    <script src="js/vendor/bootstrap.min.js"></script>
    <script src="js/plugins.js"></script>
    <script src="js/vendor/jquery.bxslider.js"></script>
    <script src="js/main.js"></script>
    <script type="text/javascript" src="js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
	<script type="text/javascript">
	"use strict";
        $('.form_date').datetimepicker({
            language:  'fr',
            weekStart: 1,
            todayBtn:  1,
            autoclose: 1,
            todayHighlight: 1,
            startView: 2,
            minView: 2,
            forceParse: 0
        });
    
    </script>

  </body>
</html>
