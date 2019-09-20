package com.example.sba.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.sba.model.Mentor;
import com.example.sba.model.User;
import com.example.sba.service.AdminService;
import com.example.sba.service.UserServiceImpl;

@Controller
public class AdminControllerImpl {

	@Autowired
	AdminService adminService;
	@Autowired
	UserServiceImpl userService;
	
	
	@RequestMapping(path="/loadUserlist",method=RequestMethod.GET)
	public String loadUser(User user,ModelMap model)
	{
		model.addAttribute("userList",adminService.getList());
		return "manageUsers";
	}
	
	  @RequestMapping(path="/activate/{id}",method=RequestMethod.GET) 
	  public  String editUser(@PathVariable ("id") int id) {
	User user=userService.getUser(id);
	if(user.getActive()==0)
		user.setActive(1);
	else
		user.setActive(0);
	userService.getUpdateUser(user);
	return "redirect:/loadUserlist";
	  }
	  
	  
	  @RequestMapping(path="/loadMentor",method=RequestMethod.GET)
	  public String loadMentor(ModelMap model) {
		  Mentor mentor=new Mentor();
		  model.addAttribute("mentor", mentor);
		  return "mentorRegistration";
	  }
	  
	  
	  @RequestMapping(path="/registerMentor",method=RequestMethod.POST)
	  public String registerMentor(Mentor mentor,ModelMap model)
	  {
		  SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		    Date date = new Date(); 
		    String date1=formatter.format(date);
		   mentor.setRegDatetime(date1);
		   Random random=new Random();
		    int i=random.nextInt(9000)+1000;
		    mentor.setRegCode("MENTOR"+i);
		 if( adminService.registerMentor(mentor)!=null)
		 {
			 return "redirect:/loadUserlist";
		 }
		  
		 else return "redirect:/loadMentor";
	  }
	  
	  
	  
	  
	  @RequestMapping(path="/loginMentor",method=RequestMethod.GET)
	  public String mentorLogin(ModelMap model)
	  {
		  Mentor mentor=new Mentor();
		  model.addAttribute("mentor",mentor);
		  return "mentorLogin";
	  }
	  
	  
	  
	  
	  
	
	  @RequestMapping(path="/mentorLogin",method=RequestMethod.POST)
	  public String loginMentor(Mentor mentor,ModelMap model)
	  {
		  Mentor mentor1=adminService.getMentor(mentor.getUserName());
		  if(mentor1!=null)
		  {
			  if(mentor.getPassword().equals(mentor1.getPassword()))
					  return "redirect:/loadMentor";
		  }
		  return "redirect:/loadUserList";
	  }
	
	  
	  @RequestMapping(path="/mentorList",method=RequestMethod.GET)
	  public String loadMentorList(ModelMap model)
	  {
		  
		  model.addAttribute("mentorList", adminService.getListMentor());
		  return "manageMentors";
	  }
}
	 
	
	

