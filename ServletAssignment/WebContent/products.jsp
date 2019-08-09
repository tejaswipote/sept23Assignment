<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@page import="java.sql.*"%>
</head>
<body bgcolor=lightgrey>
    <%
    	String username = (String)session.getAttribute("USERNAME");
    %>
    <h1><% out.println("Welcome "+username); %></h1>
    <hr>
    <h3> Start your Shopping Here&#128722;&#128722;&#128722;&#128722;&#128722;.........</h3>
    <hr>
    </br>
    <%	
   		
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=(Connection)DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/test?characterEncoding=latin1&useConfigs=maxPerformance","root","geek@Geek123");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from product;");
    %><table  style="text-align:center">
      <thead>
          <tr>
             <th>ID</th>
             <th>NAME</th>
             <th>PRICE</th>
           
          </tr>
      </thead>
      <tbody>
        <%while(rs.next())
        {
            %>
            <tr>
                <td><%=rs.getString("product_id") %></td>
                <td><%=rs.getString("product_name") %></td>
                <td><%=rs.getString("product_price") %></td>
            
            </tr>
            <%}%>
           </tbody>
        </table><br>
    <%}
    catch(Exception e){
        out.print(e.getMessage());%><br><%
    }
    finally{
    }
    %>
   
</body>
</html>