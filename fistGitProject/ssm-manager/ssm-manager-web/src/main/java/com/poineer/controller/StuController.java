package com.poineer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.poineer.enty.Student;
import com.poineer.service.StuService;

@Controller
@RequestMapping("/stu")
public class StuController {

	@Autowired
	private StuService stuService;
	
	@RequestMapping("/myIndex")
    public ModelAndView myIndex(){
		 ModelAndView mav = new ModelAndView();
		  mav.setViewName("myTest");
		return mav;
    }
	@RequestMapping("/addStu")
	@ResponseBody
    public int addStu(@RequestBody Student students){
    	
		return stuService.addStu(students);
    }
	
	@RequestMapping("/delStuByName")
	@ResponseBody
	public int delStuByName(String sName){
		
		return stuService.delStuByName(sName);
	}
	
	@RequestMapping("/findStuById")
	@ResponseBody
	public Student findStuById(int sId){
		
		return stuService.findStuById(sId);
	}

	@RequestMapping("/findAllStus")
	@ResponseBody
	public List<Student> findAllStus(){
		
		return stuService.findAllStus();
	}

	public StuService getStuService() {
		return stuService;
	}

	public void setStuService(StuService stuService) {
		this.stuService = stuService;
	}
}
