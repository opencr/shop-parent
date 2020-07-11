package org.sc.webchat.service;

import org.sc.webchat.entity.AppEntity;
import org.springframework.web.bind.annotation.GetMapping;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


/**
 * 
 * @author liuhh
 *
 */
@Api(tags = "微信接口")
public interface WebchatService {

	@ApiOperation("调用腾讯微信接口")
	@GetMapping("/getWebchat")
	public AppEntity getWebchat();
}

