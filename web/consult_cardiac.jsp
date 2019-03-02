<%-- 
    Document   : consult_cardiac
    Created on : 18 Apr, 2016, 2:08:50 PM
    Author     : Dell
--%>

<!DOCTYPE html>
<html lang="en">
    <head>

        <!-- Basic Page Needs
        ================================================== -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Cardiac Countermeasure:Consult Cardiac</title>

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


        <style>        </style>

        <script type="text/javascript">
            function getsearchdoctor(sid)

            {
//                alert(sid);
//                var sid = document.getElementById("sort").value;
                var url = "getdoctor?search=" + sid;
                var xmlReq = new XMLHttpRequest();
                xmlReq.open("get", url, true);
                xmlReq.send();
                xmlReq.onreadystatechange = function()
                {
                    if (xmlReq.status == 200)
                    {
                        document.getElementById("doclist").innerHTML = xmlReq.responseText;
                    }

                }

                //alert(sid);
            }
            function getsortdoctor(sid)
            {

//                var sid = document.getElementById("sort").value;
                var url = "getdoctor?sort=" + sid;
                var xmlReq = new XMLHttpRequest();
                xmlReq.open("get", url, true);
                xmlReq.send();
                xmlReq.onreadystatechange = function()
                {
                    if (xmlReq.status == 200)
                    {
                        document.getElementById("doclist").innerHTML = xmlReq.responseText;
                    }

                }

                //alert(sid);
            }
        </script>




        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond
        /1.4.2/respond.min.js"></script>
        <![endif]--> 
    </head>
    <body onload="getsortdoctor(1);">    
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
                            <div class="patient_profile">
                                <h2>Consult Cardiac</h2>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-12 col-md-12">
                    
                    <!--<div class="blog-breadcrumbs-area">-->

                    <div class="col-lg-12 col-md-8">
                        <div class="container">
                            <div style="margin-top: 1px;width: 100%">
                                <img src="images/images/search1.png" style="padding: 8px;" />
                                <!--<label for="author"></label>-->
                                <input type="text" size="30" onkeyup="getsearchdoctor(this.value);" style="width: 20%;" class="wp-form-control wpcf7-text" value="" name="author" >
                            </div> 
                            <div style="margin-top: 1px; width: 100%; margin-top: -43px;margin-left: 730px;
                                 ">
                                <img src="images/images/filter2.jpg" style="padding: 8px;">  
                                <select id="sort" onchange="getsortdoctor(this.value);" name="c_filter" style="width: 20%; margin-left: 225px;" class="wp-form-control wpcf7-text">
                                    <option value="1">A to Z</option>
                                    <option value="2">Z to A</option>
                                </select>

                            </div>
                        </div>
                    </div>
                    <p style="color: green;text-align: center;"><% if (request.getAttribute("msg") != null) {%>
                        <%=request.getAttribute("msg")%>
                        <%}%></p>
                </div>
                <div class="col-lg-12 col-md-12">
                    <div class="container">

                        <ul id="doclist" style="margin-left: 267px;width: 60%;">


                        </ul>

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