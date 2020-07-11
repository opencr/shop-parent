package org.sc.member.feign;

import org.sc.webchat.service.WebchatService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("app-webchat")
public interface WebchatServiceFeign extends WebchatService{

}
