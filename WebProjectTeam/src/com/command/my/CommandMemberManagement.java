package com.command.my;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;
import vo.ReservationInfoVO;
import vo.UserInfoVO;

public class CommandMemberManagement implements CommandImpl{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		DAO tidao1 = null;
		
		tidao1 = new DAO();
		
		ArrayList <UserInfoVO> alist1 = null;
		alist1 = tidao1.getAdminInfo(); 
		request.setAttribute("alist1", alist1);
		
		
		ArrayList <ReservationInfoVO> alist2 = null;
		alist2 = tidao1.getReservationInfo(); 
		request.setAttribute("alist2", alist2);
		
	}

}
