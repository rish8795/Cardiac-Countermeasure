<%-- 
    Document   : consult_cardiac
    Created on : 18 Apr, 2016, 2:08:50 PM
    Author     : Dell
--%>

<!DOCTYPE html>
<html lang="en">
    <head>

        <!-- Basic Page Needs
        ================================================== -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Cardiac Countermeasure:View lab</title>

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


        <style>        </style>

        <script type="text/javascript">
            function getsearchdoctor(sid)
            
            {
//                alert(sid);
//                var sid = document.getElementById("sort").value;
                var url = "get_lab_admin?search=" + sid;
                var xmlReq = new XMLHttpRequest();
                xmlReq.open("get", url, true);
                xmlReq.send();
                xmlReq.onreadystatechange = function()
                {
                    if (xmlReq.status == 200)
                    {
                        document.getElementById("doclist").innerHTML = xmlReq.responseText;
                    }

                }

                //alert(sid);
            }
            function getsortdoctor(sid)
            {

//                var sid = document.getElementById("sort").value;
                var url = "get_lab_admin?sort=" + sid;
                var xmlReq = new XMLHttpRequest();
                xmlReq.open("get", url, true);
                xmlReq.send();
                xmlReq.onreadystatechange = function()
                {
                    if (xmlReq.status == 200)
                    {
                        document.getElementById("doclist").innerHTML = xmlReq.responseText;
                    }

                }

                //alert(sid);
            }
        </script>




        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond
        /1.4.2/respond.min.js"></script>
        <![endif]--> 
    </head>
    <body onload="getsortdoctor(1);">    
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
                            <div class="patient_profile">
                                <h2>Consult Laboratory</h2>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-12 col-md-12">
                    <!--<div class="blog-breadcrumbs-area">-->

                    <div class="col-lg-12 col-md-8">
                        <div class="container">
                            <div style="margin-top: 1px;width: 100%">
                                <img src="images/images/search1.png" style="padding: 8px;" />
                                <!--<label for="author"></label>-->
                                <input type="text" size="30" onkeyup="getsearchdoctor(this.value);" style="width: 20%;" class="wp-form-control wpcf7-text" value="" name="author" >
                            </div> 
                            <div style="margin-top: 1px; width: 100%; margin-top: -43px;margin-left: 730px;
                                 ">
                                <img src="images/images/filter2.jpg" style="padding: 8px;">  
                                <select id="sort" onchange="getsortdoctor(this.value);" name="c_filter" style="width: 20%; margin-left: 225px;" class="wp-form-control wpcf7-text">
                                    <option value="1">A to Z</option>
                                    <option value="2">Z to A</option>
                                </select>

                            </div>
                        </div>
                    </div>
                    
                    <p style="color: green;text-align: center;"><% if (request.getAttribute("msg") != null) {%>
                        <%=request.getAttribute("msg")%>
                        <%}%></p>
                </div>
                <div class="col-lg-12 col-md-12">
                    <div class="container">

                        <ul id="doclist" style="margin-left: 267px;width: 60%;">


                        </ul>

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