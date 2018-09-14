package com.teamsankya.bankingsystem.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Transation")
public class TransationBean implements Serializable {
     
	@ManyToOne
	@JoinColumn(name = "accountno", referencedColumnName = "Accountno")
	private UserInfoBean userinfo;
    @Id
	@Column(name = "Tran_idno")
	private String Tran_idno;
	@Column(name = "Tran_desc")
	private String Tran_desc;
	@Column(name = "Date_of_Trans")
	private int Date_of_Trans;
	@Column(name = "Tran_Type")
	private String Tran_Type;
	@Column(name = "Tran_Amount")
	private int Tran_amount;

	public UserInfoBean getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(UserInfoBean userinfo) {
		this.userinfo = userinfo;
	}

	public String getTran_idno() {
		return Tran_idno;
	}

	public void setTran_idno(String tran_idno) {
		Tran_idno = tran_idno;
	}

	public String getTran_desc() {
		return Tran_desc;
	}

	public void setTran_desc(String tran_desc) {
		Tran_desc = tran_desc;
	}

	public int getDate_of_Trans() {
		return Date_of_Trans;
	}

	public void setDate_of_Trans(int date_of_Trans) {
		Date_of_Trans = date_of_Trans;
	}

	public String getTran_Type() {
		return Tran_Type;
	}

	public void setTran_Type(String tran_Type) {
		Tran_Type = tran_Type;
	}

	public int getTran_amount() {
		return Tran_amount;
	}

	public void setTran_amount(int tran_amount) {
		Tran_amount = tran_amount;
	}

}
