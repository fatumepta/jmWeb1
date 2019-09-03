package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class MultiplyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        try {

            String value = req.getParameter("value");
            resp.getWriter().println(Integer.parseInt(value) * 2);
            resp.setStatus(HttpServletResponse.SC_OK);

        } catch (NumberFormatException nfe) {
            resp.getWriter().println(0);
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }
    }
}
