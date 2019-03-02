<%-- 
    Document   : Blogs
    Created on : Feb 5, 2016, 11:54:38 AM
    Author     : zaru
--%>

<%@page import="model.Blog"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
   
    <!-- Basic Page Needs
    ================================================== -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
     <title>CADIAC COUNTERMEASURE : Blogs</title>

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
    <%@include file="header_home.jsp" %>
    <!--=========== END HEADER SECTION ================-->   
 
    <!--=========== START BLOG SECTION ================-->       
    <section id="blogArchive">      
      <div class="row">
        <div class="col-lg-12 col-md-12">
          <div class="blog-breadcrumbs-area">
            <div class="container">
              <div class="blog-breadcrumbs-left">
                <h2>Blog</h2>
              </div>
              <div class="blog-breadcrumbs-right">
                <ol class="breadcrumb">
                  <li>You are here</li>
                  <li><a href="#">Home</a></li>                  
                  <li class="active">Blog</li>
                </ol>
              </div>
            </div>
          </div>
        </div>        
      </div>
      <div class="row">
        <div class="col-lg-12 col-md-12">
          <div class="container">
            <div class="row">
              <div class="col-md-12 col-sm-12">
                <!-- Start Blog Archive Area -->
                <div class="blogArchive-area">
                  <div class="row">
                  <!-- Start left Side bar -->
                    <div class="col-md-3 col-sm-4">
                      <aside class="sidebar">
                         <!-- Start sidebar widget -->
                        
                        <div class="sidebar-widget">
                          <h3>Latest Posts</h3>
                          <ul class="popular-tab">
                            <li>
                              <div class="media">
                                <div class="media-left">
                                  <a href="#" class="news-img">
                                      <img alt="img" src="images/heart-healthy-people.jpg" class="media-object">
                                  </a>
                                </div>
                                <div class="media-body">
                                 <a href="blog-single.html">The Healthy Foodie</a>
                                 <span class="feed-date">Sun May 22 19:29:33 IST 2016</span>
                                </div>
                              </div>
                            </li>
                            <li>
                              <div class="media">
                                <div class="media-left">
                                  <a href="#" class="news-img">
                                      <img alt="img" src="images/heart-healthy-people.jpg" class="media-object">
                                  </a>
                                </div>
                                <div class="media-body">
                                 <a href="blog-single.html">High Blood Cholesterol â? What Do the New Guidelines Say?</a>
                                 <span class="feed-date">Sun May 22 19:48:04 IST 2016</span>
                                </div>
                              </div>
                            </li>
                                            
                          </ul>
                        </div>
                        <!-- Start sidebar widget -->
                        <div class="sidebar-widget">
                          <h3>Most Viewed</h3>
                          <ul class="popular-tab">
                            <li>
                              <div class="media">
                                <div class="media-left">
                                  <a href="#" class="news-img">
                                      <img alt="img" src="images/heart-healthy-people.jpg" class="media-object">
                                  </a>
                                </div>
                                <div class="media-body">
                                 <a href="blog-single.html">The Healthy Foodie</a>
                                 <span class="feed-date">Sun May 22 19:29:33 IST 2016</span>
                                </div>
                              </div>
                            </li>
                            <li>
                              <div class="media">
                                <div class="media-left">
                                  <a href="#" class="news-img">
                                      <img alt="img" src="images/heart-healthy-people.jpg" class="media-object">
                                  </a>
                                </div>
                                <div class="media-body">
                                 <a href="blog-single.html">High Blood Cholesterol â? What Do the New Guidelines Say?</a>
                                 <span class="feed-date">Sun May 22 19:48:04 IST 2016</span>
                                </div>
                              </div>
                            </li>
                                             
                          </ul>
                        </div>
                        <!-- Start sidebar widget -->
                        
                        <!-- Start sidebar widget -->
                       
                        <!-- Start sidebar widget -->
                                              </aside>
                    </div>
                    <!-- Start Blog Content -->
                    <div class="col-md-9 col-sm-8">                     
                      <div class="blog-content">
                        <!-- Start Single Blog -->
                        <div class="single-Blog">
                             <% if (request.getAttribute("da")!= null) {
                            ArrayList<Blog> dp = (ArrayList<Blog>) request.getAttribute("da");
                            int loop = 1;
                            for (Blog dp1 : dp) {


                    %> 
                          <div class="single-blog-left">
                            <ul class="blog-comments-box">
                               <li> <span><%=dp1.getBlogDate() %></span></li>
                              <li><span class="fa fa-eye"></span><%=dp1.getBlogView() %></li>
                            </ul>
                          </div>
                          <div class="single-blog-right">
                            <div class="blog-img">
                              <figure class="blog-figure">
                                  <a href="#"><img alt="img" src="images/heart-healthy-people.jpg"></a>
                                <span class="image-effect"></span>
                              </figure>
                            </div>
                            <div class="blog-author">
                              <ul>
                                <li>By <a href="#">Dr. <%=dp1.getDId().getDFirstname()+" "+ dp1.getDId().getDLastname() %></a></li>
                              </ul>
                            </div>
                            <div class="blog-content">
                              <h2><%=dp1.getBlogname() %></h2>
                              <p><%=dp1.getBlogdescription() %></p>
                              <!-- Read more btn -->
                              <a class="wpcf7-submit button--itzel" href="#">
                                <i class="button__icon fa fa-link"></i>
                                <span>Read More</span>
                              </a>   
                            </div>
                          </div>
                                <% loop++;
                        }
                    } else { %>
                    
                        <td colspan="5"><h3 style="color: #FF9800">No Blog's Added.!</h3></td>
                    
                    <% }%>
                              
                        </div>
                             


                        <!-- Start blog pagination  -->
                        <div class="blog-pagination">
                          <nav>
                            <ul class="pagination">
                              <li>
                                <a href="#" aria-label="Previous">
                                  <span class="fa fa-angle-left"></span>
                                </a>
                              </li>
                              <li><a href="#">1</a></li>
                              <li><a href="#">2</a></li>
                              <li><a href="#">3</a></li>
                              <li><a href="#">4</a></li>
                              <li><a href="#">5</a></li>
                              <li>
                                <a href="#" aria-label="Next">
                                  <span class="fa fa-angle-right"></span>
                                </a>
                              </li>
                            </ul>
                          </nav>
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
    <!--=========== START BLOG SECTION ================-->
    
 <!--=========== Start Footer SECTION ================-->
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
    <script src="http://cdnjs.cloudflare.com/ajax/libs/waypoints/2.0.3/waypoints.min.js"></script>
    <script src="js/jquery.counterup.min.js"></script>
    <!-- Doctors hover effect -->
    <script src="js/snap.svg-min.js"></script>
    <script src="js/hovers.js"></script>
    
    <!-- Custom JS -->
    <script src="js/custom.js"></script>
     
  </body>
</html>