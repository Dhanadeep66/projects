import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
class output{
    public static void main(String args[])
    {
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","baradwaz","b1234");
            Statement st = con.createStatement();
            String a = "baradwaz";
            ResultSet rs = st.executeQuery("select * from attendance");
            while(rs.next()) {
            	System.out.println(rs.getString("emp_id"));
            	System.out.println(rs.getString("emp_name"));
            	System.out.println(rs.getString("emp_no"));
            	System.out.println(rs.getString("emp_email"));
            	System.out.println(rs.getString("session1"));
            	System.out.println(rs.getString("emp_attendance"));
            }
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}