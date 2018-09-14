package com.teamsankya.bankingsystem.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Service_Tracker")
public class ServiceTrackerBean implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "Service_Id")
	private int serviceId;
	@Column(name = "s_description")
	private String s_description;
	@Column(name = "Service_raisedDate")
	private String Service_raisedDate;
	@Column(name = "Service_status")
	private String Service_status;
	@ManyToOne
	@JoinColumn(name = "Accountno", referencedColumnName = "Accountno")
	private UserInfoBean bean;
	public int getServiceId() {
		return serviceId;
	}
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	public String getS_description() {
		return s_description;
	}
	public void setS_description(String s_description) {
		this.s_description = s_description;
	}
	public String getService_raisedDate() {
		return Service_raisedDate;
	}
	public void setService_raisedDate(String service_raisedDate) {
		Service_raisedDate = service_raisedDate;
	}
	public String getService_status() {
		return Service_status;
	}
	public void setService_status(String service_status) {
		Service_status = service_status;
	}
	public UserInfoBean getBean() {
		return bean;
	}
	public void setBean(UserInfoBean bean) {
		this.bean = bean;
	}
	
}
