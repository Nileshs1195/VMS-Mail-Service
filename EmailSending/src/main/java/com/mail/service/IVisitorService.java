package com.mail.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;
import com.mail.dto.VisitorDto;
import com.mail.entity.Visitor;

public interface IVisitorService {

	public String register(VisitorDto visitorDto);

	public List<Visitor> getVisitorsList();

	public List<Visitor> visitorList();

	public java.util.Optional<Visitor> getVisitorById(Long id);

}
