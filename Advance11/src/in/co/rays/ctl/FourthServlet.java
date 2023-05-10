package in.co.rays.ctl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FourthServlet")
public class FourthServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println(" In Fourth Servlet do get ");

		String loginid = req.getParameter("loginId");
		String password = req.getParameter("password");

		System.out.println("msg :" + loginid + " " + password);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println(" In Fourth Servlet do post ");

		String loginid = req.getParameter("loginId");
		String password = req.getParameter("password");

		System.out.println("msg :" + loginid + " " + password);

	}

}
