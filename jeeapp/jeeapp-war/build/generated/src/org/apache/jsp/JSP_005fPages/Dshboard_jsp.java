package org.apache.jsp.JSP_005fPages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Dshboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <!-- Required meta tags-->\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"au theme template\">\n");
      out.write("    <meta name=\"author\" content=\"Hau Nguyen\">\n");
      out.write("    <meta name=\"keywords\" content=\"au theme template\">\n");
      out.write("\n");
      out.write("    <!-- Title Page-->\n");
      out.write("    <title>Dashboard</title>\n");
      out.write("\n");
      out.write("    <!-- Fontfaces CSS-->\n");
      out.write("    <link href=\"css/font-face.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <link href=\"vendor/font-awesome-4.7/css/font-awesome.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <link href=\"vendor/font-awesome-5/css/fontawesome-all.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <link href=\"vendor/mdi-font/css/material-design-iconic-font.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS-->\n");
      out.write("    <link href=\"vendor/bootstrap-4.1/bootstrap.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("\n");
      out.write("    <!-- Vendor CSS-->\n");
      out.write("    <link href=\"vendor/animsition/animsition.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <link href=\"vendor/bootstrap-progressbar/bootstrap-progressbar-3.3.4.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <link href=\"vendor/wow/animate.cs\n");
      out.write("    \n");
      out.write("    s\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <link href=\"vendor/css-hamburgers/hamburgers.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <link href=\"vendor/slick/slick.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <link href=\"vendor/select2/select2.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <link href=\"vendor/perfect-scrollbar/perfect-scrollbar.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("\n");
      out.write("    <!-- Main CSS-->\n");
      out.write("    <link href=\"css/theme.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"animsition\">\n");
      out.write("    <div class=\"page-wrapper\">\n");
      out.write("        <!-- HEADER MOBILE-->\n");
      out.write("        <header class=\"header-mobile d-block d-lg-none\">\n");
      out.write("            <div class=\"header-mobile__bar\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"header-mobile-inner\">\n");
      out.write("                        <a class=\"logo\" href=\"index.html\">\n");
      out.write("                            <img src=\"images/icon/logo.png\" alt=\"CoolAdmin\" />\n");
      out.write("                        </a>\n");
      out.write("                        <button class=\"hamburger hamburger--slider\" type=\"button\">\n");
      out.write("                            <span class=\"hamburger-box\">\n");
      out.write("                                <span class=\"hamburger-inner\"></span>\n");
      out.write("                            </span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <nav class=\"navbar-mobile\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <!-- END HEADER MOBILE-->\n");
      out.write("\n");
      out.write("        <!-- MENU SIDEBAR-->\n");
      out.write("        <aside class=\"menu-sidebar d-none d-lg-block\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <a href=\"dashboard.php\">\n");
      out.write("                    <img src=\"images/icon/logo.png\" alt=\"Cool Admin\" />\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"menu-sidebar__content js-scrollbar1\">\n");
      out.write("                <nav class=\"navbar-sidebar\">\n");
      out.write("                    <ul class=\"list-unstyled navbar__list\">\n");
      out.write("                        <li>\n");
      out.write("                        <a class=\"js-arrow\" href=\"dashboard.php\">\n");
      out.write("                                <i class=\"fas fa-tachometer-alt\"></i>Dashboard</a>\n");
      out.write("                           \n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"listelivre.php\">\n");
      out.write("                                <i class=\"fas fa-table\"></i>des livres</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"listeemp.php\">\n");
      out.write("                                <i class=\"far fa-check-square\"></i>Gestion des employés</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"listearticle.php\">\n");
      out.write("                                <i class=\"fas fa-calendar-alt\"></i>Des Articles</a>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </aside>\n");
      out.write("        <!-- END MENU SIDEBAR-->\n");
      out.write("\n");
      out.write("        <!-- PAGE CONTAINER-->\n");
      out.write("        <div class=\"page-container\">\n");
      out.write("            <!-- HEADER DESKTOP-->\n");
      out.write("            <header class=\"header-desktop\">\n");
      out.write("                <div class=\"section__content section__content--p30\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"header-wrap\">\n");
      out.write("                            <form class=\"form-header\" action=\"\" method=\"POST\">\n");
      out.write("                                \n");
      out.write("                                   \n");
      out.write("                                </button>\n");
      out.write("                            </form>\n");
      out.write("                            <div class=\"header-button\">\n");
      out.write("                                <div class=\"noti-wrap\">\n");
      out.write("                                    <div class=\"noti__item js-item-menu\">\n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"account-wrap\">\n");
      out.write("                                    <div class=\"account-item clearfix js-item-menu\">\n");
      out.write("                                        \n");
      out.write("                                        <div class=\"content\">\n");
      out.write("                                            <a class=\"js-acc-btn\" href=\"index.php\">Logout</a>\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("            <!-- HEADER DESKTOP-->\n");
      out.write("\n");
      out.write("            <!-- MAIN CONTENT-->\n");
      out.write("            <div class=\"main-content\">\n");
      out.write("                <div class=\"section__content section__content--p30\">\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- END MAIN CONTENT-->\n");
      out.write("            <!-- END PAGE CONTAINER-->\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Jquery JS-->\n");
      out.write("    <script src=\"vendor/jquery-3.2.1.min.js\"></script>\n");
      out.write("    <!-- Bootstrap JS-->\n");
      out.write("    <script src=\"vendor/bootstrap-4.1/popper.min.js\"></script>\n");
      out.write("    <script src=\"vendor/bootstrap-4.1/bootstrap.min.js\"></script>\n");
      out.write("    <!-- Vendor JS       -->\n");
      out.write("    <script src=\"vendor/slick/slick.min.js\">\n");
      out.write("    </script>\n");
      out.write("    <script src=\"vendor/wow/wow.min.js\"></script>\n");
      out.write("    <script src=\"vendor/animsition/animsition.min.js\"></script>\n");
      out.write("    <script src=\"vendor/bootstrap-progressbar/bootstrap-progressbar.min.js\">\n");
      out.write("    </script>\n");
      out.write("    <script src=\"vendor/counter-up/jquery.waypoints.min.js\"></script>\n");
      out.write("    <script src=\"vendor/counter-up/jquery.counterup.min.js\">\n");
      out.write("    </script>\n");
      out.write("    <script src=\"vendor/circle-progress/circle-progress.min.js\"></script>\n");
      out.write("    <script src=\"vendor/perfect-scrollbar/perfect-scrollbar.js\"></script>\n");
      out.write("    <script src=\"vendor/chartjs/Chart.bundle.min.js\"></script>\n");
      out.write("    <script src=\"vendor/select2/select2.min.js\">\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    <!-- Main JS-->\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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
