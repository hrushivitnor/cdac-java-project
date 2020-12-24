package com.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.app.pojos.Buyers;


@Repository
public class BuyerDaoImpl implements IBuyerDao {
	@PersistenceContext //JPA anno.
	private EntityManager mgr;
	public BuyerDaoImpl() {
		System.out.println("in ctor of "+getClass().getName());
	
	}
      @Override
	public List<Buyers> getAllBuyers() {
		String jpql="select b from Buyers b";
		return mgr.createQuery(jpql, Buyers.class).getResultList();
	}

/*	@Override
	   public Buyers deleteBuyer(int bid) 
	{
          String mesg="buyer deletion failed";
		
	Buyers b=mgr.find(Buyers.class, bid);
		if(b != null)
		{
			return mgr.remove(b);
			mesg="buyer deleted successfully";
		}
		
	}
*/
	
@Override
	public Buyers getBuyerDetailsbyId(int bid) {
	System.out.println("in dao of getbuyerbyid");
	String jpql="select b from Buyers b where b.bid=:id";
		return mgr.createQuery(jpql,Buyers.class).setParameter("id",bid).getSingleResult();
	}

@Override
public Buyers addBuyer(Buyers transientBuyer) {
	mgr.persist(transientBuyer);
	return transientBuyer;
}

	@Override
	public Buyers UpdateBuyer(Buyers detachedPojo) {
		// TODO Auto-generated method stub
		return mgr.merge(detachedPojo);
	}
	/*@Override
	public Buyers deleteBuyer(int bid) {
		// TODO Auto-generated method stub
		return null;
	}
*/
}
