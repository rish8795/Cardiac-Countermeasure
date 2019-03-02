<%-- 
    Document   : admin_add_doctors
    Created on : 20 Apr, 2016, 5:28:46 PM
    Author     : Dell
--%>

<%@page import="model.Lab"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Doctor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
   
    <!-- Basic Page Needs
    ================================================== -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
     <title>Cardiac Countermeasure:Add Laboratory</title>

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
    
    <style>
        
    .button--itzel {
    border: none;
    padding: 0px 4px 0px 0px;
    overflow: hidden;
    width: 150px;
    height: 45px;
    
}

.table>tbody>tr>td, .table>tbody>tr>th, .table>tfoot>tr>td, .table>tfoot>tr>th, .table>thead>tr>td, .table>thead>tr>th {
    padding: 8px;
    line-height: 1.42857143;
    vertical-align: middle;
    border-top: 1px solid #ddd;
}
        
    </style>
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
    <%@include file="header_admin.jsp" %>
    <!--=========== END HEADER SECTION ================-->
    
    <!--=========== START BLOG SECTION ================-->       
    <section id="blogArchive">      
      <div class="row">
        <div class="col-lg-12 col-md-12">
          <div class="blog-breadcrumbs-area">
            <div class="container">
              <div class="blog-breadcrumbs-left">
                <h2>Doctor's Request</h2>
              </div>
              <div class="blog-breadcrumbs-right">
                <ol class="breadcrumb">
                  <li>You are here</li>
                  <li><a href="Labhomepage.jsp">Home</a></li>                  
                  <li class="active">Add/Reject Doctor</li>
                </ol>
              </div>
            </div>
          </div>
        </div>        
      </div>
      
                        <!-- Start sidebar widget -->
                   
                              <h3></h3> <span style="color: green;">
                <% if (request.getAttribute("msg") != null) {%>
                <%=request.getAttribute("msg")%>
                <% }%>
            </span> 

                             <table class="table table-hover">
                                <thead>
                                  <tr>
                                    <th>No</th>
                                    <th>Laboratory's Name</th>
                                    <th>View laboratory's Profile</th>
                                    <th>Approve Lab</th>
                                    <th>Reject Lab</th>
                                    
                                  </tr>
                                </thead>
                                <tbody>
                    <% if (request.getAttribute("da") != null) {
                            ArrayList<Lab> dp = (ArrayList<Lab>) request.getAttribute("da");
                            int loop = 1;
                            for (Lab dp1 : dp) {


                    %> 
                                  <tr>
                                    <th scope="row"><%=loop%></th>
                                    <td> <%=dp1.getLabName() %></td>
                                    <td><a href="view_labprofile_admin?lid=<%= dp1.getLId() %>" class="author-morepost">View Profile</a></td>
                           <td>
                            <form  action="admin_add_lab">
                                <input type="hidden" name="lId" value="<%=dp1.getLId() %>" />
                                <input type="hidden" name="status" value="approve"  />
                                <button name="btn_update" value="APPROVE" class="wpcf7-submit button--itzel" type="submit"><i class="button__icon fa fa-check"></i><span>Approve</span></button>
                            </form>
                          </td>
                          <td>
                            <form action="admin_add_lab" >
                                <input type="hidden" name="lId" value="<%=dp1.getLId() %>" />
                                <input type="hidden" name="status" value="reject" />
                                <button name="btn_update" value="UPDATE" class="wpcf7-submit button--itzel" type="submit"><i class="button__icon fa fa-remove"></i><span>Reject</span></button>
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

    <%@include file="footer.jsp" %>
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
