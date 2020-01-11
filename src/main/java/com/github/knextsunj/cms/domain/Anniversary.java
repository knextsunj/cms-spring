/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.knextsunj.cms.domain;

import java.time.LocalDate;

/**
 *
 * @author kk
 */
//@Embeddable
//@Access(AccessType.FIELD)
public class Anniversary {

//	@Column(name = "dob")
	private LocalDate dateOfBirth;

//	@Column(name = "anniv_rem_msg")
	private LocalDate anniversaryDate;

	public Anniversary() {

	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDate getAnniversaryDate() {
		return anniversaryDate;
	}

	public void setAnniversaryDate(LocalDate anniversaryDate) {
		this.anniversaryDate = anniversaryDate;
	}

}
