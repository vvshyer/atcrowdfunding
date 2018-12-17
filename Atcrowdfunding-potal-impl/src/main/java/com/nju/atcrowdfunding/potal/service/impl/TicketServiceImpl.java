package com.nju.atcrowdfunding.potal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nju.atcrowdfunding.bean.Member;
import com.nju.atcrowdfunding.bean.Ticket;
import com.nju.atcrowdfunding.potal.dao.TicketMapper;
import com.nju.atcrowdfunding.potal.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketMapper ticketMapper ;

	@Override
	public Ticket getTicketByMemberId(Integer id) {
		return ticketMapper.getTicketByMemberId(id);
	}

	@Override
	public void saveTicket(Ticket ticket) {
		ticketMapper.saveTicket(ticket);
	}

	@Override
	public void updatePstep(Ticket ticket) {
		ticketMapper.updatePstep(ticket);
	}

	@Override
	public void updatePiidAndPstep(Ticket ticket) {
		ticketMapper.updatePiidAndPstep(ticket);
	}

	@Override
	public Member getMemberByPiid(String processInstanceId) {
		return ticketMapper.getMemberByPiid(processInstanceId);
	}

	@Override
	public void updateStatus(Member member) {
		ticketMapper.updateStatus(member);
	}
	
}
