package com.chengzi.web.advice;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * 处理全局异常处理 （所有Controller受影响）
 * @author chengzi
 *
 */
@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice {
 
	@ExceptionHandler
	public ModelAndView exceptionHandle(Exception ex){
		ModelAndView mv = new ModelAndView("/error/error");
		mv.addObject("message", ex.getMessage());
		System.out.println("进入异常处理controller！");
		return mv;
	}
}
