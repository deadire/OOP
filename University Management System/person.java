class Person {
    	private String name;
    	private String designation;

    	public Person(String name, String desig) {
        	this.name = name;
        	this.designation = desig;
    	}

    	public void displayPerson() {
        	System.out.println("Name: " + name + ", Designation: " + designation);
    	}
}