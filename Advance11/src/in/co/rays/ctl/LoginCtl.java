package in.co.rays.ctl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

@WebServlet("/LoginCtl")
public class LoginCtl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String op = req.getParameter("Operation");

		if (op != null) {

			HttpSession session = req.getSession();

			session.invalidate();

			req.setAttribute("Sucess", "Logout Sucessfully.....!!!!");

		}

		RequestDispatcher rd = req.getRequestDispatcher("LoginView.jsp");

		rd.forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String login = req.getParameter("loginId");
		String password = req.getParameter("password");

		String op = req.getParameter("operation");

		if (op.equals("SignIn")) {

			if (login.equals("") || password.equals("")) {

				if (login.equals("")) {

					req.setAttribute("val1", "LoginId is required");
				}
				if (password.equals("")) {

					req.setAttribute("val2", "Password is required");

				}

				RequestDispatcher rd = req.getRequestDispatcher("LoginView.jsp");
				rd.forward(req, resp);

			} else {

				UserModel model = new UserModel();

				try {
					UserBean bean = model.authenticate(login, password);
					if (bean != null) {

						HttpSession session = req.getSession();

						System.out.println("User valid");
						session.setAttribute("fname", bean.getFistName());
						session.setMaxInactiveInterval(20);
						String uri = req.getParameter("uri");

						if (uri.equalsIgnoreCase("null")) {

							resp.sendRedirect("WelcomeLoginCtl");

						} else {

							resp.sendRedirect(uri);
						}
					} else {
						System.out.println("User not valid");
						RequestDispatcher rd = req.getRequestDispatcher("LoginView.jsp");
						req.setAttribute("name", "Try again Invalid login Password....!!!!");
						rd.forward(req, resp);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}
		if (op.equals("SignUp")) {

			resp.sendRedirect("UserCtl");

		}
	}
}
