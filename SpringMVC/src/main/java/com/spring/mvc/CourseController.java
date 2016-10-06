package com.spring.mvc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
public class CourseController{
	
	@Autowired
	private CourseService cs;

	@RequestMapping(value="/course.mjt")
	protected String getCourses(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ArrayList<String> al=cs.getCourses();
		request.setAttribute("AL", al);
		return "show";
	}

}
