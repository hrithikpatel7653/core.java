package in.co.rays.ctl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SecondForward")
public class SecondForward extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println(" In Second Forward do get ");

		String loginid = req.getParameter("loginId");
		String password = req.getParameter("password");

		//System.out.println("msg :" + loginid + " " + password);

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println(" In First Forward do post ");

		String loginid = req.getParameter("loginId");
		String password = req.getParameter("password");

		String name = (String) req.getAttribute("name");

		System.out.println("msg :" + loginid + " " + password + " " + name);

	}

}
