import java.io.*;
import javax.servlet.*;
import java.util.*;

public class ContextServlet extends GenericServlet
{
	public void service(ServletRequest request,ServletResponse response)throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		ServletContext context=getServletContext();
		String lname=context.getServletContextName();
		String driverClass=context.getInitParameter("driverClass");
		String url=context.getInitParameter("url");
		String username=context.getInitParameter("username");
		String password=context.getInitParameter("password");
		Enumeration e=context.getInitParameterNames();
		String paramNames="";
		while(e.hasMoreElements())
		{
			paramNames=paramNames+e.nextElement()+"<br>";
		}

		context.setAttribute("cid","c-1111");
		context.setAttribute("cname","JAVA");
		context.setAttribute("ccost",10000);

		String cid=(String) context.getAttribute("cid");
		String cname=(String) context.getAttribute("cname");
		int ccost=(Integer) context.getAttribute("ccost");
		e=context.getAttributeNames();
		String attrNames="";
		while(e.hasMoreElements())
		{
			attrNames=attrNames+e.nextElement()+"<br>";
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
		out.println("Course ID: "+cid+"<br>");
		out.println("Course Name: "+cname+"<br>");
		out.println("Course Cost: "+ccost+"<br>");
		out.println("Attribute Names <br>");
		out.println(attrNames);
		out.println("</h1></body></html>");

	}
}