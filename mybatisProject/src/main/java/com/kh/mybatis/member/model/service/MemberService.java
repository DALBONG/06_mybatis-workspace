package com.kh.mybatis.member.model.service;

import com.kh.mybatis.member.model.vo.Member;

public interface MemberService {
	//인터페이스 : 상수필드 + 추상메소드 (public abstract이 숨겨있음)
		// 우리가 어떤 메소드가 필요할지 설계만 하는 것. 
	int insertMember(Member m);
	Member loginMember(Member m);
	int updateMember(Member m);
	int deleteMember(String userId);
	
	
}
