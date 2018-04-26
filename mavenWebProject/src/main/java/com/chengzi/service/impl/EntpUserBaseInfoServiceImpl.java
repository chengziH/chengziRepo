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
@Service("entpUserBaseInfoService")
public class EntpUserBaseInfoServiceImpl implements UserBaseInfoService{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserBaseInfoMapper userBaseInfoMapper ; 
	
	@Override
	public void insert(UserBaseInfo info) {
		logger.info("新增企业信息入参info={}",info);
		info.setType("ENTP");
		info.setState("NORMAL");
		userBaseInfoMapper.insert(info);
	}
	
}
