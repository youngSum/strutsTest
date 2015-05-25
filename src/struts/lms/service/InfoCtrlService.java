package struts.lms.service;

import java.sql.SQLException;
import java.util.List;

import struts.lms.dao.UserDao;
import struts.lms.entity.Info;

public class InfoCtrlService {

	private final static UserDao userDao  = new UserDao();
	
	public List<Info> getAllInfo() {
		List<Info> list = null;
		try {
			list = userDao.getAllInfo();
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return list;
		}
		
	}
	
	public Info modify(String id) {
		Info info = null;
		try {
			info = userDao.getInfoById(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return info;
		}
		return info;
	}
	
	public void complete(Info info) {
		try {
			userDao.updateInfo(info);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void delete(String id) {
		try {
			userDao.deleteInfo(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void add(Info info) { 
		try {
			userDao.addInfo(info);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
