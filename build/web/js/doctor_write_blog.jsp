<%-- 
    Document   : doctor_write
    Created on : 28 Mar, 2016, 4:45:11 PM
    Author     : Dell
--%>

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
              <a class="navbar-brand" href="Labhomepage.jsp"><i class="fa fa-heartbeat"></i><span style="font-family: cursive">CARDIAC COUNTERMEASURE</span></a>              
              <!-- IMG BASED LOGO  -->
              <!--  <a class="navbar-brand" href="index.html"><img src="images/logo.png" alt="logo"></a>   -->                    
            </div>
            <div id="navbar" class="navbar-collapse collapse">
              <ul id="top-menu" class="nav navbar-nav navbar-right main-nav">
                  <li class="active"><a href="Labhomepage.jsp">Home</a></li>
                
                <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Services <span class="fa fa-angle-down"></span></a>
                  <ul class="dropdown-menu" role="menu">
                    <li><a href="patient_heart_attack_services.jsp">Heart-attack detection</a></li>
                    <li><a href="medical-research.html">Consult Cariac</a></li>
                    <li><a href="blood-bank.html">Laboratory test</a></li>
                 </ul>
                </li>
                <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown">Blogs <span class="fa fa-angle-down"></span></a>
                  <ul class="dropdown-menu" role="menu">
                    <li><a href="blog-archive.html">View Blogs</a></li>
                    <li><a href="blog-archive-with-left-sidebar.html">Write Blog</a></li>
                    <li><a href="blog-archive-with-right-sidebar.html">Blog Archive with Right Sidebar</a></li>
                    <li><a href="blog-single.html">Blog Single</a></li>
                    <li><a href="blog-single-with-left-sidebar.html">Blog Single with Left Sidebar</a></li>
                    <li><a href="blog-single-with-right-sidebar.html">Blog Single with Right Sidebar</a></li>           
                  </ul>
                </li>
                 
                <li><a href="features.html">FAQs</a></li>
                <li><a href="contact.html">Contact Us</a></li>
                <li><a href="features.html">My Profile</a></li>
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
                          <div class="comments-area">
                                <h3 class="comments-title">Patient's Questions</h3>
                                <div class="comments">
                                  <ul class="commentlist">
                                    <li>
                                      <div class="media">
                                        <div class="media-left">    
                                            <img alt="img" src="images/doctor-2.jpg" class="media-object news-img">      
                                        </div>
                                        <div class="media-body">
                                         <h4 class="author-name">Dr. Jack Johnson</h4>
                                         <span class="comments-date"> May 16, 2015 / 10:29 am</span>
                                         <p>Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English</p>
                                         <a class="reply-btn" href="#">Comment</a>
                                        </div>
                                      </div>
                                    </li>
                                    <li>
                                      <div class="media">
                                        <div class="media-left">    
                                            <img alt="img" src="images/doctor-2.jpg" class="media-object news-img">      
                                        </div>
                                        <div class="media-body">
                                         <h4 class="author-name">Dr. Jack Johnson</h4>
                                         <span class="comments-date"> May 16, 2015 / 10:29 am</span>
                                         <p>Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English</p>
                                         <a class="reply-btn" href="#">Comment</a>
                                        </div>
                                      </div>
                                    </li>
                                  </ul>
                        </div>
                          </div>
                        <!-- Start sidebar widget -->
                        <div class="sidebar-widget">
                          <nav>
                                <ul class="comments-pagination">
                                  <li>
                                    <a aria-label="Previous" href="#">
                                      <span class="fa fa-angle-left"></span>
                                    </a>
                                  </li>
                                  <li><a href="#">1</a></li>
                                  <li><a href="#">2</a></li>
                                  <li><a href="#">3</a></li>
                                  <li>
                                    <a aria-label="Next" href="#">
                                      <span class="fa fa-angle-right"></span>
                                    </a>
                                  </li>
                                </ul>
                              </nav>
                        </div>
                      </aside>
                    </div>
                    <!-- Start Blog Content -->
                    
                    <div class="col-md-9 col-sm-8">
                        
                      <div class="blog-content">
                        <!-- Start Single Blog -->
                        <span style="margin-left: 631px;">
                        <img src="images/gallery/../write_blog.gif">
                        <a href="doctor_blog1.jsp" class="author-morepost" style="font-size: medium;font-weight: 600;">Create Blog</a>
                        </span>
                        <div class="single-Blog">
                          <div class="single-blog-left">
                            <ul class="blog-comments-box">
                               <li style="border-bottom-color: #CE522C;border-bottom-width: 1px;border-right-color: #CE522C;border-right-width: 1px;">May <h2>10</h2>2015</li>
                               <li style="border-bottom-color: #CE522C;border-bottom-width: 1px;border-right-color: #CE522C;border-right-width: 1px;"><span class="fa fa-eye"></span>1523</li>
                               <li style="border-bottom-color: #CE522C;border-bottom-width: 1px;border-right-color: #CE522C;border-right-width: 1px;"><a href="#"><span class="fa fa-comments"></span>5</a></li>
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
                                <li><span class="fa fa-tags"></span><a href="#">Dental</a> <a href="#">Surgery</a> <a href="#">Cardiac</a></li>
                              </ul>
                            </div>
                            <div class="blog-content blog-details">
                                <h2>Latest Trend Of Medical Dental Department</h2>                           
                              <p>It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident</p> 
                              <a href="#">Link Text</a>
                              
                              
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
                             <!-- Start Post Navigation -->
                             <div class="post-navigation">
                               <div class="postnav-left">
                                   <a class="prev-icon" href="#" style="border-color: #CE522C;"><span class="fa fa-angle-left" style="border-color: #CE522C;"></span></a>
                                   <h4 class="navg-title" style="border-color: #CE522C;">Previous</h4>
                               </div>
                               <div class="postnav-right">
                                   <a class="next-icon" href="#" style="border-color: #CE522C;"><span class="fa fa-angle-right" style="border-color: #CE522C;"></span>
                                 </a>
                                   <h4 class="navg-title" style="border-color: #CE522C;">Next</h4>
                               </div>
                             </div>
                              
                              <!-- Start Similar News -->
                              <div class="similar-post">
                                <h2>Similar News  </h2>
                                 <div class="row">
                                    <div class="col-md-6 col-sm-6">
                                      <div class="media">
                                          <div class="media-left">
                                            <a class="news-img" href="#">
                                              <img class="media-object" src="images/small-blog-img1.jpg" alt="img">
                                            </a>
                                          </div>
                                          <div class="media-body">
                                           <a href="blog-single.html">Dummy text of the Medical Post</a>
                                           <span class="feed-date">27.02.15</span>
                                          </div>
                                      </div>
                                    </div>
                                    <div class="col-md-6 col-sm-6">
                                      <div class="media">
                                        <div class="media-left">
                                          <a class="news-img" href="#">
                                            <img class="media-object" src="images/small-blog-img1.jpg" alt="img">
                                          </a>
                                        </div>
                                        <div class="media-body">
                                         <a href="blog-single.html">Dummy text of the Medical Post</a>
                                         <span class="feed-date">27.02.15</span>
                                        </div>
                                      </div>
                                    </div>
                                    <div class="col-md-6 col-sm-6">
                                      <div class="media">
                                          <div class="media-left">
                                            <a class="news-img" href="#">
                                              <img class="media-object" src="images/small-blog-img1.jpg" alt="img">
                                            </a>
                                          </div>
                                          <div class="media-body">
                                           <a href="blog-single.html">Dummy text of the Medical Post</a>
                                           <span class="feed-date">27.02.15</span>
                                          </div>
                                      </div>
                                    </div>
                                    <div class="col-md-6 col-sm-6">
                                      <div class="media">
                                        <div class="media-left">
                                          <a class="news-img" href="#">
                                            <img class="media-object" src="images/small-blog-img1.jpg" alt="img">
                                          </a>
                                        </div>
                                        <div class="media-body">
                                         <a href="blog-single.html">Dummy text of the Medical Post</a>
                                         <span class="feed-date">27.02.15</span>
                                        </div>
                                      </div>
                                   </div>
                                  </div>
                                </div>
                              </div>
                              
                              <!-- start Comments navigation -->
                              <nav>
                                <ul class="comments-pagination">
                                  <li>
                                    <a aria-label="Previous" href="#">
                                      <span class="fa fa-angle-left"></span>
                                    </a>
                                  </li>
                                  <li><a href="#">1</a></li>
                                  <li><a href="#">2</a></li>
                                  <li><a href="#">3</a></li>
                                  <li><a href="#">4</a></li>
                                  <li><a href="#">5</a></li>
                                  <li>
                                    <a aria-label="Next" href="#">
                                      <span class="fa fa-angle-right"></span>
                                    </a>
                                  </li>
                                </ul>
                              </nav>
                              <!-- Comments Responds -->                            
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