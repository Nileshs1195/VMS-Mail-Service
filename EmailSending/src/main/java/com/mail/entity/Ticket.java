package com.mail.entity;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

/**
 * 
 * @author Nilesh
 *
 */
@Entity
@Table
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ticketId;

	@CreationTimestamp
	private LocalDateTime createDateTime;

	@CreationTimestamp
	private LocalTime inTime;

	@CreationTimestamp
	private Date outTime;

	public LocalTime getInTime() {
		return inTime;
	}

	public void setInTime(LocalTime inTime) {
		this.inTime = inTime;
	}

	public Date getOutTime() {
		return outTime;
	}

	public void setOutTime(Date outTime) {
		this.outTime = outTime;
	}

	public LocalDateTime getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(LocalDateTime createDateTime) {
		this.createDateTime = createDateTime;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "visitor_id")
	private Visitor visitor;

	public Visitor getVisitor() {
		return visitor;
	}

	public void setVisitor(Visitor visitor) {
		this.visitor = visitor;
	}

	public long getTicketId() {
		return ticketId;
	}

	public void setTicketId(long ticketId) {
		this.ticketId = ticketId;
	}

}
