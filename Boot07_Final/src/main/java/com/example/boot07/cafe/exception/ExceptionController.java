package com.example.boot07.cafe.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/*
 *  Spring MVC가 동작중에 특정 type의 예외가 발생하면 해당 예외를 여기서 처리 할 수 있다.
 */
@ControllerAdvice
public class ExceptionController {
	// spring framework가 동작하는 중에 NotDeleteException type의
	// 예외가 발생하면 호출되는 메소드
	@ExceptionHandler(NotDeleteException.class)
	public ModelAndView notDelete(NotDeleteException nde) { // 메소드의 인자로 예외 객체가 전달된다.
		ModelAndView mView = new ModelAndView();
		// exception 이라는 키값으로 예외 객체를 담고
		mView.addObject("exception", nde);
		// view page ( /WEB-INF/views/error/info.jsp )로 forward 이동해서 예외 정보 응답하기
		mView.setViewName("error/info");
		return mView;
		
	}
	
}
