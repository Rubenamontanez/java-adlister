import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet( urlPatterns = "/login")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(username.contentEquals("isadmin") && password.contentEquals("thepassword"))
        {
            RequestDispatcher req = request.getRequestDispatcher("profile.jsp");
            req.include(request, response);
        }
        else
        {
            RequestDispatcher req = request.getRequestDispatcher("login.jsp");
            req.forward(request, response);
        }
    }

}
