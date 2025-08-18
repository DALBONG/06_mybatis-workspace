package com.kh.mybatis.member.model.dao;

import org.apache.ibatis.session.SqlSession;

import com.kh.mybatis.member.model.vo.Member;

public class MemberDao {

	public int insertMember(SqlSession sqlSession, Member m) {
		
		
		/*
         * int result = 0;
         * PreparedStatement pstmt = null;
         * String sql = prop.getProperty("insertMember");
         * 
         * try {
         *     pstmt = conn.prepareStatement(sql);
         *  pstmt.setString(1, m.getUserId());
         *  pstmt.setString(2, m.getUserPwd());
         *  ....
         *  
         *  result = pstmt.executeUpdate();
         * 
         * } catch(xxx){
         * 
         * } finally{
         *      close(pstmt);
         * }
         * 
         * return result
         * 
         */
		
		/*
		  sqlSession에서 제공하는 메소드를 통해 sql문 찾아 실행 및 결과 받기
		  
		 	sqlSession.sql문종류에 맞는메소드("매퍼의별칭.쿼리아이디", ["sql문 완성시킬 객체"]); 
		*/
		
		return sqlSession.insert("memberMapper.insertMember", m);
	}

}
