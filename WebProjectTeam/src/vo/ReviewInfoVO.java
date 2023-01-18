package vo;

import java.util.Date;

public class ReviewInfoVO {
	private int num;
	private String tit;
	private String name;
	private Date tda;
	private String nayoung;
	private int cou;
	
	public ReviewInfoVO() {}

	public ReviewInfoVO(int num,String tit,String name, Date tda,String nayoung,int cou) {
		this.num = num;
		this.tit = tit;
		this.name = name;
		this.tda = tda;
		this.nayoung = nayoung;
		this.cou = cou;
	}

	public int getNum() {
		return num;
	}

	public String getTit() {
		return tit;
	}

	public String getName() {
		return name;
	}

	public Date getTda() {
		return tda;
	}

	public String getNayoung() {
		return nayoung;
	}

	public int getCou() {
		return cou;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setTit(String tit) {
		this.tit = tit;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTda(Date tda) {
		this.tda = tda;
	}

	public void setNayoung(String nayoung) {
		this.nayoung = nayoung;
	}

	public void setCou(int cou) {
		this.cou = cou;
	}

	
}
