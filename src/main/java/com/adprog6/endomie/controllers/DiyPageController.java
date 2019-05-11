package com.adprog6.endomie.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DiyPageController {
	@GetMapping(value = "/diy")
	public String diy() {
		return "diy";
	}
}
