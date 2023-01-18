package com.empmanage.hotel.service.dao;

import java.util.ArrayList;

import com.empmanage.hotel.vo.HtdateVO;
import com.empmanage.hotel.vo.HtloginVO;
import com.empmanage.hotel.vo.JoinVO;

public interface JoinDAO {

	ArrayList<JoinVO> getReservationDetail(HtloginVO htloginVO);
	
	ArrayList<JoinVO> getAdminReservationDetail();

	JoinVO editReservation(HtdateVO htdateVO); 
	
	void delReservationInfo(HtdateVO htdateVO); 
	
	void editReservationInfo(HtdateVO htdateVO); 
}
