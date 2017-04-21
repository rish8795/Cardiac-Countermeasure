package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    \n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t<title>CardiacCountermeasure:- SignIn</title>\n");
      out.write("\n");
      out.write("\t<!-- Google Fonts -->\n");
      out.write("\t<link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700|Lato:400,100,300,700,900' rel='stylesheet' type='text/css'>\n");
      out.write("<!-- Mobile Specific Metas\n");
      out.write("    ================================================== -->\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("    <!-- Favicon -->\n");
      out.write("    <link rel=\"shortcut icon\" type=\"image/icon\" href=\"images/favicon.ico\"/>\n");
      out.write("\n");
      out.write("    <!-- CSS\n");
      out.write("    ================================================== -->       \n");
      out.write("    <!-- Font awesome css file-->\n");
      out.write("    <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">       \n");
      out.write("    \n");
      out.write("\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("\t<!-- Custom Stylesheet -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <form name=\"authentication\" class=\"submitphoto_form\" method=\"post\" action=\"LogServ\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("\t\t<div class=\"top2\">\n");
      out.write("\t\t\t<h1 id=\"title\" class=\"hidden\"><span id=\"logo\">Cardiac <span>CounterMeasure</span></span></h1>\n");
      out.write("\t\t</div>\n");
      out.write("    </div>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("            <div class=\"top1\"></div>\n");
      out.write("\t\t<div class=\"login-box animated fadeInUp\">\n");
      out.write("\t\t\t<div class=\"box-header\">\n");
      out.write("\t\t\t\t<h2>Log In</h2>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<label  for=\"username\">Username</label>\n");
      out.write("\t\t\t<br/>\n");
      out.write("                        <input required name=\"username\" type=\"text\" id=\"username\">\n");
      out.write("\t\t\t<br/>\n");
      out.write("\t\t\t<label for=\"password\">Password</label>\n");
      out.write("\t\t\t<br/>\n");
      out.write("                        <input required name=\"password\" type=\"password\" id=\"password\">\n");
      out.write("\t\t\t<br/>\n");
      out.write("\t\t\t<button type=\"submit\">Sign In</button>\n");
      out.write("\t\t\t<br/>\n");
      out.write("                        <a href=\"#\"><p class=\"small\">Forgot your password?</p></a>\n");
      out.write("                        <label for=\"new user\">new user?</label><a href=\"http://localhost:8084/CardiacCountermeasure/patient_reg.jsp\"> <button type=\"button\">SignUp </button></a>\n");
      out.write("                          </div>\n");
      out.write("        </div>\n");
      out.write("                \n");
      out.write("    </form>\n");
      out.write("    <div class=\"container\">\n");
      out.write("            <div class=\"top1\"></div>\n");
      out.write("\t\t<div class=\"login-box2 animated fadeInUp\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\n");
      out.write("                </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\t$(document).ready(function () {\n");
      out.write("    \t$('#logo').addClass('animated fadeInDown');\n");
      out.write("    \t$(\"input:text:visible:first\").focus();\n");
      out.write("\t});\n");
      out.write("\t$('#username').focus(function() {\n");
      out.write("\t\t$('label[for=\"username\"]').addClass('selected');\n");
      out.write("\t});\n");
      out.write("\t$('#username').blur(function() {\n");
      out.write("\t\t$('label[for=\"username\"]').removeClass('selected');\n");
      out.write("\t});\n");
      out.write("\t$('#password').focus(function() {\n");
      out.write("\t\t$('label[for=\"password\"]').addClass('selected');\n");
      out.write("\t});\n");
      out.write("\t$('#password').blur(function() {\n");
      out.write("\t\t$('label[for=\"password\"]').removeClass('selected');\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("\n");
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
