package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Buyers")
public class Buyers {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Integer bid;
	@Column(length=30)
	private String bname;
	@Column(unique=true)
   private String emailId;
	@Column(length=30)
	private String address;
	private String district;
	private String city;
	private Integer Pincode;
	private String state;
	@Column(length=12,unique=true,nullable = false)
	private Integer contactNo;
	private Integer  acccountNo;
	@Column(length=16,unique=true,nullable = false)
	private Integer  aadharNo;
	private String licenceType;
	//@OneToMany(mappedBy = "cropsOwner",cascade = CascadeType.ALL)
	//private List<Crop> crops=new ArrayList<>();

	public Buyers() {
		System.out.println("in ctor of "+getClass().getName());
	}

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
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
	public Integer getContactNo() {
		return contactNo;
	}
	public void setContactNo(Integer contactNo) {
		this.contactNo = contactNo;
	}

	public Integer getAcccountNo() {
		return acccountNo;
	}

	public void setAcccountNo(Integer acccountNo) {
		this.acccountNo = acccountNo;
	}
	public Integer getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(Integer aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getLicenceType() {
		return licenceType;
	}

	public void setLicenceType(String licenceType) {
		this.licenceType = licenceType;
	}

	@Override
	public String toString() {
		return "Buyers [bid=" + bid + ", bname=" + bname + ", emailId=" + emailId + ", address=" + address
				+ ", district=" + district + ", city=" + city + ", Pincode=" + Pincode + ", state=" + state
				+ ", contactNo=" + contactNo + ", acccountNo=" + acccountNo + ", aadharNo=" + aadharNo
				+ ", licenceType=" + licenceType + "]";
	}

}
