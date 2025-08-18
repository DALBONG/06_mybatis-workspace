<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	되나?
	<!--  
		* 프레임 워크 
		  : 개발자가 보다 편리한 환경에서 개발할 수 있도록 제공하는 틀, 뼈대.
		 - S/W의 개발 입장으로서 공통적으로 사용되는 lib/개발도구/인터페이스 등 의미
		
		* 프레임 워크의 필요성
		 - 규모가 큰 프로젝트 작업시(많은 개발자들이 필요)
		   -> '통일성'있게 '빠르고, 안정적'으로 개발하기 위해 사용
		   -> 생산성 향상
		   
		* 프레임 워크 특징
		 - 개발자들이 따라야 하는 가이드라인 제공.
		   => 자유로운 설계/코딩 X, 가이드 대로 설계 및 코딩 (개발 범위 정해짐)
		 - 개발자들을 위한 다양한 도구 지원.
		
		* 프레임워크 장점 
		 - 개발 시간 줄일 수 있음
		 - 유지보수 용이 
		* 프레임워크 단점
		 - 프레임 워크에 의존시 개발자들의 능력이 떨어짐.
		 - 익숙해지기 까지 시간이 걸림.
		 
		* 프레임워크(FW) 종류
		 - 영속성 : 데이터 관련 CRUD 기능들을 보다 편리하게 작업할 수 있도록 제공하는 FW
		   ex) Mybatis, Hibernate, JPA
		 - java : 웹 app에 초점을 맞춰 필요한 요소들을 모듈화해서 제공해주는 FW
		   ex) Spring, Struts
		 - 화면구현 : FrontEnd를 보다 쉽게 구현할 수 있게 제공하는 FW
		   ex) Bootstrap, ...
		 - 기능 및 지원 : 특정 기능이나 업무 수행에 도움줄 수 있게 제공하는 FW
		   ex) Log4j, ...

	-->
	
	<!-- index페이지 로딩되면, WEB-INF/views/main.jsp로 곧바로 포워딩 -->
	<jsp:forward page="WEB-INF/views/main.jsp"/>
	
	
</body>
</html>