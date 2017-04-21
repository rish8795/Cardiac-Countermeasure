<%-- 
    Document   : Blogs
    Created on : Feb 5, 2016, 11:54:38 AM
    Author     : zaru
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
   
    <!-- Basic Page Needs
    ================================================== -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
     <title>CADIAC COUNTERMEASURE : Blogs</title>

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
    <header id="header">
      <!-- BEGIN MENU -->
      <div class="menu_area">
        <nav class="navbar navbar-default navbar-fixed-top" role="navigation">  
          <div class="container">
            <div class="navbar-header">
              <!-- FOR MOBILE VIEW COLLAPSED BUTTON -->
              <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
              <!-- LOGO -->              
              <!-- TEXT BASED LOGO -->
              <a class="navbar-brand" href="home.jsp"><i class="fa fa-heartbeat"></i><span style="font-family: cursive;">CARDIAC COUNTERMEASURE</span></a>              
              <!-- IMG BASED LOGO  -->
              <!--  <a class="navbar-brand" href="index.html"><img src="images/logo.png" alt="logo"></a>   -->                    
            </div>
            <div id="navbar" class="navbar-collapse collapse">
              <ul id="top-menu" class="nav navbar-nav navbar-right main-nav">
                <li><a href="home.jsp">Home</a></li>
                <li><a href="about_us.jsp">About Us</a></li>
                
                <li><a href="ContactUs.jsp">ContactUs</a></li>
                <li> <a href="forums.jsp">FORUMS </a> </li>
                <li><a href="blog-archive-with-left-sidebar.html">FAQ</a> </li>
                <li class="active"> <a href="Blogs.jsp">BLOGS</a></li>
                <li><a href="login.jsp">LOGIN</a></li>               
                <li><a href="Whoru.jsp">SIGNUP</a></li>
            
              </ul>           
            </div><!--/.nav-collapse -->
          </div>     
        </nav>  
      </div>
      <!-- END MENU -->    
    </header>
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
                        <!-- Start sidebar widget -->
                        <div class="sidebar-widget">
                          <h3>Latest Posts</h3>
                          <ul class="popular-tab">
                            <li>
                              <div class="media">
                                <div class="media-left">
                                  <a href="#" class="news-img">
                                    <img alt="img" src="images/small-blog-img1.jpg" class="media-object">
                                  </a>
                                </div>
                                <div class="media-body">
                                 <a href="blog-single.html">Dummy text of the Medical Post</a>
                                 <span class="feed-date">27.02.15</span>
                                </div>
                              </div>
                            </li>
                            <li>
                              <div class="media">
                                <div class="media-left">
                                  <a href="#" class="news-img">
                                    <img alt="img" src="images/small-blog-img2.jpg" class="media-object">
                                  </a>
                                </div>
                                <div class="media-body">
                                 <a href="blog-single.html">Dummy text of the Medical Post</a>
                                 <span class="feed-date">28.02.15</span>
                                </div>
                              </div>
                            </li>
                            <li>
                              <div class="media">
                                <div class="media-left">
                                  <a href="#" class="news-img">
                                    <img alt="img" src="images/small-blog-img1.jpg" class="media-object">
                                  </a>
                                </div>
                                <div class="media-body">
                                 <a href="#">Dummy text of the Medical Post</a>
                                 <span class="feed-date">28.02.15</span>
                                </div>
                              </div>
                            </li>                  
                          </ul>
                        </div>
                        <!-- Start sidebar widget -->
                        <div class="sidebar-widget">
                          <h3>Most Viewed</h3>
                          <ul class="popular-tab">
                            <li>
                              <div class="media">
                                <div class="media-left">
                                  <a href="#" class="news-img">
                                    <img alt="img" src="images/small-blog-img1.jpg" class="media-object">
                                  </a>
                                </div>
                                <div class="media-body">
                                 <a href="blog-single.html">Dummy text of the Medical Post</a>
                                 <span class="feed-date">27.02.15</span>
                                </div>
                              </div>
                            </li>
                            <li>
                              <div class="media">
                                <div class="media-left">
                                  <a href="#" class="news-img">
                                    <img alt="img" src="images/small-blog-img2.jpg" class="media-object">
                                  </a>
                                </div>
                                <div class="media-body">
                                 <a href="blog-single.html">Dummy text of the Medical Post</a>
                                 <span class="feed-date">28.02.15</span>
                                </div>
                              </div>
                            </li>
                            <li>
                              <div class="media">
                                <div class="media-left">
                                  <a href="#" class="news-img">
                                    <img alt="img" src="images/small-blog-img1.jpg" class="media-object">
                                  </a>
                                </div>
                                <div class="media-body">
                                 <a href="#">Dummy text of the Medical Post</a>
                                 <span class="feed-date">28.02.15</span>
                                </div>
                              </div>
                            </li>                  
                          </ul>
                        </div>
                        <!-- Start sidebar widget -->
                        <div class="sidebar-widget">
                          <h3>Tags</h3>
                          <ul class="tag-nav">
                            <li><a href="#">Dental</a></li>
                            <li><a href="#">Surgery</a></li>
                            <li><a href="#">Pediatric</a></li>
                            <li><a href="#">Cardiac</a></li>
                            <li><a href="#">Ophthalmology</a></li>
                            <li><a href="#">Diabetes</a></li>
                          </ul>
                        </div>
                        <!-- Start sidebar widget -->
                        <div class="sidebar-widget">
                          <h3>Text Widget</h3>
                          <p>This is text widget of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly <a href="#">believable</a></p>
                        </div>
                        <!-- Start sidebar widget -->
                        <div class="sidebar-widget">
                          <h3>Archives</h3>
                          <ul class="archives">
                            <li><a title="May 2015" href="#">May 2015<span>2</span></a></li>
                            <li><a title="April 2015" href="#">April 2015<span>5</span></a></li>
                            <li><a title="March 2015" href="#">March 2015<span>10</span></a></li>
                          </ul>
                        </div>
                        <!-- Start sidebar widget -->
                        <div class="sidebar-widget">
                          <h3>Categories</h3>
                          <ul>
                            <li><a href="#"><span class="fa fa-angle-right"></span>Dental</a></li>
                            <li><a href="#"><span class="fa fa-angle-right"></span>Surgery</a></li>
                            <li><a href="#"><span class="fa fa-angle-right"></span>Pediatric</a></li>
                            <li><a href="#"><span class="fa fa-angle-right"></span>Cardiac</a></li>
                            <li><a href="#"><span class="fa fa-angle-right"></span>Ophthalmology</a></li>
                            <li><a href="#"><span class="fa fa-angle-right"></span>Diabetes</a></li>
                          </ul>
                        </div>
                      </aside>
                    </div>
                    <!-- Start Blog Content -->
                    <div class="col-md-9 col-sm-8">                     
                      <div class="blog-content">
                        <!-- Start Single Blog -->
                        <div class="single-Blog">
                          <div class="single-blog-left">
                            <ul class="blog-comments-box">
                              <li>May <h2>10</h2>2015</li>
                              <li><span class="fa fa-eye"></span>1523</li>
                              <li><a href="#"><span class="fa fa-comments"></span>5</a></li>
                            </ul>
                          </div>
                          <div class="single-blog-right">
                            <div class="blog-img">
                              <figure class="blog-figure">
                               <a href="#"><img alt="img" src="images/9.jpg"></a>
                                <span class="image-effect"></span>
                              </figure>
                            </div>
                            <div class="blog-author">
                              <ul>
                                <li>By <a href="#">Dr. Smith</a></li>
                                <li>In <a href="#">Dental</a></li>
                              </ul>
                            </div>
                            <div class="blog-content">
                              <h2>Latest Trend Of Medical Dental Department</h2>
                              <p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable.</p>
                              <!-- Read more btn -->
                              <a class="wpcf7-submit button--itzel" href="#">
                                <i class="button__icon fa fa-link"></i>
                                <span>Read More</span>
                              </a>   
                            </div>
                          </div>
                        </div>
                        <!-- Start Single Blog -->
                        <div class="single-Blog">
                          <div class="single-blog-left">
                            <ul class="blog-comments-box">
                              <li>May <h2>10</h2>2015</li>
                              <li><span class="fa fa-eye"></span>1523</li>
                              <li><a href="#"><span class="fa fa-comments"></span>5</a></li>
                            </ul>
                          </div>
                          <div class="single-blog-right">
                            <div class="blog-img">
                              <figure class="blog-figure">
                               <a href="#"><img alt="img" src="images/9.jpg"></a>
                                <span class="image-effect"></span>
                              </figure>
                            </div>
                            <div class="blog-author">
                              <ul>
                                <li>By <a href="#">Dr. Smith</a></li>
                                <li>In <a href="#">Dental</a></li>
                              </ul>
                            </div>
                            <div class="blog-content">
                              <h2>Latest Trend Of Medical Dental Department</h2>
                              <p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable.</p>
                              <!-- Read more btn -->
                              <a class="wpcf7-submit button--itzel" href="#">
                                <i class="button__icon fa fa-link"></i>
                                <span>Read More</span>
                              </a>   
                            </div>
                          </div>
                        </div>
                        <!-- Start Single Blog -->
                        <div class="single-Blog">
                          <div class="single-blog-left">
                            <ul class="blog-comments-box">
                              <li>May <h2>10</h2>2015</li>
                              <li><span class="fa fa-eye"></span>1523</li>
                              <li><a href="#"><span class="fa fa-comments"></span>5</a></li>
                            </ul>
                          </div>
                          <div class="single-blog-right">
                            <div class="blog-img">
                              <figure class="blog-figure">
                               <a href="#"><img alt="img" src="images/9.jpg"></a>
                                <span class="image-effect"></span>
                              </figure>
                            </div>
                            <div class="blog-author">
                              <ul>
                                <li>By <a href="#">Dr. Smith</a></li>
                                <li>In <a href="#">Dental</a></li>
                              </ul>
                            </div>
                            <div class="blog-content">
                              <h2>Latest Trend Of Medical Dental Department</h2>
                              <p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable.</p>
                              <!-- Read more btn -->
                              <a class="wpcf7-submit button--itzel" href="#">
                                <i class="button__icon fa fa-link"></i>
                                <span>Read More</span>
                              </a>   
                            </div>
                          </div>
                        </div>
                        <!-- Start Single Blog -->
                        <div class="single-Blog">
                          <div class="single-blog-left">
                            <ul class="blog-comments-box">
                              <li>May <h2>10</h2>2015</li>
                              <li><span class="fa fa-eye"></span>1523</li>
                              <li><a href="#"><span class="fa fa-comments"></span>5</a></li>
                            </ul>
                          </div>
                          <div class="single-blog-right">
                            <div class="blog-img">
                              <figure class="blog-figure">
                               <a href="#"><img alt="img" src="images/9.jpg"></a>
                                <span class="image-effect"></span>
                              </figure>
                            </div>
                            <div class="blog-author">
                              <ul>
                                <li>By <a href="#">Dr. Smith</a></li>
                                <li>In <a href="#">Dental</a></li>
                              </ul>
                            </div>
                            <div class="blog-content">
                              <h2>Latest Trend Of Medical Dental Department</h2>
                              <p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable.</p>
                              <!-- Read more btn -->
                              <a class="wpcf7-submit button--itzel" href="#">
                                <i class="button__icon fa fa-link"></i>
                                <span>Read More</span>
                              </a>   
                            </div>
                          </div>
                        </div>

                        <!-- Start blog pagination  -->
                        <div class="blog-pagination">
                          <nav>
                            <ul class="pagination">
                              <li>
                                <a href="#" aria-label="Previous">
                                  <span class="fa fa-angle-left"></span>
                                </a>
                              </li>
                              <li><a href="#">1</a></li>
                              <li><a href="#">2</a></li>
                              <li><a href="#">3</a></li>
                              <li><a href="#">4</a></li>
                              <li><a href="#">5</a></li>
                              <li>
                                <a href="#" aria-label="Next">
                                  <span class="fa fa-angle-right"></span>
                                </a>
                              </li>
                            </ul>
                          </nav>
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
    <!--=========== START BLOG SECTION ================-->
    
 <!--=========== Start Footer SECTION ================-->
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
    <script src="http://cdnjs.cloudflare.com/ajax/libs/waypoints/2.0.3/waypoints.min.js"></script>
    <script src="js/jquery.counterup.min.js"></script>
    <!-- Doctors hover effect -->
    <script src="js/snap.svg-min.js"></script>
    <script src="js/hovers.js"></script>
    
    <!-- Custom JS -->
    <script src="js/custom.js"></script>
     
  </body>
</html>