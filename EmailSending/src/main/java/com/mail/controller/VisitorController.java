package com.mail.controller;

import java.util.List;
import java.util.Optional;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mail.dto.VisitorDto;
import com.mail.entity.Visitor;
import com.mail.service.IVisitorService;
import com.mail.service.SmtpMailSender;

/**
 * 
 * @author Nilesh
 *
 */
@RestController
@RequestMapping("/visitor")
public class VisitorController {
	@Autowired
	IVisitorService visitorService;

	@Autowired
	SmtpMailSender smtpMailSender;

	/**
	 * Method used to register visitor
	 * 
	 * @param visitor details (Visitor Object)
	 * @return status string
	 * @throws MessagingException
	 */

	@PostMapping("/register")
	public ResponseEntity<String> register(@RequestBody VisitorDto visitorDto) throws MessagingException {

		// return new ResponseEntity<String>(visitorService.register(visitorDto),
		// HttpStatus.OK);
		ResponseEntity<String> status = new ResponseEntity<String>(visitorService.register(visitorDto), HttpStatus.OK);
		ResponseEntity<String> status2 = new ResponseEntity<String>("Ticket Generated", HttpStatus.OK);
		String bodyMsg= "Dear Questines, Following visitor want to meet you regarding :"+ "Name : Rama" + "Purpose : Meeting";
		
		if (status2.equals(status)) {
			System.out.println("In Mail Service");

			smtpMailSender.send(visitorDto.getContactPersonEmail(),bodyMsg,visitorDto.getReasonForVisit());
			return status;
		} else {
			return new ResponseEntity<String>("Error in registration", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	/**
	 * Method used to get visitor list Displays visitor list on web page
	 * 
	 * @param Model Object
	 * @return status string
	 */

	@GetMapping("/visitorList")
	public String getVisitorsList() {
		List<Visitor> visitorlist = visitorService.getVisitorsList();
		return "visitorlist";
	}

	/**
	 * Method used to get visitor list
	 * 
	 * @param Model Object
	 * @return status string
	 */

	@GetMapping("/allVisitors")
	public List<Visitor> visitorList() {
		return visitorService.visitorList();
	}

	/**
	 * Method used to get visitor details
	 * 
	 * @param Long visitor id
	 * @return visitor details (Visitor Object)
	 */

	@GetMapping("/visitorList/{id}")
	public Optional<Visitor> getVisitorById(@PathVariable Long id) {
		return visitorService.getVisitorById(id);
	}

}
