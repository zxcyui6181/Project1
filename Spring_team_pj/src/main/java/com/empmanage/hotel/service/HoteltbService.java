
package com.empmanage.hotel.service;

import java.util.ArrayList;

import com.empmanage.hotel.vo.HoteltbVO;

public interface HoteltbService {

	ArrayList<HoteltbVO> viewHotelList(HoteltbVO hoteltbVO);

	void detailCheck(HoteltbVO hoteltbVO);
	
	HoteltbVO getPriceInfo(HoteltbVO hoteltbVO);
	
	void deleteSession(HoteltbVO hoteltbVO);
	
}
