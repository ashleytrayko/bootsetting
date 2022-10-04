package com.ko.personal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.ko.personal.dto.JoinDto;
import com.ko.personal.service.StudentService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MainController {
	private final StudentService sService;
	
	@PostMapping("/join")
	public String join(JoinDto dto) {
		sService.joinStudent(dto);
		return "/";
	}
}
