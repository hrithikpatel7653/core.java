package in.co.rays.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.co.rays.bean.UserBean;
import in.co.rays.util.JDBCDataSource;

public class UserModel {

	public static void Add(UserBean bean) throws Exception {

		Connection conn = JDBCDataSource.getConnection();

		PreparedStatement ps = conn.prepareStatement("insert into user values(?,?,?,?,?,?)");

		ps.setInt(1, nextPk());
		ps.setString(2, bean.getFistName());
		ps.setString(3, bean.getLastName());
		ps.setString(4, bean.getLoginId());
		ps.setString(5, bean.getPassword());
		ps.setString(6, bean.getMobileNo());

		int i = ps.executeUpdate();

		System.out.println("Inserted :" + i);

	}

	public List<UserBean> search() throws Exception {

		Connection conn = JDBCDataSource.getConnection();

		PreparedStatement ps = conn.prepareStatement("select * from user");

		ResultSet rs = ps.executeQuery();

		ArrayList<UserBean> list = new ArrayList();

		UserBean bean = null;

		while (rs.next()) {

			bean = new UserBean();

			bean.setId(rs.getInt(1));
			bean.setFistName(rs.getString(2));
			bean.setLastName(rs.getString(3));
			bean.setLoginId(rs.getString(4));
			bean.setPassword(rs.getString(5));
			bean.setMobileNo(rs.getString(6));

			list.add(bean);

		}

		return list;
	}

	public void delete(int id) throws Exception {

		Connection conn = JDBCDataSource.getConnection();

		PreparedStatement ps = conn.prepareStatement("delete from user where id = ?");

		ps.setInt(1, id);

		int i = ps.executeUpdate();

		System.out.println("Deleted :" + i);

	}

	public static Integer nextPk() throws Exception {

		int Pk = 0;

		Connection conn = JDBCDataSource.getConnection();

		PreparedStatement ps = conn.prepareStatement("select max(id) from user");

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			Pk = rs.getInt(1);

		}

		return Pk + 1;

	}

	public UserBean FindById(int id) throws Exception {

		Connection conn = JDBCDataSource.getConnection();

		PreparedStatement ps = conn.prepareStatement("select * from user where id = ?");

		ps.setInt(1, id);

		ResultSet rs = ps.executeQuery();

		UserBean bean = null;

		while (rs.next()) {

			bean = new UserBean();

			bean.setId(rs.getInt(1));
			bean.setFistName(rs.getString(2));
			bean.setLastName(rs.getString(3));
			bean.setLoginId(rs.getString(4));
			bean.setPassword(rs.getString(5));
			bean.setMobileNo(rs.getString(6));

		}

		return bean;

	}

	public UserBean authenticate(String login, String password) throws Exception {

		Connection conn = JDBCDataSource.getConnection();

		PreparedStatement ps = conn.prepareStatement("select * from user where logiId=? && password=?");

		ps.setString(1, login);
		ps.setString(2, password);

		ResultSet rs = ps.executeQuery();

		UserBean bean = null;

		while (rs.next()) {

			bean = new UserBean();
           bean.setId(rs.getInt(1));
			bean.setFistName(rs.getString(2));
			bean.setLastName(rs.getString(3));
			bean.setLoginId(rs.getString(4));
			bean.setPassword(rs.getString(5));
			bean.setMobileNo(rs.getString(6));

		}

		return bean;
	}

	public List<UserBean> search2(UserBean bean) throws Exception {

		Connection conn = JDBCDataSource.getConnection();

		StringBuffer sql = new StringBuffer("select * from user where 1=1");

		if (bean != null) {
			if (bean.getFistName() != null) {
				sql.append(" and FirstName like '" + bean.getFistName() + "%'");

			}

		}

		PreparedStatement ps = conn.prepareStatement(sql.toString());

		ResultSet rs = ps.executeQuery();

		ArrayList<UserBean> list = new ArrayList<UserBean>();

		while (rs.next()) {

			bean = new UserBean();

			bean.setId(rs.getInt(1));
			bean.setFistName(rs.getString(2));
			bean.setLastName(rs.getString(3));
			bean.setLoginId(rs.getString(4));
			bean.setPassword(rs.getString(5));
			bean.setMobileNo(rs.getString(6));

			list.add(bean);

		}
		return list;
	}

	public void update(UserBean bean) throws Exception {

		Connection conn = JDBCDataSource.getConnection();

		PreparedStatement ps = conn.prepareStatement(
				"update user set firstName=?,lastName=?,LogiId=?,password=?,mobileNo=? where id=?");

		ps.setString(1, bean.getFistName());
		ps.setString(2, bean.getLastName());
		ps.setString(3, bean.getLoginId());
		ps.setString(4, bean.getPassword());
		ps.setString(5, bean.getMobileNo());
		ps.setInt(6, bean.getId());

		int i = ps.executeUpdate();

		System.out.println("Updated :" + i);
	}

}
