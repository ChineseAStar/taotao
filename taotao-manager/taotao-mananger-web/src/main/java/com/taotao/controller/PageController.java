package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	/**
	 * 显示首页
	 * @return
	 */
	@RequestMapping("/")
	public String showIndex()
	{
		return "index";
	}
	
	/**
	 * 显示其他页面
	 * @param page
	 * @return
	 */
	@RequestMapping("/{page}")
	public String showpage(@PathVariable String page)
	{
		return page;
	}
	
}
