package org.sc.member.service;

import java.util.List;

import org.sc.member.entity.UserEntity;
import org.sc.webchat.entity.AppEntity;
import org.springframework.web.bind.annotation.GetMapping;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


/**
 * 
 * @author liuhh
 *
 */
@Api(tags = "会员服务接口")
public interface MemberService {

	@ApiOperation("会员服务调用微信服务接口")
	@GetMapping("/memberToWebchat")
	public AppEntity memberToWebchat();
	
	@GetMapping("/getUser")
	public List<UserEntity> getUser();
}
