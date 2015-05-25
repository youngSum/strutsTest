package struts.lms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import struts.lms.entity.Info;
import struts.lms.entity.User;


public class UserDao {
//	private final static String DRIVER = "oracle.jdbc.driver.OracleDriver";
//	private final static String URL = "jdbc:oracle:thin:@dzzx-db1.hnisi.com.cn:1523:ZXKFK";
//	private final static String NAME = "gdyj_test_ds";
//	private final static String PASSWORD = "gdyj_test_ds";
	private final static String DRIVER = "com.mysql.jdbc.Driver";
	private final static String URL = "jdbc:mysql://localhost:3306/test";
	private final static String NAME = "root";
	private final static String PASSWORD = "future";

	static {
		try {
			Class.forName(DRIVER); // ¼ÓÔØÇý¶¯

		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
	
	public User getUserByName(String name , String password) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet ret = null;
		User user = new User();
		try {
			conn = DriverManager.getConnection(URL, NAME, PASSWORD);
			String sql = "select * from suser where uname = ? and password = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, password);
			ret = pstmt.executeQuery();
			if(ret.next())
			{
				user.setUserName(ret.getString(1));
				user.setPassword(ret.getString(2));
				return user;
			}
			return null;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		} finally {
			ret.close();
			pstmt.close();
			conn.close();
		}
	}

	public List<Info> getAllInfo() throws SQLException {
		Connection conn = null;
		Statement state = null;
		ResultSet ret = null;
		List<Info> list = new ArrayList();
		try {
			conn = DriverManager.getConnection(URL, NAME, PASSWORD);
			state = conn.createStatement();
			ret = state.executeQuery("select * from tstu");

			while (ret.next()) {
				Info info = new Info();
				info.setId(ret.getString(1));
				info.setName(ret.getString(2));
				info.setSex(ret.getString(3));
				info.setAge(ret.getInt(4));
				info.setTelephone(ret.getString(5));
				list.add(info);
			}
			return list;
		} catch (Exception ex) {
			ex.printStackTrace();
			return list;
		} finally {
			ret.close();
			state.close();
			conn.close();
		}
	}
//
	public Info getInfoById(String id) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet ret = null;
		Info info = new Info();
		try {
			conn = DriverManager.getConnection(URL, NAME, PASSWORD);
			String sql = "select * from tstu where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ret = pstmt.executeQuery();
			if(ret.next())
			{
				
				info.setId(ret.getString(1));
				info.setName(ret.getString(2));
				info.setSex(ret.getString(3));
				info.setAge(ret.getInt(4));
				info.setTelephone(ret.getString(5));
			}
			return info;
		} catch (Exception ex) {
			ex.printStackTrace();
			return info;
		} finally {
			ret.close();
			pstmt.close();
			conn.close();
		}
	}
	
	public void updateInfo(Info info) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DriverManager.getConnection(URL, NAME, PASSWORD);
			String sql = " update tstu set id=?,name=?,sex=?,age=?,telephone=? where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, info.getId());
	        pstmt.setString(2, info.getName());
	        pstmt.setString(3, info.getSex());
	        pstmt.setInt(4, info.getAge());
	        pstmt.setString(5, info.getTelephone());
	        pstmt.setString(6, info.getId());
	        pstmt.executeUpdate();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			pstmt.close();
			conn.close();
		}
	}
	
	public void deleteInfo(String id) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DriverManager.getConnection(URL, NAME, PASSWORD);
			String sql = " delete from tstu where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
	        pstmt.executeUpdate();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			pstmt.close();
			conn.close();
		}
	}
	
	public void addInfo(Info info) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DriverManager.getConnection(URL, NAME, PASSWORD);
			String sql = " insert into tstu values(?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, info.getId());
	        pstmt.setString(2, info.getName());
	        pstmt.setString(3, info.getSex());
	        pstmt.setInt(4, info.getAge());
	        pstmt.setString(5, info.getTelephone());
	        pstmt.executeUpdate();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			pstmt.close();
			conn.close();
		}
	}
}
