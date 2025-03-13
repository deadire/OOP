class Campus {
    	private String campusName;
    	private String directorName;
    	private String campusAddress;
    	private Department[] departments;

    	public Campus(String Name, String director, String Address, Department[] departments) {
        	this.campusName = Name;
        	this.directorName = director;
        	this.campusAddress = Address;
        	this.departments = departments;
    	}

    	public void displayCampus() {
        	System.out.println("Campus Name: " + campusName);
        	System.out.println("Director: " + directorName);
        	System.out.println("Address: " + campusAddress);
        	for (Department department : departments) {
            	department.displayDepartment();
        	}
    	}
}