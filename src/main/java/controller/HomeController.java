package controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	//@Autowired 
	Wheater weather;
	
	@RequestMapping("/test")
	void test() {
		System.out.println("test");
	}
	
	@RequestMapping("/test3")
	String test3() {
		return "test333";
	}
	@RequestMapping("/test1")
	ModelAndView test1() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("data", "test1");
		mv.setViewName("test");
		return mv;
	}
	@RequestMapping("/test2")
	ModelAndView test2() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("data", "test2");
		mv.setViewName("test");
		return mv;
	}
	
	@RequestMapping("/weather")
	ModelAndView weather(HttpServletRequest request, HttpServletResponse response) {
		response.setCharacterEncoding("UTF-8");
		ServletContext context=request.getServletContext();
		context.setAttribute("context", "context");
		HttpSession session= request.getSession();
		session.setAttribute("session", "session");
		ModelAndView mv=new ModelAndView();
		//mv.addObject("data", new Wheater().weatherData());
		mv.addObject("data", weather.weatherData());
		mv.setViewName("weather");
		return mv;
	}
	@RequestMapping("elec")
	ModelAndView edu(HttpServletRequest request, HttpServletResponse response) {
		response.setCharacterEncoding("UTF-8");
		ServletContext context=request.getServletContext();
		context.setAttribute("context", "context");
		HttpSession session= request.getSession();
		session.setAttribute("session", "session");
		ModelAndView mv=new ModelAndView();
		mv.addObject("data", new elec_car().car_Data());
		mv.setViewName("elec");
		return mv;
	}
}
