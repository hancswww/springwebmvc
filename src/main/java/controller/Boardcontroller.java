package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import controller.board.dao.BoardDAO;
import controller.board.model.BoardVO;

@Controller
@RequestMapping("/board/")
public class Boardcontroller {
	
	@Autowired
	BoardDAO dao;
	BoardVO	vo;
	
	@RequestMapping("list")
		public ModelAndView list() {
			ModelAndView mv=new ModelAndView();
			mv.addObject("pageboard", dao.list(1));
			mv.setViewName("/board/list");
			return mv;
	}
	
	
	@RequestMapping("searchList")
		public ModelAndView searchlist(String field, String search, int requestPage) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("pageboard", dao.searchList(field, search, requestPage));
		mv.setViewName("/board/list");
		return mv;
}
	/*
	@RequestMapping("test")
	@ResponseBody
		public String test(String p, String name, String age) {
			return p;
		}
	*/
	
	@RequestMapping("test")
	public String test(String p, String name, String age) {
		System.out.println("p:"+p);
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		return "/board/test";
	}
	
	@RequestMapping("testform")
		public String testform() {
		return "/board/testform";
	}
	
	@RequestMapping("writeForm")
		public ModelAndView writeForm() {
			ModelAndView mv=new ModelAndView();
			mv.addObject(dao.insert(vo));
			mv.setViewName("/board/writeForm");
			return mv;
		}
	
	@RequestMapping("update")
		public ModelAndView update() {
			ModelAndView mv=new ModelAndView();
			mv.addObject(dao.update(0, null, null));
			mv.setViewName("board/update");
			return mv;
	}
	/*
	@RequestMapping("read")
	public ModelAndView read() {
		ModelAndView mv=new ModelAndView();
		mv.addObject(dao.));
		return mv;
	}
	*/
	@RequestMapping("reply")
	public ModelAndView reply() {
		ModelAndView mv=new ModelAndView();
		mv.addObject(dao.replyInsert(vo));
		mv.setViewName("board/replyForm");
		
		return mv;
	}
	
	
}

