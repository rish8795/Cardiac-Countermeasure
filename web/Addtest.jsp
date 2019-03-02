<%-- 
    Document   : Addtest
    Created on : 14 Mar, 2016, 3:27:49 PM
    Author     : Dell
--%>

<!DOCTYPE html>
<html lang="en">
    <head>

        <!-- Basic Page Needs
        ================================================== -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Cardiac Countermeasure:Laboratory Appointment</title>

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
            .btn_add_test{
                margin-left: 38px;
                margin-top: 2px;
                border-radius: 18px;
                border-color: #020202;
                background-color: rgba(206, 82, 44, 0.93);
            }
            .test_name{margin-top: 7px;
                       border-bottom-style: dotted;
                       border-bottom-color: #CE522C;
                       border-bottom-width: 2px;
                }
                .price{
                    margin-top: 7px;
                    margin-left: 44px;
                    border-bottom-style: dotted;
                    border-bottom-color: #CE522C;
                    border-bottom-width: 2px;
                 }
                 .remove_test{
                     margin-left: 2px;
                     margin-top: 2px;
                     border-radius: 6px;
                     border-color: #020202;
                     background-color: rgba(206, 82, 44, 0.93);
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
        <%@include file="header_lab.jsp" %>
        <!--=========== END HEADER SECTION ================-->

        <!--=========== START BLOG SECTION ================-->       
        <section id="blogArchive">      
            <div class="row">
                <div class="col-lg-12 col-md-12">
                    <div class="blog-breadcrumbs-area">
                        <div class="container">
                            <div class="patient_profile">
                                <h2>Tests</h2>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-12 col-md-12">
                    <!--<div class="blog-breadcrumbs-area">-->
                        <div class="container">
                            <div class="col-md-6" style="border-width: thick;
    border: solid;
    border-color: #CE522C;
    border-radius: -4px;
    border-radius: 25px;">
                                
                                <div class="col-md-9" style="border: solid;
    border-color: #CE522C;
    border-left: 1px;
    border-top: 1px;
    border-right: 1px;
    border-bottom-width: 3px;
    font-size: large;
    font-stretch: expanded;
    font-weight: bold;">Lists of All Tests</div>
                                <div class="col-md-1" style="border: solid;
    border-color: #CE522C;
    border-left: 1px;
    border-top: 1px;
    border-right: 1px;
    border-bottom-width: 3px;
    font-size: large;
    font-stretch: expanded;
    font-weight: bold;margin-left: 35px;" >Add</div>
                                <div class="col-md-9" style="margin-top: 7px;
    border-bottom-style: dotted;
    border-bottom-color: #CE522C;
    border-bottom-width: 2px;">Test Name</div>
                                <div class="col-md-1"><button class="btn_add_test">+</button></div>
                                <div class="col-md-9 test_name">Test Name</div>
                                <div class="col-md-1"><button class="btn_add_test" >+</button></div>
                                <div class="col-md-9 test_name">Test Name</div>
                                <div class="col-md-1"><button class="btn_add_test" >+</button></div>
                                <div class="col-md-9 test_name">Test Name</div>
                                <div class="col-md-1"><button class="btn_add_test" >+</button></div>
                                <div class="col-md-9 test_name">Test Name</div>
                                <div class="col-md-1"><button class="btn_add_test" >+</button></div>
                                <div class="col-md-9 test_name">Test Name</div>
                                <div class="col-md-1"><button class="btn_add_test" >+</button></div>
                                <div class="col-md-9 test_name">Test Name</div>
                                <div class="col-md-1"><button class="btn_add_test" >+</button></div>
                                <div class="col-md-9 test_name">Test Name</div>
                                <div class="col-md-1"><button class="btn_add_test" >+</button></div>
                                <div class="col-md-9 test_name">Test Name</div>
                                <div class="col-md-1"><button class="btn_add_test" >+</button></div>
                                <div class="col-md-9 test_name">Test Name</div>
                                <div class="col-md-1"><button class="btn_add_test" >+</button></div>

                            </div>
                            <div class="col-md-6" style="border-width: thick;
    border: solid;
    border-color: #CE522C;
    border-radius: -4px;
    border-radius: 25px;">
                                <div class="col-md-8" style="border: solid;
    border-color: #CE522C;
    border-left: 1px;
    border-top: 1px;
    border-right: 1px;
    border-bottom-width: 3px;
    font-size: large;
    font-stretch: expanded;
    font-weight: bold;">Laboratory Test Name</div>
                                <div class="col-md-1" style="border: solid;
    border-color: #CE522C;
    border-left: 1px;
    border-top: 1px;
    border-right: 1px;
    border-bottom-width: 3px;
    font-size: large;
    font-stretch: expanded;
    font-weight: bold;">Remove</div>
                                <div class="col-md-2" style="border: solid;
    border-color: #CE522C;
    border-left: 1px;
    border-top: 1px;
    border-right: 1px;
    border-bottom-width: 3px;
    font-size: large;
    font-stretch: expanded;
    font-weight: bold; margin-left: 44px;">Price</div>
                                <div class="col-md-8 test_name">Test Name</div>
                                <div class="col-md-1"><button class="remove_test">-</button></div>
                                <div class="col-md-2 price">1000</div>
                                <div class="col-md-8 test_name">Test Name</div>
                                <div class="col-md-1"><button class="remove_test">-</button></div>
                                <div class="col-md-2 price">1000</div>
                                <div class="col-md-8 test_name">Test Name</div>
                                <div class="col-md-1"><button class="remove_test">-</button></div>
                                <div class="col-md-2 price">1000</div>
                                <div class="col-md-8 test_name">Test Name</div>
                                <div class="col-md-1"><button class="remove_test">-</button></div>
                                <div class="col-md-2 price">1000</div>
                                <div class="col-md-8 test_name">Test Name</div>
                                <div class="col-md-1"><button class="remove_test">-</button></div>
                                <div class="col-md-2 price">1000</div>
                                <div class="col-md-8 test_name">Test Name</div>
                                <div class="col-md-1"><button class="remove_test">-</button></div>
                                <div class="col-md-2 price">1000</div>
                                <div class="col-md-8 test_name">Test Name</div>
                                <div class="col-md-1"><button class="remove_test">-</button></div>
                                <div class="col-md-2 price">1000</div>
                                <div class="col-md-8 test_name">Test Name</div>
                                <div class="col-md-1"><button class="remove_test">-</button></div>
                                <div class="col-md-2 price">1000</div>
                                <div class="col-md-8 test_name">Test Name</div>
                                <div class="col-md-1"><button class="remove_test">-</button></div>
                                <div class="col-md-2 price">1000</div>
                                <div class="col-md-8 test_name">Test Name</div>
                                <div class="col-md-1"><button class="remove_test">-</button></div>
                                <div class="col-md-2 price">1000</div>
                                
                               
                            </div>
                        </div>
                    <!--</div>-->
                </div>
            </div>
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