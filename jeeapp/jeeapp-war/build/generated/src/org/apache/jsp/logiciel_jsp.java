package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import SessionBeans.CategoriesSessionBean;

public final class logiciel_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_query_var_dataSource;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_query_var_dataSource = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_sql_query_var_dataSource.release();
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <!-- Required meta tags-->\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <meta name=\"description\" content=\"au theme template\">\r\n");
      out.write("    <meta name=\"author\" content=\"Hau Nguyen\">\r\n");
      out.write("    <meta name=\"keywords\" content=\"au theme template\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Title Page-->\r\n");
      out.write("    <title>Dashboard</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Fontfaces CSS-->\r\n");
      out.write("    <link href=\"css/font-face.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("    <link href=\"vendor/font-awesome-4.7/css/font-awesome.min.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("    <link href=\"vendor/font-awesome-5/css/fontawesome-all.min.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("    <link href=\"vendor/mdi-font/css/material-design-iconic-font.min.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap CSS-->\r\n");
      out.write("    <link href=\"vendor/bootstrap-4.1/bootstrap.min.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Vendor CSS-->\r\n");
      out.write("    <link href=\"vendor/animsition/animsition.min.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("    <link href=\"vendor/bootstrap-progressbar/bootstrap-progressbar-3.3.4.min.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("    <link href=\"vendor/wow/animate.cs\r\n");
      out.write("    \r\n");
      out.write("    s\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("    <link href=\"vendor/css-hamburgers/hamburgers.min.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("    <link href=\"vendor/slick/slick.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("    <link href=\"vendor/select2/select2.min.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("    <link href=\"vendor/perfect-scrollbar/perfect-scrollbar.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Main CSS-->\r\n");
      out.write("    <link href=\"css/theme.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"animsition\">\r\n");
      out.write("    <div class=\"page-wrapper\">\r\n");
      out.write("        <!-- HEADER MOBILE-->\r\n");
      out.write("        <header class=\"header-mobile d-block d-lg-none\">\r\n");
      out.write("            <div class=\"header-mobile__bar\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <div class=\"header-mobile-inner\">\r\n");
      out.write("                        <a class=\"logo\" href=\"index.html\">\r\n");
      out.write("                            <img src=\"images/icon/logo.png\" alt=\"CoolAdmin\" />\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <button class=\"hamburger hamburger--slider\" type=\"button\">\r\n");
      out.write("                            <span class=\"hamburger-box\">\r\n");
      out.write("                                <span class=\"hamburger-inner\"></span>\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <nav class=\"navbar-mobile\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </header>\r\n");
      out.write("        <!-- END HEADER MOBILE-->\r\n");
      out.write("\r\n");
      out.write("        <!-- MENU SIDEBAR-->\r\n");
      out.write("        <aside class=\"menu-sidebar d-none d-lg-block\">\r\n");
      out.write("            <div class=\"logo\">\r\n");
      out.write("                <a href=\"dashboard.php\">\r\n");
      out.write("                    <img src=\"images/icon/logo.png\" alt=\"Cool Admin\" />\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"menu-sidebar__content js-scrollbar1\">\r\n");
      out.write("                <nav class=\"navbar-sidebar\">\r\n");
      out.write("                    <ul class=\"list-unstyled navbar__list\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                        <a class=\"js-arrow\" href=\"logiciel.html\">\r\n");
      out.write("                                <i class=\"fas fa-tachometer-alt\"></i>Logiciels</a>\r\n");
      out.write("                           \r\n");
      out.write("                        </li>\r\n");
      out.write("                        \r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"categorie.html\">\r\n");
      out.write("                                <i class=\"fas fa-table\"></i>Categories</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"composant.html\">\r\n");
      out.write("                                <i class=\"far fa-check-square\"></i>Compasants</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"users.html\">\r\n");
      out.write("                                <i class=\"fas fa-calendar-alt\"></i>Users</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                    </ul>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("        </aside>\r\n");
      out.write("        <!-- END MENU SIDEBAR-->\r\n");
      out.write("\r\n");
      out.write("        <!-- PAGE CONTAINER-->\r\n");
      out.write("        <div class=\"page-container\">\r\n");
      out.write("            <!-- HEADER DESKTOP-->\r\n");
      out.write("            <header class=\"header-desktop\">\r\n");
      out.write("                <div class=\"section__content section__content--p30\">\r\n");
      out.write("                    <div class=\"container-fluid\">\r\n");
      out.write("                        <div class=\"header-wrap\">\r\n");
      out.write("                            <form class=\"form-header\" action=\"\" method=\"POST\">\r\n");
      out.write("                                \r\n");
      out.write("                                   \r\n");
      out.write("                                </button>\r\n");
      out.write("                            </form>\r\n");
      out.write("                            <div class=\"header-button\">\r\n");
      out.write("                                <div class=\"noti-wrap\">\r\n");
      out.write("                                    <div class=\"noti__item js-item-menu\">\r\n");
      out.write("                                        \r\n");
      out.write("                                        \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    \r\n");
      out.write("                                    \r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"account-wrap\">\r\n");
      out.write("                                    <div class=\"account-item clearfix js-item-menu\">\r\n");
      out.write("                                        \r\n");
      out.write("                                        <div class=\"content\">\r\n");
      out.write("                                            <a class=\"js-acc-btn\" href=\"index.php\">Logout</a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </header>\r\n");
      out.write("            <!-- HEADER DESKTOP-->\r\n");
      out.write(" <!-- MAIN CONTENT-->\r\n");
      out.write("            <div class=\"main-content\">\r\n");
      out.write("                <div class=\"section__content section__content--p30\">\r\n");
      out.write("                     <div id=\"page-wrapper\" >\r\n");
      out.write("            <div id=\"page-inner\">\r\n");
      out.write("\r\n");
      out.write("                 <!-- /. ROW  -->\r\n");
      out.write("                <div class=\"row\" >\r\n");
      out.write("\r\n");
      out.write("                   <div class=\"col-md-12 col-sm-12 col-xs-12\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"panel panel-default\">\r\n");
      out.write("                        <div class=\"panel-heading\">\r\n");
      out.write("                         logiciel\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"panel-body\">\r\n");
      out.write("                         <div class=\"zoneAdd\">\r\n");
      out.write("                                <input type=\"text\" class=\"myInput\" placeholder=\"Nom\" name=\"lo_nom\">\r\n");
      out.write("                                <input type=\"text\" class=\"myInput\" placeholder=\"taille\" name=\"lo_taille\">\r\n");
      out.write("                                <input type=\"text\" class=\"myInput\" placeholder=\"Description\" name=\"lo_desc\">\r\n");
      out.write("                                <input type=\"text\" class=\"myInput\" placeholder=\"Dependences\" name=\"lo_depen\">\r\n");
      out.write("                                <button class=\"btn btn-danger\" id=\"addcomp\"><i class=\"glyphicon glyphicon-ok\"></i> Ajouter</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"table-responsive\">\r\n");
      out.write("                                <table class=\"table table-striped table-bordered table-hover\">\r\n");
      out.write("                                    <thead>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <th>Code </th>\r\n");
      out.write("                                            <th>Nom </th>\r\n");
      out.write("                                            <th>Taille</th>\r\n");
      out.write("                                            <th>Description </th>\r\n");
      out.write("                                            <th>Dependences</th>\r\n");
      out.write("                                             <th>Delete</th>\r\n");
      out.write("                                              <th>Edit</th>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                    </thead>\r\n");
      out.write("                                    <tbody>\r\n");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_sql_query_0(_jspx_page_context))
        return;
      out.write("                                \r\n");
      out.write("                                         ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    </tbody>\r\n");
      out.write("                                </table>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                 <!-- /. ROW  -->\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- END MAIN CONTENT-->\r\n");
      out.write("            <!-- END PAGE CONTAINER-->\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("<!-- Modal -->\r\n");
      out.write("<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("      <div class=\"modal-header\">\r\n");
      out.write("        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Modal title</h5>\r\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("          <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("        </button>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-body\">\r\n");
      out.write("        <div class=\"zoneAdd\" >\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-md-6\">\r\n");
      out.write("                                        <input type=\"hidden\" value=\"id\" name=\"ecre0\">\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                          <label for=\"usr\">Nom</label>\r\n");
      out.write("                                          <input type=\"text\" class=\"form-control\" value=\"aaa\" name=\"ecre1\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-md-6\">\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                          <label for=\"usr\">Taille</label>\r\n");
      out.write("                                          <input type=\"text\" class=\"form-control\" value=\"bbb\" name=\"ecre2\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                       <div class=\"col-md-6\">\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                          <label for=\"usr\">Description</label>\r\n");
      out.write("                                          <input type=\"text\" class=\"form-control\" value=\"bbb\" name=\"ecre3\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                       <div class=\"col-md-6\">\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                          <label for=\"usr\">Dependeces</label>\r\n");
      out.write("                                          <input type=\"text\" class=\"form-control\" value=\"bbb\" name=\"ecre4\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                      \r\n");
      out.write("                            </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-footer\">\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("         <button class=\"btn btn-danger\" id=\"edit\"><i class=\"glyphicon glyphicon-ok\"></i> Modifier</button>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Jquery JS-->\r\n");
      out.write("    <script src=\"vendor/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("    <!-- Bootstrap JS-->\r\n");
      out.write("    <script src=\"vendor/bootstrap-4.1/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"vendor/bootstrap-4.1/bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- Vendor JS       -->\r\n");
      out.write("    <script src=\"vendor/slick/slick.min.js\">\r\n");
      out.write("    </script>\r\n");
      out.write("    <script src=\"vendor/wow/wow.min.js\"></script>\r\n");
      out.write("    <script src=\"vendor/animsition/animsition.min.js\"></script>\r\n");
      out.write("    <script src=\"vendor/bootstrap-progressbar/bootstrap-progressbar.min.js\">\r\n");
      out.write("    </script>\r\n");
      out.write("    <script src=\"vendor/counter-up/jquery.waypoints.min.js\"></script>\r\n");
      out.write("    <script src=\"vendor/counter-up/jquery.counterup.min.js\">\r\n");
      out.write("    </script>\r\n");
      out.write("    <script src=\"vendor/circle-progress/circle-progress.min.js\"></script>\r\n");
      out.write("    <script src=\"vendor/perfect-scrollbar/perfect-scrollbar.js\"></script>\r\n");
      out.write("    <script src=\"vendor/chartjs/Chart.bundle.min.js\"></script>\r\n");
      out.write("    <script src=\"vendor/select2/select2.min.js\">\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Main JS-->\r\n");
      out.write("    <script src=\"js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("<!-- end document-->\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_sql_setDataSource_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_0.setParent(null);
    _jspx_th_sql_setDataSource_0.setVar("jee_base1");
    _jspx_th_sql_setDataSource_0.setDriver("com.mysql.jdbc.Driver");
    _jspx_th_sql_setDataSource_0.setUrl("jdbc:mysql://localhost/jee_base1");
    _jspx_th_sql_setDataSource_0.setUser("root");
    _jspx_th_sql_setDataSource_0.setPassword("");
    int _jspx_eval_sql_setDataSource_0 = _jspx_th_sql_setDataSource_0.doStartTag();
    if (_jspx_th_sql_setDataSource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
    return false;
  }

  private boolean _jspx_meth_sql_query_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_0.setParent(null);
    _jspx_th_sql_query_0.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jee_base1}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sql_query_0.setVar("result");
    int[] _jspx_push_body_count_sql_query_0 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_0 = _jspx_th_sql_query_0.doStartTag();
      if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_0[0]++;
          _jspx_th_sql_query_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_0.doInitBody();
        }
        do {
          out.write(" SELECT * from logiciels ;");
          int evalDoAfterBody = _jspx_th_sql_query_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_0[0]--;
      }
      if (_jspx_th_sql_query_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_0.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("logiciel");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("                                        \r\n");
          out.write("                                        <tr>\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${logiciel.codLogiciel}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${logiciel.nomLogiciel}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${logiciel.Taille}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${logiciel.DescriptionLogiciel}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${logiciel.Dependences}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                            <td><button class=\"btn btn-danger\"><i class=\"fa fa-ban\"></i></button> </td>\r\n");
          out.write("                                            <td><button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#exampleModal\">\r\n");
          out.write("                                            Edit\r\n");
          out.write("                                            </button> </td>\r\n");
          out.write("                                        </tr>\r\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
