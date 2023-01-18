package com.empmanage.hotel.service.dao;

import java.util.ArrayList;

import com.empmanage.hotel.vo.HtdateVO;

public interface HtdateDAO {

	void insertDate(HtdateVO htdateVO);
	
	int getReservationNum(HtdateVO htdateVO);
	
	HtdateVO viewCheckInfo(HtdateVO htdateVO);
	
	ArrayList<HtdateVO> getAllRevation();
	
	void deleteSession(HtdateVO htdateVO);
}
