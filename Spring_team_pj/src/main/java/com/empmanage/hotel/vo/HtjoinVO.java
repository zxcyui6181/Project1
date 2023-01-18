package com.empmanage.hotel.vo;

import java.sql.Date;

public class HtjoinVO {
	private HtdateVO htdateVO;
	private HtloginVO htloginVO;
	private HoteltbVO hoteltbVO;
	
	public HtdateVO getHtdateVO() {
		return htdateVO;
	}
	public HtloginVO getHtloginVO() {
		return htloginVO;
	}
	public HoteltbVO getHoteltbVO() {
		return hoteltbVO;
	}
	public void setHtdateVO(HtdateVO htdateVO) {
		this.htdateVO = htdateVO;
	}
	public void setHtloginVO(HtloginVO htloginVO) {
		this.htloginVO = htloginVO;
	}
	public void setHoteltbVO(HoteltbVO hoteltbVO) {
		this.hoteltbVO = hoteltbVO;
	}

	
}