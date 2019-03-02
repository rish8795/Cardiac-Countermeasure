<%-- 
    Document   : Doctor_myprofile
    Created on : 10 Mar, 2016, 4:38:34 PM
    Author     : Dell
--%>

<%@page import="model.Doctor"%>
<!DOCTYPE html>
<html lang="en">
  <head>
   
    <!-- Basic Page Needs
    ================================================== -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
     <title>Cardiac Countermeasure:My Profile</title>

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
   

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond
    /1.4.2/respond.min.js"></script>
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
    <%@include file="header_doctor.jsp" %>
    <!--=========== END HEADER SECTION ================-->
    
    <!--=========== START BLOG SECTION ================-->       
    <section id="blogArchive">      
      <div class="row">
        <div class="col-lg-12 col-md-12">
          <div class="blog-breadcrumbs-area">
            <div class="container">
              <div class="patient_profile">
                <h2>My Profile</h2>
              </div>
            </div>
          </div>
          

        </div>        
      </div>
      
                        <!-- Start sidebar widget -->
                         <div class="sidebar-widget">
                          <ul class="archives">
                            <li><a title="May 2015" href="doc_profile">Edit Profile</a></li>
                            <li><a title="April 2015" href="change_password_doc.jsp">Change Password</a></li>
                            
                          </ul>
                        </div>
                           <% if(request.getAttribute("pdata")!=null){
                             Doctor p =(Doctor)request.getAttribute("pdata"); %>
                        <div stylr="width:1463px; height:1000px">
                        <form method="post" class="submitphoto_form" action="doc_profile" style="margin-left: 420px;margin-top: 20px;margin-right: 60px;width: 890px; height: 1000px">
                            <span class="my_profile">First_Name:</span> <input type="text" class="my_profile_form" placeholder="" value=" <%=p.getDFirstname() %>" name="p_firstname" style="margin-left: -155px;"></br>
                            <span class="my_profile">Last_Name:</span> <input type="text" class="my_profile_form" placeholder="" value="  <%= p.getDLastname() %>" name="p_lastname" style="margin-left: -151px;"></br>
                            <span class="my_profile">Gender:</span> <input type="text" disabled class="my_profile_form" placeholder="" value=" <%= p.getGender() %>" name="gender" style="margin-left: -114px;"></br>
                            <span class="my_profile">Birth_Date:</span>  <input type="text" class="my_profile_form"  placeholder="" value="  <%= p.getBirthDate() %>" name="birth_date" style="margin-left: -148px;"></br>
                            <span class="my_profile">Email_Id:</span>  <input type="email" class="my_profile_form"  placeholder="" value=" <%= p.getEmailId()  %>" name="email_id" style="margin-left: -125px;"></br>
                            <span class="my_profile">Contact:</span>  <input type="text" class="my_profile_form" placeholder="" value="  <%=p.getContactnum() %>" name="contact_num" style="margin-left: -114px;"></br>
                            <span class="my_profile">Address_line1:</span> <input type="text" class="my_profile_form" placeholder=""value="  <%= p.getAddressid().getLine1() %>" name="line1" style="margin-left: -172px;"></br>
                            <span class="my_profile">Address_line2:</span> <input type="text" class="my_profile_form" placeholder="" value="  <%= p.getAddressid().getLine2() %>" name="line2" style="margin-left: -176px;"></br>
                            
                            <span class="my_profile">Pincode:</span> <input type="text" class="my_profile_form" placeholder="" value="  <%= p.getAddressid().getPincode() %>" name="pincode" style="margin-left: -112px;"></br>
                            <span class="my_profile">Status:</span> <input type="text" disabled class="my_profile_form" placeholder="" value="  <%= p.getStatus() %>" name="pincode" style="margin-left: -112px;"></br>
                            
                            
                            <button name="btn_update" value="UPDATE" class="wpcf7-submit button--itzel" type="submit"><i class="button__icon fa fa-envelope"></i><span>Update Profile</span></button>
                        </form>
                        </div>
                       <% } %>
                      
                          
                        
                                                           <!-- Start Social Share-->
                              <div class="social-share">
                               <h3></h3>
                               <ul>
                                 <li><a href="#"><span class="fa fa-facebook"></span></a></li>
                                 <li><a href="#"><span class="fa fa-twitter"></span></a></li>
                                 <li><a href="#"><span class="fa fa-pinterest"></span></a></li>
                                 <li><a href="#"><span class="fa fa-google-plus"></span></a></li>
                                 <li><a href="#"><span class="fa fa-linkedin"></span></a></li>
                               </ul>
                             </div>                                                          
                            </div>
                          </div>                          
                        </div>                     
                      </div>
                    </div>                    
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    <!--=========== END BLOG SECTION ================-->

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