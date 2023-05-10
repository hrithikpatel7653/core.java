package in.co.rays.ctl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/second", "/patel", "/ba", "*.do" })
public class SecondServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String login = req.getParameter("login");
		String pwd = req.getParameter("pwd");

		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();

		out.println("<h1> Hello, Second Servlet</h1>");

		out.println(fname + " " + lname + " " + login + " " + pwd);

		out.close();

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String login = req.getParameter("login");
		String pwd = req.getParameter("pwd");

		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();

		out.println("<h1> Hello, Second Servlet</h1>");

		out.println(fname + " " + lname + " " + login + " " + pwd);

		out.close();
	}

}
