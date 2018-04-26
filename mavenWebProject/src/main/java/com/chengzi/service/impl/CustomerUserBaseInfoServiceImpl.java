package com.chengzi.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chengzi.mybatis.mapper.UserBaseInfoMapper;
import com.chengzi.mybatis.model.UserBaseInfo;
import com.chengzi.service.UserBaseInfoService;

/**
 * 个人用户信息
 * @author asus
 *
 */
@Service("customerUserBaseInfoService")
public class CustomerUserBaseInfoServiceImpl implements UserBaseInfoService{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserBaseInfoMapper userBaseInfoMapper ; 
	
	@Override
	public void insert(UserBaseInfo info) {
		logger.info("添加个人用户信息入参info={}",info);
		info.setType("PERSON");
		info.setState("NORMAL");
		try{
			int  num = 5 / 0;
		}catch (Exception e){
			logger.error("添加个人用户信息错误日志："+e.getMessage());
		}
		userBaseInfoMapper.insert(info);
	}
	
}
