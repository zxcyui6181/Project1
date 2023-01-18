package com.command.my;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;
import vo.ReservationInfoVO;

public class CommandEditReservation implements CommandImpl{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		

		DAO tidao11 = null;
		ReservationInfoVO tv2 = null;

		tidao11 = new DAO();
			
				
		int renum = Integer.parseInt(request.getParameter("renum"));
	
		tv2 = tidao11.getAllReservationInfo(renum);
			
		
		request.setAttribute("srenum", renum);
		request.setAttribute("stv2", tv2);
	}
	

}
