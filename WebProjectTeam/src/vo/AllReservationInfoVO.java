package vo;

import java.util.Date;

public class AllReservationInfoVO {
	private int renum;
	private String region;
	private String hname;
	private String name;
	private String email;
	private String tel;
	private Date cin;
	private Date cout;
	private int pep;
	
	
	
	public AllReservationInfoVO() {}
	
	public AllReservationInfoVO(int renum,String region, String hname,String name,String email,String tel, Date cin,Date cout,int pep) {
		this.renum = renum;
		this.name = name;
		this.email = email;
		this.tel = tel;
		this.cin = cin;
		this.cout = cout;
		this.pep = pep;
		this.region = region;
		this.hname = hname;
		
		
		
		
	}

	public String getRegion() {
		return region;
	}

	public String getHname() {
		return hname;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getRenum() {
		return renum;
	}

	public String getEmail() {
		return email;
	}

	public Date getCin() {
		return cin;
	}

	public Date getCout() {
		return cout;
	}

	public int getPep() {
		return pep;
	}

	public void setRenum(int renum) {
		this.renum = renum;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCin(Date cin) {
		this.cin = cin;
	}

	public void setCout(Date cout) {
		this.cout = cout;
	}

	public void setPep(int pep) {
		this.pep = pep;
	}

}
