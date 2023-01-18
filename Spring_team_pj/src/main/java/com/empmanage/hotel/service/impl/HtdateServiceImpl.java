package com.empmanage.hotel.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.empmanage.hotel.service.HtdateService;
import com.empmanage.hotel.service.dao.HtdateDAO;
import com.empmanage.hotel.vo.HoteltbVO;
import com.empmanage.hotel.vo.HtdateVO;

@Service("htdateService")
public class HtdateServiceImpl implements HtdateService{

	@Autowired
	private HtdateDAO hotelkaja1;

	@Override
	public void insertDate(HtdateVO htdateVO) {
		hotelkaja1.insertDate(htdateVO);
		
	}

	@Override
	public int getReservationNum(HtdateVO htdateVO) {
		return hotelkaja1.getReservationNum(htdateVO);
	}


	@Override
	public HtdateVO viewCheckInfo(HtdateVO htdateVO) {
		// TODO Auto-generated method stub
		return hotelkaja1.viewCheckInfo(htdateVO);
	}

	@Override
	@Transactional
	public ArrayList<HtdateVO> getAllRevation() {
		return hotelkaja1.getAllRevation();
	}
	
	
	public void deleteSession(HtdateVO htdateVO) {
		hotelkaja1.deleteSession(htdateVO);
	}	
}
	

