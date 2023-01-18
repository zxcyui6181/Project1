package com.command.my;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;
import vo.ReviewInfoVO;

public class CommandAdminReviewRetouch implements CommandImpl{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		

		DAO tidao11 = null;
		ReviewInfoVO tv3 = null;

		tidao11 = new DAO();
			
				
		String tit = request.getParameter("tit");
	
		tv3 = tidao11.getOneReviewInfo(tit);
			
		
		request.setAttribute("stit", tit);
		request.setAttribute("stv3", tv3);
			
		tidao11 = new DAO();
				
		tidao11.updateViews(tit);
		
	}

}
