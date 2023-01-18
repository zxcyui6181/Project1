package com.command.my;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DAO;
import vo.HotelListInfoVO;

public class CommandHotelList implements CommandImpl{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		// session에서 location 받기
		HttpSession session = request.getSession();
		String location = (String) session.getAttribute("location");
		
		
		// DAO생성
		DAO tidao1 = new DAO();
		ArrayList<HotelListInfoVO> alist1 = null;
		
		// 선택한 지역에 대한 호텔정보를 뽑아내는 viewHotelInfo메소드 사용, 반환형은 TelHotelListVO
		alist1 = tidao1.viewHotelInfo(location);
		
		
		request.setAttribute("alist1", alist1);
		
	}

}
