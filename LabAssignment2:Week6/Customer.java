class Customer {
    	private int customerId;
    	private String name;
    	private String phoneNumber;
    	private String email;
    	
    	public Customer(int customerId, String name, String phoneNumber, String email) {
        	this.customerId = customerId;
        	this.name = name;
        	this.phoneNumber = phoneNumber;
        	this.email = email;
    	}
    
    	public void displayCustomer() {
		System.out.println("Customer ID: " + customerId);
		System.out.println("Name: " + name);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Email: " + email);
		
    	}
    
	public boolean equals(Customer obj) {
    		if (this.customerId == obj.customerId &&
        		this.name.equals(obj.name) &&
        		this.phoneNumber.equals(obj.phoneNumber) &&
        		this.email.equals(obj.email)) 
			{return true;} else {return false;}
	}
}