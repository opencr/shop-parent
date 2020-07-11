package org.sc.member.service.impl;

import java.util.List;

import org.sc.member.entity.UserEntity;
import org.sc.member.feign.WebchatServiceFeign;
import org.sc.member.mapper.UserMapper;
import org.sc.member.service.MemberService;
import org.sc.webchat.entity.AppEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MemberServiceImpl implements MemberService{

	@Autowired
	private WebchatServiceFeign webchatServiceFeign;
	
	@Override
	public AppEntity memberToWebchat() {
		return webchatServiceFeign.getWebchat();
	}
	
	@Autowired
	private UserMapper historyMapper;

	@Override
	public List<UserEntity> getUser() {
		return historyMapper.selectList(null);
	}

}
