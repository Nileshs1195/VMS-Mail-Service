package com.mail.service;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import com.mail.dto.VisitorDto;
import com.mail.entity.Ticket;
import com.mail.entity.Visitor;
import com.mail.repository.TicketRepository;
/**
 * 
 * @author Nilesh
 *
 */
@Service
public class TicketServiceImpl implements ITicketService {
	@Autowired
	TicketRepository ticketRepository;
public String generateTicket(@RequestBody VisitorDto visitorDto) {
		
		Ticket t1 = new Ticket();
		
		t1.setVisitor(new Visitor(visitorDto.getName(),visitorDto.getEmail(),visitorDto.getMobileNo(),
				visitorDto.getAddress(),visitorDto.getIdProof(),
				visitorDto.getContactPersonName(),visitorDto.getContactPersonEmail(),
				visitorDto.getReasonForVisit(),visitorDto.getStatus(),visitorDto.getContactPersonMobileNo()));
		t1.setOutTime(new Date());
		Ticket tId = ticketRepository.save(t1);
		ticketRepository.save(t1);
		
		System.out.println("visitor id is:"+tId.getVisitor().getId());
			
		return "Ticket Generated";
	}

}

