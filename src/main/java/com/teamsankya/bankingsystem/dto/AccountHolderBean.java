package com.teamsankya.bankingsystem.dto;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "AccountHolderBean")
public class AccountHolderBean implements Serializable {
	@Id
	@OneToOne
	@JoinColumn(name="Accountno",referencedColumnName="Accountno")
	private UserInfoBean user;
	@Column(name = "Acc_Type")
	private String Acc_Type;
	
	@Column(name = "Acc_openDate")
	private Date Acc_openDate;
	@Column(name = "Address")
	private String Address;
	
	public UserInfoBean getUser() {
		return user;
	}
	public void setUser(UserInfoBean user) {
		this.user = user;
	}
	public String getAcc_Type() {
		return Acc_Type;
	}
	public void setAcc_Type(String acc_Type) {
		Acc_Type = acc_Type;
	}
	public Date getAcc_openDate() {
		return Acc_openDate;
	}
	public void setAcc_openDate(Date acc_openDate) {
		Acc_openDate = acc_openDate;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
}
