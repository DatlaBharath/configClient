package com.iiht.configClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Value;


@RestController
@RequestMapping("/readprops")
public class UserConfigController {
	@Value("${server.port}") String serverport;
	@Value("${spring.application.name}") String aname;
	
	@GetMapping
	public String data() {
		return "Port : "+serverport + " App name : " +aname;
	}
}
