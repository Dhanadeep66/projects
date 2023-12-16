import java.io.*;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class signup_servlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
//		res.setContentType("text/html");
        String fname = req.getParameter("fname");
        String lname = req.getParameter("lname");
        String email = req.getParameter("email");
        String pass = req.getParameter("pass");
        String date = req.getParameter("date");
        String address = req.getParameter("address");
        String address1 = req.getParameter("address1");
        String number = req.getParameter("number");
        String zip = req.getParameter("zip");
        String city = req.getParameter("city");
        String state = req.getParameter("state");
        String country = req.getParameter("country");
		try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","baradwaz","b1234");
            String vsql = "insert into sign_up(firstname, lastname, email, pass, birth_date, address, address1, mobile_number, zip, city, state, country) values(?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(vsql);
            ps.setString(1,fname);
            ps.setString(2,lname);
            ps.setString(3,email);
            ps.setString(4,pass);
            ps.setString(5,date);
            ps.setString(6,address);
            ps.setString(7,address1);
            ps.setString(8,number);
            ps.setString(9,zip);
            ps.setString(10,city);
            ps.setString(11,state);
            ps.setString(12,country);
            ps.executeUpdate();
            PrintWriter out1 = res.getWriter();
//            int i=ps.executeUpdate();  
//            if(i>0) { 
            	out1.print("You are successfully registered...");  
//            }
            ps.close();
        }catch(Exception e){
        	PrintWriter out1 = res.getWriter();
            out1.println(e);
        }
	}
}