package controller.board.model;

import java.util.List;

import controller.board.dao.BoardDAO;

public class Mian {

	public static void main(String[] args) {
		BoardDAO dao=new BoardDAO();
		//new BoardDAO().list(1);
		
		BoardVO board=new BoardVO();
		board.setTitle("����16");
		board.setContent("Content16");
		board.setWriteId("id5");
		board.setWriteName("�̸�5");
		int result=dao.insert(board);
		System.out.println(result);
		//dao.list(1);
		
		//����Ʈ ���
		
		List<BoardVO> list=dao.select();
		for(BoardVO b:list) {
			System.out.println(b);
		}
		
	}

}
