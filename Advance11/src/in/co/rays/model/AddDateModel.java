package in.co.rays.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.co.rays.bean.AddDateBean;
import in.co.rays.util.JDBCDataSource;

public class AddDateModel {

	public void add(AddDateBean bean) throws Exception {

		Connection conn = JDBCDataSource.getConnection();

		PreparedStatement ps = conn.prepareStatement("insert into anu2 values(?)");

		ps.setDate(1, new java.sql.Date(bean.getDob().getTime()));

		int i = ps.executeUpdate();

		JDBCDataSource.closeConnection(conn);

		System.out.println("Data Inserted :" + i);

	}

}
