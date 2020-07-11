package org.sc.webchat.service.impl;

import org.sc.webchat.entity.AppEntity;
import org.sc.webchat.service.WebchatService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebchatServiceImpl implements WebchatService {

	@Override
	public AppEntity getWebchat() {
		return new AppEntity("14774826773", "liuhenghuo");
	}

}
