<%@page import="java.sql.ResultSet"%>
<%@page import="SessionBeans.CategoriesSessionBean"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %><!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<!DOCTYPE html>
<html lang="en">

<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="au theme template">
    <meta name="author" content="Hau Nguyen">
    <meta name="keywords" content="au theme template">

    <!-- Title Page-->
    <title>Dashboard</title>

    <!-- Fontfaces CSS-->
    <link href="css/font-face.css" rel="stylesheet" media="all">
    <link href="vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <link href="vendor/font-awesome-5/css/fontawesome-all.min.css" rel="stylesheet" media="all">
    <link href="vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">

    <!-- Bootstrap CSS-->
    <link href="vendor/bootstrap-4.1/bootstrap.min.css" rel="stylesheet" media="all">

    <!-- Vendor CSS-->
    <link href="vendor/animsition/animsition.min.css" rel="stylesheet" media="all">
    <link href="vendor/bootstrap-progressbar/bootstrap-progressbar-3.3.4.min.css" rel="stylesheet" media="all">
    <link href="vendor/wow/animate.cs
    
    s" rel="stylesheet" media="all">
    <link href="vendor/css-hamburgers/hamburgers.min.css" rel="stylesheet" media="all">
    <link href="vendor/slick/slick.css" rel="stylesheet" media="all">
    <link href="vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="vendor/perfect-scrollbar/perfect-scrollbar.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="css/theme.css" rel="stylesheet" media="all">

</head>

<body class="animsition">
    <div class="page-wrapper">
        <!-- HEADER MOBILE-->
        <header class="header-mobile d-block d-lg-none">
            <div class="header-mobile__bar">
                <div class="container-fluid">
                    <div class="header-mobile-inner">
                        <a class="logo" href="index.html">
                            <img src="images/icon/logo.png" alt="CoolAdmin" />
                        </a>
                        <button class="hamburger hamburger--slider" type="button">
                            <span class="hamburger-box">
                                <span class="hamburger-inner"></span>
                            </span>
                        </button>
                    </div>
                </div>
            </div>
            <nav class="navbar-mobile">
                <div class="container-fluid">
                    
                </div>
            </nav>
        </header>
        <!-- END HEADER MOBILE-->

        <!-- MENU SIDEBAR-->
        <aside class="menu-sidebar d-none d-lg-block">
            <div class="logo">
                <a href="dashboard.php">
                    <img src="images/icon/logo.png" alt="Cool Admin" />
                </a>
            </div>
            <div class="menu-sidebar__content js-scrollbar1">
                <nav class="navbar-sidebar">
                    <ul class="list-unstyled navbar__list">
                        <li>
                        <a class="js-arrow" href="logiciel.html">
                                <i class="fas fa-tachometer-alt"></i>Logiciels</a>
                           
                        </li>
                        
                        <li>
                            <a href="categorie.html">
                                <i class="fas fa-table"></i>Categories</a>
                        </li>
                        <li>
                            <a href="composant.html">
                                <i class="far fa-check-square"></i>Compasants</a>
                        </li>
                        <li>
                            <a href="users.html">
                                <i class="fas fa-calendar-alt"></i>Users</a>
                        </li>
                        
                        
                        
                    </ul>
                </nav>
            </div>
        </aside>
        <!-- END MENU SIDEBAR-->

        <!-- PAGE CONTAINER-->
        <div class="page-container">
            <!-- HEADER DESKTOP-->
            <header class="header-desktop">
                <div class="section__content section__content--p30">
                    <div class="container-fluid">
                        <div class="header-wrap">
                            <form class="form-header" action="" method="POST">
                                
                                   
                                </button>
                            </form>
                            <div class="header-button">
                                <div class="noti-wrap">
                                    <div class="noti__item js-item-menu">
                                        
                                        
                                    </div>
                                    
                                    
                                </div>
                                <div class="account-wrap">
                                    <div class="account-item clearfix js-item-menu">
                                        
                                        <div class="content">
                                            <a class="js-acc-btn" href="index.php">Logout</a>
                                        </div>
                                        
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </header>
            <!-- HEADER DESKTOP-->
 <!-- MAIN CONTENT-->
            <div class="main-content">
                <div class="section__content section__content--p30">
                     <div id="page-wrapper" >
            <div id="page-inner">

                 <!-- /. ROW  -->
                <div class="row" >

                   <div class="col-md-12 col-sm-12 col-xs-12">

                    <div class="panel panel-default">
                        <div class="panel-heading">
                         logiciel
                        </div>
                        <div class="panel-body">
                         <div class="zoneAdd">
                                <input type="text" class="myInput" placeholder="Nom" name="lo_nom">
                                <input type="text" class="myInput" placeholder="taille" name="lo_taille">
                                <input type="text" class="myInput" placeholder="Description" name="lo_desc">
                                <input type="text" class="myInput" placeholder="Dependences" name="lo_depen">
                                <button class="btn btn-danger" id="addcomp"><i class="glyphicon glyphicon-ok"></i> Ajouter</button>
                            </div>
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover">
                                    <thead>
                                        <tr>
                                            <th>Code </th>
                                            <th>Nom </th>
                                            <th>Taille</th>
                                            <th>Description </th>
                                            <th>Dependences</th>
                                             <th>Delete</th>
                                              <th>Edit</th>
                                        </tr>
                                    </thead>
                                    <tbody>
