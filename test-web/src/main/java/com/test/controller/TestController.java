package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <br>
 *
 * @ClassName TestController
 * @Author dwj
 * @Date 2022/4/11 14:41
 * @Version 1.0
 */
@Controller
public class TestController {

	@RequestMapping(method = RequestMethod.GET, value = "/test")
	@ResponseBody
	public String test(){
		return "hi";
	}
}
