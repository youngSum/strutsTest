package struts.lms.service;


import java.sql.SQLException;

import struts.lms.dao.UserDao;
import struts.lms.entity.User;


public class LoginCheckService {
	
	private final static UserDao userDao  = new UserDao();
	
	public boolean isValid(String name,String password) {
		try {
			User user = userDao.getUserByName(name,password);
			if(user == null)
			{
				return false;
			}
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}
