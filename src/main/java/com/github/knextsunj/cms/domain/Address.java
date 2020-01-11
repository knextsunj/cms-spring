/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.knextsunj.cms.domain;

import java.time.LocalDateTime;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;

/**
 *
 * @author kk
 */
//@Entity
//@Table(name = "address")
public class Address {

//    @Id
//    @Column(name = "id")
//    @SequenceGenerator(name = "Address_Seq", sequenceName = "address_seq")
//    @GeneratedValue(generator = "Address_Seq")
	private Long id;

//    @Column(name = "line1")
	private String addrLine1;

//    @Column(name = "line2")
	private String addrLine2;

//    @Column(name = "line3")
	private String addrLine3;

//    @ManyToOne
//    @JoinColumn(name = "city_id")
	private City city;

//    @ManyToOne
//    @JoinColumn(name = "state_id")
	private State state;

	private Long position;

//    @ManyToOne
//    @JoinColumn(name = "addr_type_id")
	private AddressType addressType;

	private Contact contact;

	private LocalDateTime createdDate;

	private LocalDateTime updatedDate;

	public Address() {

	}

	public Long getId() {
		return id;
	}

	public String getAddrLine1() {
		return addrLine1;
	}

	public void setAddrLine1(String addrLine1) {
		this.addrLine1 = addrLine1;
	}

	public String getAddrLine2() {
		return addrLine2;
	}

	public void setAddrLine2(String addrLine2) {
		this.addrLine2 = addrLine2;
	}

	public String getAddrLine3() {
		return addrLine3;
	}

	public void setAddrLine3(String addrLine3) {
		this.addrLine3 = addrLine3;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public AddressType getAddressType() {
		return addressType;
	}

	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}

	public Long getPosition() {
		return position;
	}

	public void setPosition(Long position) {
		this.position = position;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

}
