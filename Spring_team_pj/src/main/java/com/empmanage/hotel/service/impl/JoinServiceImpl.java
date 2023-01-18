package com.empmanage.hotel.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empmanage.hotel.service.JoinService;
import com.empmanage.hotel.service.dao.JoinDAO;
import com.empmanage.hotel.vo.HtdateVO;
import com.empmanage.hotel.vo.HtloginVO;
import com.empmanage.hotel.vo.JoinVO;


@Service("joinService")
public class JoinServiceImpl implements JoinService{
	
	@Autowired
	private JoinDAO joinkaja;

	@Override
	public ArrayList<JoinVO> getAllSawonJoin(HtloginVO htloginVO) {
		return joinkaja.getReservationDetail(htloginVO);
	}
	
	@Override
	public ArrayList<JoinVO> getAllAdminJoin() {
		return joinkaja.getAdminReservationDetail();
	}

	@Override
	public JoinVO editReservation(HtdateVO htdateVO) {
		// TODO Auto-generated method stub
		return joinkaja.editReservation(htdateVO);
	}

	@Override
	public void delReservationInfo(HtdateVO htdateVO) {
		// TODO Auto-generated method stub
		joinkaja.delReservationInfo(htdateVO);
		
	}

	@Override
	public void editReservationInfo(HtdateVO htdateVO) {
		// TODO Auto-generated method stub
		joinkaja.editReservationInfo(htdateVO);
	}


}
