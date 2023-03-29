package com.human.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.human.project.domain.Users;
import com.human.project.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping({"", "/", "/index"})
	public String index(Model model) throws Exception {
		log.info("관리자 페이지...");
		
		List<Users> usersList = userService.list();
		
		for (Users users : usersList) {
			log.info(users.toString());
		}
		
		model.addAttribute("usersList",usersList);
		
		return "admin/index";
		
	}

	@GetMapping("/test")
	public String tset() {
		log.info("테스트... (삭제 예정)");

		return "admin/test";
	}

}
