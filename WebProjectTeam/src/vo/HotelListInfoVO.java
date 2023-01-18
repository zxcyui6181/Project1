package vo;

public class HotelListInfoVO {

	
	private String hotelLocation;
	private String hotelName;
	private String roomSize;
	private String roomPrice;
	
	public HotelListInfoVO() {} // 디폴트생성자
	
	public HotelListInfoVO(String hotelLocation, String hotelName, String roomSize, String roomPrice) {
		super();
		this.hotelLocation = hotelLocation;
		this.hotelName = hotelName;
		this.roomSize = roomSize;
		this.roomPrice = roomPrice;
	}

	public String getHotelLocation() {
		return hotelLocation;
	}

	public void setHotelLocation(String hotelLocation) {
		this.hotelLocation = hotelLocation;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getRoomSize() {
		return roomSize;
	}

	public void setRoomSize(String roomSize) {
		this.roomSize = roomSize;
	}

	public String getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(String roomPrice) {
		this.roomPrice = roomPrice;
	}

	
	
	
}
