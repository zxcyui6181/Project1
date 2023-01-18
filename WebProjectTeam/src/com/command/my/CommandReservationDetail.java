package com.command.my;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DAO;
import vo.AllReservationInfoVO;

// 예약내역 서비스
public class CommandReservationDetail implements CommandImpl{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		String aemail = (String)session.getAttribute("email3");
		
		DAO tidao1 = null;
		
		tidao1 = new DAO();
		
		ArrayList <AllReservationInfoVO> alist3 = null;
		alist3 = tidao1.getAllReservationInfo(aemail); 
		request.setAttribute("alist3", alist3);
		
	}

}
