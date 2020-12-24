package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Buyers;

import com.app.service.IBuyerService;


@RestController
@RequestMapping("/buyers")
public class BuyerController {
	@Autowired
	private IBuyerService service;
	public BuyerController() {
		System.out.println("in ctor of " + getClass().getName());
	}
	// req handling method to display all products
		@GetMapping
		public ResponseEntity<?> listBuyers() {
			System.out.println("in list Buyers.... " );
			List<Buyers> buyers= service.getAllBuyers();	
			if (buyers.isEmpty())
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			// non empty list
			return new ResponseEntity<>(buyers, HttpStatus.OK);
			}

		
		@PostMapping
		//@RequestBody => un marshalling
		public ResponseEntity<?> createNewBuyer(@RequestBody Buyers newBuyer) {
			System.out.println("in create fund " + newBuyer);
			try {
				Buyers buyer = service.addBuyer(newBuyer);
				return new ResponseEntity<>(buyer, HttpStatus.CREATED);
			} catch (RuntimeException e) {
				e.printStackTrace();
				// resp pkt : set status code : 500 (server internal error)
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		@GetMapping("/{bid}")
		public ResponseEntity<?> getBuyerDetailsbyId(@PathVariable int bid)
		{
			System.out.println("in get buyerbyid "+bid);
			try
			{
			Buyers b=service.getBuyerDetailsbyId(bid);
			return new ResponseEntity<>(b, HttpStatus.OK);
			}
			catch(RuntimeException e)
			{
				e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}

		@PutMapping("/bid")
		public ResponseEntity <?>updateBuyerDetials(@PathVariable int bid,@RequestBody Buyers detachedPojo)
		{
			System.out.println("in service update  buyer"+bid+" "+detachedPojo);
			Buyers updateBuyer=service.UpdateBuyer(bid, detachedPojo);
			if(updateBuyer==null)
			
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			return new ResponseEntity<>(updateBuyer,HttpStatus.OK);
		}
		
		
		@DeleteMapping("/{bid}")
		public String deleteBuyer(@PathVariable int bid)
		{
			System.out.println("in delete controller"+bid);
			return service.deleteBuyerById(bid);
		}
		
		
		
		
		
		
		
		
		
		
}
