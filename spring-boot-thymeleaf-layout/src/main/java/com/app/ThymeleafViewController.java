package com.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafViewController {

	@RequestMapping("/")
	public String viewDashboard() {
		return "admin_web/dashboard";
	}

	@RequestMapping("/about")
	public String viewAbout() {
		return "admin_web/about";
	}

	@RequestMapping("/contact")
	public String viewContact() {
		return "admin_web/contact";
	}

}
