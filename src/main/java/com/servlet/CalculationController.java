package com.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculationController {
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest req, HttpServletResponse res)
	{
		
		  int i = Integer.parseInt(req.getParameter("a1")); 
		  int j = Integer.parseInt(req.getParameter("a2")); 
		  ModelAndView mv = new ModelAndView(); 
		  mv.setViewName("result.jsp"); 
		  mv.addObject("operation", "ADDITION"); 
		  mv.addObject("result", (i+j));
		  return mv;
	}
	
	@RequestMapping("/sub")
	public ModelAndView subtract(HttpServletRequest req, HttpServletResponse res)
	{
		
		  int i = Integer.parseInt(req.getParameter("s1")); 
		  int j = Integer.parseInt(req.getParameter("s2")); 
		  ModelAndView mv = new ModelAndView(); 
		  mv.setViewName("result.jsp"); 
		  mv.addObject("operation", "SUBTRACTION"); 
		  mv.addObject("result", (i-j));
		  return mv;
	}
	
	@RequestMapping("/mul")
	public ModelAndView multiply(HttpServletRequest req, HttpServletResponse res)
	{
		
		  int i = Integer.parseInt(req.getParameter("m1")); 
		  int j = Integer.parseInt(req.getParameter("m2")); 
		  ModelAndView mv = new ModelAndView(); 
		  mv.setViewName("result.jsp"); 
		  mv.addObject("operation", "MULTIPLICATION"); 
		  mv.addObject("result", (i*j));
		  return mv;
	}
	
	@RequestMapping("/div")
	public ModelAndView divide(HttpServletRequest req, HttpServletResponse res)
	{
		
		  int i = Integer.parseInt(req.getParameter("d1")); 
		  int j = Integer.parseInt(req.getParameter("d2")); 
		  ModelAndView mv = new ModelAndView(); 
		  mv.setViewName("result.jsp"); 
		  mv.addObject("operation", "DIVISION"); 
		  mv.addObject("result",(float)(i/j));
		  return mv;
	}
 }
