package LabWeek4;

public class Person {
	private String name;
    	private String role;
    	private Address address;

    	public Person(String name, String role, Address address) {
        	this.name = name;
        	this.role = role;
        	this.address = address;
    	}

    	public Person(Person other) {
        	this.name = other.name;
        	this.role = other.role;
        	this.address = other.address;
    	}

    	public void showPersonDetails() {
        	System.out.println("Name: " + name);
        	System.out.println("Role: " + role);
        	System.out.println("Address: " + address);
    	}

    	public boolean equals(Person original) {
    	if ((this.name == original.name) && (this.role == original.role)){return true;} else {return false;}
    	}

	// Setters 
   	public void setRole(String role) {
        	this.role = role;
    	}
    	public void setName(String name) {
        	this.name = name;
    	}

	// Getters
    	public String getName() {
        	return name;
    	}
    	public String getRole() {
        	return role;
    	}

}
