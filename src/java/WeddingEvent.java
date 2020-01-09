/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(urlPatterns = {"/WeddingEvent"})
public class WeddingEvent extends HttpServlet {

   public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        PrintWriter out=response.getWriter();
    try
    {
        String Name= request.getParameter("name");
        String Email= request.getParameter("email");
        String Services= request.getParameter("services");
        String Package= request.getParameter("package");
        String Message= request.getParameter("message");
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3307/evento", "root", "root");
        PreparedStatement st= con.prepareStatement("insert into wedevent(`name`,`email`,`services`,`package`,`message`) values(?,?,?,?,?)");
        st.setString(1, Name);
        st.setString(2, Email);
        st.setString(3, Services);
        st.setString(4, Package);
        st.setString(5, Message);
        st.executeUpdate();
        con.close();
        
        response.sendRedirect("WeddingGallery.html");
        
    } 
    catch(Exception ex){
       // ex.printStackTrace();
        System.out.println(ex);
        out.println(ex);
    }
    }

}
