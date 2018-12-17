package com.nju.atcrowdfunding.potal.service;

import com.nju.atcrowdfunding.bean.Member;
import com.nju.atcrowdfunding.bean.Ticket;

public interface TicketService {

	Ticket getTicketByMemberId(Integer id);

	void saveTicket(com.nju.atcrowdfunding.bean.Ticket ticket);

	void updatePstep(Ticket ticket);

	void updatePiidAndPstep(Ticket ticket);

	Member getMemberByPiid(String processInstanceId);

	void updateStatus(Member member);

}
