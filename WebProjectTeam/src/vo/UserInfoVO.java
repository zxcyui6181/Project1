package vo;

import java.util.Date;

public class UserInfoVO {
	private String name;
	private String email;
	private String passw;
	private String tel;
	private String admin;

	

	
	public UserInfoVO() {}
	
	public UserInfoVO(String name, String email, String passw, String tel,String admin) {
		this.name = name;
		this.email = email;
		this.passw = passw;
		this.tel = tel;
		this.admin = admin;
		
	}



	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPassw() {
		return passw;
	}

	public String getTel() {
		return tel;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassw(String passw) {
		this.passw = passw;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
}