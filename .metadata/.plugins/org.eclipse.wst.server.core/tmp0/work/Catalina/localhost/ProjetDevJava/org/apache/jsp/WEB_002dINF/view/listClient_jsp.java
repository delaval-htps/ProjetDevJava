/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.36
 * Generated at: 2020-10-19 09:54:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listClient_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/view/nav.jsp", Long.valueOf(1602113270024L));
    _jspx_dependants.put("/WEB-INF/lib/javax.servlet.jsp.jstl-1.2.1.jar", Long.valueOf(1599490641995L));
    _jspx_dependants.put("/WEB-INF/view/sidebar.jsp", Long.valueOf(1601838350012L));
    _jspx_dependants.put("jar:file:/home/delaval/Documents/ProjetDevJava/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ProjetDevJava/WEB-INF/lib/javax.servlet.jsp.jstl-1.2.1.jar!/META-INF/c.tld", Long.valueOf(1323254778000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "Les JSPs ne permettent que GET, POST ou HEAD. Jasper permet aussi OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Liste des Clients</title>\n");
      out.write("<link rel=\"icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/favicon.ico\" type=\"image/x-icon\" />\n");
      out.write("<meta\n");
      out.write("\t\t\tname=\"viewport\"\n");
      out.write("\t\t\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\"\n");
      out.write(">\n");
      out.write("<link\n");
      out.write("\t\t\trel=\"stylesheet\"\n");
      out.write("\t\t\ttype=\"text/css\"\n");
      out.write("\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/mycss.css\"\n");
      out.write(">\n");
      out.write("<link\n");
      out.write("\t\t\trel=\"stylesheet\"\n");
      out.write("\t\t\thref=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\"\n");
      out.write("\t\t\tintegrity=\"sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z\"\n");
      out.write("\t\t\tcrossorigin=\"anonymous\"\n");
      out.write(">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t\t\t<div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.write("<nav\n");
      out.write("\t\t\tid=\"sidebarMenu\"\n");
      out.write("\t\t\tclass=\"col-md-3 col-lg-2 border-right  collapse show  \"\n");
      out.write(">\n");
      out.write("\t\t\t<div class=\"position-sticky\">\n");
      out.write("\t\t\t\t\t\t<div class=\"row \">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"navbar-brand ml-2 pt-3 \"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/\"\n");
      out.write("\t\t\t\t\t\t\t\t\t> <img\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/images/logoCrm.svg\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\twidth=\"30\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\theight=\"30\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"d-inline-block align-top\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\talt=\"\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tloading=\"lazy\"\n");
      out.write("\t\t\t\t\t\t\t\t\t><span class=\" pl-1 h5  align-middle text-dark \">CRM</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav flex-column justify-content-start pt-5 \">\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item\"><a\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"nav-link active\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\taria-current=\"page\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/\"\n");
      out.write("\t\t\t\t\t\t\t\t\t> <span data-feather=\"home\"></span> Home\n");
      out.write("\t\t\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item\"><a\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"nav-link\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/client/list\"\n");
      out.write("\t\t\t\t\t\t\t\t\t> <span data-feather=\"Clients\"></span> Clients\n");
      out.write("\t\t\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item\"><a\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"nav-link\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/docs/html/index.html\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"_blank\"\n");
      out.write("\t\t\t\t\t\t\t\t\t> <span data-feather=\"Docs\"></span> Doc Générale\n");
      out.write("\t\t\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item\"><a\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"nav-link\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/docs/javadoc/index.html\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget=\"_blank\"\n");
      out.write("\t\t\t\t\t\t\t\t\t> <span data-feather=\"Docs\"></span> Javadoc\n");
      out.write("\t\t\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tid=\"main\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"col  \"\n");
      out.write("\t\t\t\t\t\t\t\t\t>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-12 p-0\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      out.write("\n");
      out.write("<nav\n");
      out.write("\t\t\tclass=\" navbar navbar-expand-lg  border-bottom mb-2 \"\n");
      out.write(">\n");
      out.write("\n");
      out.write("\t\t\t<!-- bouton de collapse pour le sidebar vertical -->\n");
      out.write("\t\t\t<buton class=\"btn btn-outline-light mr-2\"> <img\n");
      out.write("\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/images/icones/arrow-left-right.svg\"\n");
      out.write("\t\t\t\t\t\tdata-toggle=\"collapse\"\n");
      out.write("\t\t\t\t\t\tdata-target=\"#sidebarMenu\"\n");
      out.write("\t\t\t\t\t\taria-expanded=\"false\"\n");
      out.write("\t\t\t\t\t\taria-controls=\"sidebarMenu\"\n");
      out.write("\t\t\t/> </buton>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\t\t<form class=\"form-inline my-2 my-lg-0 \">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"form-control mr-sm-2\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttype=\"search\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"Search...\"\n");
      out.write("\t\t\t\t\t\t\t\t\t>\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- \t\t\t\t<button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button> -->\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t<span class=\"navbar-text ml-auto p-2\"> Connexion </span> <!-- ml-auto permet de mettre au fond de la ligne l'element -->\n");
      out.write("\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-12 \">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"card shadow  mb-5 bg-white rounded\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"card-header listClientHeader \">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/images/icones/people.svg\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth=\"28\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\theight=\"28\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t/> <span class=\"h5 align-middle pl-1\">Clients</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"btn btn-sm btn-outline-primary ml-auto\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\thref=\"formNewClient\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\trole=\"button\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>Nouveau Client</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div> -->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"card-body\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table class=\" table-hover table  \">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<caption >\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tImage par <a\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\thref=\"https://pixabay.com/fr/users/whitesession-4645995/?utm_source=link-attribution&amp;utm_medium=referral&amp;utm_campaign=image&amp;utm_content=2756210\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>Angelo Esslinger</a> et <a\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\thref=\"https://pixabay.com/fr/users/nastya_gepp-3773230/?utm_source=link-attribution&amp;utm_medium=referral&amp;utm_campaign=image&amp;utm_content=3560917\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>Anastasia Gepp</a> de <a\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\thref=\"https://pixabay.com/fr/?utm_source=link-attribution&amp;utm_medium=referral&amp;utm_campaign=image&amp;utm_content=2756210\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t>Pixabay</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</caption>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<thead class=\"thead\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th scope=\"col\"></th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th scope=\"col\">Nom</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th scope=\"col\">Prénom</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th scope=\"col\">Numéro Tel</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th scope=\"col\">Email</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th scope=\"col\">Société</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</thead>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tbody>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<script\n");
      out.write("\t\t\t\t\t\tsrc=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"\n");
      out.write("\t\t\t\t\t\tintegrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\"\n");
      out.write("\t\t\t\t\t\tcrossorigin=\"anonymous\"\n");
      out.write("\t\t\t></script>\n");
      out.write("\t\t\t<script\n");
      out.write("\t\t\t\t\t\tsrc=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"\n");
      out.write("\t\t\t\t\t\tintegrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\"\n");
      out.write("\t\t\t\t\t\tcrossorigin=\"anonymous\"\n");
      out.write("\t\t\t></script>\n");
      out.write("\t\t\t<script\n");
      out.write("\t\t\t\t\t\tsrc=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"\n");
      out.write("\t\t\t\t\t\tintegrity=\"sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV\"\n");
      out.write("\t\t\t\t\t\tcrossorigin=\"anonymous\"\n");
      out.write("\t\t\t></script>\n");
      out.write("\n");
      out.write("\t\t\t<!--  js permettant de selectionner une ligne de tableau directement -->\n");
      out.write("\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\t$('tr[data-href]').on(\"click\", function() {\n");
      out.write("\t\t\t\t\tdocument.location = $(this).data('href');\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t</script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/view/listClient.jsp(95,30) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/view/listClient.jsp(95,30) '${clients}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${clients}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/view/listClient.jsp(95,30) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("client");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr data-href=\"select?id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${client.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\">\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"tdImgList\"\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tscope=\"row\"\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"align-middle text-center\"\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t><img\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"rounded-circle \"\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\theight=\"42\"\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth=\"42\"\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("/resources/images/photos/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${client.photo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\talt=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${client.nom.charAt(0)}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t/></td>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"align-middle\"><span\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"font-weight-bold font-italic\"\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t> ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${client.nom}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</span></td>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"align-middle\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${client.prenom}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"align-middle\">0");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${client.numeroTel}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"align-middle\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${client.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"align-middle\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${client.nomSociete}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}