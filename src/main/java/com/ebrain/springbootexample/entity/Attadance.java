package com.ebrain.springbootexample.entity;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "attadance")
public class Attadance {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Type(type = "uuid-char")
	@Column(name = "id", updatable = false, nullable = false)
	private UUID id;

	@Column(name = "date")
	@ApiModelProperty(value = "date", required = true, allowableValues = "")
	private Date date;

	@Column(name = "check_in_time")
	@ApiModelProperty(value = "checkInTime", required = true, allowableValues = "Date")

	private Date checkInTime;

	@Column(name = "check_out_time")
	@ApiModelProperty(value = "checkInTime", required = true, allowableValues = "Date")
	private Date checkOutTime;

	@ManyToOne
	@JoinColumn(name = "eid")
	private Employee eId;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getCheckInTime() {
		return checkInTime;
	}

	public void setCheckInTime(Date checkInTime) {
		this.checkInTime = checkInTime;
	}

	public Date getCheckOutTime() {
		return checkOutTime;
	}

	public void setCheckOutTime(Date checkOutTime) {
		this.checkOutTime = checkOutTime;
	}

	public Employee geteId() {
		return eId;
	}

	public void seteId(Employee eId) {
		this.eId = eId;
	}

}
