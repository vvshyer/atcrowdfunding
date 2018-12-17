package com.nju.atcrowdfunding.potal.service;

import java.util.List;
import java.util.Map;

import com.nju.atcrowdfunding.bean.Member;

public interface MemberService {

	Member queryMebmerlogin(Map<String, Object> paramMap);

	void updateAcctType(Member loginMember);

	void updateBasicinfo(Member loginMember);

	void updateEmail(Member loginMember);

	void updateAuthstatus(Member loginMember);

	Member getMemberById(Integer memberid);

	List<Map<String, Object>> queryCertByMemberid(Integer memberid);

}
