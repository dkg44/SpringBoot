package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Formcontroller {
	// to store data in h2 data base
	@Autowired
	CustomerRepo repo;
//	@Autowired
	@RequestMapping("/")
	public String details(){
		return "edu";
	}
	@RequestMapping("/details")
	public String details(Customers customers){
		repo.save(customers);
		return "edu";
	}
	//vies
	@RequestMapping("/getdetails")
	public String getdetails(){
		return "ViewCustomers";
	}
	@PostMapping("/getdetails")
	public ModelAndView ViewDetails(@RequestParam int cid)
	{
		System.out.println("u r here ");
		 ModelAndView mv = new ModelAndView("Retrieve");
		 Customers customers = repo.findById(cid).orElse(null);
//		 if(customers == null) {
//			 return "there is error";
//		 }
		 mv.addObject(customers);
		 return mv;
	}
//	@GetMapping("edu")
//	public String edu(){
//		return "edu";
//	}
//	@PostMapping("/details")
	/*
	@PostMapping("/getdetails")
	public String ViewDetails(@RequestParam("cid") String cid,
			@RequestParam("cname") String cname,
			@RequestParam("cemail") String cemail, ModelMap modelMap)
	{
		System.out.println("post ");
		modelMap.put("cid", cid);
		modelMap.put("cname", cname);
		modelMap.put("cemail", cemail);
		return "ViewCustomers";
	}
	*/
	
	
	

}
