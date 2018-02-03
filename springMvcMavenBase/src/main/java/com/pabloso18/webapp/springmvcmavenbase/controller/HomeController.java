package com.pabloso18.webapp.springmvcmavenbase.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Home Controller
 * Handles requests for the application home page
 * @author Jose_Solano
 *
 */
@Controller
@RequestMapping("/")
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping( method = RequestMethod.GET)
	public String home(Model model) {
		logger.info("Welcome home!");
		
		return "home";
	}
	
}