<sql:setDataSource var="jee_base1" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/jee_base1" user="root" password=""/>
<sql:query dataSource="${jee_base1}" var="result"> SELECT * from logiciels ;</sql:query>                                
                                         <c:forEach items="${result.rows}" var="logiciel">                                        
                                        <tr>
                                            <td>${logiciel.codLogiciel}</td>
                                            <td>${logiciel.nomLogiciel}</td>
                                            <td>${logiciel.Taille}</td>
                                            <td>${logiciel.DescriptionLogiciel}</td>
                                            <td>${logiciel.Dependences}</td>
                                            <td><button class="btn btn-danger"><i class="fa fa-ban"></i></button> </td>
                                            <td><button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
                                            Edit
                                            </button> </td>
                                        </tr>
                                        </c:forEach>

                                    </tbody>
                                </table>
                            </div>
                        </div>
                        
                        
                    </div>

                    </div>

                        </div>
                    </div>

                    </div>
                </div>
                 <!-- /. ROW  -->
                </div>
            </div>
            <!-- END MAIN CONTENT-->
            <!-- END PAGE CONTAINER-->
        </div>

    </div>
<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <div class="zoneAdd" >
                                <div class="row">
                                    <div class="col-md-6">
                                        <input type="hidden" value="id" name="ecre0">
                                        <div class="form-group">
                                          <label for="usr">Nom</label>
                                          <input type="text" class="form-control" value="aaa" name="ecre1">
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-group">
                                          <label for="usr">Taille</label>
                                          <input type="text" class="form-control" value="bbb" name="ecre2">
                                        </div>
                                    </div>
                                       <div class="col-md-6">
                                        <div class="form-group">
                                          <label for="usr">Description</label>
                                          <input type="text" class="form-control" value="bbb" name="ecre3">
                                        </div>
                                    </div>
                                       <div class="col-md-6">
                                        <div class="form-group">
                                          <label for="usr">Dependeces</label>
                                          <input type="text" class="form-control" value="bbb" name="ecre4">
                                        </div>
                                    </div>
                      
                            </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
         <button class="btn btn-danger" id="edit"><i class="glyphicon glyphicon-ok"></i> Modifier</button>
      </div>
    </div>
  </div>
</div>

    <!-- Jquery JS-->
    <script src="vendor/jquery-3.2.1.min.js"></script>
    <!-- Bootstrap JS-->
    <script src="vendor/bootstrap-4.1/popper.min.js"></script>
    <script src="vendor/bootstrap-4.1/bootstrap.min.js"></script>
    <!-- Vendor JS       -->
    <script src="vendor/slick/slick.min.js">
    </script>
    <script src="vendor/wow/wow.min.js"></script>
    <script src="vendor/animsition/animsition.min.js"></script>
    <script src="vendor/bootstrap-progressbar/bootstrap-progressbar.min.js">
    </script>
    <script src="vendor/counter-up/jquery.waypoints.min.js"></script>
    <script src="vendor/counter-up/jquery.counterup.min.js">
    </script>
    <script src="vendor/circle-progress/circle-progress.min.js"></script>
    <script src="vendor/perfect-scrollbar/perfect-scrollbar.js"></script>
    <script src="vendor/chartjs/Chart.bundle.min.js"></script>
    <script src="vendor/select2/select2.min.js">
    </script>

    <!-- Main JS-->
    <script src="js/main.js"></script>

</body>

</html>
<!-- end document-->

