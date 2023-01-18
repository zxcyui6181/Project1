package com.command.my;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;

public class CommandEditReservationInfo implements CommandImpl{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		

		int renum = Integer.parseInt(request.getParameter("renum"));
		String cin = request.getParameter("cin");
		String cout = request.getParameter("cout");
		int pep = Integer.parseInt(request.getParameter("pep"));
		int srenum = Integer.parseInt(request.getParameter("srenum"));
		
		DAO tidao3 = null;
			
		tidao3 = new DAO();
				
				
		tidao3.editReservation(renum,cin,cout,pep,srenum);
		
	}
}
