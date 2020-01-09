package com.mail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mail.entity.Ticket;

/**
 * 
 * @author Nilesh
 *
 */
@Repository
public interface TicketRepository extends JpaRepository<Ticket,Long>{

}
