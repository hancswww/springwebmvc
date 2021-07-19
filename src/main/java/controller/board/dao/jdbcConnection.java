package controller.board.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

@Repository
public class jdbcConnection {
	Connection conn;
	
	
	//static 사용시 autowired 사용하지 않아도 됨
	public Connection getConn() {
		return conn;
	}



	public void setConn(Connection conn) {
		this.conn = conn;
	}



	public jdbcConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(
			"jdbc:oracle:thin:@localhost:1521:xe","system","1111");

			if(conn==null) {System.out.println("DB접속 실패");}
			System.out.println("DB 접속성공");
			
			}catch(Exception e) { }
			
	}
	
	public void jdbcclose() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
