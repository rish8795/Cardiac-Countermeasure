<%-- 
    Document   : patient_add_pastcardiac_history
    Created on : 30 Apr, 2016, 11:36:25 AM
    Author     : Dell
--%>

<%@page import="model.Patient"%>
<!DOCTYPE html>
<html lang="en">
  <head>
   
    <!-- Basic Page Needs
    ================================================== -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
     <title>Cardiac Countermeasure:Past Cardiac history</title>

    <!-- Mobile Specific Metas
    ================================================== -->
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Favicon -->
    <link rel="shortcut icon" type="image/icon" href="images/favicon.ico"/>

    <!-- CSS
    ================================================== -->       
    <!-- Bootstrap css file-->
    <link href="css/bootstrap.min.jui.css" rel="stylesheet">
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
      <script src="https://oss.maxcdn.com/respond
    /1.4.2/respond.min.js"></script>
    <![endif]--> 
     <style>
        .my_profile{
            font-size: 22px;
            float: left;
            margin-left: 15px; 
            margin-right: 222px;
            margin-bottom: 34px;
        }
        .my_profile_form{
            border-radius: 35px;
            display: inline;
            font-size: 15px;
            float: left;
            margin-bottom: 20px;
            margin-right: 118px;
            padding: 10px 0px;
           -webkit-transition: all 0.4s ease 0s;
           -o-transition: all 0.4s ease 0s;
           -ms-transition: all 0.4s ease 0s;
            transition: all 0.4s ease 0s;
            width: 45%;
            border: 2px solid #BF4C31
        }
    </style>
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
    
    <!--=========== START BLOG SECTION ================-->       
    <section id="blogArchive">      
      <div class="row">
        <div class="col-lg-12 col-md-12">
          <div class="blog-breadcrumbs-area">
            <div class="container">
              <div class="blog-breadcrumbs-left">
                <h2>My past cardiac history</h2>
              </div>
              <div class="blog-breadcrumbs-right">
                <ol class="breadcrumb">
                  <li>You are here</li>
                  <li><a href="patienthomepage.jsp">Home</a></li>                  
                  <li><a href="patient_heart_attack_services.jsp">Services</a></li>
                  <li class="active">Add Past Cardiac History</li>
                </ol>
              </div>
            </div>
          </div>
        </div>        
      </div>
      
                        <!-- Start sidebar widget -->
                        
                         <% if(request.getAttribute("pdata")!=null){
                             Patient p =(Patient)request.getAttribute("pdata"); %>
                        <h3 style="font-size: large; color:#CE522C; font-weight: bold; margin-left: 568px; ">Past Cardiac History</h3>
                    <div class="line"></div>
                    <form method="post" class="submitphoto_form" action="pastcardiac_history" style="margin-left: 420px;margin-top: 20px;margin-right: 60px;width: 890px; height: 1000px">
                    <h5 style="font-size: large;font-weight: bold;color: #CE522C;">  Have you ever gone through cardiac arrest before?</h5> <select name="attack"class="wp-form-control wpcf7-text" placeholder="Gender" style="border-radius: 35px; width: 28%; margin-left: 100px;">
                     <option value="null" >Select one</option>
                    <option value="Yes">Yes</option>
                    <option value="No">No</option>
               </select></br>
               <h5 style="font-size: large;font-weight: bold;color: #CE522C;margin-top: 50px;">What medication you are taking? </h5>
               <textarea name="medic" class="wp-form-control wpcf7-textarea" cols="30" rows="10" style="border-radius: 35px; width: 40%; margin-left: 50px;"></textarea></br>
               
               
                     <button name="btn_update" value="UPDATE" class="wpcf7-submit button--itzel" type="submit" style="margin-left: 230px;"><i class="button__icon fa fa-history"></i><span>Add Past Cardiac History</span></button>                
               </form>
                              <!-- Start Social Share-->
                                                                                     
                           
    </section>
    <!--=========== END BLOG SECTION ================-->

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
    
    <!-- Custom JS -->
    <script src="js/custom.js"></script>
     
  </body>
</html>