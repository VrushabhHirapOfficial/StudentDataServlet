import jakarta.servlet.*;

// import java.beans.Statement;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Login extends GenericServlet {
      public void init(ServletConfig sc) throws ServletException {
            // it is used to initilize servlet parameters
            System.out.println("init()  is running...");

      }

      public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

      
            // try{
            //       Class.forName("com.mysql.cj.jdbc.Driver");
            //       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db_servlet","root","vruhirapsh9981");


            //       Statement statement = con.createStatement();
            //       statement.executeUpdate("CREATE TABLE sample (name VARCHAR(255) NOT NULL);");

            // }catch(Exception e){
            //       System.out.println(e.getMessage());
            // }


            System.out.println("Service() is running...");
            res.setContentType("text/html");
            PrintWriter pw = res.getWriter();
            pw.println("<html><head>");
            pw.println("<link rel=\"stylesheet\" href=\"css/style.css\">");
            

            pw.println("<h1>Student Registration Form</h1>");
            pw.println("</head><body>");
            pw.println("<div class=\"container\">");
            pw.println("<form action='http://localhost:80/StudentLoginServlet/login.php' method='POST'>"); 
            pw.println("<label for='name' >Name:</label>");
            pw.println("<input type='text' id='name' name='name' placeholder='Enter your name'><br><br>");

            pw.println("<label for='email'>Email:</label>");
            pw.println("<input type='email' id='email' name='email' placeholder='Enter your email'><br><br>");

            pw.println("<label for='rollno'>Roll No:</label>");
            pw.println("<input type='text' id='rollno' name='rollno' placeholder='Enter your roll number'><br><br>");

            pw.println("<button type='submit'>Submit</button>");
            pw.println("</form>");
            pw.println("</div>");
            pw.println("</body></html>");
      }

      public void destroy() {
            System.out.println("destroy() is running...");
      }

}