package ua.com.emailsend.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.com.emailsend.service.UserService;



@Controller
public class Controler {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(value="/newUser")
	public String newUser(){
		return "newUser";
	}
	
	
//	@RequestMapping(value="/index")
//	public String index(){
//		return "index";
//	}
	
	@RequestMapping(value = "/loginPage")
	public String loginPage() {
		return "loginPage";
	}
	
	@RequestMapping(value="/newUser", method = RequestMethod.POST)
	public String newUser2(
			@RequestParam(value="emailUser") String emailUser,
			@RequestParam(value="passwordUser") String passwordUser,
			@RequestParam(value="passwordUserRepeat") String passwordUserRepeat,
			@RequestParam(value="nameUser") String nameUser,
			@RequestParam(value="telephoneUser") String telephoneUser){
		
		if (passwordUser.equals(passwordUserRepeat)) {
		long tel = Long.parseLong(telephoneUser);
		
		service.createUser(nameUser, emailUser, passwordUser, tel);
		
		return "redirect:/loginPage?reg=success";
		}
		
	
	else {
		return "redirect:/newUser?reg=wrongpass";
	}
		
	}
	
	@RequestMapping(value = "/secured/helloAdmin")
	public String welcomeAfterLogingPage() {
		return "secured/helloAdmin";
	}
	
	@RequestMapping(value = "/users/helloUser")
	public String welcomeAfterLogingPage2() {
		return "users/helloUser";
	}
	}
	

