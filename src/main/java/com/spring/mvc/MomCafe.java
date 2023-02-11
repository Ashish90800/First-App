package com.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Controller
public class MomCafe {
	
	@RequestMapping("/cafe")
	public String getResult() {
	
		
		return "welcomePage";
	}
	
	@RequestMapping("/cafeMessage")
	public String getRecived(HttpServletRequest request,Model model) {
		model.addAttribute("items",request.getParameter("itemsNAme"));
	
		
		
		return "recived";
	}

}
