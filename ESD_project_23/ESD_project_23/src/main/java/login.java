import java.io.*;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class login extends HttpServlet{

  private static final long serialVersionUID = 1L;

  public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
//    res.setContentType("text/html");
        String name = req.getParameter("name");
        String pass = req.getParameter("password");
    try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","baradwaz","b1234");
            String vsql = "select * from sign_up where firstname=? and pass=?";
            PreparedStatement ps = con.prepareStatement(vsql);
            ps.setString(1,name);
            ps.setString(2,pass);
            ResultSet rs =  ps.executeQuery();
            PrintWriter out1 = res.getWriter();
            if(rs.next()) {
              req.setAttribute("name",name);
              RequestDispatcher rd = req.getRequestDispatcher("/Welcome");
              rd.forward(req,res);
            }
            else {
              out1.println("Invalid username/password");
//        RequestDispatcher rd = req.getRequestDispatcher("login.html");
//        rd.include(req,res);
            }
        }catch(Exception e){
          PrintWriter out1 = res.getWriter();
            out1.println(e);
        }
  }
}