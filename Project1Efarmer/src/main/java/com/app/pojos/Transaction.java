package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="Transaction")
public class Transaction {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer tid;
	@Column(length=30)
	private Integer cropId;
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private LocalDate dot;
	public Transaction() {
		System.out.println("in ctor of "+getClass().getName());
	}

}
