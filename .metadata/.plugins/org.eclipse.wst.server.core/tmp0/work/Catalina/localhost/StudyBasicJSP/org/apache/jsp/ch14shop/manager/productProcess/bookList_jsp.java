/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.26
 * Generated at: 2020-08-29 21:52:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.ch14shop.manager.productProcess;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ch14.bookshop.master.ShopBookDBBean;
import ch14.bookshop.master.ShopBookDataBean;
import java.util.List;
import java.text.SimpleDateFormat;

public final class bookList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {


    SimpleDateFormat sdf = 
        new SimpleDateFormat("yyyy-MM-dd HH:mm");

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
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("ch14.bookshop.master.ShopBookDBBean");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
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
      out.write("\r\n");
 
  String bodyback_c="#e0ffff";
  String back_c="#8fbc8f";
  String title_c="#5f9ea0";
  String value_c="#b0e0e6";
  String bar="#778899";

      out.write(" \r\n");
      out.write("\r\n");

String managerId ="";
try{
	managerId = (String)session.getAttribute("managerId");
	if(managerId==null || managerId.equals("")){
       response.sendRedirect("../logon/managerLoginForm.jsp");
	}else{

      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
     
    int number =0;
    String book_kind="";
    
    List<ShopBookDataBean> bookList = null;
    book_kind = request.getParameter("book_kind");
 
    ShopBookDBBean bookProcess = ShopBookDBBean.getInstance();
    int count = bookProcess.getBookCount();    
    
    if (count > 0) {
    	bookList = bookProcess.getBooks(book_kind);
    }

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>등록된 책 목록</title>\r\n");
      out.write("<link href=\"../../etc/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"");
      out.print(bodyback_c);
      out.write("\">\r\n");

   String book_kindName="";
   if(book_kind.equals("100")){
	   book_kindName="문학";
   }else if(book_kind.equals("200")){
	   book_kindName="외국어";  
   }else if(book_kind.equals("300")){
	   book_kindName="컴퓨터";
   }else if(book_kind.equals("all")){
	   book_kindName="전체";
   }

      out.write("\r\n");
      out.write("<a href=\"../managerMain.jsp\"> 관리자 메인으로</a> &nbsp;\r\n");
      out.write("<p>");
      out.print(book_kindName);
      out.write(" 분류의 목록: \r\n");
if(book_kind.equals("all")){
      out.write(" \r\n");
      out.write("    ");
      out.print(count);
      out.write('개');
      out.write('\r');
      out.write('\n');
}else{
      out.write("\r\n");
      out.write("    ");
      out.print(bookList.size() );
      out.write('개');
      out.write('\r');
      out.write('\n');
} 
      out.write("\r\n");
      out.write("</p>\r\n");
      out.write("<table>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td align=\"right\" bgcolor=\"");
      out.print(value_c);
      out.write("\">\r\n");
      out.write("       <a href=\"bookRegisterForm.jsp\">책 등록</a>\r\n");
      out.write("    </td>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");

  if (count == 0) {

      out.write("\r\n");
      out.write("<table>\r\n");
      out.write("<tr>\r\n");
      out.write("   <td align=\"center\">\r\n");
      out.write("           등록된 책이 없습니다.\r\n");
      out.write("   </td>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
} else {
      out.write("\r\n");
      out.write("<table> \r\n");
      out.write("    <tr height=\"30\" bgcolor=\"");
      out.print(value_c);
      out.write("\"> \r\n");
      out.write("      <td align=\"center\"  width=\"30\">번호</td> \r\n");
      out.write("      <td align=\"center\"  width=\"30\">책분류</td> \r\n");
      out.write("      <td align=\"center\"  width=\"100\">제목</td>\r\n");
      out.write("      <td align=\"center\"  width=\"50\">가격</td> \r\n");
      out.write("      <td align=\"center\"  width=\"50\">수량</td> \r\n");
      out.write("      <td align=\"center\"  width=\"70\">저자</td>\r\n");
      out.write("      <td align=\"center\"  width=\"70\">출판사</td>\r\n");
      out.write("      <td align=\"center\"  width=\"50\">출판일</td>\r\n");
      out.write("      <td align=\"center\"  width=\"50\">책이미지</td>\r\n");
      out.write("      <td align=\"center\"  width=\"30\">할인율</td>\r\n");
      out.write("      <td align=\"center\"  width=\"70\">등록일</td>\r\n");
      out.write("      <td align=\"center\"  width=\"50\">수정</td>\r\n");
      out.write("      <td align=\"center\"  width=\"50\">삭제</td>         \r\n");
      out.write("    </tr>\r\n");
  
    for (int i = 0 ; i <bookList.size() ; i++) {
      ShopBookDataBean book = 
    		  (ShopBookDataBean)bookList.get(i);

      out.write("\r\n");
      out.write("   <tr height=\"30\">\r\n");
      out.write("      <td width=\"30\">");
      out.print(++number);
      out.write("</td> \r\n");
      out.write("      <td width=\"30\">");
      out.print(book.getBook_kind());
      out.write("</td> \r\n");
      out.write("      <td width=\"100\" align=\"left\">\r\n");
      out.write("           ");
      out.print(book.getBook_title());
      out.write("</td>\r\n");
      out.write("      <td width=\"50\" align=\"right\">");
      out.print(book.getBook_price());
      out.write("</td> \r\n");
      out.write("      <td width=\"50\" align=\"right\">\r\n");
      out.write("      ");
 if(book.getBook_count()==0) {
      out.write("\r\n");
      out.write("         <font color=\"red\">");
      out.print("일시품절");
      out.write("</font>\r\n");
      out.write("      ");
 }else{ 
      out.write("\r\n");
      out.write("         ");
      out.print(book.getBook_count());
      out.write("\r\n");
      out.write("      ");
} 
      out.write("\r\n");
      out.write("      </td> \r\n");
      out.write("      <td width=\"70\">");
      out.print(book.getAuthor());
      out.write("</td>\r\n");
      out.write("      <td width=\"70\">");
      out.print(book.getPublishing_com());
      out.write("</td>\r\n");
      out.write("      <td width=\"50\">");
      out.print(book.getPublishing_date());
      out.write("</td>\r\n");
      out.write("      <td width=\"50\">");
      out.print(book.getBook_image());
      out.write("</td>\r\n");
      out.write("      <td width=\"50\">");
      out.print(book.getDiscount_rate());
      out.write("</td>\r\n");
      out.write("      <td width=\"50\">");
      out.print(sdf.format(book.getReg_date()));
      out.write("</td>\r\n");
      out.write("      <td width=\"50\">\r\n");
      out.write("         <a href=\"bookUpdateForm.jsp?book_id=");
      out.print(book.getBook_id());
      out.write("&book_kind=");
      out.print(book.getBook_kind());
      out.write("\">수정</a></td>\r\n");
      out.write("      <td width=\"50\">\r\n");
      out.write("         <a href=\"bookDeleteForm.jsp?book_id=");
      out.print(book.getBook_id());
      out.write("&book_kind=");
      out.print(book.getBook_kind());
      out.write("\">삭제</a></td>    \r\n");
      out.write("   </tr>\r\n");
}
      out.write("\r\n");
      out.write("</table>\r\n");
}
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<a href=\"../managerMain.jsp\"> 관리자 메인으로</a> \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
 
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