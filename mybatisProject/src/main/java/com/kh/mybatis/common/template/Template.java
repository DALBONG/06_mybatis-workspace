package com.kh.mybatis.common.template;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Template {

	/*
     * 기존 JDBC
     * public static Connection getConnection() {
     *         // driver.properties 파일 읽어들여서
     *         // 해당 DB와 접속된 Connection 객체 생성하는 반환
     * }
     * 
     * public static void close(JDBC용 객체){
     *         // 전달받은 JDBC용 객체를 반납시키는 구문
     * }
     * 
     * public static void commit | rollback(Connection conn){
     *         // 트랜젝션 처리
     * }
     */

 	//Mybatis 
	public static SqlSession getSqlSession() {
		
		// mybaties-config.xml파일 읽어들여 해당 DB와 접속된 sqlSession객체 생성해서 반환
		SqlSession sqlSession = null;
		
		//sqlSession생성하기 위해, sqlSessionFactory 필요
		// sqlSessionFactory를 생성하기 위해, sqlSessionFactoryBuilder 필요 
		
		//source folder에 넣으면 복잡하지 않게 파일만 지정하면 됨
		String resource = "/mybatis-config.xml";
		
		try {
			InputStream stream = Resources.getResourceAsStream(resource);
			
			sqlSession = new SqlSessionFactoryBuilder().build(stream).openSession(false);
					//openSession(boolean flag) : 자동커밋 여부 (true : 함 / false : 안함)
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return sqlSession;
		
	}
	
	
	
	
	
	
	
	
	
}
