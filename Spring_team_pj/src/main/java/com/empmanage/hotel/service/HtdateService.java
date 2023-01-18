
package com.empmanage.hotel.service;

import java.util.ArrayList;

import com.empmanage.hotel.vo.HtdateVO;

public interface HtdateService {

	void insertDate(HtdateVO htdateVO);
	
	int getReservationNum(HtdateVO htdateVO);
	
	HtdateVO viewCheckInfo(HtdateVO htdateVO);
	
	ArrayList<HtdateVO> getAllRevation();
	
	void deleteSession(HtdateVO htdateVO);
}
