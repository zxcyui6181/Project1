package com.command.my;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;
import vo.UserInfoVO;

// 관리자 개인정보확인 컨트롤러
public class CommandUserInfo implements CommandImpl{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		

		DAO tidao11 = null;
		UserInfoVO tv = null;

		tidao11 = new DAO();
			
				
		String email = request.getParameter("email");
	
		tv = tidao11.getAllUserInfo(email);
			
		
		request.setAttribute("semail", email);
		request.setAttribute("stv", tv);
		
	}

}
