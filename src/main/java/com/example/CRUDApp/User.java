package com.example.CRUDApp;


public class User {
	
	// Properties of user object
	private int id;
	private String name;
	private String surname;
	
	
	
	// Constructor
	public User(int id,String name,String surname) {
		this.id=id;
		this.name=name;
		this.surname=surname;
	}


       // Getter and setter methods

	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getSurname() {
		return surname;
	}




	public void setSurname(String surname) {
		this.surname = surname;
	};

}
