package LabWeek4;

public class Address{
	
	private String street;
	private String city;

	Address(String street, String city){
		this.street = street;
		this.city = city;
	}
	
	Address(Address other){
		this.street = other.street;
		this.city = other.city;
	}
	
	public void showAddress(){
		System.out.println("Street: " + street);
		System.out.println("City: " + city);
	}
	
	public boolean equals(Address original){
		if ((original.street == this.street) && (original.city == this.city)){return true;} else {return false;}
	}

	// Getters
	public String getStreet(){
		return street;
	}
	public String getCity(){
		return city;
	}

	// Setters
	void setStreet(String street){
		this.street = street;
	}
	void setCity(String city){
		this.city = city;
	}

}