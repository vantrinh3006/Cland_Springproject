/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.34
 * Generated at: 2021-12-05 01:53:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.public_;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"clearfix slider\">\r\n");
      out.write("\t<ul class=\"pgwSlider\">\r\n");
      out.write("\t\t<li><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/public/images/thumbs/megamind_07.jpg\" alt=\"Paris, France\"\r\n");
      out.write("\t\t\tdata-description=\"Eiffel Tower and Champ de Mars\"\r\n");
      out.write("\t\t\tdata-large-src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/public/images/slides/megamind_07.jpg\" /></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<li><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/public/images/thumbs/wall-e.jpg\"\r\n");
      out.write("\t\t\talt=\"Montréal, QC, Canada\" data-large-src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/public/images/slides/wall-e.jpg\"\r\n");
      out.write("\t\t\tdata-description=\"Eiffel Tower and Champ de Mars\" /></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<li><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/public/images/thumbs/up-official-trailer-fake.jpg\"\r\n");
      out.write("\t\t\talt=\"Shanghai, China\"\r\n");
      out.write("\t\t\tdata-large-src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/public/images/slides/up-official-trailer-fake.jpg\"\r\n");
      out.write("\t\t\tdata-description=\"Shanghai ,chaina\"></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t</ul>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"clearfix content\">\r\n");
      out.write("\t<div class=\"content_title\">\r\n");
      out.write("\t\t<h2>Bài viết mới</h2>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"clearfix single_content\">\r\n");
      out.write("\t\t<div class=\"clearfix post_date floatleft\">\r\n");
      out.write("\t\t\t<div class=\"date\">\r\n");
      out.write("\t\t\t\t<h3>27</h3>\r\n");
      out.write("\t\t\t\t<p>Tháng 3</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"clearfix post_detail\">\r\n");
      out.write("\t\t\t<h2>\r\n");
      out.write("\t\t\t\t<a href=\"\">Duis sed odio sit amet nibh vulputate cursus a sit\r\n");
      out.write("\t\t\t\t\tamet mauris. </a>\r\n");
      out.write("\t\t\t</h2>\r\n");
      out.write("\t\t\t<div class=\"clearfix post-meta\">\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<span><i class=\"fa fa-clock-o\"></i> Địa chỉ: Phạm Như Xương\r\n");
      out.write("\t\t\t\t\t\t- Đà Nẵng</span> <span><i class=\"fa fa-folder\"></i> Diện tích:\r\n");
      out.write("\t\t\t\t\t\t100m2</span>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"clearfix post_excerpt\">\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/public/images/thumb.png\" alt=\"\" />\r\n");
      out.write("\t\t\t\t<p>Morbi accumsan ipsum velit. Nam nec tellus a odio tincidunt\r\n");
      out.write("\t\t\t\t\tauctor a ornare odio. Sed non mauris vitae erat consequat auctor eu\r\n");
      out.write("\t\t\t\t\tin elit. Class aptent taciti sociosqu ad litora torquent per\r\n");
      out.write("\t\t\t\t\tconubia nostra, per inceptos</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<a href=\"\">Đọc thêm</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"clearfix single_content\">\r\n");
      out.write("\t\t<div class=\"clearfix post_date floatleft\">\r\n");
      out.write("\t\t\t<div class=\"date\">\r\n");
      out.write("\t\t\t\t<h3>27</h3>\r\n");
      out.write("\t\t\t\t<p>Tháng 3</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"clearfix post_detail\">\r\n");
      out.write("\t\t\t<h2>\r\n");
      out.write("\t\t\t\t<a href=\"\">Duis sed odio sit amet nibh vulputate cursus a sit\r\n");
      out.write("\t\t\t\t\tamet mauris. </a>\r\n");
      out.write("\t\t\t</h2>\r\n");
      out.write("\t\t\t<div class=\"clearfix post-meta\">\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<span><i class=\"fa fa-clock-o\"></i> Địa chỉ: Phạm Như Xương\r\n");
      out.write("\t\t\t\t\t\t- Đà Nẵng</span> <span><i class=\"fa fa-folder\"></i> Diện tích:\r\n");
      out.write("\t\t\t\t\t\t100m2</span>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"clearfix post_excerpt\">\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/public/images/thumb.png\" alt=\"\" />\r\n");
      out.write("\t\t\t\t<p>Morbi accumsan ipsum velit. Nam nec tellus a odio tincidunt\r\n");
      out.write("\t\t\t\t\tauctor a ornare odio. Sed non mauris vitae erat consequat auctor eu\r\n");
      out.write("\t\t\t\t\tin elit. Class aptent taciti sociosqu ad litora torquent per\r\n");
      out.write("\t\t\t\t\tconubia nostra, per inceptos</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<a href=\"\">Đọc thêm</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"clearfix single_content\">\r\n");
      out.write("\t\t<div class=\"clearfix post_date floatleft\">\r\n");
      out.write("\t\t\t<div class=\"date\">\r\n");
      out.write("\t\t\t\t<h3>27</h3>\r\n");
      out.write("\t\t\t\t<p>Tháng 3</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"clearfix post_detail\">\r\n");
      out.write("\t\t\t<h2>\r\n");
      out.write("\t\t\t\t<a href=\"\">Duis sed odio sit amet nibh vulputate cursus a sit\r\n");
      out.write("\t\t\t\t\tamet mauris. </a>\r\n");
      out.write("\t\t\t</h2>\r\n");
      out.write("\t\t\t<div class=\"clearfix post-meta\">\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<span><i class=\"fa fa-clock-o\"></i> Địa chỉ: Phạm Như Xương\r\n");
      out.write("\t\t\t\t\t\t- Đà Nẵng</span> <span><i class=\"fa fa-folder\"></i> Diện tích:\r\n");
      out.write("\t\t\t\t\t\t100m2</span>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"clearfix post_excerpt\">\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/public/images/thumb.png\" alt=\"\" />\r\n");
      out.write("\t\t\t\t<p>Morbi accumsan ipsum velit. Nam nec tellus a odio tincidunt\r\n");
      out.write("\t\t\t\t\tauctor a ornare odio. Sed non mauris vitae erat consequat auctor eu\r\n");
      out.write("\t\t\t\t\tin elit. Class aptent taciti sociosqu ad litora torquent per\r\n");
      out.write("\t\t\t\t\tconubia nostra, per inceptos</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<a href=\"\">Đọc thêm</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"pagination\">\r\n");
      out.write("\t<nav>\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li><a href=\"\"> << </a></li>\r\n");
      out.write("\t\t\t<li><a href=\"\">1</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"\">2</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"\">3</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"\">4</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"\"> >> </a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</nav>\r\n");
      out.write("</div>");
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
}