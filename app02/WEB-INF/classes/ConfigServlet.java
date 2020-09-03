import java.io.*;
import javax.servlet.*;
import java.util.*;

public class ConfigServlet extends GenericServlet
{
	public void service(ServletRequest request,ServletResponse response)throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		ServletConfig config=getServletConfig();
		String lname=config.getServletName();
		String driverClass=config.getInitParameter("driverClass");
		String url=config.getInitParameter("url");
		String username=config.getInitParameter("username");
		String password=config.getInitParameter("password");
		Enumeration e=config.getInitParameterNames();
		String paramNames="";
		while(e.hasMoreElements())
		{
			paramNames=paramNames+e.nextElement()+"<br>";
		}
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>");
		out.println("Logical Name: "+lname+"<br>");
		out.println("Driver Class: "+driverClass+"<br>");
		out.println("URL: "+url+"<br>");
		out.println("User Name: "+username+"<br>");
		out.println("password: "+password+"<br>");
		out.println("Initialisation Parameter Names <br>");
		out.println(paramNames);
		out.println("</h1></body></html>");

	}
}