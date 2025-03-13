class Department {
    	private String departmentName;
    	private Person departmentAssistant;
    	private Lab[] labList;

    	public Department(String departmentName, Person departmentAssistant, Lab[] labList) {
        	this.departmentName = departmentName;
        	this.departmentAssistant = departmentAssistant;
        	this.labList = labList;
    	}

    	public void displayDepartment() {
        	System.out.println("Department: " + departmentName);
        	departmentAssistant.displayPerson();
        	for (Lab lab : labList) {
            	lab.displayLab();
        	}
    	}
}