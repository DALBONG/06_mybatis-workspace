package com.kh.mybatis.board.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.mybatis.board.model.service.BoardService;
import com.kh.mybatis.board.model.service.BoardServiceImpl;
import com.kh.mybatis.board.model.vo.Board;
import com.kh.mybatis.board.model.vo.Reply;

/**
 * Servlet implementation class BoardDetailController
 */
@WebServlet("/detail.bo")
public class BoardDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardDetailController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int boardNo = Integer.parseInt(request.getParameter("bno"));

		//이게 정확한 표현법.
		//BoardService bservice = new BoardServiceImpl();
		
		BoardServiceImpl bservice = new BoardServiceImpl();
		
		
		// 1. 조회수 증가
		int result = bservice.increaseCount(boardNo);
		
		if(result > 0) {// 증가 성공
			
			// 2. 게시글 상세 조회
			Board b = bservice.selectBoard(boardNo);
			
			// 3. 해당 게시글의 댓글 조회
			ArrayList<Reply> list = bservice.selectReplyList(boardNo);
			
			request.setAttribute("b", b);
			request.setAttribute("list", list);
			
			request.getRequestDispatcher("WEB-INF/views/board/boardDetail.jsp").forward(request, response);
			
			
		}else {
			request.setAttribute("errorMsg", "상세조회 실패");
			request.getRequestDispatcher("WEB-INF/views/common/errorPage.jsp").forward(request, response);
			
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
