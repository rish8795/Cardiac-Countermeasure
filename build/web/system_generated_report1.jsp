<%-- 
    Document   : system_generated_report1
    Created on : 28 Apr, 2016, 2:17:55 PM
    Author     : Dell
--%>

<%@page import="model.TestRecommend"%>
<%@page import="model.FactorDetails"%>
<%@page import="model.PatientfactorAnswer"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Calculationmeteredata"%>
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

        <%
            if (request.getAttribute("calcdata") != null) {

                ArrayList<PatientfactorAnswer> anslist = (ArrayList<PatientfactorAnswer>) request.getAttribute("anslist");
                Calculationmeteredata cm1 = (Calculationmeteredata) request.getAttribute("calcdata");
                int metervalue = cm1.getMetervalue();
                String[] chartdata = new String[4];
                chartdata[0] = "5";
                chartdata[1] = "29";
                chartdata[2] = "35";
                chartdata[3] = "60";

                HttpSession hs = request.getSession();
                if (request.getAttribute("chartdata") != null) {
                    chartdata = (String[]) request.getAttribute("chartdata");
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
        <%
            double rmetervalue = cm1.getRmetervalue();
            String[] rchartdata = new String[4];
            rchartdata[0] = "5";
            rchartdata[1] = "29";
            rchartdata[2] = "35";
            rchartdata[3] = "60";

//            HttpSession hs = request.getSession();
//            if (hs.getAttribute("metervalue") != null) {
//                metervalue = (Double) hs.getAttribute("metervalue");
//            }
            if (request.getAttribute("rchartdata") != null) {
                rchartdata = (String[]) request.getAttribute("rchartdata");
            }
%>
        <script type="text/javascript">
            AmCharts.makeChart("chartdiv1",
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
                                "value": <%=rmetervalue%>
                            }
                        ],
                        "axes": [
                            {
                                "axisThickness": 1,
                                "bottomText": "<%=rmetervalue%> %",
                                "bottomTextColor": "#FF8000",
                                "bottomTextYOffset": -20,
                                "bottomTextFontSize": 20,
                                "endValue": <%=rchartdata[3]%>,
                                "id": "GaugeAxis-1",
                                "valueInterval": 2,
                                "bands": [
                                    {
                                        "alpha": 0.7,
                                        "color": "#00CC00",
                                        "endValue": <%=rchartdata[0]%>,
                                        "id": "GaugeBand-1",
                                        "startValue": 0
                                    },
                                    {
                                        "alpha": 0.7,
                                        "color": "#9400D3",
                                        "endValue": <%=rchartdata[1]%>,
                                        "id": "GaugeBand-2",
                                        "startValue": <%=rchartdata[0]%>
                                    },
                                    {
                                        "alpha": 0.7,
                                        "color": "#ffac29",
                                        "endValue": <%=rchartdata[2]%>,
                                        "id": "GaugeBand-3",
                                        "innerRadius": "95%",
                                        "startValue": <%=rchartdata[1]%>
                                    },
                                    {
                                        "color": "#ea3838",
                                        "endValue": <%=rchartdata[3]%>,
                                        "id": "GaugeBand-4",
                                        "startValue": <%=rchartdata[2]%>
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

        <section id="blogArchive">      
            <div class="row">
                <div class="col-lg-12 col-md-12">
                    <div class="blog-breadcrumbs-area">
                        <div class="container">
                            <div class="blog-breadcrumbs-left">
                                <h2>System Report</h2>
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



        <!--=========== BEGIN Heart-attack meter SECTION ================-->
        <section id="whychooseSection" style="background-color: white;">
            <div class="container">    
                <span style="margin-left: 216px; font-size: larger;color: #CE522C;font-weight: bolder;">Absolute Risk Meter</span>
                <span style="margin-left: 500px; font-size: larger;color: #CE522C;font-weight: bolder;">Relative Risk Meter</span>
                <div class="line" style="margin-left: 236px;"></div>
                <div class="line" style="margin-top: -56px;margin-right: 123px;"></div>
                <div id="chartdiv" style="width: 59%; height: 367px;background-color: white; margin-left: -130px;" ></div>         
                <div id="chartdiv1" style="width: 50%; height: 367px;background-color: white;margin-left: 530px;margin-top: -375px;" ></div>
            </div> 
            <div class="container">
                <p style="color: #CE522C;font-size: medium;width: 50%;">Absolute Risk meter shows the chances of occurrence of heart-attack based on the factors you answer. it is same as you show all your reports to cardiologist and it tells you chances of occurrence of heart-attack</p>
                <p style="color: #CE522C;font-size: medium;width: 50%;margin-left: 675px;margin-top: -76px;">Estimates of short-term risk (absolute risk in the next 10
                    years) are potentially useful for the identification of patients
                    who need aggressive risk reduction in the clinical setting.</p>
            </div>
            <h3 style="border-bottom-style: ridge;"></h3>
        </section>

        <!--=========== END Heart-attack meter SECTION ================-->
        <!---------------Start modifiable factors------------->
        <div class="container">
            <section>
                <div class="how-works-area">
                    <div class="section-heading"> 
                        <h3 style="color:#CE522C;font-weight: bold; ">Modifiable Risk Factors</h3>
                        <div class="line" style="margin-left: 500px;"></div>
                    </div>
                    <div class="how-works" style="width: 60%;margin-left: 252px;">
                        <ul class="nav nav-tabs" id="myTab">
                            <li class="active"><a href="#experiment" data-toggle="tab">Cholesterol</a></li>
                            <li><a href="#monitor" data-toggle="tab">Blood Pressure</a></li>
                            <li><a href="#clean" data-toggle="tab">Smoking</a></li>
                            <li><a href="#clean1" data-toggle="tab">BMI</a></li>
                        </ul>
                        <!-- Tab panes -->
                        <div class="tab-content">
                            <div class="tab-pane fade in active" id="experiment">
                                <table style="border-style: inset; border-color: #CE522C;width: 100%;">
                                    <tr style="border-bottom-color: #CE522C;  border-bottom-style: inset;">
                                        <td style="border-right-style: ridge;border-right-color: #CE522C;width: 25%;background-color:#B73022; "></td>
                                        <td style="border-right-style: ridge;border-right-color: #CE522C;background-color: #B73022;
                                            font-size: large;
                                            color: white;
                                            font-weight: bold;">Current Risk Factors</td>
                                        <td style="border-right-style: ridge;border-right-color: #CE522C;background-color: #B73022;
                                            font-size: large;
                                            color: white;
                                            font-weight: bold;">Goal Risk Factors</td>
                                    </tr>
                                    <tr style="border-bottom-color: #CE522C;  border-bottom-style: inset;">
                                        <td style="border-right-style: ridge;border-right-color: #CE522C;background-color: #B73022;
                                            font-size: large;
                                            color: white;
                                            font-weight: bold; padding: 16px;">Total Cholesterol(mg/dL)</td>
                                        <td style="border-right-style: ridge;border-right-color: #CE522C;    background-color: rgb(245, 245, 245);
                                            font-size: x-large;
                                            color: #B73022;
                                            font-weight: bold;padding: 16px;">
                                            <%
                                                for (PatientfactorAnswer opp : anslist) {
                                                    if (opp.getFactorId().equals(new FactorDetails(3))) {
                                            %><%=opp.getFactorOptionId().getFactorOption()%><%
                                                            }
                                                        }
                                            %> 
                                        </td>
                                        <td style="border-right-style: ridge;border-right-color: #CE522C;    background-color: rgb(245, 245, 245);
                                            font-size: x-large;
                                            color: #B73022;
                                            font-weight: bold; padding: 16px;"><160(Goal)</td>
                                    </tr>
                                    <tr>
                                        <td style="border-right-style: ridge;border-right-color: #CE522C;background-color: #B73022;
                                            font-size: large;
                                            color: white;
                                            font-weight: bold; padding: 16px;">HDL (good) Cholesterol(mg/dL)</td>
                                        <td style="border-right-style: ridge;border-right-color: #CE522C;background-color: rgb(245, 245, 245);
                                            font-size: x-large;
                                            color: #B73022;
                                            font-weight: bold;"> 
                                            <%
                                                for (PatientfactorAnswer opp : anslist) {
                                                    if (opp.getFactorId().equals(new FactorDetails(4))) {
                                            %><%=opp.getFactorOptionId().getFactorOption()%><%
                                                            }
                                                        }
                                            %> 
                                        </td>
                                        <td style="border-right-style: ridge;border-right-color: #CE522C;background-color: rgb(245, 245, 245);
                                            font-size: x-large;
                                            color: #B73022;
                                            font-weight: bold; padding: 16px;">50</td>
                                    </tr>
                                </table>
                            </div>
                            <div class="tab-pane fade " id="monitor">
                                <table style="border-style: inset; border-color: #CE522C;width: 100%;">
                                    <tr style="border-bottom-color: #CE522C; border-bottom-style: inset;">
                                        <td style="border-right-style: ridge;border-right-color: #CE522C;width: 25%;background-color:#B73022;"></td>
                                        <td style="border-right-style: ridge;border-right-color: #CE522C;background-color: #B73022;
                                            font-size: large;
                                            color: white;
                                            font-weight: bold;">Current Risk Factors</td>
                                        <td style="border-right-style: ridge;border-right-color: #CE522C;background-color: #B73022;
                                            font-size: large;
                                            color: white;
                                            font-weight: bold;">Changed Risk Factors</td>
                                    </tr>
                                    <tr>
                                        <td style="border-right-style: ridge;border-right-color: #CE522C;background-color: #B73022;
                                            font-size: large;
                                            color: white;
                                            font-weight: bold;padding: 16px;">Blood Pressure (Systolic)(mm Hg)</td>
                                        <td style="border-right-style: ridge;border-right-color: #CE522C;background-color: rgb(245, 245, 245);
                                            font-size: x-large;
                                            color: #B73022;
                                            font-weight: bold; padding: 16px;">
                                            <%
                                                for (PatientfactorAnswer opp : anslist) {
                                                    if (opp.getFactorId().equals(new FactorDetails(5))) {
                                            %><%=opp.getFactorOptionId().getFactorOption()%><%
                                                            }
                                                        }
                                            %> 
                                        </td>
                                        <td style="border-right-style: ridge;border-right-color: #CE522C;background-color: rgb(245, 245, 245);
                                            font-size: x-large;
                                            color: #B73022;
                                            font-weight: bold; padding: 16px;">140 to 159</td>
                                    </tr>
                                </table>
                            </div>

                            <div class="tab-pane fade " id="clean">
                                <table style="border-style: inset; border-color: #CE522C;width: 100%;">
                                    <tr style="border-bottom-color: #CE522C; border-bottom-style: inset;">
                                        <td style="border-right-style: ridge;border-right-color: #CE522C;width: 25%;background-color:#B73022;"></td>
                                        <td style="border-right-style: ridge;border-right-color: #CE522C;background-color: #B73022;
                                            font-size: large;
                                            color: white;
                                            font-weight: bold;">Current Risk Factors</td>
                                        <td style="border-right-style: ridge;border-right-color: #CE522C;background-color: #B73022;
                                            font-size: large;
                                            color: white;
                                            font-weight: bold;">Changed Risk Factors</td>
                                    </tr>
                                    <tr>
                                        <td style="border-right-style: ridge;border-right-color: #CE522C;background-color: #B73022;
                                            font-size: large;
                                            color: white;
                                            font-weight: bold; padding: 16px;">Do you Smoke?</td>
                                        <td style="border-right-style: ridge;border-right-color: #CE522C;background-color: rgb(245, 245, 245);
                                            font-size: x-large;
                                            color: #B73022;
                                            font-weight: bold; padding: 16px;">
                                            <%
                                                for (PatientfactorAnswer opp : anslist) {
                                                    if (opp.getFactorId().equals(new FactorDetails(8))) {
                                            %><%=opp.getFactorOptionId().getFactorOption()%><%
                                                                }
                                                            }
                                            %>    

                                        </td>
                                        <td style="border-right-style: ridge;border-right-color: #CE522C;background-color: rgb(245, 245, 245);
                                            font-size: x-large;
                                            color: #B73022;
                                            font-weight: bold; padding: 16px;">No</td>
                                    </tr>
                                </table>
                            </div>
                                            <div class="tab-pane fade " id="clean1">
                                <table style="border-style: inset; border-color: #CE522C;width: 100%;">
                                    <tr style="border-bottom-color: #CE522C; border-bottom-style: inset;">
                                        <td style="border-right-style: ridge;border-right-color: #CE522C;width: 25%;background-color:#B73022;"></td>
                                        <td style="border-right-style: ridge;border-right-color: #CE522C;background-color: #B73022;
                                            font-size: large;
                                            color: white;
                                            font-weight: bold;">Current Risk Factors</td>
                                        <td style="border-right-style: ridge;border-right-color: #CE522C;background-color: #B73022;
                                            font-size: large;
                                            color: white;
                                            font-weight: bold;">Changed Risk Factors</td>
                                    </tr>
                                    <tr>
                                        <td style="border-right-style: ridge;border-right-color: #CE522C;background-color: #B73022;
                                            font-size: large;
                                            color: white;
                                            font-weight: bold; padding: 16px;">BMI STATUS</td>
                                        <td style="border-right-style: ridge;border-right-color: #CE522C;background-color: rgb(245, 245, 245);
                                            font-size: x-large;
                                            color: #B73022;
                                            font-weight: bold; padding: 16px;">
                                            <%
                                                for (PatientfactorAnswer opp : anslist) {
                                                    if (opp.getFactorId().equals(new FactorDetails(11))) {
                                            %><%=opp.getFactorOptionId().getFactorOption()%><%
                                                                }
                                                            }
                                            %>    

                                        </td>
                                        <td style="border-right-style: ridge;border-right-color: #CE522C;background-color: rgb(245, 245, 245);
                                            font-size: x-large;
                                            color: #B73022;
                                            font-weight: bold; padding: 16px;">Normal-Weight</td>
                                    </tr>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
                <h3 style="border-bottom-style: ridge;"></h3>
            </section>
        </div>

        <!----------------End modifiable factors-------------->
        <!---------------Start suggest test section--------->
        <section>
            <h3 style="color:#CE522C;font-weight: bold;margin-left: 552px; ">Metabolic Syndrome</h3>
            <div class="line" style="margin-left: 615px;"></div>
            <div>
                <div style="width: 50%; margin-left: 30px;border: solid;border-color: #CE522C;border-radius: 35px;">
                    <table class="table table-hover">
                        <thead style="font-size: large;color: #CE522C;">
                            <tr style="border-bottom-style: solid;border-bottom-color: #CE522C;">
                                <th><div class="checkbox">
                            <label>
                                <input type="checkbox" value=""
                                       <%
                                           for (PatientfactorAnswer opp : anslist) {
                                               if (opp.getFactorId().equals(new FactorDetails(10))) {
                                                   if (opp.getFactorOptionId().getFactorOption().equals("Yes")) {
                                       %>checked<%
                                                                    }
                                                                }
                                                            }
                                       %>
                                       disabled="">
                            </label>
                        </div></th>
                        <th style="border-right-style: solid;">Abdominal Obesity</th>
                        <th>Waist Circumference of 40" or more </th>   
                        </tr>
                        </thead>

                        <thead style="font-size: large;color: #CE522C;">
                            <tr style="border-bottom-style: solid;border-bottom-color: #CE522C;">
                                <th><div class="checkbox">
                            <label>
                                <input type="checkbox" value=""
                                       <%
                                           for (PatientfactorAnswer opp : anslist) {
                                               if (opp.getFactorId().equals(new FactorDetails(5))) {
                                                   if (opp.getFactorOptionId().getFactorOption().equals(">160")) {
                                       %>checked<%
                                                                    }
                                                                }
                                                            }
                                       %>
                                       disabled="">
                            </label>
                        </div></th>
                        <th style="border-right-style: solid;">High Blood Pressure</th>
                        <th>130/85 mm/Hg or higher </th>   
                        </tr>
                        </thead>

                        <thead style="font-size: large;color: #CE522C;">
                            <tr style="border-bottom-style: solid;border-bottom-color: #CE522C;">
                                <th><div class="checkbox">
                            <label>
                                <input type="checkbox" value=""
                                       <%
                                           for (PatientfactorAnswer opp : anslist) {
                                               if (opp.getFactorId().equals(new FactorDetails(9))) {
                                                   if (opp.getFactorOptionId().getFactorOption().equals("Yes")) {
                                       %>checked<%
                                                                    }
                                                                }
                                                            }
                                       %>
                                       disabled="">
                            </label>
                        </div></th>
                        <th style="border-right-style: solid;">High Blood Triglycerides</th>
                        <th>150 mg/dL or higher </th>   
                        </tr>
                        </thead>
                        <thead style="font-size: large;color: #CE522C;">
                            <tr style="border-bottom-style: solid;border-bottom-color: #CE522C;">
                                <th><div class="checkbox">
                            <label>
                                <input type="checkbox" value=""
                                       <%
                                           for (PatientfactorAnswer opp : anslist) {
                                               if (opp.getFactorId().equals(new FactorDetails(4))) {
                                                   if (opp.getFactorOptionId().getFactorOption().equals("<35") || opp.getFactorOptionId().getFactorOption().equals("35-44")) {
                                       %>checked<%
                                                                    }
                                                                }
                                                            }
                                       %>
                                       disabled="">
                            </label>
                        </div></th>
                        <th style="border-right-style: solid;">Low HDL (good Cholesterol)</th>
                        <th>Less than 40 mg/dL </th>   
                        </tr>
                        </thead>
                        <thead style="font-size: large;color: #CE522C;">
                            <tr style="border-bottom-style: solid;border-bottom-color: #CE522C;">
                                <th><div class="checkbox">
                            <label>
                                <input type="checkbox" value=""
                                       <%
                                           for (PatientfactorAnswer opp : anslist) {
                                               if (opp.getFactorId().equals(new FactorDetails(7))) {
                                                   if (opp.getFactorOptionId().getFactorOption().equals("Yes")) {
                                       %>checked<%
                                                                    }
                                                                }
                                                            }
                                       %>
                                       disabled="">
                            </label>
                        </div></th>
                        <th style="border-right-style: solid;">High Blood Sugar</th>
                        <th>Fasting glucose of 100mg/dL or higher </th>   
                        </tr>
                        </thead>

                    </table>
                </div>
                <div style="width:10%;">
                    <img src="images/rarrow.png" style="margin-left: 705px;
                         margin-top: -470px;">
                </div>
                <div style="width:25%; border: solid;border-color:#CE522C;border-radius: 35px;margin-left: 935px;margin-top: -320px; ">
                    <ul>
                        <li style="padding: 12px; font-size: large; font-weight: bold;color:#CE522C; padding-left: 80px; font-size: x-large; margin-left: -46px; border-bottom-style: solid;"><i class=""></i>Recommended Tests</li>
                            <% if (request.getAttribute("testlist") != null) {
                                    ArrayList<TestRecommend> tlist = (ArrayList<TestRecommend>) request.getAttribute("testlist");
                                    for (TestRecommend tr : tlist) {
                            %>
                        <li style="padding: 12px; font-size: large; font-weight: bold;color:#CE522C; padding-left: 80px; "><i class="fa fa-check"></i><%=tr.getTId().getTestName()%> </li>
                            <% }
                        } else { %>
                        <li style="padding: 12px; font-size: large; font-weight: bold;color:#CE522C; padding-left: 80px;"><i class="fa fa-check"></i>No test recommended.!</li>
                            <% } %>
                    </ul>
                </div>
             <form action="consult_lab.jsp" method="post">
                <button class="wpcf7-submit button--itzel" type="submit" style="margin-left: 980px;"><i class="button__icon fa fa-cart-plus"></i><span>Take Lab Appointment</span></button>                
            </form>

            </div>
            <% } else { %> Please take your test..!  <%}%>

        </section>
        <!---------------End sgggest test Section---------->

        <!--=========== Start Footer SECTION ================-->
        <footer id="footer" style="padding-top: 100px;">
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