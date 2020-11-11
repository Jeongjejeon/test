package com.kg.myapp.controller;

import java.io.IOException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kg.myapp.vo.MemberVO;
import com.kg.myapp.service.IMemberService;

@Controller
@RequestMapping(value="/member")
public class MemberController {
	
	@Autowired
	IMemberService memberService;
	
	@GetMapping(value="/insert")
	public void insertMember(Model model) {
		
	}
	
	@PostMapping(value="/insert")
	public String insertMember(@RequestParam MultipartFile file, MemberVO member, RedirectAttributes redirectAttributes) {
		if(file!=null && !file.isEmpty()) {
			try {
				member.setPicture(file.getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
			member.setPicturesize(file.getSize());
		}
		memberService.insertMember(member);
		redirectAttributes.addFlashAttribute("message", "회원 가입 완료");
		return "redirect:/login";
	}
	
	

}















