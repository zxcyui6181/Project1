package com.empmanage.hotel.service.dao;

import java.util.ArrayList;

import com.empmanage.hotel.vo.HtloginVO;

public interface HtloginDAO {

	ArrayList<HtloginVO> getAllmember();
	
	HtloginVO getlogin(HtloginVO htloginVO);
	
	HtloginVO userInfo(HtloginVO htloginVO);
	
	void delUserInfo(HtloginVO htloginVO);

	void hotelJoin(HtloginVO htloginVO);
	
	void userDelete(HtloginVO htloginVO);
	
	void editUserInfo(HtloginVO htloginVO);
	
	HtloginVO getPaymentInfo(HtloginVO htloginVO);
}
