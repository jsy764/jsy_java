package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DAO.BoardDao;
import DTO.Board;
import jakarta.servlet.http.HttpServletRequest;

public class BoardService {
	
	private BoardDao dao = new BoardDao();
	
	public void save(HttpServletRequest request) {
		// request객체에서 파라미터 값 가져와 Board 클래스 객체에 저장
		// Board클래스 객체를 DAO에 넘겨주기
		String Writer = request.getParameter("writer");
		String Title = request.getParameter("title");
		String Content = request.getParameter("content");
		
		Board board = new Board();
		BoardDao dao = new BoardDao();
		
		board.setContent(Content);
		board.setWriter(Writer);
		board.setTitle(Title);
		dao.insert(board);
				
	}

	public void allSelect(HttpServletRequest request) {
		
		ArrayList<Board> list = dao.select();
		request.setAttribute("boardList", list);
	}
}
