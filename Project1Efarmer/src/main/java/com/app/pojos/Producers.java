package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Producers")
public class Producers {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer pid;
	@Column(length=30)
	private String pname;
	@Column(unique=true)
   private String emailId;
	@Column(length=30)
	private String address;
	private String district;
	private String city;
	private Integer Pincode;
	private String state;
	@Column(length=12)
	private Long  contactNo;
	private Long  acccountNo;
	@Column(length=40)
	private String accountDetials;
	@Column(length=16,unique=true)
	private Long  aadharNo;
	public Producers() {
		System.out.println("in ctor of "+getClass().getName());
	}

	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getPincode() {
		return Pincode;
	}
	public void setPincode(Integer pincode) {
		Pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Long getContactNo() {
		return contactNo;
	}
	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}
	public Long getAcccountNo() {
		return acccountNo;
	}
	public void setAcccountNo(Long acccountNo) {
		this.acccountNo = acccountNo;
	}
	public String getAccountDetials() {
		return accountDetials;
	}
	public void setAccountDetials(String accountDetials) {
		this.accountDetials = accountDetials;
	}
	public Long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(Long aadharNo) {
		this.aadharNo = aadharNo;
	}

}
