import java.io.*;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.*;
import java.io.IOException;
public class Attendence extends HttpServlet {
 
 public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
  String emp_id = (req.getParameter("emp_num"));
        String name = req.getParameter("emp_name");
        String number = (req.getParameter("emp_number"));
        String email = req.getParameter("emp_email");
        String session = req.getParameter("emp_attendance");
        String log = req.getParameter("emp_attendance_log");
        Date dNow = new Date( );
        SimpleDateFormat log_in_date = new SimpleDateFormat ("E yyyy.MM.dd");
        SimpleDateFormat log_in_time = new SimpleDateFormat ("hh:mm:ss a");
        String lin_date = log_in_date.format(dNow);
        String lin_time = log_in_time.format(dNow);
        SimpleDateFormat log_out_date = new SimpleDateFormat ("E yyyy.MM.dd");
        SimpleDateFormat log_out_time = new SimpleDateFormat ("hh:mm:ss a");
        String lout_date = log_out_date.format(dNow);
        String lout_time = log_out_time.format(dNow);
        
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","baradwaz","b1234");
            String vsql = "insert into ATTENDANCE(emp_id, emp_name, emp_no, emp_email, session1, emp_attendance, login_date, login_time, logout_date, logout_time)values(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(vsql);
            ps.setString(1,emp_id);
            ps.setString(2,name);
            ps.setString(3,number);
            ps.setString(4,email);
            ps.setString(5,session);
            ps.setString(6,log);
            ps.setString(7,lin_date);
            ps.setString(8,lin_time);
            ps.setString(9,lout_date);
            ps.setString(10,lout_time);
            ps.executeUpdate();
            PrintWriter out1 = res.getWriter();
              out1.print("You are successfully registered...");  
//            }
        }
        catch(Exception e)
        {
          PrintWriter out1 = res.getWriter();
            out1.println(e);
        }
  }

}
