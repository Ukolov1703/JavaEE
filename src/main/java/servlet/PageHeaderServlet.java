package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/page_header")
public class PageHeaderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        resp.getWriter().println("<table><tr>");
        resp.getWriter().println("<td><a href='" + getServletContext().getContextPath() + "/http-servlet'>HttpServlet</a></td>");
        resp.getWriter().println("<td><a href='" + getServletContext().getContextPath() + "/product'>Продукты</a></td>");
        resp.getWriter().println("</tr></table>");

        String pageHeaderLvl = (String) req.getAttribute("pageHeaderLvl");
        String header = (String) req.getAttribute("pageHeader");
        resp.getWriter().println("<" + pageHeaderLvl + ">" + header + "</" + pageHeaderLvl + ">");

        resp.getWriter().println("<hr/>");

    }
}
