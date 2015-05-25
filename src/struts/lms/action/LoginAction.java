package struts.lms.action;

import java.util.List;

import struts.lms.entity.Info;
import struts.lms.service.InfoCtrlService;
import struts.lms.service.LoginCheckService;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String password;
	private List<Info> list;

	private final static LoginCheckService loginCheckService = new LoginCheckService();
	private final static InfoCtrlService infoCtrlService = new InfoCtrlService();

	public String execute() {
		if (loginCheckService.isValid(name, password)) {
			list = infoCtrlService.getAllInfo();
			return SUCCESS;
		}
		return INPUT;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Info> getList() {
		return list;
	}

	public void setList(List<Info> list) {
		this.list = list;
	}

	/*
	 * @Override public void validate() { // TODO Auto-generated method stub
	 * if(account==null||"".equals(account)) { this.addFieldError("account",
	 * "用户名不能为空！"); } else if(account.length()!=6) {
	 * this.addFieldError("account","用户名必须为6位"); }
	 * 
	 * if(password==null||"".equals(password)) {
	 * this.addFieldError("password","密码不能为空！"); } else if(password.length()<6||password.length()>12) {
	 * this.addFieldError("password","密码长度必须在6到12位之间!"); } }
	 * 
	 */
}
