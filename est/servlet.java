import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class servlet extends HttpServlet {
    private String output;

    @Override
    public void init() throws ServletException {
        output = "Advance Java Concepts";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
        throws ServletException, IOException {
        resp.setContentType("text/html");
        try (PrintWriter out = resp.getWriter()) {
            out.println(output); // Thread-safe
        }
    }

    @Override
    public void destroy() {
        System.out.println("Servlet destroyed");
    }
}

