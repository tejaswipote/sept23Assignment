import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;  
  
public class RegisterServlet extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String name=request.getParameter("userName");  
String pass=request.getParameter("userPass");  
String email=request.getParameter("userEmail");  
String country=request.getParameter("userCountry");  
          
try{ 
	
	Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/test?characterEncoding=latin1&useConfigs=maxPerformance","root","geek@Geek123");  
   
  
PreparedStatement ps=con.prepareStatement(  
"insert into userreg values(?,?,?,?)");  
  
ps.setString(1,name);  
ps.setString(2,pass);  
ps.setString(3,email);  
ps.setString(4,country);  
          
int i=ps.executeUpdate();  
if(i>0)  
out.print("You are successfully registered...");  
      
          
}catch (Exception e2) {System.out.println(e2);}  
          
out.close();  
}  
  
}  
