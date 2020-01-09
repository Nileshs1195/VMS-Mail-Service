package com.mail.controller;

import java.time.LocalTime;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mail.dto.VisitorDto;
import com.mail.entity.Ticket;
import com.mail.entity.Visitor;
import com.mail.repository.TicketRepository;
import com.mail.repository.VisitorRepository;
import com.mail.service.ITicketService;
import com.mail.service.IVisitorService;

/**
 * 
 * @author Nilesh
 *
 */

@Controller
@RequestMapping("/Ticket")
public class TicketController {

	@Autowired
	ITicketService ticketService;

	/**
	 * Method used to Generate Ticket
	 * 
	 * @param visitor details (Visitor Object)
	 * @return status string
	 */
	@PostMapping("/generateTicket")
	public String generateTicket(@RequestBody VisitorDto visitorDto) {

		return ticketService.generateTicket(visitorDto);
	}

}
