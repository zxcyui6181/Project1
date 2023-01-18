package vo;

public class PaymentInfoVO {
	
	private int price;
	private String email;
	private String name;
	private String tel;
	
	public PaymentInfoVO() {}

	public PaymentInfoVO(int price, String email, String name, String tel) {
		this.price = price;
		this.email = email;
		this.name = name;
		this.tel = tel;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	

}
