package com.nt.controller;


import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	/*@RequestMapping("/home")
	public String homeController() {
		return "welcome";
	}*/
	
		@RequestMapping("/")
		public String showWelcome() {
			return "welcome";
		}
	
	/*@RequestMapping("/register")
	public String register(Map<String, Object>map) {
		map.put("attr1","val1");
		map.put("sysDt",LocalDateTime.now());
		return "show_data";
	}
	*/
	/*	@RequestMapping("/process")
		public String process(ModelMap map) {
			System.out.println("");
			map.put("attr1", "val1");
			map.put("sysDt", LocalDateTime.now());
			return "show_data";
		}*/
		
	/*@RequestMapping("/process")
	public String process(Model model) {
		System.out.println(LocalDateTime.now());
		model.addAttribute("attr1","val1");
		model.addAttribute("sysDt",LocalDateTime.now());
		return "show_data";
	}
	*/
	/*	
		@RequestMapping("/process")
		public Map<String, Object> process(){
			//create shared memory
			Map<String, Object> map=new HashMap();
			//add model attributes to shared memory
			map.put("attr1", "val1");
			map.put("sysDt", LocalDateTime.now());
			return map;
		}*/
	/*
	@RequestMapping("/process")
	public ModelAndView process() {
		//create shared memory
		ModelAndView map=new ModelAndView();
		map.addObject("attr1","val1");
		map.addObject("sysDt",LocalDateTime.now());
		//place LVN to MAV object
		map.setViewName("show_data");
		return map;
	}*/
		//return typ void
		/*	@RequestMapping("/process")
			public void process(Map<String, Object> map) {
				//add shared memory
				map.put("attr1", "val1");
				map.put("sysDt",new Date());
				
			}
		*/
	
		/*	@RequestMapping("/process")
			public String process(Map<String,Object> map) {
				//add shared memory
				map.put("attr1", "val1");
				map.put("sysDt", new Date());
				return null;
			}*/
		//redirect reuest url source to destination
		/*@RequestMapping("/process")
		public String process() {
			System.out.println("HomeController.process()");
			return "forward:report";
		}
		
		@RequestMapping("/report")
		public String showReport() {
			System.out.println("HomeController.showReport()");
			return "show_data";
		}
		*/
		/*		@RequestMapping("/process")
				public String process(HttpServletRequest req) {
					System.out.println("HomeController.process()"+ req.hashCode());
					req.setAttribute("attr1", "val1");
					return "redirect:report";
				}
				
				@RequestMapping("/report")
				public String showReport(HttpServletRequest req) {
					System.out.println("req attribute " + req.getAttribute("attr1"));
					System.out.println("HomeController.showReport()");
					return "show_data";
				}*/
		
		@RequestMapping("/process")
		public String process(HttpServletRequest req,HttpServletResponse res) {
			req.setAttribute("attr1", "val1");
			return "show_data";
		}
		
		
		
		
		
}
