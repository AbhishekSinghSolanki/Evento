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
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(urlPatterns = {"/Rwed"})
public class Rwed extends HttpServlet {

    public void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        PrintWriter out=response.getWriter();
    try
    {
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3307/evento", "root", "root");
        PreparedStatement st= con.prepareStatement("select * from wedevent");
       ResultSet rs= st.executeQuery();
      out.print("<head>");
       out.print("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/font-awesome.min.css\">");
       out.print("<link rel=\"stylesheet\" href=\"css/bootstrap.css\">");
       //out.print("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">");
       out.print("<link href='https://fonts.googleapis.com/css?family=Open+Sans:300,600|Raleway:600,300|Josefin+Slab:400,700,600italic,600,400italic' rel='stylesheet' type='text/css'>");
       out.print("</head>");
       //out.print("<div class=\"featured-services-grids\">");
       out.print("<table class='table table-striped table-responsive'>");
       out.print("<thead>");
       out.print("<tr>");
       out.print("<th>S.no</th>");
       out.print("<th>Name</th>");
       out.print("<th>Email</th>");
       out.print("<th>Services</th>");
       out.print("<th>Package</th>");
       out.print("<th>Email</th>");
       out.print("</tr>");
       out.print("</thead>");
       out.print("<tbody>");
        while(rs.next())
       {
       out.print("<tr>");
       out.print("<td>"+rs.getString(1)+"</td>");
       out.print("<td>"+rs.getString(2)+"</td>");
       out.print("<td>"+rs.getString(3)+"</td>");
       out.print("<td>"+rs.getString(4)+"</td>");
       out.print("<td>"+rs.getString(5)+"</td>");
       out.print("<td>"+rs.getString(6)+"</td>");
       out.print("</tr>");    
       }
       out.print("</tbody>");       
        con.close();         
    } 
    catch(Exception ex){
       // ex.printStackTrace();
        System.out.println(ex);
        out.println(ex);
    }
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
