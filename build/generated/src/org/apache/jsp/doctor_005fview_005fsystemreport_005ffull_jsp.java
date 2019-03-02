package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.TestRecommend;
import model.FactorDetails;
import model.PatientfactorAnswer;
import java.util.ArrayList;
import model.Calculationmeteredata;

public final class doctor_005fview_005fsystemreport_005ffull_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header_doctor.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <!-- Basic Page Needs\n");
      out.write("        ================================================== -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>CARDIAC COUNTERMEASURE :Heart-attack Detection</title>\n");
      out.write("\n");
      out.write("        <!-- Mobile Specific Metas\n");
      out.write("        ================================================== -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/icon\" href=\"images/favicon.ico\"/>\n");
      out.write("\n");
      out.write("        <!-- CSS\n");
      out.write("        ================================================== -->       \n");
      out.write("        <!-- Bootstrap css file-->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Font awesome css file-->\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">       \n");
      out.write("        <!-- Default Theme css file -->\n");
      out.write("        <link id=\"switcher\" href=\"css/themes/default-theme.css\" rel=\"stylesheet\">      \n");
      out.write("        <!-- Slick slider css file -->\n");
      out.write("        <link href=\"css/slick.css\" rel=\"stylesheet\"> \n");
      out.write("        <!-- Photo Swipe Image Gallery -->     \n");
      out.write("        <link rel='stylesheet prefetch' href='css/photoswipe.css'>\n");
      out.write("        <link rel='stylesheet prefetch' href='css/default-skin.css'>    \n");
      out.write("\n");
      out.write("        <!-- Main structure css file -->\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Google fonts -->\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>  \n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Habibi' rel='stylesheet' type='text/css'>  \n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Cinzel+Decorative:900' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]--> \n");
      out.write("        <meta name=\"description\" content=\"chart created using amCharts live editor\" />\n");
      out.write("\n");
      out.write("        <!-- amCharts custom font -->\n");
      out.write("        <link href='css/cssamcharts.css' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("        <!-- amCharts javascript sources -->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/amcharts.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/gauge.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/chalk.js\"></script>\n");
      out.write("\n");
      out.write("        ");

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
        
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            AmCharts.makeChart(\"chartdiv\",\n");
      out.write("                    {\n");
      out.write("                        \"type\": \"gauge\",\n");
      out.write("                        \"faceBorderColor\": \"#282828\",\n");
      out.write("                        \"faceBorderWidth\": 4,\n");
      out.write("                        \"faceColor\": \"#FF8000\",\n");
      out.write("                        \"gaugeX\": 375,\n");
      out.write("                        \"gaugeY\": 275,\n");
      out.write("                        \"marginBottom\": 12,\n");
      out.write("                        \"marginLeft\": -66,\n");
      out.write("                        \"marginRight\": 22,\n");
      out.write("                        \"marginTop\": 50,\n");
      out.write("                        \"startDuration\": 4,\n");
      out.write("                        \"startEffect\": \"bounce\",\n");
      out.write("                        \"backgroundColor\": \"#F7F7F7\",\n");
      out.write("                        \"borderColor\": \"#FFFF00\",\n");
      out.write("                        \"color\": \"#CE522C\",\n");
      out.write("                        \"fontFamily\": \"cursive\",\n");
      out.write("                        \"fontSize\": 15,\n");
      out.write("                        \"theme\": \"dark\",\n");
      out.write("                        \"arrows\": [\n");
      out.write("                            {\n");
      out.write("                                \"alpha\": 0.6,\n");
      out.write("                                \"axis\": \"GaugeAxis-1\",\n");
      out.write("                                \"borderAlpha\": 0.54,\n");
      out.write("                                \"clockWiseOnly\": true,\n");
      out.write("                                \"color\": \"#000000\",\n");
      out.write("                                \"id\": \"GaugeArrow-1\",\n");
      out.write("                                \"innerRadius\": 20,\n");
      out.write("                                \"radius\": \"75%\",\n");
      out.write("                                \"value\": ");
      out.print(metervalue);
      out.write("\n");
      out.write("                            }\n");
      out.write("                        ],\n");
      out.write("                        \"axes\": [\n");
      out.write("                            {\n");
      out.write("                                \"axisThickness\": 1,\n");
      out.write("                                \"bottomText\": \"");
      out.print(metervalue);
      out.write(" %\",\n");
      out.write("                                \"bottomTextColor\": \"#FF8000\",\n");
      out.write("                                \"bottomTextYOffset\": -20,\n");
      out.write("                                \"bottomTextFontSize\": 20,\n");
      out.write("                                \"endValue\": ");
      out.print(chartdata[3]);
      out.write(",\n");
      out.write("                                \"id\": \"GaugeAxis-1\",\n");
      out.write("                                \"valueInterval\": 2,\n");
      out.write("                                \"bands\": [\n");
      out.write("                                    {\n");
      out.write("                                        \"alpha\": 0.7,\n");
      out.write("                                        \"color\": \"#00CC00\",\n");
      out.write("                                        \"endValue\": ");
      out.print(chartdata[0]);
      out.write(",\n");
      out.write("                                        \"id\": \"GaugeBand-1\",\n");
      out.write("                                        \"startValue\": 0\n");
      out.write("                                    },\n");
      out.write("                                    {\n");
      out.write("                                        \"alpha\": 0.7,\n");
      out.write("                                        \"color\": \"#9400D3\",\n");
      out.write("                                        \"endValue\": ");
      out.print(chartdata[1]);
      out.write(",\n");
      out.write("                                        \"id\": \"GaugeBand-2\",\n");
      out.write("                                        \"startValue\": ");
      out.print(chartdata[0]);
      out.write("\n");
      out.write("                                    },\n");
      out.write("                                    {\n");
      out.write("                                        \"alpha\": 0.7,\n");
      out.write("                                        \"color\": \"#ffac29\",\n");
      out.write("                                        \"endValue\": ");
      out.print(chartdata[2]);
      out.write(",\n");
      out.write("                                        \"id\": \"GaugeBand-3\",\n");
      out.write("                                        \"innerRadius\": \"95%\",\n");
      out.write("                                        \"startValue\": ");
      out.print(chartdata[1]);
      out.write("\n");
      out.write("                                    },\n");
      out.write("                                    {\n");
      out.write("                                        \"color\": \"#ea3838\",\n");
      out.write("                                        \"endValue\": ");
      out.print(chartdata[3]);
      out.write(",\n");
      out.write("                                        \"id\": \"GaugeBand-4\",\n");
      out.write("                                        \"startValue\": ");
      out.print(chartdata[2]);
      out.write("\n");
      out.write("                                    }\n");
      out.write("                                ]\n");
      out.write("                            }\n");
      out.write("                        ],\n");
      out.write("                        \"allLabels\": [\n");
      out.write("                            {\n");
      out.write("                                \"align\": \"center\",\n");
      out.write("                                \"alpha\": 0.9,\n");
      out.write("                                \"color\": \"#FF8000\",\n");
      out.write("                                \"id\": \"Label-1\",\n");
      out.write("                                \"size\": 25,\n");
      out.write("                                \"text\": \"Heart-Attack Meter\",\n");
      out.write("                                \"x\": -90,\n");
      out.write("                                \"y\": 21\n");
      out.write("                            }\n");
      out.write("                        ],\n");
      out.write("                        \"balloon\": {\n");
      out.write("                            \"animationDuration\": 0.66,\n");
      out.write("                            \"color\": \"#FF8000\",\n");
      out.write("                            \"fadeOutDuration\": 0.76\n");
      out.write("                        },\n");
      out.write("                        \"titles\": []\n");
      out.write("                    }\n");
      out.write("            );\n");
      out.write("        </script>\n");
      out.write("        ");

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

      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            AmCharts.makeChart(\"chartdiv1\",\n");
      out.write("                    {\n");
      out.write("                        \"type\": \"gauge\",\n");
      out.write("                        \"faceBorderColor\": \"#282828\",\n");
      out.write("                        \"faceBorderWidth\": 4,\n");
      out.write("                        \"faceColor\": \"#FF8000\",\n");
      out.write("                        \"gaugeX\": 375,\n");
      out.write("                        \"gaugeY\": 275,\n");
      out.write("                        \"marginBottom\": 12,\n");
      out.write("                        \"marginLeft\": -66,\n");
      out.write("                        \"marginRight\": 22,\n");
      out.write("                        \"marginTop\": 50,\n");
      out.write("                        \"startDuration\": 4,\n");
      out.write("                        \"startEffect\": \"bounce\",\n");
      out.write("                        \"backgroundColor\": \"#F7F7F7\",\n");
      out.write("                        \"borderColor\": \"#FFFF00\",\n");
      out.write("                        \"color\": \"#CE522C\",\n");
      out.write("                        \"fontFamily\": \"cursive\",\n");
      out.write("                        \"fontSize\": 15,\n");
      out.write("                        \"theme\": \"dark\",\n");
      out.write("                        \"arrows\": [\n");
      out.write("                            {\n");
      out.write("                                \"alpha\": 0.6,\n");
      out.write("                                \"axis\": \"GaugeAxis-1\",\n");
      out.write("                                \"borderAlpha\": 0.54,\n");
      out.write("                                \"clockWiseOnly\": true,\n");
      out.write("                                \"color\": \"#000000\",\n");
      out.write("                                \"id\": \"GaugeArrow-1\",\n");
      out.write("                                \"innerRadius\": 20,\n");
      out.write("                                \"radius\": \"75%\",\n");
      out.write("                                \"value\": ");
      out.print(rmetervalue);
      out.write("\n");
      out.write("                            }\n");
      out.write("                        ],\n");
      out.write("                        \"axes\": [\n");
      out.write("                            {\n");
      out.write("                                \"axisThickness\": 1,\n");
      out.write("                                \"bottomText\": \"");
      out.print(rmetervalue);
      out.write(" %\",\n");
      out.write("                                \"bottomTextColor\": \"#FF8000\",\n");
      out.write("                                \"bottomTextYOffset\": -20,\n");
      out.write("                                \"bottomTextFontSize\": 20,\n");
      out.write("                                \"endValue\": ");
      out.print(rchartdata[3]);
      out.write(",\n");
      out.write("                                \"id\": \"GaugeAxis-1\",\n");
      out.write("                                \"valueInterval\": 2,\n");
      out.write("                                \"bands\": [\n");
      out.write("                                    {\n");
      out.write("                                        \"alpha\": 0.7,\n");
      out.write("                                        \"color\": \"#00CC00\",\n");
      out.write("                                        \"endValue\": ");
      out.print(rchartdata[0]);
      out.write(",\n");
      out.write("                                        \"id\": \"GaugeBand-1\",\n");
      out.write("                                        \"startValue\": 0\n");
      out.write("                                    },\n");
      out.write("                                    {\n");
      out.write("                                        \"alpha\": 0.7,\n");
      out.write("                                        \"color\": \"#9400D3\",\n");
      out.write("                                        \"endValue\": ");
      out.print(rchartdata[1]);
      out.write(",\n");
      out.write("                                        \"id\": \"GaugeBand-2\",\n");
      out.write("                                        \"startValue\": ");
      out.print(rchartdata[0]);
      out.write("\n");
      out.write("                                    },\n");
      out.write("                                    {\n");
      out.write("                                        \"alpha\": 0.7,\n");
      out.write("                                        \"color\": \"#ffac29\",\n");
      out.write("                                        \"endValue\": ");
      out.print(rchartdata[2]);
      out.write(",\n");
      out.write("                                        \"id\": \"GaugeBand-3\",\n");
      out.write("                                        \"innerRadius\": \"95%\",\n");
      out.write("                                        \"startValue\": ");
      out.print(rchartdata[1]);
      out.write("\n");
      out.write("                                    },\n");
      out.write("                                    {\n");
      out.write("                                        \"color\": \"#ea3838\",\n");
      out.write("                                        \"endValue\": ");
      out.print(rchartdata[3]);
      out.write(",\n");
      out.write("                                        \"id\": \"GaugeBand-4\",\n");
      out.write("                                        \"startValue\": ");
      out.print(rchartdata[2]);
      out.write("\n");
      out.write("                                    }\n");
      out.write("                                ]\n");
      out.write("                            }\n");
      out.write("                        ],\n");
      out.write("                        \"allLabels\": [\n");
      out.write("                            {\n");
      out.write("                                \"align\": \"center\",\n");
      out.write("                                \"alpha\": 0.9,\n");
      out.write("                                \"color\": \"#FF8000\",\n");
      out.write("                                \"id\": \"Label-1\",\n");
      out.write("                                \"size\": 25,\n");
      out.write("                                \"text\": \"Heart-Attack Meter\",\n");
      out.write("                                \"x\": -90,\n");
      out.write("                                \"y\": 21\n");
      out.write("                            }\n");
      out.write("                        ],\n");
      out.write("                        \"balloon\": {\n");
      out.write("                            \"animationDuration\": 0.66,\n");
      out.write("                            \"color\": \"#FF8000\",\n");
      out.write("                            \"fadeOutDuration\": 0.76\n");
      out.write("                        },\n");
      out.write("                        \"titles\": []\n");
      out.write("                    }\n");
      out.write("            );\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>    \n");
      out.write("        <!-- BEGAIN PRELOADER -->\n");
      out.write("        <div id=\"preloader\">\n");
      out.write("            <div id=\"status\">&nbsp;</div>\n");
      out.write("        </div>\n");
      out.write("        <!-- END PRELOADER -->\n");
      out.write("\n");
      out.write("        <!-- SCROLL TOP BUTTON -->\n");
      out.write("        <a class=\"scrollToTop\" href=\"#\"><i class=\"fa fa-heartbeat\"></i></a>\n");
      out.write("        <!-- END SCROLL TOP BUTTON -->\n");
      out.write("\n");
      out.write("        <!--=========== BEGIN HEADER SECTION ================-->\n");
      out.write("        ");
      out.write(" <!--=========== BEGIN HEADER SECTION ================-->\n");
      out.write("    <header id=\"header\">\n");
      out.write("      <!-- BEGIN MENU -->\n");
      out.write("      <div class=\"menu_area\">\n");
      out.write("        <nav class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\">  \n");
      out.write("          <div class=\"container\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("              <!-- FOR MOBILE VIEW COLLAPSED BUTTON -->\n");
      out.write("              <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("              </button>\n");
      out.write("              <!-- LOGO -->              \n");
      out.write("              <!-- TEXT BASED LOGO -->\n");
      out.write("              <a class=\"navbar-brand\" href=\"index.html\"><i class=\"fa fa-heartbeat\"></i><span style=\"font-family: cursive\">CARDIAC COUNTERMEASURE</span></a>              \n");
      out.write("              <!-- IMG BASED LOGO  -->\n");
      out.write("              <!--  <a class=\"navbar-brand\" href=\"index.html\"><img src=\"images/logo.png\" alt=\"logo\"></a>   -->                    \n");
      out.write("            </div>\n");
      out.write("            <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("              <ul id=\"top-menu\" class=\"nav navbar-nav navbar-right main-nav\">\n");
      out.write("                  <li class=\"active\"><a href=\"doctorhomepage.jsp\">Home</a></li>\n");
      out.write("                \n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                  <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Services <span class=\"fa fa-angle-down\"></span></a>\n");
      out.write("                  <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                      <li><a href=\"get_appointment_doc\">List of Appointment</a></li>\n");
      out.write("                      <li><a href=\"doc_view_approved_appointment\">Approved Appointment</a></li>\n");
      out.write("                 </ul>\n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("                  <li><a href=\"Blogs.jsp\">Blogs</a></li>\n");
      out.write("                </li>\n");
      out.write("                 \n");
      out.write("                <li><a href=\"features.html\">FAQs</a></li>\n");
      out.write("                <li><a href=\"ContactUs.jsp\">Contact Us</a></li>\n");
      out.write("                <li><a href=\"doc_profile\">My Profile</a></li>\n");
      out.write("                <li><a href=\"logoutserv\">LogOut</a></li>\n");
      out.write("              </ul>           \n");
      out.write("            </div><!--/.nav-collapse -->\n");
      out.write("          </div>     \n");
      out.write("        </nav>  \n");
      out.write("      </div>\n");
      out.write("      <!-- END MENU -->    \n");
      out.write("    </header>\n");
      out.write("    <!--=========== END HEADER SECTION ================-->  ");
      out.write("\n");
      out.write("\n");
      out.write("        <section id=\"blogArchive\">      \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12 col-md-12\">\n");
      out.write("                    <div class=\"blog-breadcrumbs-area\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"blog-breadcrumbs-left\">\n");
      out.write("                                <h2>System Report</h2>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"blog-breadcrumbs-right\">\n");
      out.write("                                <ol class=\"breadcrumb\">\n");
      out.write("                                    <li>You are here</li>\n");
      out.write("                                    <li><a href=\"#\">Home</a></li>                  \n");
      out.write("                                    <li class=\"active\">Heart-attack Detection</li>\n");
      out.write("                                </ol>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>        \n");
      out.write("            </div>      \n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--=========== BEGIN Heart-attack meter SECTION ================-->\n");
      out.write("        <section id=\"whychooseSection\" style=\"background-color: white;\">\n");
      out.write("            <div class=\"container\">    \n");
      out.write("                <span style=\"margin-left: 216px; font-size: larger;color: #CE522C;font-weight: bolder;\">Absolute Risk Factor</span>\n");
      out.write("                <span style=\"margin-left: 500px; font-size: larger;color: #CE522C;font-weight: bolder;\">Relative Risk Factor</span>\n");
      out.write("                <div class=\"line\" style=\"margin-left: 236px;\"></div>\n");
      out.write("                <div class=\"line\" style=\"margin-top: -56px;margin-right: 123px;\"></div>\n");
      out.write("                <div id=\"chartdiv\" style=\"width: 59%; height: 367px;background-color: white; margin-left: -130px;\" ></div>         \n");
      out.write("                <div id=\"chartdiv1\" style=\"width: 50%; height: 367px;background-color: white;margin-left: 530px;margin-top: -375px;\" ></div>\n");
      out.write("            </div> \n");
      out.write("            <div class=\"container\">\n");
      out.write("                <p style=\"color: #CE522C;font-size: medium;width: 50%;\">Estimates of short-term risk (absolute risk in the next 10\n");
      out.write("                    years) are potentially useful for the identification of patients\n");
      out.write("                    who need aggressive risk reduction in the clinical setting.</p>\n");
      out.write("                <p style=\"color: #CE522C;font-size: medium;width: 50%;margin-left: 675px;margin-top: -76px;\">Estimates of short-term risk (absolute risk in the next 10\n");
      out.write("                    years) are potentially useful for the identification of patients\n");
      out.write("                    who need aggressive risk reduction in the clinical setting.</p>\n");
      out.write("            </div>\n");
      out.write("            <h3 style=\"border-bottom-style: ridge;\"></h3>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!--=========== END Heart-attack meter SECTION ================-->\n");
      out.write("        <!---------------Start modifiable factors------------->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <section>\n");
      out.write("                <div class=\"how-works-area\">\n");
      out.write("                    <div class=\"section-heading\"> \n");
      out.write("                        <h3 style=\"color:#CE522C;font-weight: bold; \">Modifiable Risk Factors</h3>\n");
      out.write("                        <div class=\"line\" style=\"margin-left: 500px;\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"how-works\" style=\"width: 60%;margin-left: 252px;\">\n");
      out.write("                        <ul class=\"nav nav-tabs\" id=\"myTab\">\n");
      out.write("                            <li class=\"active\"><a href=\"#experiment\" data-toggle=\"tab\">Cholesterol</a></li>\n");
      out.write("                            <li><a href=\"#monitor\" data-toggle=\"tab\">Blood Pressure</a></li>\n");
      out.write("                            <li><a href=\"#clean\" data-toggle=\"tab\">Smoking</a></li>\n");
      out.write("                            <li><a href=\"#clean\" data-toggle=\"tab\">BMI</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                        <!-- Tab panes -->\n");
      out.write("                        <div class=\"tab-content\">\n");
      out.write("                            <div class=\"tab-pane fade in active\" id=\"experiment\">\n");
      out.write("                                <table style=\"border-style: inset; border-color: #CE522C;width: 100%;\">\n");
      out.write("                                    <tr style=\"border-bottom-color: #CE522C;  border-bottom-style: inset;\">\n");
      out.write("                                        <td style=\"border-right-style: ridge;border-right-color: #CE522C;width: 25%;background-color:#B73022; \"></td>\n");
      out.write("                                        <td style=\"border-right-style: ridge;border-right-color: #CE522C;background-color: #B73022;\n");
      out.write("                                            font-size: large;\n");
      out.write("                                            color: white;\n");
      out.write("                                            font-weight: bold;\">Current Risk Factors</td>\n");
      out.write("                                        <td style=\"border-right-style: ridge;border-right-color: #CE522C;background-color: #B73022;\n");
      out.write("                                            font-size: large;\n");
      out.write("                                            color: white;\n");
      out.write("                                            font-weight: bold;\">Goal Risk Factors</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr style=\"border-bottom-color: #CE522C;  border-bottom-style: inset;\">\n");
      out.write("                                        <td style=\"border-right-style: ridge;border-right-color: #CE522C;background-color: #B73022;\n");
      out.write("                                            font-size: large;\n");
      out.write("                                            color: white;\n");
      out.write("                                            font-weight: bold; padding: 16px;\">Total Cholesterol(mg/dL)</td>\n");
      out.write("                                        <td style=\"border-right-style: ridge;border-right-color: #CE522C;    background-color: rgb(245, 245, 245);\n");
      out.write("                                            font-size: x-large;\n");
      out.write("                                            color: #B73022;\n");
      out.write("                                            font-weight: bold;padding: 16px;\">\n");
      out.write("                                            ");

                                                for (PatientfactorAnswer opp : anslist) {
                                                    if (opp.getFactorId().equals(new FactorDetails(3))) {
                                            
      out.print(opp.getFactorOptionId().getFactorOption());

                                                            }
                                                        }
                                            
      out.write(" \n");
      out.write("                                        </td>\n");
      out.write("                                        <td style=\"border-right-style: ridge;border-right-color: #CE522C;    background-color: rgb(245, 245, 245);\n");
      out.write("                                            font-size: x-large;\n");
      out.write("                                            color: #B73022;\n");
      out.write("                                            font-weight: bold; padding: 16px;\"><160(Goal)</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td style=\"border-right-style: ridge;border-right-color: #CE522C;background-color: #B73022;\n");
      out.write("                                            font-size: large;\n");
      out.write("                                            color: white;\n");
      out.write("                                            font-weight: bold; padding: 16px;\">HDL (good) Cholesterol(mg/dL)</td>\n");
      out.write("                                        <td style=\"border-right-style: ridge;border-right-color: #CE522C;background-color: rgb(245, 245, 245);\n");
      out.write("                                            font-size: x-large;\n");
      out.write("                                            color: #B73022;\n");
      out.write("                                            font-weight: bold;\"> \n");
      out.write("                                            ");

                                                for (PatientfactorAnswer opp : anslist) {
                                                    if (opp.getFactorId().equals(new FactorDetails(4))) {
                                            
      out.print(opp.getFactorOptionId().getFactorOption());

                                                            }
                                                        }
                                            
      out.write(" \n");
      out.write("                                        </td>\n");
      out.write("                                        <td style=\"border-right-style: ridge;border-right-color: #CE522C;background-color: rgb(245, 245, 245);\n");
      out.write("                                            font-size: x-large;\n");
      out.write("                                            color: #B73022;\n");
      out.write("                                            font-weight: bold; padding: 16px;\">50</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"tab-pane fade \" id=\"monitor\">\n");
      out.write("                                <table style=\"border-style: inset; border-color: #CE522C;width: 100%;\">\n");
      out.write("                                    <tr style=\"border-bottom-color: #CE522C; border-bottom-style: inset;\">\n");
      out.write("                                        <td style=\"border-right-style: ridge;border-right-color: #CE522C;width: 25%;background-color:#B73022;\"></td>\n");
      out.write("                                        <td style=\"border-right-style: ridge;border-right-color: #CE522C;background-color: #B73022;\n");
      out.write("                                            font-size: large;\n");
      out.write("                                            color: white;\n");
      out.write("                                            font-weight: bold;\">Current Risk Factors</td>\n");
      out.write("                                        <td style=\"border-right-style: ridge;border-right-color: #CE522C;background-color: #B73022;\n");
      out.write("                                            font-size: large;\n");
      out.write("                                            color: white;\n");
      out.write("                                            font-weight: bold;\">Changed Risk Factors</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td style=\"border-right-style: ridge;border-right-color: #CE522C;background-color: #B73022;\n");
      out.write("                                            font-size: large;\n");
      out.write("                                            color: white;\n");
      out.write("                                            font-weight: bold;padding: 16px;\">Blood Pressure (Systolic)(mm Hg)</td>\n");
      out.write("                                        <td style=\"border-right-style: ridge;border-right-color: #CE522C;background-color: rgb(245, 245, 245);\n");
      out.write("                                            font-size: x-large;\n");
      out.write("                                            color: #B73022;\n");
      out.write("                                            font-weight: bold; padding: 16px;\">\n");
      out.write("                                            ");

                                                for (PatientfactorAnswer opp : anslist) {
                                                    if (opp.getFactorId().equals(new FactorDetails(5))) {
                                            
      out.print(opp.getFactorOptionId().getFactorOption());

                                                            }
                                                        }
                                            
      out.write(" \n");
      out.write("                                        </td>\n");
      out.write("                                        <td style=\"border-right-style: ridge;border-right-color: #CE522C;background-color: rgb(245, 245, 245);\n");
      out.write("                                            font-size: x-large;\n");
      out.write("                                            color: #B73022;\n");
      out.write("                                            font-weight: bold; padding: 16px;\">140 to 159</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"tab-pane fade \" id=\"clean\">\n");
      out.write("                                <table style=\"border-style: inset; border-color: #CE522C;width: 100%;\">\n");
      out.write("                                    <tr style=\"border-bottom-color: #CE522C; border-bottom-style: inset;\">\n");
      out.write("                                        <td style=\"border-right-style: ridge;border-right-color: #CE522C;width: 25%;background-color:#B73022;\"></td>\n");
      out.write("                                        <td style=\"border-right-style: ridge;border-right-color: #CE522C;background-color: #B73022;\n");
      out.write("                                            font-size: large;\n");
      out.write("                                            color: white;\n");
      out.write("                                            font-weight: bold;\">Current Risk Factors</td>\n");
      out.write("                                        <td style=\"border-right-style: ridge;border-right-color: #CE522C;background-color: #B73022;\n");
      out.write("                                            font-size: large;\n");
      out.write("                                            color: white;\n");
      out.write("                                            font-weight: bold;\">Changed Risk Factors</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td style=\"border-right-style: ridge;border-right-color: #CE522C;background-color: #B73022;\n");
      out.write("                                            font-size: large;\n");
      out.write("                                            color: white;\n");
      out.write("                                            font-weight: bold; padding: 16px;\">Do you Smoke?</td>\n");
      out.write("                                        <td style=\"border-right-style: ridge;border-right-color: #CE522C;background-color: rgb(245, 245, 245);\n");
      out.write("                                            font-size: x-large;\n");
      out.write("                                            color: #B73022;\n");
      out.write("                                            font-weight: bold; padding: 16px;\">\n");
      out.write("                                            ");

                                                for (PatientfactorAnswer opp : anslist) {
                                                    if (opp.getFactorId().equals(new FactorDetails(8))) {
                                            
      out.print(opp.getFactorOptionId().getFactorOption());

                                                                }
                                                            }
                                            
      out.write("    \n");
      out.write("\n");
      out.write("                                        </td>\n");
      out.write("                                        <td style=\"border-right-style: ridge;border-right-color: #CE522C;background-color: rgb(245, 245, 245);\n");
      out.write("                                            font-size: x-large;\n");
      out.write("                                            color: #B73022;\n");
      out.write("                                            font-weight: bold; padding: 16px;\">No</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                        <div class=\"tab-pane fade \" id=\"clean\">\n");
      out.write("                                <table style=\"border-style: inset; border-color: #CE522C;width: 100%;\">\n");
      out.write("                                    <tr style=\"border-bottom-color: #CE522C; border-bottom-style: inset;\">\n");
      out.write("                                        <td style=\"border-right-style: ridge;border-right-color: #CE522C;width: 25%;background-color:#B73022;\"></td>\n");
      out.write("                                        <td style=\"border-right-style: ridge;border-right-color: #CE522C;background-color: #B73022;\n");
      out.write("                                            font-size: large;\n");
      out.write("                                            color: white;\n");
      out.write("                                            font-weight: bold;\">Current Risk Factors</td>\n");
      out.write("                                        <td style=\"border-right-style: ridge;border-right-color: #CE522C;background-color: #B73022;\n");
      out.write("                                            font-size: large;\n");
      out.write("                                            color: white;\n");
      out.write("                                            font-weight: bold;\">Changed Risk Factors</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td style=\"border-right-style: ridge;border-right-color: #CE522C;background-color: #B73022;\n");
      out.write("                                            font-size: large;\n");
      out.write("                                            color: white;\n");
      out.write("                                            font-weight: bold; padding: 16px;\">Do you Smoke?</td>\n");
      out.write("                                        <td style=\"border-right-style: ridge;border-right-color: #CE522C;background-color: rgb(245, 245, 245);\n");
      out.write("                                            font-size: x-large;\n");
      out.write("                                            color: #B73022;\n");
      out.write("                                            font-weight: bold; padding: 16px;\">\n");
      out.write("                                            ");

                                                for (PatientfactorAnswer opp : anslist) {
                                                    if (opp.getFactorId().equals(new FactorDetails(11))) {
                                            
      out.print(opp.getFactorOptionId().getFactorOption());

                                                                }
                                                            }
                                            
      out.write("    \n");
      out.write("\n");
      out.write("                                        </td>\n");
      out.write("                                        <td style=\"border-right-style: ridge;border-right-color: #CE522C;background-color: rgb(245, 245, 245);\n");
      out.write("                                            font-size: x-large;\n");
      out.write("                                            color: #B73022;\n");
      out.write("                                            font-weight: bold; padding: 16px;\">Normal</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <h3 style=\"border-bottom-style: ridge;\"></h3>\n");
      out.write("            </section>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!----------------End modifiable factors-------------->\n");
      out.write("        <!---------------Start suggest test section--------->\n");
      out.write("        <section>\n");
      out.write("            <h3 style=\"color:#CE522C;font-weight: bold;margin-left: 552px; \">Metabolic Syndrome</h3>\n");
      out.write("            <div class=\"line\" style=\"margin-left: 615px;\"></div>\n");
      out.write("            <div>\n");
      out.write("                <div style=\"width: 50%; margin-left: 30px;border: solid;border-color: #CE522C;border-radius: 35px;\">\n");
      out.write("                    <table class=\"table table-hover\">\n");
      out.write("                        <thead style=\"font-size: large;color: #CE522C;\">\n");
      out.write("                            <tr style=\"border-bottom-style: solid;border-bottom-color: #CE522C;\">\n");
      out.write("                                <th><div class=\"checkbox\">\n");
      out.write("                            <label>\n");
      out.write("                                <input type=\"checkbox\" value=\"\"\n");
      out.write("                                       ");

                                           for (PatientfactorAnswer opp : anslist) {
                                               if (opp.getFactorId().equals(new FactorDetails(10))) {
                                                   if (opp.getFactorOptionId().getFactorOption().equals("Yes")) {
                                       
      out.write("checked");

                                                                    }
                                                                }
                                                            }
                                       
      out.write("\n");
      out.write("                                       disabled=\"\">\n");
      out.write("                            </label>\n");
      out.write("                        </div></th>\n");
      out.write("                        <th style=\"border-right-style: solid;\">Abdominal Obesity</th>\n");
      out.write("                        <th>Waist Circumference of 40\" or more </th>   \n");
      out.write("                        </tr>\n");
      out.write("                        </thead>\n");
      out.write("\n");
      out.write("                        <thead style=\"font-size: large;color: #CE522C;\">\n");
      out.write("                            <tr style=\"border-bottom-style: solid;border-bottom-color: #CE522C;\">\n");
      out.write("                                <th><div class=\"checkbox\">\n");
      out.write("                            <label>\n");
      out.write("                                <input type=\"checkbox\" value=\"\"\n");
      out.write("                                       ");

                                           for (PatientfactorAnswer opp : anslist) {
                                               if (opp.getFactorId().equals(new FactorDetails(5))) {
                                                   if (opp.getFactorOptionId().getFactorOption().equals(">160")) {
                                       
      out.write("checked");

                                                                    }
                                                                }
                                                            }
                                       
      out.write("\n");
      out.write("                                       disabled=\"\">\n");
      out.write("                            </label>\n");
      out.write("                        </div></th>\n");
      out.write("                        <th style=\"border-right-style: solid;\">High Blood Pressure</th>\n");
      out.write("                        <th>130/85 mm/Hg or higher </th>   \n");
      out.write("                        </tr>\n");
      out.write("                        </thead>\n");
      out.write("\n");
      out.write("                        <thead style=\"font-size: large;color: #CE522C;\">\n");
      out.write("                            <tr style=\"border-bottom-style: solid;border-bottom-color: #CE522C;\">\n");
      out.write("                                <th><div class=\"checkbox\">\n");
      out.write("                            <label>\n");
      out.write("                                <input type=\"checkbox\" value=\"\"\n");
      out.write("                                       ");

                                           for (PatientfactorAnswer opp : anslist) {
                                               if (opp.getFactorId().equals(new FactorDetails(9))) {
                                                   if (opp.getFactorOptionId().getFactorOption().equals("Yes")) {
                                       
      out.write("checked");

                                                                    }
                                                                }
                                                            }
                                       
      out.write("\n");
      out.write("                                       disabled=\"\">\n");
      out.write("                            </label>\n");
      out.write("                        </div></th>\n");
      out.write("                        <th style=\"border-right-style: solid;\">High Blood Triglycerides</th>\n");
      out.write("                        <th>150 mg/dL or higher </th>   \n");
      out.write("                        </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <thead style=\"font-size: large;color: #CE522C;\">\n");
      out.write("                            <tr style=\"border-bottom-style: solid;border-bottom-color: #CE522C;\">\n");
      out.write("                                <th><div class=\"checkbox\">\n");
      out.write("                            <label>\n");
      out.write("                                <input type=\"checkbox\" value=\"\"\n");
      out.write("                                       ");

                                           for (PatientfactorAnswer opp : anslist) {
                                               if (opp.getFactorId().equals(new FactorDetails(4))) {
                                                   if (opp.getFactorOptionId().getFactorOption().equals("<35") || opp.getFactorOptionId().getFactorOption().equals("35-44")) {
                                       
      out.write("checked");

                                                                    }
                                                                }
                                                            }
                                       
      out.write("\n");
      out.write("                                       disabled=\"\">\n");
      out.write("                            </label>\n");
      out.write("                        </div></th>\n");
      out.write("                        <th style=\"border-right-style: solid;\">Low HDL (good Cholesterol)</th>\n");
      out.write("                        <th>Less than 40 mg/dL </th>   \n");
      out.write("                        </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <thead style=\"font-size: large;color: #CE522C;\">\n");
      out.write("                            <tr style=\"border-bottom-style: solid;border-bottom-color: #CE522C;\">\n");
      out.write("                                <th><div class=\"checkbox\">\n");
      out.write("                            <label>\n");
      out.write("                                <input type=\"checkbox\" value=\"\"\n");
      out.write("                                       ");

                                           for (PatientfactorAnswer opp : anslist) {
                                               if (opp.getFactorId().equals(new FactorDetails(7))) {
                                                   if (opp.getFactorOptionId().getFactorOption().equals("Yes")) {
                                       
      out.write("checked");

                                                                    }
                                                                }
                                                            }
                                       
      out.write("\n");
      out.write("                                       disabled=\"\">\n");
      out.write("                            </label>\n");
      out.write("                        </div></th>\n");
      out.write("                        <th style=\"border-right-style: solid;\">High Blood Sugar</th>\n");
      out.write("                        <th>Fasting glucose of 100mg/dL or higher </th>   \n");
      out.write("                        </tr>\n");
      out.write("                        </thead>\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"width:10%;\">\n");
      out.write("                    <img src=\"images/rarrow.png\" style=\"margin-left: 705px;\n");
      out.write("                         margin-top: -470px;\">\n");
      out.write("                </div>\n");
      out.write("                <div style=\"width:25%; border: solid;border-color:#CE522C;border-radius: 35px;margin-left: 935px;margin-top: -320px; \">\n");
      out.write("                    <ul>\n");
      out.write("                        <li style=\"padding: 12px; font-size: large; font-weight: bold;color:#CE522C; padding-left: 80px; font-size: x-large; margin-left: -46px; border-bottom-style: solid;\"><i class=\"\"></i>Recommended Tests</li>\n");
      out.write("                            ");
 if (request.getAttribute("testlist") != null) {
                                    ArrayList<TestRecommend> tlist = (ArrayList<TestRecommend>) request.getAttribute("testlist");
                                    for (TestRecommend tr : tlist) {
                            
      out.write("\n");
      out.write("                        <li style=\"padding: 12px; font-size: large; font-weight: bold;color:#CE522C; padding-left: 80px; \"><i class=\"fa fa-check\"></i>");
      out.print(tr.getTId().getTestName());
      out.write(" </li>\n");
      out.write("                            ");
 }
                        } else { 
      out.write("\n");
      out.write("                        <li style=\"padding: 12px; font-size: large; font-weight: bold;color:#CE522C; padding-left: 80px;\"><i class=\"fa fa-check\"></i>No test recommended.!</li>\n");
      out.write("                            ");
 } 
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            ");
 } else { 
      out.write(" Please take your test..!  ");
}
      out.write("\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("        <!---------------End sgggest test Section---------->\n");
      out.write("\n");
      out.write("        <!--=========== Start Footer SECTION ================-->\n");
      out.write("        <footer id=\"footer\" style=\"padding-top: 170px;\">\n");
      out.write("            <!-- Start Footer Top -->\n");
      out.write("            <div class=\"footer-top\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-3 col-md-3 col-sm-3\">\n");
      out.write("                            <div class=\"single-footer-widget\">\n");
      out.write("                                <div class=\"section-heading\">\n");
      out.write("                                    <h2>About Us</h2>\n");
      out.write("                                    <div class=\"line\"></div>\n");
      out.write("                                </div>           \n");
      out.write("                                <p> 'Cardiac Countermeasure' is a link between the Artificial Intelligence Cardiac System and the needy patient. It provides the person with a detailed list of Factors and functions related to heart-attack and after the user provides the correct information then System will generate the chances of the person of having heart-attack. Not only that after the system based report is generated it also provides the further asylum to the user for consulting laboratory as well as cardiologist.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-5 col-md-5 col-sm-5\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-3 col-md-3 col-sm-3\">\n");
      out.write("                            <div class=\"single-footer-widget\">\n");
      out.write("                                <div class=\"col-lg-3 col-md-3 col-sm-3\">\n");
      out.write("                                    <div class=\"single-footer-widget\">\n");
      out.write("                                        <div class=\"section-heading\">\n");
      out.write("                                            <h2>Contact Info</h2>\n");
      out.write("                                            <div class=\"line\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <p>Feel free to contact us at any time for suggestions or complaints</p>\n");
      out.write("                                        <address class=\"contact-info\">\n");
      out.write("                                            <p><span class=\"fa fa-home\"></span>305 Satyam mall,\n");
      out.write("                                                jodhpur,Ahmedabad</p>\n");
      out.write("                                            <p><span class=\"fa fa-phone\"></span>+919974911232</p>\n");
      out.write("                                            <p><span class=\"fa fa-envelope\"></span>info@Cardiaccountermeasure.com</p>\n");
      out.write("                                        </address>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Start Footer Middle -->\n");
      out.write("                    <div class=\"footer-middle\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                                    <div class=\"footer-copyright\">\n");
      out.write("                                        <p>&copy; Copyright 2015 <a href=\"index.html\">R&J</a></p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                                    <div class=\"footer-social\">              \n");
      out.write("                                        <a href=\"#\"><span class=\"fa fa-facebook\"></span></a>\n");
      out.write("                                        <a href=\"#\"><span class=\"fa fa-twitter\"></span></a>\n");
      out.write("                                        <a href=\"#\"><span class=\"fa fa-google-plus\"></span></a>\n");
      out.write("                                        <a href=\"#\"><span class=\"fa fa-linkedin\"></span></a>     \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Start Footer Bottom -->\n");
      out.write("                    <div class=\"footer-bottom\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <p>Design & Developed By <a rel=\"nofollow\" href=\"https://www.facebook.com/rishabh.shah.18\"> R&J</a></p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    </footer>\n");
      out.write("                    <!--=========== End Footer SECTION ================-->\n");
      out.write("\n");
      out.write("                    <!-- jQuery Library  -->\n");
      out.write("                    <script src=\"js/jquery.js\"></script>    \n");
      out.write("                    <!-- Bootstrap default js -->\n");
      out.write("                    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("                    <!-- slick slider -->\n");
      out.write("                    <script src=\"js/slick.min.js\"></script>    \n");
      out.write("                    <script type=\"text/javascript\" src=\"js/modernizr.custom.79639.js\"></script>   \n");
      out.write("                    <!-- counter -->\n");
      out.write("                    <script src=\"js/waypoints.min.js\"></script>\n");
      out.write("                    <script src=\"js/jquery.counterup.min.js\"></script>\n");
      out.write("                    <!-- Doctors hover effect -->\n");
      out.write("                    <script src=\"js/snap.svg-min.js\"></script>\n");
      out.write("                    <script src=\"js/hovers.js\"></script>\n");
      out.write("                    <!-- Photo Swipe Gallery Slider -->\n");
      out.write("                    <script src='js/photoswipe.min.js'></script>\n");
      out.write("                    <script src='js/photoswipe-ui-default.min.js'></script>    \n");
      out.write("                    <script src=\"js/photoswipe-gallery.js\"></script>\n");
      out.write("\n");
      out.write("                    <!-- Custom JS -->\n");
      out.write("                    <script src=\"js/custom.js\"></script>\n");
      out.write("\n");
      out.write("                    </body>\n");
      out.write("                    </html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
