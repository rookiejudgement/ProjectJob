package com.teamsankya.bankingsystem.dto;

import java.io.Serializable;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "CustmerIdBean")
public class CustmerIdBean implements Serializable {
	@Id
	@OneToOne
	@JoinColumn(name = "Accountno", referencedColumnName = "Accountno")
	private AccountHolderBean accountholder;

	@Column(name = "Custmer_name")
	private String Custmer_name;
	@Column(name = "email")
	private String email;
	@Column(name = "Address")
	private String Address;
	@Column(name = "pancard")
	private String Pancard;
	@Column(name="password")
	private String  passsword;
	public AccountHolderBean getAccountholder() {
		return accountholder;
	}
	public void setAccountholder(AccountHolderBean accountholder) {
		this.accountholder = accountholder;
	}
	public String getCustmer_name() {
		return Custmer_name;
	}
	public void setCustmer_name(String custmer_name) {
		Custmer_name = custmer_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPancard() {
		return Pancard;
	}
	public void setPancard(String pancard) {
		Pancard = pancard;
	}
	public String getPasssword() {
		return passsword;
	}
	public void setPasssword(String passsword) {
		this.passsword = passsword;
	}

	
}
