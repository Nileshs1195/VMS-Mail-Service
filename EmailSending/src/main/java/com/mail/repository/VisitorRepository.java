package com.mail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mail.dto.VisitorDto;
import com.mail.entity.Visitor;

@Repository
public interface VisitorRepository extends JpaRepository<Visitor, Long>{

}
