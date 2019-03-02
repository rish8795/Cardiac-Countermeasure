package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005fview_005ftotallab_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <!-- Basic Page Needs\n");
      out.write("        ================================================== -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>Cardiac Countermeasure:Laboratory Appointment</title>\n");
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
      out.write("        <link id=\"switcher\" href=\"css/themes/default-theme.css\" rel=\"stylesheet\">    \n");
      out.write("        <!-- Slick slider css file -->\n");
      out.write("        <link href=\"css/slick.css\" rel=\"stylesheet\"> \n");
      out.write("\n");
      out.write("        <!-- Main structure css file -->\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Google fonts -->\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>  \n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Habibi' rel='stylesheet' type='text/css'>   \n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Cinzel+Decorative:900' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <style>        </style>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function getsearchdoctor(sid)\n");
      out.write("            \n");
      out.write("            {\n");
      out.write("//                alert(sid);\n");
      out.write("//                var sid = document.getElementById(\"sort\").value;\n");
      out.write("                var url = \"get_lab_admin?search=\" + sid;\n");
      out.write("                var xmlReq = new XMLHttpRequest();\n");
      out.write("                xmlReq.open(\"get\", url, true);\n");
      out.write("                xmlReq.send();\n");
      out.write("                xmlReq.onreadystatechange = function()\n");
      out.write("                {\n");
      out.write("                    if (xmlReq.status == 200)\n");
      out.write("                    {\n");
      out.write("                        document.getElementById(\"doclist\").innerHTML = xmlReq.responseText;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                //alert(sid);\n");
      out.write("            }\n");
      out.write("            function getsortdoctor(sid)\n");
      out.write("            {\n");
      out.write("\n");
      out.write("//                var sid = document.getElementById(\"sort\").value;\n");
      out.write("                var url = \"get_lab_admin?sort=\" + sid;\n");
      out.write("                var xmlReq = new XMLHttpRequest();\n");
      out.write("                xmlReq.open(\"get\", url, true);\n");
      out.write("                xmlReq.send();\n");
      out.write("                xmlReq.onreadystatechange = function()\n");
      out.write("                {\n");
      out.write("                    if (xmlReq.status == 200)\n");
      out.write("                    {\n");
      out.write("                        document.getElementById(\"doclist\").innerHTML = xmlReq.responseText;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                //alert(sid);\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/respond\n");
      out.write("        /1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]--> \n");
      out.write("    </head>\n");
      out.write("    <body onload=\"getsortdoctor(1);\">    \n");
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
      out.write("        <header id=\"header\">\n");
      out.write("            <!-- BEGIN MENU -->\n");
      out.write("            <div class=\"menu_area\">\n");
      out.write("                <nav class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\">  \n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"navbar-header\">\n");
      out.write("                            <!-- FOR MOBILE VIEW COLLAPSED BUTTON -->\n");
      out.write("                            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("                                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                            </button>\n");
      out.write("                            <!-- LOGO -->              \n");
      out.write("                            <!-- TEXT BASED LOGO -->\n");
      out.write("                            <a class=\"navbar-brand\" href=\"Labhomepage.jsp\"><i class=\"fa fa-heartbeat\"></i><span style=\"font-family: cursive\">CARDIAC COUNTERMEASURE</span></a>              \n");
      out.write("                            <!-- IMG BASED LOGO  -->\n");
      out.write("                            <!--  <a class=\"navbar-brand\" href=\"index.html\"><img src=\"images/logo.png\" alt=\"logo\"></a>   -->                    \n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("                            <ul id=\"top-menu\" class=\"nav navbar-nav navbar-right main-nav\">\n");
      out.write("                               <li class=\"active\"><a href=\"patienthomepage.jsp\">Home</a></li>\n");
      out.write("                \n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                  <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Services <span class=\"fa fa-angle-down\"></span></a>\n");
      out.write("                  <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                      <li><a href=\"patient_heart_attack_services.jsp\">Heart-attack detection</a></li>\n");
      out.write("                      <li><a href=\"consult_cardiac.jsp\">Consult Cardiac</a></li>\n");
      out.write("                      <li><a href=\"consult_lab.jsp\">Consult Laboratory</a></li>\n");
      out.write("                      <li><a href=\"patient_view_docappointment\">View Doctor Appointment</a></li>\n");
      out.write("                      <li><a href=\"patient_view_labappointment\">View Laboratory Appointment</a></li>\n");
      out.write("                  </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"Blogs.jsp\">Blog</a></li>\n");
      out.write("                <li><a href=\"features.html\">FAQs</a></li>\n");
      out.write("                <li><a href=\"ContactUs.jsp\">Contact Us</a></li>\n");
      out.write("                <li><a href=\"myprofile\">My Profile</a></li>\n");
      out.write("                <li><a href=\"logoutserv\">LogOut</a></li>\n");
      out.write("                            </ul>           \n");
      out.write("                        </div><!--/.nav-collapse -->\n");
      out.write("                    </div>     \n");
      out.write("                </nav>  \n");
      out.write("            </div>\n");
      out.write("            <!-- END MENU -->    \n");
      out.write("        </header>\n");
      out.write("        <!--=========== END HEADER SECTION ================-->\n");
      out.write("\n");
      out.write("        <!--=========== START BLOG SECTION ================-->       \n");
      out.write("        <section id=\"blogArchive\">      \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12 col-md-12\">\n");
      out.write("                    <div class=\"blog-breadcrumbs-area\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"patient_profile\">\n");
      out.write("                                <h2>Consult Laboratory</h2>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-12 col-md-12\">\n");
      out.write("                    <!--<div class=\"blog-breadcrumbs-area\">-->\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-12 col-md-8\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div style=\"margin-top: 1px;width: 100%\">\n");
      out.write("                                <img src=\"images/images/search1.png\" style=\"padding: 8px;\" />\n");
      out.write("                                <!--<label for=\"author\"></label>-->\n");
      out.write("                                <input type=\"text\" size=\"30\" onkeyup=\"getsearchdoctor(this.value);\" style=\"width: 20%;\" class=\"wp-form-control wpcf7-text\" value=\"\" name=\"author\" >\n");
      out.write("                            </div> \n");
      out.write("                            <div style=\"margin-top: 1px; width: 100%; margin-top: -43px;margin-left: 730px;\n");
      out.write("                                 \">\n");
      out.write("                                <img src=\"images/images/filter2.jpg\" style=\"padding: 8px;\">  \n");
      out.write("                                <select id=\"sort\" onchange=\"getsortdoctor(this.value);\" name=\"c_filter\" style=\"width: 20%; margin-left: 225px;\" class=\"wp-form-control wpcf7-text\">\n");
      out.write("                                    <option value=\"1\">A to Z</option>\n");
      out.write("                                    <option value=\"2\">Z to A</option>\n");
      out.write("                                </select>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <p style=\"color: green;text-align: center;\">");
 if (request.getAttribute("msg") != null) {
      out.write("\n");
      out.write("                        ");
      out.print(request.getAttribute("msg"));
      out.write("\n");
      out.write("                        ");
}
      out.write("</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-12 col-md-12\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("\n");
      out.write("                        <ul id=\"doclist\" style=\"margin-left: 267px;width: 60%;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                        <!-- Start Social Share-->\n");
      out.write("                                                                              \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>                          \n");
      out.write("            </div>                     \n");
      out.write("        </div>\n");
      out.write("    </div>                    \n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</section>\n");
      out.write("<!--=========== END BLOG SECTION ================-->\n");
      out.write("\n");
      out.write("<footer id=\"footer\">\n");
      out.write("    <!-- Start Footer Top -->\n");
      out.write("    <div class=\"footer-top\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-3 col-md-3 col-sm-3\">\n");
      out.write("                    <div class=\"single-footer-widget\">\n");
      out.write("                        <div class=\"section-heading\">\n");
      out.write("                            <h2>About Us</h2>\n");
      out.write("                            <div class=\"line\"></div>\n");
      out.write("                        </div>           \n");
      out.write("                        <p> 'Cardiac Countermeasure' is a link between the Artificial Intelligence Cardiac System and the needy patient. It provides the person with a detailed list of Factors and functions related to heart-attack and after the user provides the correct information then System will generate the chances of the person of having heart-attack. Not only that after the system based report is generated it also provides the further asylum to the user for consulting laboratory as well as cardiologist.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-5 col-md-5 col-sm-5\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-3 col-sm-3\">\n");
      out.write("                    <div class=\"single-footer-widget\">\n");
      out.write("                        <div class=\"col-lg-3 col-md-3 col-sm-3\">\n");
      out.write("                            <div class=\"single-footer-widget\">\n");
      out.write("                                <div class=\"section-heading\">\n");
      out.write("                                    <h2>Contact Info</h2>\n");
      out.write("                                    <div class=\"line\"></div>\n");
      out.write("                                </div>\n");
      out.write("                                <p>Feel free to contact us at any time for suggestions or complaints</p>\n");
      out.write("                                <address class=\"contact-info\">\n");
      out.write("                                    <p><span class=\"fa fa-home\"></span>305 Satyam mall,\n");
      out.write("                                        jodhpur,Ahmedabad</p>\n");
      out.write("                                    <p><span class=\"fa fa-phone\"></span>+919974911232</p>\n");
      out.write("                                    <p><span class=\"fa fa-envelope\"></span>info@Cardiaccountermeasure.com</p>\n");
      out.write("                                </address>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Start Footer Middle -->\n");
      out.write("            <div class=\"footer-middle\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                            <div class=\"footer-copyright\">\n");
      out.write("                                <p>&copy; Copyright 2015 <a href=\"index.html\">R&J</a></p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                            <div class=\"footer-social\">              \n");
      out.write("                                <a href=\"#\"><span class=\"fa fa-facebook\"></span></a>\n");
      out.write("                                <a href=\"#\"><span class=\"fa fa-twitter\"></span></a>\n");
      out.write("                                <a href=\"#\"><span class=\"fa fa-google-plus\"></span></a>\n");
      out.write("                                <a href=\"#\"><span class=\"fa fa-linkedin\"></span></a>     \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Start Footer Bottom -->\n");
      out.write("            <div class=\"footer-bottom\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <p>Design & Developed By <a rel=\"nofollow\" href=\"https://www.facebook.com/rishabh.shah.18\"> R&J</a></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            </footer>\n");
      out.write("            <!--=========== End Footer SECTION ================-->\n");
      out.write("\n");
      out.write("            <!-- jQuery Library  -->\n");
      out.write("            <script src=\"js/jquery.js\"></script>    \n");
      out.write("            <!-- Bootstrap default js -->\n");
      out.write("            <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("            <!-- slick slider -->\n");
      out.write("            <script src=\"js/slick.min.js\"></script>    \n");
      out.write("            <script type=\"text/javascript\" src=\"js/modernizr.custom.79639.js\"></script>   \n");
      out.write("            <!-- counter -->\n");
      out.write("            <script src=\"js/waypoints.min.js\"></script>\n");
      out.write("            <script src=\"js/jquery.counterup.min.js\"></script>\n");
      out.write("            <!-- Doctors hover effect -->\n");
      out.write("            <script src=\"js/snap.svg-min.js\"></script>\n");
      out.write("            <script src=\"js/hovers.js\"></script>\n");
      out.write("\n");
      out.write("            <!-- Custom JS -->\n");
      out.write("            <script src=\"js/custom.js\"></script>\n");
      out.write("\n");
      out.write("            </body>\n");
      out.write("            </html>");
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
