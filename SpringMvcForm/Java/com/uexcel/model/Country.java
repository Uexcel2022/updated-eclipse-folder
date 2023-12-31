package com.uexcel.model;

public class Country {
	
	private String Id;

	private String name;
	
	public Country() {
		
	}

	public Country(String id, String name) {
		Id = id;
		this.name = name;
	}

	

	public String getId() {
		return Id;

	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Country [Id=" + Id + ", name=" + name + "]";
	}
	
	

}
