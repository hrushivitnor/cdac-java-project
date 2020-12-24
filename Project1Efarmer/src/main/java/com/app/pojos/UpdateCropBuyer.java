package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="updateCropBuyer")
public class UpdateCropBuyer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cropId;
	//private Integer bid;
	
	private Long cropPrice;
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private LocalDate Date;
	@ManyToOne
	@JoinColumn (name="bid",nullable=true)
	private Buyers selectedBuyer;
	public UpdateCropBuyer() {
		// TODO Auto-generated constructor stub
	}

}
