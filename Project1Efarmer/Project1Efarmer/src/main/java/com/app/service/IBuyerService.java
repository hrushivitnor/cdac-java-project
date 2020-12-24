package com.app.service;

import java.util.List;

import com.app.pojos.Buyers;


public interface IBuyerService {
	List<Buyers> getAllBuyers();
	Buyers addBuyer(Buyers transientBuyer);
	Buyers getBuyerDetailsbyId(int bid);
	Buyers UpdateBuyer(int bid,Buyers detachedPojo);
	String deleteBuyerById(int bid);
}
