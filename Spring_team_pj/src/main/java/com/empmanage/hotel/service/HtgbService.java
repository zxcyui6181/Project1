
package com.empmanage.hotel.service;

import java.util.ArrayList;

import com.empmanage.hotel.vo.HtgbVO;

public interface HtgbService {


	ArrayList<HtgbVO> getAllGb();
	
	void insertWriting(HtgbVO htgbVO);
	
	HtgbVO reviewEdit(HtgbVO htgbVO);
	
	HtgbVO reviewRe(HtgbVO htgbVO);
	
	void plusCou(HtgbVO htgbVO);
	
	void reviewModify(HtgbVO htgbVO);
	
	void delReviewInfo(HtgbVO htgbVO);
	
}
