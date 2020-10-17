package com.ebrain.springbootexample.entity;

import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import com.ebrain.springbootexample.enumeration.Status;
import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Type(type = "uuid-char")
	@Column(name = "id", updatable = false, nullable = false)
	private UUID id;

	@ApiModelProperty(value = "name", required = true, allowableValues = "String")
	@Column(name = "name")
	private String name;

	@ApiModelProperty(value = "phoneNumber", required = true, allowableValues = "String")
	@Column(name = "address")
	private String emaill;

	@ApiModelProperty(value = "phoneNumber", required = true, allowableValues = "String")
	@Column(name = "address")
	private String address;

	@ApiModelProperty(value = "Status", required = true, allowableValues = "ACTIVE,DELETE")
	@Enumerated(EnumType.STRING)
	@Column(name = "status")
	private Status status;

	@ApiModelProperty(value = "phoneNumber", required = true, allowableValues = "String")
	@Column(name = "name")
	private String phone;

	@JsonIgnore
	@OneToMany(mappedBy = "eId")
	private List<Attadance> aId;

	@JsonIgnore
	@OneToMany(mappedBy = "eId")
	private List<Leave> lId;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmaill() {
		return emaill;
	}

	public void setEmaill(String emaill) {
		this.emaill = emaill;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Attadance> getaId() {
		return aId;
	}

	public void setaId(List<Attadance> aId) {
		this.aId = aId;
	}

	public List<Leave> getlId() {
		return lId;
	}

	public void setlId(List<Leave> lId) {
		this.lId = lId;
	}

}
