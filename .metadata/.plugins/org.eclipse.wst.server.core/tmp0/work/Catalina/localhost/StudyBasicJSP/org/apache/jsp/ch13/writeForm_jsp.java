/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.26
 * Generated at: 2020-08-22 16:00:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.ch13;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class writeForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/ch13/color.jspf", Long.valueOf(1598111902189L));
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

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
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
      out.write("    ");

   String bodyback_c="#FFF0B5";
   String value_c="#FFE271";

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>게시판</title>\r\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"script.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"");
      out.print(bodyback_c);
      out.write("\">\r\n");
      out.write("\t");

		int num=0, ref=1, re_step=0,re_level=0;
		String strV="";
		try{
			if(request.getParameter("num")!=null){
				num=Integer.parseInt(request.getParameter("num"));
				ref=Integer.parseInt(request.getParameter("ref"));
				re_step=Integer.parseInt(request.getParameter("re_step"));
				re_level=Integer.parseInt(request.getParameter("re_level"));						
			}			
	
      out.write("\r\n");
      out.write("\t<p>글쓰기</p>\r\n");
      out.write("\t<form method=\"post\" name=\"writeform\" action=\"writePro.jsp\" onsubmit=\"return writeSave()\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"num\" value=\"");
      out.print(num );
      out.write("\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"ref\" value=\"");
      out.print(ref );
      out.write("\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"re_step\" value=\"");
      out.print(re_step );
      out.write("\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"re_level\" value=\"");
      out.print(re_level );
      out.write("\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"right\" colspan=\"2\" bgcolor=\"");
      out.print(value_c );
      out.write("\">\r\n");
      out.write("\t\t\t\t<a href=\"list.jsp\">글목록</a>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td width=\"70\" bgcolor=\"");
      out.print(value_c );
      out.write("\" align=\"center\">이름</td>\r\n");
      out.write("\t\t\t\t<td width=\"330\" align=\"left\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" size=\"10\" maxlength=\"10\"\r\n");
      out.write("\t\t\t\t\t\tname=\"writer\" style=\"ime-mode:active;\"></td><!-- active:한글 -->\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td width=\"70\" bgcolor=\"");
      out.print(value_c );
      out.write("\" align=\"center\">제목</td>\r\n");
      out.write("\t\t\t\t<td width=\"330\" align=\"left\">\r\n");
      out.write("\t\t\t\t");

					if(request.getParameter("num")==null)
						strV="";
					else
						strV="[답변]";
				
      out.write("\r\n");
      out.write("\t\t\t\t<input type=\"text\" size=\"40\" maxlength=\"50\" name=\"subject\"\r\n");
      out.write("\t\t\t\t\tvalue=\"");
      out.print(strV );
      out.write("\" style=\"ime-mode:active;\"></td>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"70\" bgcolor=\"");
      out.print(value_c);
      out.write("\" align=\"center\">Email</td>\r\n");
      out.write("\t\t\t\t\t<td width=\"330\" align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" size=\"40\" maxlength=\"30\" name=\"email\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"ime-mode:inactive;\"> <!-- inactive:영문 -->\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td width=\"70\" bgcolor=\"");
      out.print(value_c);
      out.write("\" align=\"center\">내용</td>\r\n");
      out.write("\t\t\t\t<td width=\"330\" align=\"left\">\r\n");
      out.write("\t\t\t\t\t<textarea name=\"content\" rows=\"13\" cols=\"40\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"ime-mode:active;\"></textarea>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td width=\"70\" bgcolor=\"");
      out.print(value_c );
      out.write("\" align=\"center\">비밀번호</td>\r\n");
      out.write("\t\t\t\t<td width=\"330\" align=\"left\">\r\n");
      out.write("\t\t\t\t\t<input type=\"password\" size=\"8\" maxlength=\"12\"\r\n");
      out.write("\t\t\t\t\t\tname=\"passwd\" style=\"ime-mode:inactive;\">\r\n");
      out.write("\t\t\t\t</td> \t\t\t\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=2 bgcolor=\"");
      out.print(value_c );
      out.write("\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"글쓰기\">\r\n");
      out.write("\t\t\t\t\t<input type=\"reset\" value=\"다시 작성\">\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" value=\"목록보기\" onclick=\"window.location='list.jsp'\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t");
}catch(Exception e){} 
      out.write("\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
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
}
