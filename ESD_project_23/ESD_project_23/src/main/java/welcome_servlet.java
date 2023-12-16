import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class welcome_servlet extends HttpServlet
{
		private static final long serialVersionUID = 1L;

		public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
			PrintWriter out1 = res.getWriter();

			String uname = (String)req.getParameter("name");
			
			out1.println("Welcome : " + uname);
		}
}
