package com.empmanage.hotel.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empmanage.hotel.service.HtloginService;
import com.empmanage.hotel.service.dao.HtloginDAO;
import com.empmanage.hotel.vo.HtloginVO;

@Service("htloginService")
public class HtloginServiceImpl implements HtloginService{

	@Autowired
	private HtloginDAO hotelkaja;

	@Override
	public HtloginVO getlogin(HtloginVO htloginVO) {
		// TODO Auto-generated method stub
		return hotelkaja.getlogin(htloginVO);
	}

	@Override
	public void joinHotel(HtloginVO htloginVO) {
		hotelkaja.hotelJoin(htloginVO);
	}

	
	
	@Override 
	public void userDelete(HtloginVO htloginVO) {
		hotelkaja.userDelete(htloginVO);
	}
	 

	@Override
	public HtloginVO getPaymentInfo(HtloginVO htloginVO) {
		
		return hotelkaja.getPaymentInfo(htloginVO);
	}

	@Override
	public ArrayList<HtloginVO> getAllmember() {
		// TODO Auto-generated method stub
		return hotelkaja.getAllmember();
	}

	@Override
	public HtloginVO userInfo(HtloginVO htloginVO) {
		// TODO Auto-generated method stub
		return hotelkaja.userInfo(htloginVO);
	}

	@Override
	public void delUserInfo(HtloginVO htloginVO) {
		hotelkaja.delUserInfo(htloginVO);
		
	}

	@Override
	public void editUserInfo(HtloginVO htloginVO) {
		hotelkaja.editUserInfo(htloginVO);
		
	}


	
	}
	

