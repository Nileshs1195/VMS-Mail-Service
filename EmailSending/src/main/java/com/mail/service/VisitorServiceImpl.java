package com.mail.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.mail.dto.VisitorDto;
import com.mail.entity.Visitor;
import com.mail.repository.VisitorRepository;

@Service
public class VisitorServiceImpl implements IVisitorService {

	@Autowired
	VisitorRepository visitoryrepository;

	public String register(VisitorDto visitorDto) {

		Visitor va = new Visitor();

		va.setAddress(visitorDto.getAddress());

		va.setContactPersonEmail(visitorDto.getContactPersonEmail());
		va.setContactPersonName(visitorDto.getContactPersonName());
		va.setEmail(visitorDto.getEmail());

		va.setId(visitorDto.getId());

		va.setIdProof(visitorDto.getIdProof());

		va.setMobileNo(visitorDto.getMobileNo());

		va.setName(visitorDto.getName());

		va.setReasonForVisit(visitorDto.getReasonForVisit());

		visitoryrepository.save(va);
		return "Ticket Generated";
	}

	@Override
	public List<Visitor> getVisitorsList() {

		return visitoryrepository.findAll();
	}

	@Override
	public List<Visitor> visitorList() {
		return visitoryrepository.findAll();
	}

	@Override
	public Optional<Visitor> getVisitorById(Long id) {
		return visitoryrepository.findById(id);
	}

}
