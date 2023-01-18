package vo;

import java.util.Date;

public class DetailVO {
	
	private Date cin;
	private Date cout;
	private int pep;
	private String hname;
	private String roomSize;
	private int price;
	
	public DetailVO() {}

	public DetailVO(Date cin, Date cout, int pep, String hname, String roomSize, int price) {
		super();
		this.cin = cin;
		this.cout = cout;
		this.pep = pep;
		this.hname = hname;
		this.roomSize = roomSize;
		this.price = price;
	}

	public Date getCin() {
		return cin;
	}

	public void setCin(Date cin) {
		this.cin = cin;
	}

	public Date getCout() {
		return cout;
	}

	public void setCout(Date cout) {
		this.cout = cout;
	}

	public int getPep() {
		return pep;
	}

	public void setPep(int pep) {
		this.pep = pep;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public String getRoomSize() {
		return roomSize;
	}

	public void setRoomSize(String roomSize) {
		this.roomSize = roomSize;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
