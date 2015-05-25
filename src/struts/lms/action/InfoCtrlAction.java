package struts.lms.action;

import java.util.List;

import struts.lms.entity.Info;
import struts.lms.service.InfoCtrlService;
import struts.lms.service.LoginCheckService;

import com.opensymphony.xwork2.ActionSupport;

public class InfoCtrlAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Info> list;
	private Info info;
	private String id;
	private String name;
	private String sex;
	private int age;
	private String telephone;

	private final static InfoCtrlService infoCtrlService = new InfoCtrlService();

	public String modify() {
		info = infoCtrlService.modify(id);
		return "display";
	}
	
	public String complete() {
//		info.setId(id);
//		info.setName(name);
//		info.setSex(sex);
////		info.setAge(age);
//		info.setTelephone(telephone);
		infoCtrlService.complete(info);
		list = infoCtrlService.getAllInfo();
		return SUCCESS;
	}
	
	public String delete() {
		infoCtrlService.delete(id);
		list = infoCtrlService.getAllInfo();
		return SUCCESS;
	}
	
	public String add() {
		return "add";
	}
	
	public String cadd() {
		infoCtrlService.add(info);
		list = infoCtrlService.getAllInfo();
		return SUCCESS;
	}


	public List<Info> getList() {
		return list;
	}

	public void setList(List<Info> list) {
		this.list = list;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
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
