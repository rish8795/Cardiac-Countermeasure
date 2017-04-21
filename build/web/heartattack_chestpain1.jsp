
<%-- 
    Document   : login
    Created on : 12 Jan, 2016, 7:19:13 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
   
    <!-- Basic Page Needs
    ================================================== -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
     <title>CARDIAC COUNTERMEASURE :Heart-attack Detection</title>

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
    <meta name="description" content="chart created using amCharts live editor" />

		<!-- amCharts custom font -->
                <link href='css/cssamcharts.css' rel='stylesheet' type='text/css'>

		<!-- amCharts javascript sources -->
                <script type="text/javascript" src="js/amcharts.js"></script>
                <script type="text/javascript" src="js/gauge.js"></script>
                <script type="text/javascript" src="js/chalk.js"></script>

		
		
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
              <a class="navbar-brand" href="home.jsp"><i class="fa fa-heartbeat"></i><span style="font-family: cursive">CARDIAC COUNTERMEASURE</span></a>              
              <!-- IMG BASED LOGO  -->
              <!--  <a class="navbar-brand" href="index.html"><img src="images/logo.png" alt="logo"></a>   -->                    
            </div>
            <div id="navbar" class="navbar-collapse collapse">
              <ul id="top-menu" class="nav navbar-nav navbar-right main-nav">
                <li class="active"><a href="index.html">Home</a></li>
                
                <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Services <span class="fa fa-angle-down"></span></a>
                  <ul class="dropdown-menu" role="menu">
                    <li><a href="medical-counseling.html">Heart-attack detection</a></li>
                    <li><a href="medical-research.html">Consult Cariac</a></li>
                    <li><a href="blood-bank.html">Laboratory test</a></li>
                  </ul>
                </li>
                <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown">Blogs <span class="fa fa-angle-down"></span></a>
                  <ul class="dropdown-menu" role="menu">
                    <li><a href="blog-archive.html">Blog Archive</a></li>
                    <li><a href="blog-archive-with-left-sidebar.html">Blog Archive with Left Sidebar</a></li>
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
      
       <section id="blogArchive">      
      <div class="row">
        <div class="col-lg-12 col-md-12">
          <div class="blog-breadcrumbs-area">
            <div class="container">
              <div class="blog-breadcrumbs-left">
                <h2>Heart-attack Detection</h2>
              </div>
              <div class="blog-breadcrumbs-right">
                <ol class="breadcrumb">
                  <li>You are here</li>
                  <li><a href="#">Home</a></li>                  
                  <li class="active">Heart-attack Detection</li>
                </ol>
              </div>
            </div>
          </div>
        </div>        
      </div>      
    </section>
       

  
    <!--=========== BEGIN Heart-attack detection SECTION ================-->
    <section id="whychooseSection">
        <div style="width: 37%;
    float: right;
    padding: 100px;
    margin-left: 80px;
    font-size: 33px;
    color: initial;
     margin-top: -100px;">
            <h1  style="color:#31708F;"> <u>Factors</u></h1></br>
            <p style="color: darkorange;">How long you are suffering from chest pain??</p>
            <img class="img-center" src="images/chestpain1.png">
            <input type="radio"  name="radio" value=""  style="color: red" /><a href="#">less than 24hrs</a><br>
            <input type="radio" name="radio" value="" style="color: green" />  <a href="#">More than 24hrs </a>
          </div>
      <div class="container">
        <%
            int a=Integer.parseInt(request.getParameter("id"));
            if(a==0)
            {
        %>
        
       	<div id="chartdiv1" style="width: 57%; height: 367px;     background-color: rgb(247, 247, 247);" >
            <%}%>
            
                   </div>
            <%if(a==1)
            {
            %>
            <div id="chartdiv2" style="width: 57%; height: 367px; margin-top: -710px; background-color: rgb(247, 247, 247);" ></div>
            <%}%>
            <%if(a==2)
            {
            %>
            <div id="chartdiv" style="width: 57%; height: 367px; margin-top: -710px; background-color: rgb(247, 247, 247);" ></div>
            <%}%>
  
          
      </div>
    </section>
    <!--=========== END Heart-attack detection SECTION ================-->
 
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
    
     <script type="text/javascript">
        AmCharts.makeChart("chartdiv1",
				{
					"type": "gauge",
					"clockWiseOnly": true,
					"faceBorderColor": "#FF8000",
					"faceBorderWidth": 0,
					"gaugeX": 421,
					"gaugeY": 206,
					"marginTop": 90,
					"minRadius": 29,
					"startDuration": 6,
					"startEffect": "bounce",
					"autoDisplay": true,
					"backgroundColor": "#f7f7f7",
					"classNamePrefix": "CC",
					"color": "#ff0000",
					"fontSize": 20,
					"handDrawScatter": 1,
					"handDrawThickness": 3,
					"path": "CC/",
					"theme": "chalk",
					"arrows": [
						{
							"alpha": 0,
							"axis": "GaugeAxis-1",
							"color": "#333",
							"id": "GaugeArrow-1",
							"innerRadius": 21,
							"radius": "88%",
							"startWidth": 30,
							"value": 40
						}
					],
					"axes": [
						{
							"bottomText": "40.00 %",
							"bottomTextYOffset": -20,
							"endValue": 100,
							"id": "GaugeAxis-1",
							"valueInterval": 10,
							"bands": [
								{
									"alpha": 0.7,
									"color": "#00CC00",
									"endValue": 30,
									"id": "GaugeBand-1",
									"startValue": 0
								},
								{
									"alpha": 0.7,
									"color": "#F9F900",
									"endValue": 70,
									"id": "GaugeBand-2",
									"startValue": 31
								},
								{
									"alpha": 0.7,
									"color": "#ea3838",
									"endValue": 100,
									"id": "GaugeBand-3",
									"innerRadius": "95%",
									"startValue": 71
								},
								{
									"id": "GaugeBand-4"
								}
							]
						}
					],
					"allLabels": [
						{
							"align": "center",
							"alpha": 0.9,
							"color": "#FF8000",
							"id": "Label-1",
							"size": 25,
							"text": "Heart-Attack Meter",
							"x": -90,
							"y": 21
						}
					],
					"balloon": {
						"animationDuration": 0.66,
						"color": "#FF8000",
						"fadeOutDuration": 0.76
					},
					"titles": []
				}
			);
                            </script>
     <script type="text/javascript">
			AmCharts.makeChart("chartdiv",
				{
					"type": "gauge",
					"clockWiseOnly": true,
					"faceBorderColor": "#FF8000",
					"faceBorderWidth": 0,
					"gaugeX": 421,
					"gaugeY": 206,
					"marginTop": 90,
					"minRadius": 29,
					"startDuration": 6,
					"startEffect": "bounce",
					"autoDisplay": true,
					"backgroundColor": "#f7f7f7",
					"classNamePrefix": "CC",
					"color": "#ff0000",
					"fontSize": 20,
					"handDrawScatter": 1,
					"handDrawThickness": 3,
					"path": "CC/",
					"theme": "chalk",
					"arrows": [
						{
							"alpha": 0,
							"axis": "GaugeAxis-1",
							"color": "#333",
							"id": "GaugeArrow-1",
							"innerRadius": 21,
							"radius": "88%",
							"startWidth": 30,
							"value": 7
						}
					],
					"axes": [
						{
							"bottomText": "7.00 %",
							"bottomTextYOffset": -20,
							"endValue": 100,
							"id": "GaugeAxis-1",
							"valueInterval": 10,
							"bands": [
								{
									"alpha": 0.7,
									"color": "#00CC00",
									"endValue": 30,
									"id": "GaugeBand-1",
									"startValue": 0
								},
								{
									"alpha": 0.7,
									"color": "#F9F900",
									"endValue": 70,
									"id": "GaugeBand-2",
									"startValue": 31
								},
								{
									"alpha": 0.7,
									"color": "#ea3838",
									"endValue": 100,
									"id": "GaugeBand-3",
									"innerRadius": "95%",
									"startValue": 71
								},
								{
									"id": "GaugeBand-4"
								}
							]
						}
					],
					"allLabels": [
						{
							"align": "center",
							"alpha": 0.9,
							"color": "#FF8000",
							"id": "Label-1",
							"size": 25,
							"text": "Heart-Attack Meter",
							"x": -90,
							"y": 21
						}
					],
					"balloon": {
						"animationDuration": 0.66,
						"color": "#FF8000",
						"fadeOutDuration": 0.76
					},
					"titles": []
				}
			);
		</script>
