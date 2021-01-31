package com.app.service;

import com.app.pojos.Credentials;

public interface ICredentialsService {
	 Credentials fetchUserByUsernameAndPassword(String username,String pass);
	Credentials saveUserCredentials(Credentials user);
	Credentials fetchUserByUsername(String Username);
}
