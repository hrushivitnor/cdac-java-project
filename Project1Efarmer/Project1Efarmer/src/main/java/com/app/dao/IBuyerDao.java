package com.app.dao;

import java.util.List;
import com.app.pojos.Buyers;


public interface IBuyerDao {

	List<Buyers> getAllBuyers();
	Buyers getBuyerDetailsbyId(int bid);
	Buyers addBuyer(Buyers transientBuyer);
	Buyers UpdateBuyer(Buyers detachedPojo);
	//Buyers deleteBuyer(int bid);
}
