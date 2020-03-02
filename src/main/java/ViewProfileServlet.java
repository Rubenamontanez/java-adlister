import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

//@WebServlet(name = "ViewProfileServlet", urlPatterns = "/profile")
//public class ViewProfileServlet extends HttpServlet {
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        if (request.getSession().getAttribute("user") == null) {
//            response.sendRedirect("/login");
//        }else
//        request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);
//    }
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);
//
//    }
//}

@WebServlet(name = "ViewProfileServlet", urlPatterns = "/profile")
public class ViewProfileServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        boolean isUser = false;
        if (session.getAttribute("user") != null)
            isUser = (boolean) session.getAttribute("user");

        if (isUser) {
            request.setAttribute("username", session.getAttribute("username"));
            request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);
        } else
            request.getRequestDispatcher("/login").forward(request, response);
    }
}
