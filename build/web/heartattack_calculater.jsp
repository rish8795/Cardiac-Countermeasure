
<%@page import="model.FactorOption"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.FactorDetails"%>
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

        <!-- amCharts javascript code -->
        <% int metervalue = 0;
            String[] chartdata = new String[4];
            chartdata[0] = "5";
            chartdata[1] = "29";
            chartdata[2] = "35";
            chartdata[3] = "60";

            HttpSession hs = request.getSession();
            if (hs.getAttribute("metervalue") != null) {
                metervalue = (Integer) hs.getAttribute("metervalue");
            }
            if (hs.getAttribute("chartdata") != null) {
                chartdata = (String[]) hs.getAttribute("chartdata");
            }
        %>
        <script type="text/javascript">
            AmCharts.makeChart("chartdiv",
                    {
                        "type": "gauge",
                        "faceBorderColor": "#282828",
                        "faceBorderWidth": 4,
                        "faceColor": "#FF8000",
                        "gaugeX": 375,
                        "gaugeY": 275,
                        "marginBottom": 12,
                        "marginLeft": -66,
                        "marginRight": 22,
                        "marginTop": 50,
                        "startDuration": 4,
                        "startEffect": "bounce",
                        "backgroundColor": "#F7F7F7",
                        "borderColor": "#FFFF00",
                        "color": "#CE522C",
                        "fontFamily": "cursive",
                        "fontSize": 15,
                        "theme": "dark",
                        "arrows": [
                            {
                                "alpha": 0.6,
                                "axis": "GaugeAxis-1",
                                "borderAlpha": 0.54,
                                "clockWiseOnly": true,
                                "color": "#000000",
                                "id": "GaugeArrow-1",
                                "innerRadius": 20,
                                "radius": "75%",
                                "value": <%=metervalue%>
                            }
                        ],
                        "axes": [
                            {
                                "axisThickness": 1,
                                "bottomText": "<%=metervalue%> %",
                                "bottomTextColor": "#FF8000",
                                "bottomTextYOffset": -20,
                                "bottomTextFontSize": 20,
                                "endValue": <%=chartdata[3]%>,
                                "id": "GaugeAxis-1",
                                "valueInterval": 2,
                                "bands": [
                                    {
                                        "alpha": 0.7,
                                        "color": "#00CC00",
                                        "endValue": <%=chartdata[0]%>,
                                        "id": "GaugeBand-1",
                                        "startValue": 0
                                    },
                                    {
                                        "alpha": 0.7,
                                        "color": "#9400D3",
                                        "endValue": <%=chartdata[1]%>,
                                        "id": "GaugeBand-2",
                                        "startValue": <%=chartdata[0]%>
                                    },
                                    {
                                        "alpha": 0.7,
                                        "color": "#ffac29",
                                        "endValue": <%=chartdata[2]%>,
                                        "id": "GaugeBand-3",
                                        "innerRadius": "95%",
                                        "startValue": <%=chartdata[1]%>
                                    },
                                    {
                                        "color": "#ea3838",
                                        "endValue": <%=chartdata[3]%>,
                                        "id": "GaugeBand-4",
                                        "startValue": <%=chartdata[2]%>
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
<!--
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
        </section>-->



        <!--=========== BEGIN Heart-attack detection SECTION ================-->
        <section id="whychooseSection">
            <form action="calculatefactorrisk" onsubmit="return callBMI();" method="">
                <div style="width: 36%;
                     float: right;
                     padding: 0px 50px 0 20px;
                     margin-left: 0px;
                     font-size: 20px;
                     color: initial;
                     margin-top: 0px;">
                    <h1  style="color:#31708F;"> <u>Factors</u></h1></br>

                    <% if (request.getAttribute("factor") != null) {
                            FactorDetails fd = (FactorDetails) request.getAttribute("factor");
                            if (fd.getFactorId().equals(11)) {%>
                    <img class="img-center" src="images/<%= fd.getImage()%>">  
                    <p style="color: darkorange;">Enter Height : </p>
                    <input type="number" style="width: 200px;" id="foot" placeholder="FOOT" min="4" max="7" />
                    <input type="number" style="width: 200px;" id="inch" placeholder="INCH" min="1" max="11" />
                    <p style="color: darkorange;">Enter Weight(POUNDs) : </p>
                    <input type="number" style="width: 235px;float: left;" id="wt" placeholder="Weight(pound)" min="80" max="400" />
                    <input type="hidden" name="ans" id="ans1" />

                    <input name="facindex" type="hidden" value="<%=request.getAttribute("facindex")%>" />
                    <div class="readmore_area">
                        <!--<button type="submit" name="prev" data-hover="Previous" class="btn1"  ><span>Previous</span></button>-->
                        <!--<input type="submit" name="prev" value="PREVIOUS" class="reply-btn" style="float: none;background-color: rgb(60, 91, 41);" />-->
                        <input type="submit" name="next" value="SUBMIT" class="reply-btn" style="float: none;background-color:rgb(206, 82, 44);" />
                    </div>
                    <script>
                        function callBMI() {
//                            alert($("#foot").val());
                            var foot = $("#foot").val();
                            var inch = $("#inch").val();
                            var wt = $("#wt").val();

                            var totinch = foot * 12;
                            totinch += parseInt(inch);
                            var totpd = wt * 703;
//                            alert(totpd);
//                            alert(totinch);
                            var bmi = Math.round(totpd / (totinch * totinch));
//                            alert(bmi);
                            if (bmi <= 18) {
                                $("#ans1").val("38");
                            } else if (bmi < 25) {
                                $("#ans1").val("39");
                            } else if (bmi <= 30) {
                                $("#ans1").val("40");
                            } else {
                                $("#ans1").val("41");
                            }
//                            return false;

                        }
                    </script>

                    <%  } else {%>

                    <img class="img-center" src="images/<%= fd.getImage()%>">
                    <p style="color: darkorange;">
                        <%= fd.getFactorName()%>
                    </p>
                    <p style="color: darkorange;font-size: 15px;color: green">Note : <%= fd.getFactorDescription()%>
                    </p>
                    <select name="ans" class="wp-form-control wpcf7-text" style="width: 80%;margin: 21px 0 0 0;">
                        <% if (request.getAttribute("folist") != null) {
                                ArrayList<FactorOption> folist = (ArrayList<FactorOption>) request.getAttribute("folist");
                                for (FactorOption fo : folist) {
                        %>
                        <option value="<%=fo.getFoptionId()%>"><%=fo.getFactorOption()%> </option>
                        <% }
                            }%>
                    </select>
                    <input name="facindex" type="hidden" value="<%=request.getAttribute("facindex")%>" />
                    <div class="readmore_area">
                        <!--<button type="submit" name="prev" data-hover="Previous" class="btn1"  ><span>Previous</span></button>-->
                        <input type="submit" name="prev" value="PREVIOUS" class="reply-btn" style="float: none;background-color: rgb(60, 91, 41);" />
                        <input type="submit" name="next" value="NEXT" class="reply-btn" style="float: none;background-color:rgb(206, 82, 44);" />
                    </div>
                    <% }
                        }%>
                </div>
            </form>
            <div class="container">
                <div id="chartdiv" style="width: 57%; height: 367px;     background-color: rgb(247, 247, 247);" >
                </div>
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

                    </body>
                    </html>