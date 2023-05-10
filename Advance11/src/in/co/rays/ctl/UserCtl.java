package in.co.rays.ctl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

@WebServlet("/UserCtl")
public class UserCtl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("id");

		// System.out.println("id =" + id);

		if (id != null) {

			UserModel model = new UserModel();

			try {
				UserBean bean = model.FindById(Integer.parseInt(id));
				req.setAttribute("bean", bean);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		RequestDispatcher rd = req.getRequestDispatcher("UserRegistration.jsp");

		rd.forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("id");
		System.out.println("id  " + id);
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String login = req.getParameter("login");
		String pwd = req.getParameter("pwd");
		String mobno = req.getParameter("mobno");

		String op = req.getParameter("Operation");

		UserBean bean = new UserBean();

		bean.setFistName(fname);
		bean.setLastName(lname);
		bean.setLoginId(login);
		bean.setPassword(pwd);
		bean.setMobileNo(mobno);

		if (op.equals("Update")) {

			System.out.println("update method");
			bean.setId(Integer.parseInt(id));

			UserModel mode = new UserModel();
			try {
				mode.update(bean);
				resp.sendRedirect("Header.jsp");
			} catch (Exception e) {

				e.printStackTrace();
			}}

			if (op.equals("Add")) {

				System.out.println("add method");

				UserModel model = new UserModel();

				try {
					model.Add(bean);
					
					resp.sendRedirect("Header.jsp");

				} catch (Exception e) {

					e.printStackTrace();
				}

			}

		}

	}


