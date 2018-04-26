package com.chengzi.web.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chengzi.common.util.WebUtil;
import com.chengzi.mybatis.model.UserBaseInfo;
import com.chengzi.service.UserBaseInfoService;

@Controller
public class UserBaseInfoController {
	
	@Resource(name = "customerUserBaseInfoService")
	private UserBaseInfoService customerUserBaseInfoService;
	
	@Resource(name = "entpUserBaseInfoService")
	private UserBaseInfoService entpUserBaseInfoService;
	
	/**
	 * 查询集合
	 * @param type
	 * @return
	 */
	@RequestMapping(value = "/queryUserBaseInfoList/{type}",method = RequestMethod.GET)
	public String queryUserBaseInfoList(@PathVariable String type){
		System.out.println("进去用户列表页面");
		return "/userBaseInfo/userBaseInfoList";
	}
	
	/**
	 * 新增个人用户信息
	 */
	@ResponseBody
	@RequestMapping(value = "customerInsert",method = RequestMethod.POST)
	public Object customerInsert(HttpServletRequest request){
		UserBaseInfo info = new UserBaseInfo();
		WebUtil.setPoPropertyByRequest(info, request);
		customerUserBaseInfoService.insert(info);
		return info;
	}
	
	/**
	 * 新增企业信息
	 */
	@ResponseBody
	@RequestMapping(value = "entpInsert",method = RequestMethod.POST)
	public Object entpInsert(HttpServletRequest request){
		UserBaseInfo info = new UserBaseInfo();
		WebUtil.setPoPropertyByRequest(info, request);
		entpUserBaseInfoService.insert(info);
		return info;
	}
}
