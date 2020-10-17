package com.ebrain.springbootexample.entity;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import com.ebrain.springbootexample.enumeration.LeaveStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "leave")
public class Leave {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Type(type = "uuid-char")
	@Column(name = "id", updatable = false, nullable = false)
	private UUID id;

	@ApiModelProperty(value = "name", required = true, allowableValues = "integer")
	@Column(name = "no_of_days")
	private int noOfDays;

	@ApiModelProperty(value = "fromDate", required = true, allowableValues = "Date")
	@Column(name = "from_date")
	private Date fromDate;

	@ApiModelProperty(value = "toDate", required = true, allowableValues = "Date")
	@Column(name = "name")
	private Date toDate;

	@ApiModelProperty(value = "name", required = true, allowableValues = "String")
	@Column(name = "name")
	private String reason;

	@ApiModelProperty(value = "Status", required = true, allowableValues = "APPROVED,REJECTED")
	@Enumerated(EnumType.STRING)
	@Column(name = "status")
	private LeaveStatus status;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "eid")
	private Employee eId;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public LeaveStatus getStatus() {
		return status;
	}

	public void setStatus(LeaveStatus status) {
		this.status = status;
	}

	public Employee geteId() {
		return eId;
	}

	public void seteId(Employee eId) {
		this.eId = eId;
	}

}
