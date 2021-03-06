<%-- 
    Document   : Approved_appointment
    Created on : 5 Feb, 2016, 8:40:48 PM
    Author     : Dell
--%>


<%@page import="model.LabAppointment"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="en">
  <head>
   
    <!-- Basic Page Needs
    ================================================== -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
     <title>Cardiac Countermeasure:Laboratory Appointment</title>

    <!-- Mobile Specific Metas
    ================================================== -->
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Favicon -->
    <link rel="shortcut icon" type="image/icon" href="images/favicon.ico"/>

    <!-- CSS
    ================================================== -->       
    <!-- Bootstrap css file-->
    <link href="css/bootstrap.min.jui.css" rel="stylesheet">
    <!-- Font awesome css file-->
    <link href="css/font-awesome.min.css" rel="stylesheet">       
    <!-- Default Theme css file -->
    <link id="switcher" href="css/themes/default-theme.css" rel="stylesheet">    
    <!-- Slick slider css file -->
    <link href="css/slick.css" rel="stylesheet"> 

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
      <script src="https://oss.maxcdn.com/respond
    /1.4.2/respond.min.js"></script>
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
    <%@include file="header_lab.jsp" %>
    <!--=========== END HEADER SECTION ================-->
    
    <!--=========== START BLOG SECTION ================-->       
    <section id="blogArchive">      
      <div class="row">
        <div class="col-lg-12 col-md-12">
          <div class="blog-breadcrumbs-area">
            <div class="container">
              <div class="blog-breadcrumbs-left">
                <h2>Approved Appointment</h2>
              </div>
              <div class="blog-breadcrumbs-right">
                <ol class="breadcrumb">
                  <li>You are here</li>
                  <li><a href="Labhomepage.jsp">Home</a></li>                  
                  <li class="active">Services</li>
                  <li class="active">Approved Appointment</li>
                </ol>
              </div>
            </div>
          </div>
        </div>        
      </div>
      
                        <!-- Start sidebar widget -->
                   
                             <h3></h3> 
                         <span style="color: green;">
                         <% if (request.getAttribute("msg") != null) {%>
                         <%=request.getAttribute("msg")%>
                         <% }%>
                         </span>
                             <table class="table table-hover">
                                <thead>
                                  <tr>
                                    <th>No</th>
                                    <th>Patient's Name</th>
                                    <th>View Patient's Profile</th>
                                    <th>Update Appointment</th>
                                    <th> Cancel Appointment </th>
                                  </tr>
                                </thead>
                                <tbody>
                                    
                                    
                                      <% if (request.getAttribute("da") != null) {
                                         ArrayList<LabAppointment> dp = (ArrayList<LabAppointment>) request.getAttribute("da");
                                         int loop = 1;
                                         for (LabAppointment dp1 : dp) {


                                      %> 
                                    
                                    
                                    
                                  <tr>
                                    <th scope="row"><%=loop%></th>
                                    <td><%=dp1.getPId().getPFirstname() + " " + dp1.getPId().getPLastname()%></td>
                                    <td> <a href="view_pat_profile_byLab?pid=<%= dp1.getPId().getPId()%>" class="author-morepost">View Profile</a></td>
                       <td>
                            <form action="lab_view_approved_appointment" >
                                <input type="date" name="apdate" required value="<%=dp1.getDate() %>" style="height: 30px;margin: 5px;" />
                                <input type="time" required name="aptime" style="height: 30px;margin: 5px;" value="<%=dp1.getTime() %>" />
                                <input type="hidden" name="appoid" value="<%=dp1.getLaId() %>" />
                                <input type="hidden" name="status" value="update" />
                                <input type="submit" value="UPDATE" class="reply-btn" style="float: none;background-color: rgb(60, 91, 41);" />
                            </form>  
                                
                     </td>
                                       
                         <td>
                             <form action="doc_view_approved_appointment">
                                <input type="submit" value="CANCEL" class="reply-btn" style="background-color: #CE522C;" />
                                <input type="hidden" name="appoid" value="<%=dp1.getLaId() %>" />
                                <input type="hidden" name="status" value="cancel"  />
                             </form>
                        </td>
                                       
                                  </tr>
                                 
                                   <% loop++;
                        }
                    } else { %>
                    <tr>
                        <td colspan="5"><h3 style="color: #FF9800">No more appointment.!</h3></td>
                    </tr>
                    <% }%>

                                </tbody>
                              </table>

           
                              
                              
                              <!-- Start Social Share-->
                              <div class="social-share">
                               <h3></h3>
                               <ul>
                                 <li><a href="#"><span class="fa fa-facebook"></span></a></li>
                                 <li><a href="#"><span class="fa fa-twitter"></span></a></li>
                                 <li><a href="#"><span class="fa fa-pinterest"></span></a></li>
                                 <li><a href="#"><span class="fa fa-google-plus"></span></a></li>
                                 <li><a href="#"><span class="fa fa-linkedin"></span></a></li>
                               </ul>
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
      </div>
    </section>
    <!--=========== END BLOG SECTION ================-->

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
    
    <!-- Custom JS -->
    <script src="js/custom.js"></script>
     
  </body>
</html>