<script type="text/javascript">
			AmCharts.makeChart("chartdiv2",
				{
					"type": "gauge",
					"clockWiseOnly": true,
					"faceBorderColor": "#FF8000",
					"faceBorderWidth": 0,
					"gaugeX": 421,
					"gaugeY": 206,
					"marginTop": 90,
					"minRadius": 29,
					"startDuration": 6,
					"startEffect": "bounce",
					"autoDisplay": true,
					"backgroundColor": "#f7f7f7",
					"classNamePrefix": "CC",
					"color": "#ff0000",
					"fontSize": 20,
					"handDrawScatter": 1,
					"handDrawThickness": 3,
					"path": "CC/",
					"theme": "chalk",
					"arrows": [
						{
							"alpha": 0,
							"axis": "GaugeAxis-1",
							"color": "#333",
							"id": "GaugeArrow-1",
							"innerRadius": 21,
							"radius": "88%",
							"startWidth": 30,
							"value": 22
						}
					],
					"axes": [
						{
							"bottomText": "22.00 %",
							"bottomTextYOffset": -20,
							"endValue": 100,
							"id": "GaugeAxis-1",
							"valueInterval": 10,
							"bands": [
								{
									"alpha": 0.7,
									"color": "#00CC00",
									"endValue": 30,
									"id": "GaugeBand-1",
									"startValue": 0
								},
								{
									"alpha": 0.7,
									"color": "#F9F900",
									"endValue": 70,
									"id": "GaugeBand-2",
									"startValue": 31
								},
								{
									"alpha": 0.7,
									"color": "#ea3838",
									"endValue": 100,
									"id": "GaugeBand-3",
									"innerRadius": "95%",
									"startValue": 71
								},
								{
									"id": "GaugeBand-4"
								}
							]
						}
					],
					"allLabels": [
						{
							"align": "center",
							"alpha": 0.9,
							"color": "#FF8000",
							"id": "Label-1",
							"size": 25,
							"text": "Heart-Attack Meter",
							"x": -90,
							"y": 21
						}
					],
					"balloon": {
						"animationDuration": 0.66,
						"color": "#FF8000",
						"fadeOutDuration": 0.76
					},
					"titles": []
				}
			);
		</script>

     
  </body>
</html>