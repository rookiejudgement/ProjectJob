package com.teamsankya.bankingsystem.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="payee_table")
public class PayeeTableBean implements Serializable
{
	
	@Column(name="pidno") private String pidno;
	@Column(name="nick_name") private String nick_name;
	@Id
	@ManyToOne
	@JoinColumn(name="Accountno",referencedColumnName="Accountno") private UserInfoBean userinfo;
	public String getPidno() {
		return pidno;
	}
	public void setPidno(String pidno) {
		this.pidno = pidno;
	}
	public String getNick_name() {
		return nick_name;
	}
	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}
	public UserInfoBean getUserinfo() {
		return userinfo;
	}
	public void setUserinfo(UserInfoBean userinfo) {
		this.userinfo = userinfo;
	}
	
	
}
	
