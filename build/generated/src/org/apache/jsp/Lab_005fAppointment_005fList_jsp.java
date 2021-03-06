package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Labtest;
import model.PatienttestDetail;
import model.LabAppointment;
import java.util.ArrayList;

public final class Lab_005fAppointment_005fList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("   \n");
      out.write("    <!-- Basic Page Needs\n");
      out.write("    ================================================== -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("     <title>Cardiac Countermeasure:Laboratory Appointment</title>\n");
      out.write("\n");
      out.write("    <!-- Mobile Specific Metas\n");
      out.write("    ================================================== -->\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("    <!-- Favicon -->\n");
      out.write("    <link rel=\"shortcut icon\" type=\"image/icon\" href=\"images/favicon.ico\"/>\n");
      out.write("\n");
      out.write("    <!-- CSS\n");
      out.write("    ================================================== -->       \n");
      out.write("    <!-- Bootstrap css file-->\n");
      out.write("    <link href=\"css/bootstrap.min.jui.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Font awesome css file-->\n");
      out.write("    <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">       \n");
      out.write("    <!-- Default Theme css file -->\n");
      out.write("    <link id=\"switcher\" href=\"css/themes/default-theme.css\" rel=\"stylesheet\">    \n");
      out.write("    <!-- Slick slider css file -->\n");
      out.write("    <link href=\"css/slick.css\" rel=\"stylesheet\"> \n");
      out.write("\n");
      out.write("    <!-- Main structure css file -->\n");
      out.write("    <link href=\"style_jui.css\" rel=\"stylesheet\">\n");
      out.write("   \n");
      out.write("    <!-- Google fonts -->\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>  \n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Habibi' rel='stylesheet' type='text/css'>   \n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Cinzel+Decorative:900' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond\n");
      out.write("    /1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]--> \n");
      out.write("  </head>\n");
      out.write("  <body>    \n");
      out.write("    <!-- BEGAIN PRELOADER -->\n");
      out.write("    <div id=\"preloader\">\n");
      out.write("      <div id=\"status\">&nbsp;</div>\n");
      out.write("    </div>\n");
      out.write("    <!-- END PRELOADER -->\n");
      out.write("\n");
      out.write("    <!-- SCROLL TOP BUTTON -->\n");
      out.write("    <a class=\"scrollToTop\" href=\"#\"><i class=\"fa fa-heartbeat\"></i></a>\n");
      out.write("    <!-- END SCROLL TOP BUTTON -->\n");
      out.write("\n");
      out.write("    <!--=========== BEGIN HEADER SECTION ================-->\n");
      out.write("   <header id=\"header\">\n");
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
      out.write("              <a class=\"navbar-brand\" href=\"Labhomepage.jsp\"><i class=\"fa fa-heartbeat\"></i><span style=\"font-family: cursive\">CARDIAC COUNTERMEASURE</span></a>              \n");
      out.write("              <!-- IMG BASED LOGO  -->\n");
      out.write("              <!--  <a class=\"navbar-brand\" href=\"index.html\"><img src=\"images/logo.png\" alt=\"logo\"></a>   -->                    \n");
      out.write("            </div>\n");
      out.write("            <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("              <ul id=\"top-menu\" class=\"nav navbar-nav navbar-right main-nav\">\n");
      out.write("                  <li class=\"active\"><a href=\"Labhomepage.jsp\">Home</a></li>\n");
      out.write("                \n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                  <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Services <span class=\"fa fa-angle-down\"></span></a>\n");
      out.write("                  <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                    <li><a href=\"medical-counseling.html\">List of Appointment</a></li>\n");
      out.write("                    <li><a href=\"medical-research.html\">Approved Appointment</a></li>\n");
      out.write("                    <li><a href=\"medical-research.html\">Test List</a></li>\n");
      out.write("                     <li><a href=\"medical-research.html\">Upload Report</a></li>\n");
      out.write("                 </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                  <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Blogs <span class=\"fa fa-angle-down\"></span></a>\n");
      out.write("                  <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                    <li><a href=\"blog-archive.html\">View Blogs</a></li>\n");
      out.write("                    <li><a href=\"blog-archive-with-left-sidebar.html\">Write Blog</a></li>\n");
      out.write("                    <li><a href=\"blog-archive-with-right-sidebar.html\">Blog Archive with Right Sidebar</a></li>\n");
      out.write("                    <li><a href=\"blog-single.html\">Blog Single</a></li>\n");
      out.write("                    <li><a href=\"blog-single-with-left-sidebar.html\">Blog Single with Left Sidebar</a></li>\n");
      out.write("                    <li><a href=\"blog-single-with-right-sidebar.html\">Blog Single with Right Sidebar</a></li>           \n");
      out.write("                  </ul>\n");
      out.write("                </li>\n");
      out.write("                 \n");
      out.write("                <li><a href=\"features.html\">FAQs</a></li>\n");
      out.write("                <li><a href=\"contact.html\">Contact Us</a></li>\n");
      out.write("                <li><a href=\"features.html\">My Profile</a></li>\n");
      out.write("              </ul>           \n");
      out.write("            </div><!--/.nav-collapse -->\n");
      out.write("          </div>     \n");
      out.write("        </nav>  \n");
      out.write("      </div>\n");
      out.write("      <!-- END MENU -->    \n");
      out.write("    </header>\n");
      out.write("    <!--=========== END HEADER SECTION ================-->\n");
      out.write("    \n");
      out.write("    <!--=========== START BLOG SECTION ================-->       \n");
      out.write("    <section id=\"blogArchive\">      \n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-12 col-md-12\">\n");
      out.write("          <div class=\"blog-breadcrumbs-area\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("              <div class=\"blog-breadcrumbs-left\">\n");
      out.write("                <h2>Appointment List</h2>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"blog-breadcrumbs-right\">\n");
      out.write("                <ol class=\"breadcrumb\">\n");
      out.write("                  <li>You are here</li>\n");
      out.write("                  <li><a href=\"Labhomepage.jsp\">Home</a></li>                  \n");
      out.write("                  <li class=\"active\">Appointment List</li>\n");
      out.write("                </ol>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>        \n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("                        <!-- Start sidebar widget -->\n");
      out.write("                   \n");
      out.write("                              <h3></h3><span style=\"color: green;\">\n");
      out.write("                                ");
 if (request.getAttribute("msg") != null) {
      out.write("\n");
      out.write("                                 ");
      out.print(request.getAttribute("msg"));
      out.write("\n");
      out.write("                                 ");
 }
      out.write("\n");
      out.write("                             <table class=\"table table-hover\">\n");
      out.write("                                <thead>\n");
      out.write("                                  <tr>\n");
      out.write("                                    <th>No</th>\n");
      out.write("                                    <th>Patient's Name</th>\n");
      out.write("                                    <th>Ordered Tests</th>\n");
      out.write("                                    <th>View Patient's Profile</th>\n");
      out.write("                                    <th>Approve Appointment</th>\n");
      out.write("                                    <th>Reject Appointment</th>\n");
      out.write("                                    \n");
      out.write("                                  </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                    \n");
      out.write("                 ");
 if (request.getAttribute("la") != null) {
                            ArrayList<LabAppointment> la = (ArrayList<LabAppointment>) request.getAttribute("la");
                             ArrayList<ArrayList<PatienttestDetail>> testarray = (ArrayList<ArrayList<PatienttestDetail>>) request.getAttribute("ptest");
                            int loop = 1;
                            
                             for(int i = 0; i <la.size();  i++)
                             {

                                 ArrayList<PatienttestDetail> test1 = testarray.get(i);
                                    LabAppointment l =la.get(i);
                                   
                             
                             
                             for (LabAppointment dp1 : la) {
                    
      out.write(" \n");
      out.write("                                  <tr>\n");
      out.write("                                    <th scope=\"row\">");
      out.print(loop);
      out.write("</th>\n");
      out.write("                                    <td>");
      out.print(dp1.getPId().getPFirstname() + " " + dp1.getPId().getPLastname());
      out.write("</td>\n");
      out.write("                                    <td><ul class=\"footer-service\">\n");
      out.write("                                ");

                                double fees=0.0;
                                    for (PatienttestDetail ptd1 : testarray.get(i)) {
                                        Labtest ltt = ptd1.getLtId();
                                        fees= fees + ltt.getTestFees();
                                
      out.write("\n");
      out.write("                                <li><span class=\"fa fa-check\"></span> ");
      out.print(ltt.getTId().getTestName());
      out.write("</li>\n");
      out.write("                                 <!--<td>");
      out.print(fees );
      out.write("</td>-->\n");
      out.write("                                    ");
 }
      out.write("\n");
      out.write("                            </ul></td>\n");
      out.write("                                    \n");
      out.write("                                    <td> <a href=\"view_pat_profile_byLab?pid=");
      out.print( dp1.getPId().getPId());
      out.write("\" > View Profile</a></td>\n");
      out.write("                                    <td>\n");
      out.write("                            <form  action=\"lab_view_appointment\">\n");
      out.write("                                <input type=\"date\" name=\"apdate\" required placeholder=\"Date\" style=\"height: 30px;margin: 5px;\" />\n");
      out.write("                                <input type=\"time\" required name=\"aptime\" style=\"height: 30px;margin: 5px;\" placeholder=\"Time\" />\n");
      out.write("                                <input type=\"hidden\" name=\"appoid\" value=\"");
      out.print(dp1.getLaId());
      out.write("\" />\n");
      out.write("                                <input type=\"hidden\" name=\"status\" value=\"approve\"  />\n");
      out.write("                                <input type=\"submit\" value=\"APPROVE\" class=\"reply-btn\" style=\"float: none;background-color: rgb(60, 91, 41);\" />\n");
      out.write("                            </form>\n");
      out.write("                        </td>\n");
      out.write("                                    <td>\n");
      out.write("                            <form action=\"lab_view_appointment\" >\n");
      out.write("                                <!--<input type=\"date\" name=\"apdate\" placeholder=\"Date\" /><input type=\"time\" name=\"apdate\" placeholder=\"Time\" />-->\n");
      out.write("                                <input type=\"hidden\" name=\"appoid\" value=\"");
      out.print(dp1.getLaId());
      out.write("\" />\n");
      out.write("                                <input type=\"hidden\" name=\"status\" value=\"reject\" />\n");
      out.write("                                <input type=\"submit\" value=\"REJECT\" class=\"reply-btn\" style=\"background-color: #CE522C;\" />\n");
      out.write("                            </form>\n");
      out.write("                            <!--<a class=\"reply-btn\" href=\"viewapprovedappo?status=r&appoid=\" style=\"background-color: #CE522C;\"> Reject </a>-->\n");
      out.write("                        </td>\n");
      out.write("                                                                \n");
      out.write("                                  </tr>\n");
      out.write("                                  \n");
      out.write("                                   ");
 loop++;
                        } }
                    } else { 
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"5\"><h3 style=\"color: #FF9800\">No more appointment.!</h3></td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 }
      out.write("\n");
      out.write("\n");
      out.write("                                 \n");
      out.write("\n");
      out.write("                                   \n");
      out.write("                                </tbody>\n");
      out.write("                              </table>\n");
      out.write("\n");
      out.write("           \n");
      out.write("                              \n");
      out.write("                              \n");
      out.write("                              <!-- Start Social Share-->\n");
      out.write("                              <div class=\"social-share\">\n");
      out.write("                               <h3></h3>\n");
      out.write("                               <ul>\n");
      out.write("                                 <li><a href=\"#\"><span class=\"fa fa-facebook\"></span></a></li>\n");
      out.write("                                 <li><a href=\"#\"><span class=\"fa fa-twitter\"></span></a></li>\n");
      out.write("                                 <li><a href=\"#\"><span class=\"fa fa-pinterest\"></span></a></li>\n");
      out.write("                                 <li><a href=\"#\"><span class=\"fa fa-google-plus\"></span></a></li>\n");
      out.write("                                 <li><a href=\"#\"><span class=\"fa fa-linkedin\"></span></a></li>\n");
      out.write("                               </ul>\n");
      out.write("                             </div>                                                          \n");
      out.write("                            </div>\n");
      out.write("                          </div>                          \n");
      out.write("                        </div>                     \n");
      out.write("                      </div>\n");
      out.write("                    </div>                    \n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("    <!--=========== END BLOG SECTION ================-->\n");
      out.write("\n");
      out.write("     <footer id=\"footer\">\n");
      out.write("      <!-- Start Footer Top -->\n");
      out.write("      <div class=\"footer-top\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-3 col-md-3 col-sm-3\">\n");
      out.write("              <div class=\"single-footer-widget\">\n");
      out.write("                <div class=\"section-heading\">\n");
      out.write("                <h2>About Us</h2>\n");
      out.write("                <div class=\"line\"></div>\n");
      out.write("              </div>           \n");
      out.write("              <p> 'Cardiac Countermeasure' is a link between the Artificial Intelligence Cardiac System and the needy patient. It provides the person with a detailed list of Factors and functions related to heart-attack and after the user provides the correct information then System will generate the chances of the person of having heart-attack. Not only that after the system based report is generated it also provides the further asylum to the user for consulting laboratory as well as cardiologist.</p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-5 col-md-5 col-sm-5\">\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-3 col-md-3 col-sm-3\">\n");
      out.write("              <div class=\"single-footer-widget\">\n");
      out.write("                <div class=\"col-lg-3 col-md-3 col-sm-3\">\n");
      out.write("              <div class=\"single-footer-widget\">\n");
      out.write("                <div class=\"section-heading\">\n");
      out.write("                <h2>Contact Info</h2>\n");
      out.write("                <div class=\"line\"></div>\n");
      out.write("              </div>\n");
      out.write("              <p>Feel free to contact us at any time for suggestions or complaints</p>\n");
      out.write("              <address class=\"contact-info\">\n");
      out.write("                <p><span class=\"fa fa-home\"></span>305 Satyam mall,\n");
      out.write("                jodhpur,Ahmedabad</p>\n");
      out.write("                <p><span class=\"fa fa-phone\"></span>+919974911232</p>\n");
      out.write("                <p><span class=\"fa fa-envelope\"></span>info@Cardiaccountermeasure.com</p>\n");
      out.write("              </address>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- Start Footer Middle -->\n");
      out.write("      <div class=\"footer-middle\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("          <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("            <div class=\"footer-copyright\">\n");
      out.write("              <p>&copy; Copyright 2015 <a href=\"index.html\">R&J</a></p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("            <div class=\"footer-social\">              \n");
      out.write("                <a href=\"#\"><span class=\"fa fa-facebook\"></span></a>\n");
      out.write("                <a href=\"#\"><span class=\"fa fa-twitter\"></span></a>\n");
      out.write("                <a href=\"#\"><span class=\"fa fa-google-plus\"></span></a>\n");
      out.write("                <a href=\"#\"><span class=\"fa fa-linkedin\"></span></a>     \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- Start Footer Bottom -->\n");
      out.write("      <div class=\"footer-bottom\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("              <p>Design & Developed By <a rel=\"nofollow\" href=\"https://www.facebook.com/rishabh.shah.18\"> R&J</a></p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </footer>\n");
      out.write("    <!--=========== End Footer SECTION ================-->\n");
      out.write("\n");
      out.write("    <!-- jQuery Library  -->\n");
      out.write("    <script src=\"js/jquery.js\"></script>    \n");
      out.write("    <!-- Bootstrap default js -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- slick slider -->\n");
      out.write("    <script src=\"js/slick.min.js\"></script>    \n");
      out.write("    <script type=\"text/javascript\" src=\"js/modernizr.custom.79639.js\"></script>   \n");
      out.write("    <!-- counter -->\n");
      out.write("    <script src=\"js/waypoints.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.counterup.min.js\"></script>\n");
      out.write("    <!-- Doctors hover effect -->\n");
      out.write("    <script src=\"js/snap.svg-min.js\"></script>\n");
      out.write("    <script src=\"js/hovers.js\"></script>\n");
      out.write("    \n");
      out.write("    <!-- Custom JS -->\n");
      out.write("    <script src=\"js/custom.js\"></script>\n");
      out.write("     \n");
      out.write("  </body>\n");
      out.write("</html>");
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
