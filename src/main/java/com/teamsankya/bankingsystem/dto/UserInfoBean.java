package com.teamsankya.bankingsystem.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_info")
public class UserInfoBean implements Serializable

{
	@Id
	@Column(name = "Accountno")
	private String Accountno;
	@Column(name = "uidno")
	private String uidno;
	@Column(name = "login_pass")
	private String login_pass;
	@Column(name = "secreat_question")
	private String secreat_question;
	@Column(name = "tran_pass")
	private String tran_pass;
	@Column(name = "look_status")
	private String look_status;
	@Column(name = "email")
	private String email;
	@Column(name = "pancard_no")
	private String pancard_no;
	@Column(name = "Address")
	private String Address;
	@Column(name = "Mobileno")
	private String Mobileno;

	public String getAccountno() {
		return Accountno;
	}

	public void setAccountno(String accountno) {
		Accountno = accountno;
	}

	public String getUidno() {
		return uidno;
	}

	public void setUidno(String uidno) {
		this.uidno = uidno;
	}

	public String getLogin_pass() {
		return login_pass;
	}

	public void setLogin_pass(String login_pass) {
		this.login_pass = login_pass;
	}

	public String getSecreat_question() {
		return secreat_question;
	}

	public void setSecreat_question(String secreat_question) {
		this.secreat_question = secreat_question;
	}

	public String getTran_pass() {
		return tran_pass;
	}

	public void setTran_pass(String tran_pass) {
		this.tran_pass = tran_pass;
	}

	public String getLook_status() {
		return look_status;
	}

	public void setLook_status(String look_status) {
		this.look_status = look_status;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPancard_no() {
		return pancard_no;
	}

	public void setPancard_no(String pancard_no) {
		this.pancard_no = pancard_no;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getMobileno() {
		return Mobileno;
	}

	public void setMobileno(String mobileno) {
		Mobileno = mobileno;
	}

}
