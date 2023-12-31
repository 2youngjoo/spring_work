package com.example.boot04;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FortuneController {
	
	@GetMapping("/fortune")
	public ModelAndView fortune(ModelAndView mView) {
		// 오늘의 운세
		String fortuneToday="동쪽으로 가면 귀인을 만나요!";
		// ModelAndView 객체에 모델과 view page의 정보를 담고
		mView.addObject("fortuneToday", fortuneToday);
		mView.setViewName("fortune");
		// 리턴해준다.
		return mView;
	}
	
	@GetMapping("/fortune2")
	public String fortune2(HttpServletRequest request) {
		// 오늘의 운세
		String fortuneToday="동쪽으로 가면 귀인을 만나요!";
		request.setAttribute("fortuneToday", fortuneToday);
		// 리턴 해준다.
		return "fortune";
	}
}
