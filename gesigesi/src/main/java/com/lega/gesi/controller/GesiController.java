package com.lega.gesi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GesiController {
	@RequestMapping(value = "/")
	public String login() {
		return "index";
	}
}
