package com.app.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IBuyerDao;
import com.app.pojos.Buyers;
@Service
@Transactional
public class BuyerServiceImpl implements IBuyerService {
	@Autowired
	private IBuyerDao dao;
	public BuyerServiceImpl() {
		System.out.println("in ctor of " + getClass().getName());
	}

	@Override
	public List<Buyers> getAllBuyers() {
		// TODO Auto-generated method stub
		return dao.getAllBuyers();
	}

	
	

	@Override
	public Buyers addBuyer(Buyers transientBuyer) {
		// TODO Auto-generated method stub
		return dao.addBuyer(transientBuyer);
	}

	@Override
	public Buyers getBuyerDetailsbyId(int bid) {
		// TODO Auto-generated method stub
		return dao.getBuyerDetailsbyId(bid);
	}

	@Override
	public Buyers UpdateBuyer(int bid,Buyers detachedPojo) {
		// TODO Auto-generated method stub
		Buyers existingBuyer=dao.getBuyerDetailsbyId(bid);
		if(existingBuyer!=null)
		{
			existingBuyer.setBname(detachedPojo.getBname());
			existingBuyer.setCity(detachedPojo.getCity());
		return dao.UpdateBuyer(detachedPojo);
		}
		return null;
	}

	@Override
	public String deleteBuyerById(int bid) {
		//dao.deleteById(bid);
		return "Buyer  with id"+bid+" is deleted";
				
	}

}
