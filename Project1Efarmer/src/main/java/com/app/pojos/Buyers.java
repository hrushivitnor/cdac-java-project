package com.app.pojos;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="Buyers")
public class Buyers {

	public Buyers() {
		System.out.println("in ctor of "+getClass().getName());
	}

}
