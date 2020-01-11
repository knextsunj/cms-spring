/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.knextsunj.cms.domain;

import java.time.LocalDateTime;
import java.util.List;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;

/**
 *
 * @author kk
 */
//@Entity
//@Table(name = "address_type")
public class AddressType {

//    @Id
//    @Column(name = "id")
//    @SequenceGenerator(name = "Address_Type_Seq", sequenceName = "address_type_seq")
//    @GeneratedValue(generator = "Address_Type_Seq")
	private Long id;

//    @Column(name = "descr")
	private String name;

//  @OneToMany(fetch = FetchType.LAZY,mappedBy = "city")
//  @OrderBy("id ASC")
	private List<Address> addresses;

	private LocalDateTime createdDate;

	private LocalDateTime updatedDate;

	public AddressType() {

	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
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
