<%-- 
    Document   : doctor_write
    Created on : 28 Mar, 2016, 4:45:11 PM
    Author     : Dell
--%>

<%@page import="model.Blog"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="en">
    <head>

        <!-- Basic Page Needs
        ================================================== -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Cardiac Countermeasure</title>

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
        <!-- Photo Swipe Image Gallery -->     
        <link rel='stylesheet prefetch' href='css/photoswipe.css'>
        <link rel='stylesheet prefetch' href='css/default-skin.css'>    

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
        <%@include file="header_doctor.jsp" %>
        <!--=========== END HEADER SECTION ================-->  

        <!--=========== START BLOG SECTION ================-->       
        <section id="blogArchive">      
            <div class="row">
                <div class="col-lg-12 col-md-12">
                    <div class="blog-breadcrumbs-area">
                        <div class="container">
                            <div class="blog-breadcrumbs-left">
                                <h2>Blog</h2>
                            </div>
                            <div class="blog-breadcrumbs-right">
                                <ol class="breadcrumb">
                                    <li>You are here</li>
                                    <li><a href="#">Home</a></li>                  
                                    <li class="active">Blog</li>
                                </ol>
                            </div>
                        </div>
                    </div>
                </div>        
            </div>
            <div class="row">
                <div class="col-lg-12 col-md-12">
                    <div class="container">
                        <div class="row">
                            <div class="col-md-12 col-sm-12">
                                <!-- Start Blog Archive Area -->
                                <div class="blogArchive-area">
                                    <div class="row">
                                        <!-- Start left Side bar -->
                                        <div class="col-md-3 col-sm-4">
                                            <aside class="sidebar">
                                               
                                                </aside>
                                        </div>
                                        <!-- Start Blog Content -->

                                        <div class="col-md-9 col-sm-8">
                                            <div id="respond">
                                                <h2 style="margin-left: 235px;">Compose a New Blog</h2>
                                                <div class="line"></div>

                                                <form  action="writeblog" method="post" id="commentform">
                                                    <%
                                                        String cont = "";
                                                        String sub = "";

                                                        if (request.getAttribute("editblog") != null) {
                                                            Blog b1 = (Blog) request.getAttribute("editblog");
                                                            sub = b1.getBlogname();
                                                            cont = b1.getBlogdescription();
                                                    %>
                                                    <input type="hidden" name="updateblogid" value="<%=b1.getBlogId()%>" />
                                                    <%
                                                        }%>
                                                    <p class="comment-form-comment">
                                                        Subject:    <textarea required="required" aria-required="true" rows="1" cols="45" name="subject" style="background-color: rgb(245, 245, 245);border-color: #CE522C;border-width: 3px;"><%=sub%></textarea>  
                                                        Content:     <textarea required="required" aria-required="true" rows="8" cols="45" name="content" style="background-color: rgb(245, 245, 245);border-color: #CE522C;border-width: 3px;"><%=cont%></textarea>
                                                    </p>
                                                    <p class="form-submit">
                                                        <input type="submit" value="Post Blog" class="submit" name="submit">
                                                    </p>
                                                    <p style="color: green">
                                                        <% if(request.getAttribute("msg")!=null){ %><%=request.getAttribute("msg")%> <% } %>
                                                    </p>
                                                </form>
                                            </div>
                                            <% if (request.getAttribute("dblog") != null) {
                                                    ArrayList<Blog> dblog = (ArrayList<Blog>) request.getAttribute("dblog");
                                                    for (Blog bb : dblog) {
                                            %>
                                            <div class="blog-content">
                                                <!-- Start Single Blog -->
                                                <span style="margin-left: 631px;">
                                                    <a href="writeblog?blogid=<%=bb.getBlogId()%>" class="author-morepost" title="EDIT BLOG" style="font-size: medium;font-weight: 600;">
                                                        <img src="images/gallery/../write_blog.gif"> </a>
                                                </span>
                                                <div class="single-Blog">
                                                    <div class="single-blog-left">
                                                        <ul class="blog-comments-box">
                                                            <li style="border-bottom-color: #CE522C;border-bottom-width: 1px;border-right-color: #CE522C;border-right-width: 1px;"><%=bb.getBlogDate()%></li>
                                                            <li style="border-bottom-color: #CE522C;border-bottom-width: 1px;border-right-color: #CE522C;border-right-width: 1px;"><span class="fa fa-eye"></span><%=bb.getBlogView()%></li>
                                                            <!--<li style="border-bottom-color: #CE522C;border-bottom-width: 1px;border-right-color: #CE522C;border-right-width: 1px;"><a href="#"><span class="fa fa-comments"></span>5</a></li>-->
                                                        </ul>
                                                    </div>
                                                    <div class="single-blog-right">
                                                        <div class="blog-img">
                                                            <figure class="blog-figure">
                                                                <a href="#"><img alt="img" src="images/heart-healthy-people.jpg"></a>
                                                                <span class="image-effect"></span>
                                                            </figure>
                                                        </div>
                                                        <div class="blog-author">
                                                            <ul>
                                                                <li>By <a href="#">Dr.<%=bb.getDId().getDFirstname() + " " + bb.getDId().getDLastname()%></a></li>
                                                                <!--<li>In <a href="#">Dental</a></li>-->
                                                                <!--<li><span class="fa fa-tags"></span><a href="#">Dental</a> <a href="#">Surgery</a> <a href="#">Cardiac</a></li>-->
                                                            </ul>
                                                        </div>
                                                        <div class="blog-content blog-details">
                                                            <h2><%=bb.getBlogname()%></h2>
                                                            <p><%=bb.getBlogdescription()%></p>
                                                            <!--<a href="#">Link Text</a>-->


                                                            <!-- Start Social Share-->
                                                            <div class="social-share" style="border-bottom-color: #CE522C;border-top-color: #CE522C;">
                                                                <h3>Share</h3>
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

                                            <% }
                                            } else {  %>

                                            No Blog Available.!

                                            <% }%>
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