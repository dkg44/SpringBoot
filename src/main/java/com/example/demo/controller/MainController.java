package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


@Controller
public class MainController{
	
	@RequestMapping("/")
//	@GetMapping("/home")
	public String home() {
		System.out.println("This is home page!");
//		return "red.jsp";
		return "home";
	}
	@RequestMapping("/courses")
//	public String courses(HttpServletRequest req) {
//	public String courses(String cname,HttpSession session) {
//	public String courses(@RequestParam("cname")String coursename,HttpSession session) {
//		
////		HttpSession session = req.getSession();
//		
////		String cname = req.getParameter("cname");
////		System.out.println("The course name is:"+cname);
////		session.setAttribute("cname",cname);
//		session.setAttribute("cname",coursename); 
//		return "course";
//	}
    public ModelAndView course(@RequestParam("cname")String coursename) {
		
        ModelAndView mv = new ModelAndView();
        mv.addObject("cname", coursename);
        mv.setViewName("course");
		return mv;
	}
}
