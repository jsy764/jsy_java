<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String Title = request.getParameter("title");
	String Author = request.getParameter("author");
	String Content = request.getParameter("content");
	String Date = request.getParameter("date");
	
	Connection conn=null;
	PreparedStatement pt=null;
	ResultSet rs = null;
	
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String user = "jsy9845";
		String password = "1234";
		String url="jdbc:mysql://localhost:3306/jsy9845";
		conn = DriverManager.getConnection(url, user, password);
		
	}catch(Exception e){
		System.out.println("드라이버 로드 실패 및 접속 실패");
		e.printStackTrace();
	}
	
	String sql = "insert into kkk_board(title, author, content, Date) "+
			" values(?,?,?,?)";
			try{
				pt = conn.prepareStatement(sql);
				pt.setString(1, Title);
				pt.setString(2, Author);
				pt.setString(3, Content);
				pt.setString(4, Date);
				pt.executeUpdate(); // 쿼리문과 채워진 데이터를 보내기
				
			}catch(SQLException e){
				System.out.println("회원가입 테이블 저장 실패");
				e.printStackTrace();
			}
			
%>
			
			<!DOCTYPE html>
			<html>
			<head>
			<meta charset="UTF-8">
			<title>Insert title here</title>
			</head>
			<body>
			<h2> 작성 완료! </h2>
			<a href = "board.jsp">HOME</a>
			</body>
			</html>