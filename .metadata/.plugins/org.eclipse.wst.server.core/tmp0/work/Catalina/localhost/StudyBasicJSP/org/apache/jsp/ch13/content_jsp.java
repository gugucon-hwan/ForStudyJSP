/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.26
 * Generated at: 2020-08-22 21:15:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.ch13;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ch13.board.BoardDataBean;
import ch13.board.BoardDBBean;
import java.text.SimpleDateFormat;

public final class content_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("ch13.board.BoardDBBean");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("ch13.board.BoardDataBean");
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
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"");
      out.print(bodyback_c);
      out.write("\">\r\n");
      out.write("\t");

		int num=Integer.parseInt(request.getParameter("num"));
		String pageNum=request.getParameter("pageNum");
		
		SimpleDateFormat sdf=
				new SimpleDateFormat("yyyy-MM-dd HH:mm");
		try{
			BoardDBBean dbPro=BoardDBBean.getInstance();
			BoardDataBean article =dbPro.getArticle(num);
			
			int ref=article.getRef();
			int re_step=article.getRe_step();
			int re_level=article.getRe_level();	
	
      out.write("\r\n");
      out.write("\t<p>글내용 보기</p>\r\n");
      out.write("\t<form>\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr height=\"30\">\r\n");
      out.write("\t\t\t\t<td align=\"center\" width=\"125\" bgcolor=\"");
      out.print(value_c);
      out.write("\">글번호</td>\r\n");
      out.write("\t\t\t\t<td align=\"center\" width=\"125\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t");
      out.print(article.getNum() );
      out.write("\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td align=\"center\" width=\"125\" bgcolor=\"");
      out.print(value_c );
      out.write("\">조회수</td>\r\n");
      out.write("\t\t\t\t<td align=\"center\" width=\"125\" >\r\n");
      out.write("\t\t\t\t\t");
      out.print(article.getReadcount());
      out.write("</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr height=\"30\">\r\n");
      out.write("\t\t\t\t<td align=\"center\" width=\"125\" bgcolor=\"");
      out.print(value_c );
      out.write("\">작성자</td>\r\n");
      out.write("\t\t\t\t<td align=\"center\" width=\"125\" >\r\n");
      out.write("\t\t\t\t\t");
      out.print(article.getWriter() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td align=\"center\" width=\"125\" bgcolor=\"");
      out.print(value_c );
      out.write("\">작성일</td>\r\n");
      out.write("\t\t\t\t<td align=\"center\" width=\"125\" >\r\n");
      out.write("\t\t\t\t\t");
      out.print(sdf.format(article.getReg_date()) );
      out.write("\r\n");
      out.write("\t\t\t\t</td>\t\t\t\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr height=\"30\">\r\n");
      out.write("\t\t\t\t<td align=\"center\" width=\"125\" bgcolor=\"");
      out.print(value_c );
      out.write("\">글제목</td>\r\n");
      out.write("\t\t\t\t<td align=\"center\" width=\"375\" colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t");
      out.print(article.getSubject() );
      out.write("\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"center\" width=\"125\" bgcolor=\"");
      out.print(value_c );
      out.write("\">글내용</td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" width=\"375\" colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t<pre>");
      out.print(article.getContent() );
      out.write("</pre>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr height=\"30\">\r\n");
      out.write("\t\t\t\t<td colspan=\"4\" bgcolor=\"");
      out.print(value_c );
      out.write("\" align=\"right\">\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" value=\"글수정\" onclick=\"document.location.href='updateForm.jsp?num=");
      out.print(article.getNum() );
      out.write("&pageNum=");
      out.print(pageNum );
      out.write("'\">\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" value=\"글삭제\" onclick=\"document.location.href='deleteForm.jsp?num=");
      out.print(article.getNum() );
      out.write("&pageNum=");
      out.print(pageNum );
      out.write("'\">\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" value=\"댓글쓰기\" onclick=\"document.location.href='writeForm.jsp?num=");
      out.print(num );
      out.write("&ref=");
      out.print(ref );
      out.write("&re_step=");
      out.print(re_step );
      out.write("&re_level=");
      out.print(re_level );
      out.write("'\">\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" value=\"글목록\"\r\n");
      out.write("\t\t\t\t\tonclick=\"document.location.href='list.jsp?pageNum=");
      out.print(pageNum );
      out.write("'\">\r\n");
      out.write("\t\t\t\t</td>\t\t\t\t\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t");

		}catch(Exception e){}
		
      out.write("\r\n");
      out.write("\t</form>\r\n");
      out.write("\t\r\n");
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
