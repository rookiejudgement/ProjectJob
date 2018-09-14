package com.teamsankya.bankingsystem.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="fund_transfer")
public class FundTransationBean  implements Serializable
{
    @Id
	@ManyToOne
	@JoinColumn(name="Accountno",referencedColumnName="Accountno")
    private UserInfoBean userbean;
	@Column(name="DateofTranstion") private int DateofTranstion;
	@Column(name="Transtion_amount") private long Transtion_amount;
	
	@Column(name=" fundTranstion_id") private String  fundTranstion_id;
	@Column(name="pidNO") private String pidNO;
	public UserInfoBean getUserbean() {
		return userbean;
	}
	public void setUserbean(UserInfoBean userbean) {
		this.userbean = userbean;
	}
	public int getDateofTranstion() {
		return DateofTranstion;
	}
	public void setDateofTranstion(int dateofTranstion) {
		DateofTranstion = dateofTranstion;
	}
	public long getTranstion_amount() {
		return Transtion_amount;
	}
	public void setTranstion_amount(long transtion_amount) {
		Transtion_amount = transtion_amount;
	}
	public String getFundTranstion_id() {
		return fundTranstion_id;
	}
	public void setFundTranstion_id(String fundTranstion_id) {
		this.fundTranstion_id = fundTranstion_id;
	}
	public String getPidNO() {
		return pidNO;
	}
	public void setPidNO(String pidNO) {
		this.pidNO = pidNO;
	}
	
	
	
}
