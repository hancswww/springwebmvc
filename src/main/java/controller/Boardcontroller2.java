/*
package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/board/")
public class Boardcontroller2 {
	
	@Autowired
	BoardDAO dao;
	
	@RequestMapping("list")
		public ModelAndView list() {
			ModelAndView mv=new ModelAndView();
			List<BoardVO> list=new ArrayList<BoardVO>();
			BoardVO send=new BoardVO();
			list=dao.list();
			
			for(BoardVO board: list) {
				System.out.println(board.getBoard_writer());
			}
			
			mv.addObject("board", list);
			mv.setViewName("list");
			
			return mv;
		
		
	}
}

*/