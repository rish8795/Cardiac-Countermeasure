<%-- 
    Document   : Labhomepage
    Created on : 31 Jan, 2016, 6:41:10 PM
    Author     : Dell
--%>

<%@page import="model.Lab"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <!--=============================================== 
    Template Design By rishabh shah and jui desai.
    Author URI : http:///
    ====================================================-->

    <!-- Basic Page Needs
    ================================================== -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="description" content="Medical Theams">
	<meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
     <title>CARDIAC COUNTERMEASURE: Home</title>

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
    <style type="text/css">
        .rcorners1 {
    border-radius: 25px;
    background: #CE522C;
    float: left;
    display: inline;
    width: 86%;
    text-align: center;
    padding: 43px 30px;
}
.rcorners2 {
   border-radius: 25px;
    background: #CE522C;
    float: left;
    display: inline;
    width: 88%;
    text-align: center;
    padding: 52px 32px;
}
.bg_image{
        background-image: url(images/heart_repeat.jpg);
    background-repeat: inherit;
}
.row_1{
    margin-left: 90px;
    /*margin-right: 40px;*/
    float: left;
    margin-top: 30px;
}
.btn-style{
	border : solid 1px #fff700;
	border-radius : 6px;
	moz-border-radius : 6px;
	font-size : 20px;
	color : #ffffff;
	padding : 1px 17px;
	background : #ffd500;
	background : -webkit-gradient(linear, left top, left bottom, color-stop(0%,#ffd500), color-stop(100%,#ff8c00));
	background : -moz-linear-gradient(top, #ffd500 0%, #ff8c00 100%);
	background : -webkit-linear-gradient(top, #ffd500 0%, #ff8c00 100%);
	background : -o-linear-gradient(top, #ffd500 0%, #ff8c00 100%);
	background : -ms-linear-gradient(top, #ffd500 0%, #ff8c00 100%);
	background : linear-gradient(top, #ffd500 0%, #ff8c00 100%);
	filter : progid:DXImageTransform.Microsoft.gradient( startColorstr='#ffd500', endColorstr='#ff8c00',GradientType=0 );

}
.btn-upload{
    color: #fff;
    display: inline-block;
    font-size: 12px;
    font-weight: bold;
    margin-bottom: 0px;
    padding: 0px 6px;
    background-color: rgb(255, 164, 34);
    float:right;
}
.bck_img{
    background-image: url(..\images\images\ha.jpg);
    width:100%;
    height:auto;
    background-repeat: inherit;
    background-color: blanchedalmond;
}

.line1{
    border-bottom: 2px solid #FFEB3B;
    background: none repeat scroll 0 0 transparent;
    height: 1px;
    margin: 0 auto 45px;
    padding: 5px;
    position: relative;
    width: 120px;
}

.line1::after {
    border-top-color: #FFEB3B;
    border-width: 8px;
    margin-left: -8px;
}

    </style>
  </head>
  <body style="background: #f5f5f5;">  
    
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
     <!--=========== BEGIN SLIDER SECTION ================-->
    <section id="blogArchive">      
      <div class="row">
        <div class="col-lg-12 col-md-12">
          <div class="blog-breadcrumbs-area">
            <div class="container">
              <div class="blog-breadcrumbs-left">
                <%
                    HttpSession hs = request.getSession();
                    if(hs.getAttribute("lab")!=null)
                    {
                    Lab l =(Lab)hs.getAttribute("lab");
                    String fname=l.getLabName(); 
                %>
                
                  <h2>Welcome <%=fname%></h2>
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
            <div class="readmore_area">
             
            </div>
          </div>
        </div>
        <!-- End First slide -->

        <!-- Start 2nd slide -->
        <div class="top-slide-inner">
          <div class="slider-img">
              <img src="images/220616904-reagenzglasstaender-erlenmeyerkolben-schwenken-glas-schutzhandschuh (1).jpg" alt="">
          </div>
            <div class="slider-text">
            <h2>A <strong></strong> Best and accurate lab support</h2>
                        
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
              <a data-hover="Read More" href="#"><span>Read More</span></a>                
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
            <div class="readmore_area">
              <a data-hover="Read More" href="#"><span>Read More</span></a>                
            </div>
          </div>
        </div>
        <!-- End Fourth slide -->

        <!-- Start Fifth slide -->
       
        <!-- End Fifth slide -->
      </div><!-- /top-slider -->
    </section>
   
    <!--=========== BEGIN Top Feature SECTION ================-->
    
    <!--=========== END Top Feature SECTION ================-->
    <!--=========== BEGAIN Home Blog SECTION ================-->
    <section id="homeBLog">
      <div class="container">
        <div class="row">
          <div class="col-lg-12 col-md-12">
            <div class="homBlog-area">
             <!-- Start Service Title -->
              <div class="section-heading">
                <h2>News From Blog</h2>
                <div class="line"></div>
              </div> 
              <!-- Start Home Blog Content -->
              <div class="homeBlog-content">
                <div class="row">
                  <!-- Start Single Blog -->
                  <div class="col-lg-4 col-md-4 col-sm-4">
                    <div class="single-Blog">
                      <div class="single-blog-left">
                        <ul class="blog-comments-box">
                          <li>May <h2>10</h2>2016</li>
                          <li><span class="fa fa-eye"></span>20</li>
                          <!--<li><a href="#"><span class="fa fa-comments"></span>5</a></li>-->
                        </ul>
                      </div>
                      <div class="single-blog-right">
                        <div class="blog-img">
                          <figure class="blog-figure">
                              <a href="#"><img src="images/heart-healthy-people.jpg" alt="img"></a>
                            <span class="image-effect"></span>
                          </figure>
                        </div>
                        <div class="blog-author">
                          <ul>
                            <li>By <a href="#">Dr. Smith</a></li>
                            <!--<li>In <a href="#">caridac</a></li>-->
                          </ul>
                        </div>
                        <div class="blog-content">
                          <h2>Latest Trend Of Medical Dental Department</h2>
                          <p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable.</p>
                          <div class="readmore_area">
                            <a href="#" data-hover="Read More"><span>Read More</span></a>                
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                   <!-- Start Single Blog -->
                  <div class="col-lg-4 col-md-4 col-sm-4">
                    <div class="single-Blog">
                      <div class="single-blog-left">
                        <ul class="blog-comments-box">
                          <li>May <h2>10</h2>2015</li>
                          <li><span class="fa fa-eye"></span>23</li>
                          <!--<li><a href="#"><span class="fa fa-comments"></span>5</a></li>-->
                        </ul>
                      </div>
                      <div class="single-blog-right">
                         <div class="blog-img">
                          <figure class="blog-figure">
                              <a href="#"><img src="images/heart-healthy-people.jpg" alt="img"></a>
                            <span class="image-effect"></span>
                          </figure>
                        </div>
                        <div class="blog-author">
                          <ul>
                            <li>By <a href="#">Dr. Smith</a></li>
                            <!--<li>In <a href="#">Dental</a></li>-->
                          </ul>
                        </div>
                        <div class="blog-content">
                          <h2>The Healthy Foodie</h2>
                          <p>In a world where high-fat, processed foods run the market, committing to heart-healthy food can seem impossible (and downright unappetizing). The Healthy Foodie offers solutions to such dilemmas with easy, homemade foods that nourish your body.

Sonia, who decided to make significant health changes during her mid-30s, started the blog. Known as the ‚??Healthy Foodie,‚?ù Sonia shares a wealth of healthy recipes with a ‚??paleo‚?ù (low, low carbs) flavor. Sonia will help you keep both your heart and weight in check.</p>
                          <div class="readmore_area">
                            <a href="#" data-hover="Read More"><span>Read More</span></a>                
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                   <!-- Start Single Blog -->
                  <div class="col-lg-4 col-md-4 col-sm-4">
                    <div class="single-Blog">
                      <div class="single-blog-left">
                        <ul class="blog-comments-box">
                          <li>May <h2>11</h2>2016</li>
                          <li><span class="fa fa-eye"></span>25</li>
                          <!--<li><a href="#"><span class="fa fa-comments"></span>5</a></li>-->
                        </ul>
                      </div>
                      <div class="single-blog-right">
                         <div class="blog-img">
                          <figure class="blog-figure">
                              <a href="#"><img src="images/heart-healthy-people.jpg" alt="img"></a>
                            <span class="image-effect"></span>
                          </figure>
                        </div>
                        <div class="blog-author">
                          <ul>
                            <li>By <a href="#">Dr. Smith</a></li>
                            <!--<li>In <a href="#">Dental</a></li>-->
                          </ul>
                        </div>
                        <div class="blog-content">
                          <h2>The Healthy Foodie</h2>
                          <p>In a world where high-fat, processed foods run the market, committing to heart-healthy food can seem impossible (and downright unappetizing). The Healthy Foodie offers solutions to such dilemmas with easy, homemade foods that nourish your body.

Sonia, who decided to make significant health changes during her mid-30s, started the blog. Known as the ‚??Healthy Foodie,‚?ù Sonia shares a wealth of healthy recipes with a ‚??paleo‚?ù (low, low carbs) flavor. Sonia will help you keep both your heart and weight in check.</p>
                          <div class="readmore_area">
                            <a href="#" data-hover="Read More"><span>Read More</span></a>                
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
    <!--=========== End Home Blog SECTION ================-->

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
     
  </body>
</html>