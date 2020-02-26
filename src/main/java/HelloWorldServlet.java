import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        if (name == null){
            response.getWriter().println("<h1>Hello World!</h1>");
        }
        else {
            response.getWriter().println("<h1>Hello, " + name + "!<h1");
//            System.out.println(name);
//            out.println(String.format( "<h1>Hello, %s !</h1>", name));
        }
    }
}