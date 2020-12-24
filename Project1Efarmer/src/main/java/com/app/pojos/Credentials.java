package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Credentials")
public class Credentials {
	@Id
	private Integer id;
	@Column (length=20,unique=true)
	private String userName;
	private String password;
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private Role role;
		public Credentials() {
			System.out.println("in ctor of "+getClass().getName());
		}

   public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
