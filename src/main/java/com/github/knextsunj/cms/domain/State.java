/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.knextsunj.cms.domain;

import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author kk
 */
//@Entity
//@Table(name = "state")
public class State {

//    @Id
//    @Column(name = "id")
//    @SequenceGenerator(name = "State_Seq", sequenceName = "state_seq")
//    @GeneratedValue(generator = "State_Seq")
	private Long id;

//    @Column(name = "descr")
	private String name;

//    @OneToMany(fetch = FetchType.LAZY,mappedBy = "state")
//    @OrderBy("id ASC")
	private List<Address> addresses;

	private LocalDateTime createdDate;

	private LocalDateTime updatedDate;

	public State() {

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
