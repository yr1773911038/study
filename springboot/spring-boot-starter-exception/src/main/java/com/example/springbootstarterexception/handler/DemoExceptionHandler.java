package com.example.springbootstarterexception.handler;

import com.example.springbootstarterexception.exception.JsonException;
import com.example.springbootstarterexception.exception.PageException;
import com.example.springbootstarterexception.model.ApiResponse;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Configuration
@ControllerAdvice
public class DemoExceptionHandler {
	private static final String DEFAULT_ERROR_VIEW = "error";

	/**
	 * 统一 json 异常处理
	 *
	 * @param exception JsonException
	 * @return 统一返回 json 格式
	 */
	@ExceptionHandler(value = JsonException.class)
	@ResponseBody
	public ApiResponse jsonErrorHandler(JsonException exception) {
		return ApiResponse.ofException(exception);
	}

	/**
	 * 统一 页面 异常处理
	 *
	 * @param exception PageException
	 * @return 统一跳转到异常页面
	 */
	@ExceptionHandler(value = PageException.class)
	public ModelAndView pageErrorHandler(PageException exception) {
		ModelAndView view = new ModelAndView();
		view.addObject("message", exception.getMsg());
		view.setViewName(DEFAULT_ERROR_VIEW);
		return view;
	}
}