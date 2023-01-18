package com.command.my;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DAO;

// 예약 서비스
public class CommandReservation implements CommandImpl{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String email = request.getParameter("email");
		String cin = request.getParameter("cin");
		String cout = request.getParameter("cout");
		int pep = Integer.parseInt(request.getParameter("pep"));
		
		DAO tidao = null;
			
		tidao = new DAO();
		tidao.insertReservationInfo(email,cin,cout,pep);
		
		int renum = tidao.getReservationNum(email);
		
		HttpSession session = request.getSession();
		session.setAttribute("renum", renum);
		
	}

}
