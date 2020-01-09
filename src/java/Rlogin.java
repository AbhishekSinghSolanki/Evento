import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lenovo
 */
@WebServlet(urlPatterns = {"/Rlogin"})
public class Rlogin extends HttpServlet {

   @Override
   public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{  
    
           
           response.setContentType("text/html");
           PrintWriter out = response.getWriter();
           
           String n=request.getParameter("username");
           String p=request.getParameter("pass");
                
           if (login.validate(n, p)){
               RequestDispatcher rd=request.getRequestDispatcher("loginservices.html");
               rd.forward(request,response);
           }
           else {
               out.print("<span style='padding:5px;color:#e74c3c;text-align:center;border:2px solid #e74c3c;font-weight:bold;font-size:1.3em;'>Sorry username or password error</span>");
               RequestDispatcher rd=request.getRequestDispatcher("login.html");
               rd.include(request,response);
           }
           out.close();
}
}
