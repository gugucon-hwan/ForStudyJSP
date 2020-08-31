/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.26
 * Generated at: 2020-08-30 05:28:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.ch14shop.manager.productProcess;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Timestamp;
import ch14.bookshop.master.ShopBookDBBean;
import ch14.bookshop.master.ShopBookDataBean;

public final class bookUpdateForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/ch14shop/manager/productProcess/../../etc/color.jspf", Long.valueOf(1598449217976L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.sql.Timestamp");
    _jspx_imports_classes.add("ch14.bookshop.master.ShopBookDBBean");
    _jspx_imports_classes.add("ch14.bookshop.master.ShopBookDataBean");
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
      out.write("\r\n");
 
  String bodyback_c="#e0ffff";
  String back_c="#8fbc8f";
  String title_c="#5f9ea0";
  String value_c="#b0e0e6";
  String bar="#778899";

      out.write(" \r\n");
      out.write(" \r\n");

String managerId ="";
try{
   managerId = (String)session.getAttribute("managerId");
   if(managerId==null || managerId.equals("")){
      response.sendRedirect("../logon/managerLoginForm.jsp");
}else{

      out.write('\r');
      out.write('\n');

int book_id = Integer.parseInt(request.getParameter("book_id"));
String book_kind = request.getParameter("book_kind");
try{
	ShopBookDBBean bookProcess = ShopBookDBBean.getInstance();
    ShopBookDataBean book =  bookProcess.getBook(book_id); 

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>상품수정</title>\r\n");
      out.write("<link href=\"../../etc/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"../../etc/script.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"");
      out.print(bodyback_c);
      out.write("\">\r\n");
      out.write("<p>책 수정</p>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<form method=\"post\" name=\"writeform\" \r\n");
      out.write("   action=\"bookUpdatePro.jsp\"  enctype=\"multipart/form-data\">\r\n");
      out.write("<table>\r\n");
      out.write("   <tr>\r\n");
      out.write("    <td align=\"right\" colspan=\"2\" bgcolor=\"");
      out.print(value_c);
      out.write("\">\r\n");
      out.write("\t    <a href=\"../managerMain.jsp\"> 관리자 메인으로</a> &nbsp;\r\n");
      out.write("\t    <a href=\"bookList.jsp?book_kind=");
      out.print(book_kind);
      out.write("\">목록으로</a>\r\n");
      out.write("   </td>\r\n");
      out.write("   </tr>\r\n");
      out.write("   <tr>\r\n");
      out.write("    <td  width=\"100\"  bgcolor=\"");
      out.print(value_c);
      out.write("\">분류 선택</td>\r\n");
      out.write("    <td  width=\"400\"  align=\"left\">\r\n");
      out.write("       <select name=\"book_kind\">\r\n");
      out.write("           <option value=\"100\" \r\n");
      out.write("             ");
if (book.getBook_kind().equals("100")) {
      out.write("selected");
} 
      out.write("\r\n");
      out.write("              >문학</option>\r\n");
      out.write("           <option value=\"200\" \r\n");
      out.write("             ");
if (book.getBook_kind().equals("200")) {
      out.write("selected");
} 
      out.write("\r\n");
      out.write("             >외국어</option>\r\n");
      out.write("           <option value=\"300\" \r\n");
      out.write("             ");
if (book.getBook_kind().equals("300")) {
      out.write("selected");
} 
      out.write("\r\n");
      out.write("             >컴퓨터</option>\r\n");
      out.write("       </select>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td  width=\"100\"  bgcolor=\"");
      out.print(value_c);
      out.write("\">제 목</td>\r\n");
      out.write("    <td  width=\"400\" align=\"left\">\r\n");
      out.write("        <input type=\"text\" size=\"50\" maxlength=\"50\" name=\"book_title\" \r\n");
      out.write("            value=\"");
      out.print(book.getBook_title() );
      out.write("\">\r\n");
      out.write("        <input type=\"hidden\" name=\"book_id\" value=\"");
      out.print(book_id);
      out.write("\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td  width=\"100\"  bgcolor=\"");
      out.print(value_c);
      out.write("\">가 격</td>\r\n");
      out.write("    <td  width=\"400\" align=\"left\">\r\n");
      out.write("        <input type=\"text\" size=\"10\" maxlength=\"9\" name=\"book_price\" \r\n");
      out.write("          value=\"");
      out.print(book.getBook_price() );
      out.write("\">원</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td  width=\"100\"  bgcolor=\"");
      out.print(value_c);
      out.write("\">수량</td>\r\n");
      out.write("    <td  width=\"400\" align=\"left\">\r\n");
      out.write("        <input type=\"text\" size=\"10\" maxlength=\"5\" name=\"book_count\" \r\n");
      out.write("          value=\"");
      out.print(book.getBook_count() );
      out.write("\">권</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("   <tr>\r\n");
      out.write("    <td  width=\"100\"  bgcolor=\"");
      out.print(value_c);
      out.write("\">저자</td>\r\n");
      out.write("    <td  width=\"400\" align=\"left\">\r\n");
      out.write("        <input type=\"text\" size=\"10\" maxlength=\"5\" name=\"author\" \r\n");
      out.write("          value=\"");
      out.print(book.getAuthor());
      out.write("\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td  width=\"100\"  bgcolor=\"");
      out.print(value_c);
      out.write("\">출판사</td>\r\n");
      out.write("    <td  width=\"400\" align=\"left\">\r\n");
      out.write("        <input type=\"text\" size=\"20\" maxlength=\"30\" name=\"publishing_com\" \r\n");
      out.write("          value=\"");
      out.print(book.getPublishing_com() );
      out.write("\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td  width=\"100\"  bgcolor=\"");
      out.print(value_c);
      out.write("\">출판일</td>\r\n");
      out.write("    <td  width=\"400\" align=\"left\">\r\n");
      out.write("        <select name=\"publishing_year\">\r\n");
      out.write("        ");

        Timestamp nowTime  = new Timestamp(System.currentTimeMillis());
        int lastYear = Integer.parseInt(nowTime.toString().substring(0,4));
           for(int i=lastYear;i>=2010;i--){
        
      out.write("\r\n");
      out.write("             <option value=\"");
      out.print(i );
      out.write("\"  \r\n");
      out.write("             ");
if (Integer.parseInt(book.getPublishing_date().substring(0,4))==i) {
      out.write("\r\n");
      out.write("             selected");
} 
      out.write('>');
      out.print(i );
      out.write("</option>\r\n");
      out.write("        ");
} 
      out.write("\r\n");
      out.write("        </select>년\r\n");
      out.write("        \r\n");
      out.write("        <select name=\"publishing_month\">\r\n");
      out.write("        ");

           for(int i=1;i<=12;i++){
        
      out.write("\r\n");
      out.write("             <option value=\"");
      out.print(i );
      out.write("\" \r\n");
      out.write("             ");
if (Integer.parseInt(book.getPublishing_date().substring(5,7))==i) {
      out.write("\r\n");
      out.write("               selected");
} 
      out.write('>');
      out.print(i );
      out.write("</option>\r\n");
      out.write("        ");
} 
      out.write("\r\n");
      out.write("        </select>월\r\n");
      out.write("        \r\n");
      out.write("        <select name=\"publishing_day\">\r\n");
      out.write("        ");

           for(int i=1;i<=31;i++){
        
      out.write("\r\n");
      out.write("             <option value=\"");
      out.print(i );
      out.write("\" \r\n");
      out.write("             ");
if (Integer.parseInt(book.getPublishing_date().substring(8))==i) {
      out.write("\r\n");
      out.write("               selected");
} 
      out.write('>');
      out.print(i );
      out.write("</option>\r\n");
      out.write("        ");
} 
      out.write("\r\n");
      out.write("        </select>일\r\n");
      out.write("     </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td  width=\"100\"  bgcolor=\"");
      out.print(value_c);
      out.write("\">이미지</td>\r\n");
      out.write("    <td  width=\"400\" align=\"left\">\r\n");
      out.write("        <input type=\"file\" name=\"book_image\">");
      out.print(book.getBook_image() );
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td  width=\"100\"  bgcolor=\"");
      out.print(value_c);
      out.write("\">내 용</td>\r\n");
      out.write("    <td  width=\"400\" align=\"left\">\r\n");
      out.write("     <textarea name=\"book_content\" rows=\"13\" \r\n");
      out.write("         cols=\"40\">");
      out.print(book.getBook_content() );
      out.write("</textarea> </td>\r\n");
      out.write("  </tr>\r\n");
      out.write(" <tr>\r\n");
      out.write("    <td  width=\"100\"  bgcolor=\"");
      out.print(value_c);
      out.write("\">할인율</td>\r\n");
      out.write("    <td  width=\"400\" align=\"left\">\r\n");
      out.write("        <input type=\"text\" size=\"5\" maxlength=\"2\" name=\"discount_rate\" \r\n");
      out.write("          value=\"");
      out.print(book.getDiscount_rate() );
      out.write("\">%</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("<tr>      \r\n");
      out.write(" <td colspan=2 bgcolor=\"");
      out.print(value_c);
      out.write("\" align=\"center\"> \r\n");
      out.write("  <input type=\"button\" value=\"책수정\" onclick=\"updateCheckForm(this.form)\">  \r\n");
      out.write("  <input type=\"reset\" value=\"다시작성\">\r\n");
      out.write("</td></tr></table>         \r\n");
      out.write("</form>   \r\n");

}catch(Exception e){
	e.printStackTrace();
}
      out.write("         \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
 
  }
}catch(Exception e){
	e.printStackTrace();
}

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
