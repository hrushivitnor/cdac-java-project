package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="CropAdmin")
public class Crop {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cropId;
	private String cropName;
	private Long cropPrice;
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private LocalDate Date;
	
	public Crop() {
		System.out.println("in ctor of "+getClass().getName());
	}

	
	@Override
	public String toString() {
		return "Crop [cropId=" + cropId + ", cropName=" + cropName + ", cropPrice=" + cropPrice + ", Date=" + Date
				+ "]";
	}


	public Integer getCropId() {
		return cropId;
	}
	public void setCropId(Integer cropId) {
		this.cropId = cropId;
	}
	public String getCropName() {
		return cropName;
	}
	public void setCropName(String cropName) {
		this.cropName = cropName;
	}
	public Long getCropPrice() {
		return cropPrice;
	}
	public void setCropPrice(Long cropPrice) {
		this.cropPrice = cropPrice;
	}
	public LocalDate getDate() {
		return Date;
	}
	public void setDate(LocalDate date) {
		Date = date;
	}
	
}
