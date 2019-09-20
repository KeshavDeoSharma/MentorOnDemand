package com.example.sba.controller;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.sba.model.User;
import com.example.sba.model.UserLogin;
import com.example.sba.service.UserService;
import com.example.sba.service.UserServiceImpl;



@Controller
public class UserControllerImpl  {
	
	@Autowired 
	private UserService userService=new UserServiceImpl();

	@RequestMapping(value = "/userLogin", method = RequestMethod.GET)
	public String userLogin(ModelMap model) throws SQLException {
		User user=new User();
		model.addAttribute("user",user);
		return "userLogin";

	}
	

	@RequestMapping(value = "/login", method = RequestMethod.POST) 
	public String loginUser(User user, Model model, HttpSession session) throws SQLException { 
		System.out.println("inside post method"); 
		System.out.println("password"+user.getPassword());
		User user1=userService.loginUser(user.getEmail());
		if(user1!=null)
		{
			if(user.getPassword().equals(user1.getPassword()))
			{
				if(user.getActive()==1)
				{
					return " ";
				}
			}
			return "";
		}
return "";
	}
	

	@RequestMapping(value = "/userRegister", method = RequestMethod.GET)
	public String userRegistration(ModelMap model) throws SQLException {
		User user=new User();
		model.addAttribute("user",user);
		return "userRegistration";

	}
	

	@RequestMapping(value = "/userreg", method = RequestMethod.POST) 
	public String registerUser(User user, Model model) throws SQLException { 
		System.out.println("inside post method"); 
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date(); 
	    String date1=formatter.format(date);
	    user.setRegDatetime(date1);
	    Random random=new Random();
	    int i=random.nextInt(9000)+1000;
	    user.setRegCode("USER"+i);
		   user.setActive(1);
		if(userService.registerUser(user))
			return "redirect:/userLogin";
		else
			return "redirect:/userRegister";

	}

}
