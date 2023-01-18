package com.empmanage.hotel.service;

import java.util.ArrayList;

import com.empmanage.hotel.vo.HtdateVO;
import com.empmanage.hotel.vo.HtloginVO;
import com.empmanage.hotel.vo.JoinVO;


public interface JoinService {
	
	ArrayList<JoinVO> getAllSawonJoin(HtloginVO htloginVO); 
	
	ArrayList<JoinVO> getAllAdminJoin();
	
	JoinVO editReservation(HtdateVO htdateVO); 
	
	void delReservationInfo(HtdateVO htdateVO); 
	
	void editReservationInfo(HtdateVO htdateVO); 
	
}
