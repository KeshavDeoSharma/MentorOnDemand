package com.example.sba.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sba.model.Mentor;
import com.example.sba.service.AdminService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@RestController
@RequestMapping(path="/mentorprofile")
public class AdminRestController {


	
	  @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	 
	@Autowired
	AdminService adminService;
	
	@ResponseBody
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Optional<Mentor> getAdmin(@PathVariable("id") Integer id)
	{
		return adminService.getMentorById(id);
	}
	
	
	@ResponseBody
	@RequestMapping(value="/check/{id}",method=RequestMethod.GET)
	public Mentor getMentor(@PathVariable("id") Integer id)
	{
		System.out.println("hshshshshshsshshshshshshshs");
		Mentor mentor =new Mentor();
		mentor=adminService.getMentor(id);
		
		System.out.println(mentor);
	 return mentor;
	}
}
