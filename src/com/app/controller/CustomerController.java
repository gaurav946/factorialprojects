package com.app.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.Customer;
import com.app.pojos.Student;
import com.app.services.CustomServices;

@Controller
@RequestMapping(value="/customers")
public class CustomerController {
	
	// auto wiring ---byType
		@Autowired
		@Qualifier("dao_based_service") // byName
		private CustomServices service;
		
		@GetMapping("/list")
		public String listName(Model map)
		{
			System.out.println("in list name");
			
		ArrayList<String> al=	(ArrayList<String>) service.lname();
		map.addAttribute("list", al);
		return "/customers/list";
		}
		@PostMapping("/list")
		public String updateName(@RequestParam String name)
		{
			Student s=new Student();
			s.setName(name);
			service.setName(s);
			
			return "/customers/list";
		}
		

}
