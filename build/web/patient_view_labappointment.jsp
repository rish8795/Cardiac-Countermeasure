<%-- 
    Document   : patient_view_labappointent
    Created on : 22 Apr, 2016, 5:13:26 PM
    Author     : Dell
--%>

<%@page import="model.Labtest"%>
<%@page import="model.PatienttestDetail"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.LabAppointment"%>
<!DOCTYPE html>
<html lang="en">
    <head>

        <!-- Basic Page Needs
        ================================================== -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Cardiac Countermeasure: Laboratory Appointment</title>

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
        <%@include file="header_patient.jsp" %>
        <!--=========== END HEADER SECTION ================-->

        <!--=========== START BLOG SECTION ================-->       
        <section id="blogArchive">      
            <div class="row">
                <div class="col-lg-12 col-md-12">
                    <div class="blog-breadcrumbs-area">
                        <div class="container">
                            <div class="blog-breadcrumbs-left">
                                <h2>Laboratory Appointments</h2>
                            </div>
                            <div class="blog-breadcrumbs-right">
                                <ol class="breadcrumb">
                                    <li>You are here</li>
                                    <li><a href="Labhomepage.jsp">Home</a></li>                  
                                    <li class="active">My Lab Appointments</li>
                                </ol>
                            </div>
                        </div>
                    </div>
                </div>        
            </div>

            <!-- Start sidebar widget -->

            <h3></h3> 

            <% if (request.getAttribute("la") != null) { %>

            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>No</th>
                        <th>Laboratory Name</th>
                        <th>Ordered Tests</th>
                        <th>Appointment Date</th>
                        <th>Appointment Time</th>
                        <th>Total Amount</th>
                        <th>Status</th>

                    </tr>
                </thead>
                <tbody>
                    <%
                        ArrayList<LabAppointment> la = (ArrayList<LabAppointment>) request.getAttribute("la");
                        ArrayList<ArrayList<PatienttestDetail>> testarray = (ArrayList<ArrayList<PatienttestDetail>>) request.getAttribute("ptest");
//                        System.out.println(la);
                        int loop=1;
                        for (int i = 0; i < la.size(); i++) {

                            ArrayList<PatienttestDetail> test1 = testarray.get(i);
                            LabAppointment l = la.get(i);
                            String dt = "---";
                            String tm = "---";
                            String status = l.getStatus();
                            Double fees = 0.0;
                            if (l.getDate() != null) {
                                dt = l.getDate();
                            }
                            if (l.getTime() != null) {
                                tm = l.getTime();
                            }
                    %>
                    <tr>
                        <th scope="row"><%=loop %></th>
                        <td><%=l.getLId().getLabName()%></td>
                        <td><ul class="footer-service">
                                <%
                                    for (PatienttestDetail ptd1 : test1) {
                                        Labtest ltt = ptd1.getLtId();
                                        fees= fees+ltt.getTestFees();
                                %>
                                <li><span class="fa fa-check"></span> <%=ltt.getTId().getTestName()%></li>
                                    <% }%>
                            </ul></td>
                        <td><%=dt%></td>
                        <td><%=tm%></td>
                        <td><%=fees %></td>
                        <% if (status.equals("REJECTED")) {%>
                        <td style="color: red"><%=status%></td>
                        <% } else {%>
                        <td style="color: green"><%=status%></td>
                        <% } %>
                    </tr>
                    <% loop++; } %>
                </tbody>
            </table>

            <% } else { %>
            You have not taken any Appointment.!
            <form action="consult_lab.jsp" method="post">
                <button class="wpcf7-submit button--itzel" type="submit" style="margin-left: 980px;"><i class="button__icon fa fa-cart-plus"></i><span>Take Lab Appointment</span></button>                
            </form>
            <% }%>

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