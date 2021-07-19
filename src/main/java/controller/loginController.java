package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.resource.HttpResource;

@Controller
@RequestMapping("/login/")
public class loginController {
	@RequestMapping("login")
	public String loginform() {
		return "/login/login";
	}
	
	@RequestMapping("logindo")
		public ModelAndView logindo(HttpServletRequest request) {
		//System.out.println("path:"+request.getContextPath()); 
		System.out.println("path:"+request.getRequestURI()); 
		String[] arr=request.getRequestURI().split("/");
		String context="/"+arr[1]+"/";
		String file="loginsuccess";
		ModelAndView mv=new ModelAndView();
		request.getSession().setAttribute("id", "user");
		mv.setViewName(context+file);
		return mv;
	}
	
	
}
