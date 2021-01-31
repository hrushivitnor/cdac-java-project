package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Credentials;
import com.app.service.CredentialServiceImpl;
@CrossOrigin
@RestController
public class CredentialsController {
 @Autowired
 private CredentialServiceImpl service;
	public CredentialsController() {
		System.out.println("in ctor of "+getClass().getName());
	}
   
	
	@RequestMapping(value="/registeruser",produces = "application/json",method = RequestMethod.POST)
	//@PostMapping("/registeruser")
	public Credentials registerUser(@RequestBody Credentials user) throws Exception
	{
		System.out.println("------------------------------"+user);
		String tempUsername=user.getUserName();
		if(tempUsername!=null && !"".equals(tempUsername))
		{
			Credentials userObj=service.fetchUserByUsername(tempUsername);
			if(userObj!=null)
			{
				throw new Exception("user with  username"+tempUsername+"already exist");
			}
		}
		Credentials userObj=null;
		System.out.println(user);
		userObj=service.saveUserCredentials(user);
		return userObj;
	}
	
	@PostMapping("/login")
	public Credentials loginUser(@RequestBody Credentials user) throws Exception
	{
		String tempUserName=user.getUserName();
		String password=user.getPassword();
		Credentials userObj=null;
	  if(tempUserName!=null&&password!=null)
	  {
		  userObj=service.fetchUserByUsernameAndPassword(tempUserName, password);
	  }
	  if(userObj==null)
	  {
		  throw new Exception("Incorrect Credentials Plz reenter Credentials correctly...");
	  }
	  return userObj;
	}
	
	
}
