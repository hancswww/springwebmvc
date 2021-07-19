/*
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

public class BoardDAO2 {
	Connection con;
	public BoardDAO2() {
		String user="project_user";
		String password="285465";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url, user, password);
				
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		if(con==null) {
			System.out.println("DB 접속 실패");
		}else {
			System.out.println("DB 접속 성공");
		}
	}
	
	public int board_insert() {
		int result=0;
		String sql="insert into board_tbl values()";
		
		
		return result;
	}
	
	 public int board_update(int board_id) {
		 int result=0;

		 return result;
		 
	 }
	
	 public int board_delete(int board_id) {
		 int result=0;
		 
		 return result;		 
	 }
	 
	 //유저 주요 정보 리스트 생성
	 public List<BoardVO> userlist(String login_id){
		 List<BoardVO> list=new ArrayList<BoardVO>();
		 
		 String sql="select board_view, board_up, board_down from board_tbl where board_writer=?";
		 
		 try {
		 PreparedStatement pstmt=con.prepareStatement(sql);
		 pstmt.setString(1, login_id);
		 ResultSet rs=pstmt.executeQuery();
		 
		 while(rs.next()) {
			 BoardVO board=new BoardVO();
			 board.setBoard_view(rs.getInt("board_view"));
			 board.setBoard_up(rs.getInt("board_up"));
			 board.setBoard_down(rs.getInt("board_down"));
			 list.add(board);
		 }
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 return list;
		 
	 }
	 
	 //
	 public List<BoardVO> list(){
		 List<BoardVO> list=new ArrayList<BoardVO>();
		 
		 String sql="select board_num, board_title, board_writer, board_view, board_up, board_down, board_date from board_tbl";
		 
		 try {
			 
		 
		 PreparedStatement pstmt=con.prepareStatement(sql);
		 ResultSet rs=pstmt.executeQuery();
		 while(rs.next()) {
			 BoardVO board=new BoardVO();
			 board.setBoard_num(rs.getInt("board_num"));
			 board.setBoard_title(rs.getString("board_title"));
			 board.setBoard_writer(rs.getString("board_writer"));
			 board.setBoard_view(rs.getInt("board_view"));
			 board.setBoard_up(rs.getInt("board_up"));
			 board.setBoard_down(rs.getInt("board_down"));
			 board.setBoard_date(rs.getDate("board_date"));
			 list.add(board);
		 }
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 return list;
	 }
	 public List<BoardVO> list(String type){
		 List<BoardVO> list=new ArrayList<BoardVO>();
		 String sql="select * from board_tbl where board_main=?";
		try {
		 PreparedStatement pstmt=con.prepareStatement(sql);
		 ResultSet rs=pstmt.executeQuery();
		 while(rs.next()){
			 BoardVO board=new BoardVO();
			 board.setBoard_num(rs.getInt("board_num"));
			 board.setBoard_title(rs.getString("board_title"));
			 board.setBoard_writer(rs.getString("board_writer"));
			 board.setBoard_view(rs.getInt("board_view"));
			 board.setBoard_up(rs.getInt("board_up"));
			 board.setBoard_down(rs.getInt("board_down"));
			 board.setBoard_date(rs.getDate("board_date"));
			 list.add(board);
		 }
		 }catch(Exception e) {
				e.printStackTrace();
		 }
		 return list;
	 }
	 
}
*/