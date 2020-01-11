/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.knextsunj.cms.domain;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author kk
 */
//@Entity
//@Table(name = "contact")
public class Contact {

//    @Id
//    @Column(name = "id")
//    @SequenceGenerator(name = "Contact_Seq", sequenceName = "contact_seq")
//    @GeneratedValue(generator = "Contact_Seq")
	private Long id;

//    @Column(name = "name")
	private String name;

//    @Column(name = "email")
	private String emailAddress;

//    @Embedded
	private Anniversary anniversary;

//    @OneToMany(fetch = FetchType.LAZY,mappedBy = "contact")
//    @OrderBy("id ASC")
	private Set<Address> addresses;

	private LocalDateTime createdDate;

	private LocalDateTime updatedDate;

	public Contact() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Anniversary getAnniversary() {
		return anniversary;
	}

	public void setAnniversary(Anniversary anniversary) {
		this.anniversary = anniversary;
	}

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
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

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", emailAddress=" + emailAddress + ", anniversary="
				+ anniversary + ", addresses=" + addresses + ", createdDate=" + createdDate + ", updatedDate="
				+ updatedDate + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(createdDate, emailAddress, id, name, updatedDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		return Objects.equals(createdDate, other.createdDate) && Objects.equals(emailAddress, other.emailAddress)
				&& Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(updatedDate, other.updatedDate);
	}

	
	
}
