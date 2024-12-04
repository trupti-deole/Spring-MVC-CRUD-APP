package com.cjc.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.crud.model.Student;
import com.cjc.crud.serviceI.HomeService;

@Controller
public class HomeController {
	         
	//it will inject HomeServiceImpl bean automatically due to autowire annotation
	@Autowired 
	private HomeService service; //secondary reference of HomeService inteface
	
	@RequestMapping(value="/")
	public String LandingPage()
	{
		 return "index";
	}

	
	
    @RequestMapping(value="/log")
	public String logPage()
	{
		 return "login";
	}
    @RequestMapping(value="/login")
	public String loginPage(@RequestParam String uname,@RequestParam String pass,Model m)
	{
//    	we send it to service then service will send it to repository then in repository
    	//we will chk username & password match or not.If matched then we will get  stu list.
    	
    	List<Student> studList=service.loginCheck(uname,pass);
    	System.out.println("Elements are"+studList);
    	
    	m.addAttribute("data",studList);
		 return "success";
	}
    
    @RequestMapping(value="/reg")
   	public String regPage()
   	{
   		 return "register";
   	}
    @RequestMapping(value="/register")
   	public String registerPage(@ModelAttribute Student stu)
   	{
    	System.out.println("In controller:"+stu);
    	service.saveData(stu);
   		 return "login";
   	}
    @RequestMapping(value="/delete")
   	public String deleteData(@RequestParam int rollno,Model m)
   	{
    	List<Student> alist=service.deleteData(rollno);
    	m.addAttribute("data",alist);
   		 return "success";
    	
   	}
    
    @RequestMapping(value="/update")
   	public String updateData(@RequestParam int rollno,Model m)
   	{
    	Student student=service.updateData(rollno);
    	m.addAttribute("data",student);
   		 return "update";
    	
   	}
    
    @RequestMapping(value="/edit")
   	public String updateData(@ModelAttribute Student st,Model m)
   	{
    	List<Student> studentList=service.editData(st);
    	m.addAttribute("data",studentList);
   		 return "success";
    	
   	}
    
}
