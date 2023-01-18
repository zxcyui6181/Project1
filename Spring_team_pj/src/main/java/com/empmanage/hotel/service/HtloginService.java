
package com.empmanage.hotel.service;

import java.util.ArrayList;

import com.empmanage.hotel.vo.HtloginVO;

public interface HtloginService {


	ArrayList<HtloginVO> getAllmember();
	
	HtloginVO getlogin(HtloginVO htloginVO);
	
	HtloginVO userInfo(HtloginVO htloginVO);
	
	void delUserInfo(HtloginVO htloginVO);
	
	void joinHotel(HtloginVO htloginVO);
	
	void userDelete(HtloginVO htloginVO);
	
	void editUserInfo(HtloginVO htloginVO);
	
	HtloginVO getPaymentInfo(HtloginVO htloginVO);
	
	
	
}
