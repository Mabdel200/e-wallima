package com.mycompany.service.auth.request;

public class LoginRequest {

  	private String noms;

	private String password;

	public String getNoms() {
		return noms;
	}

	public void setNoms(String noms) {
		this.noms = noms;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
