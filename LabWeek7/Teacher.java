public class Teacher extends Person {
    private String subject;
    private int ID;

    public Teacher(String name, int age, String subject, int ID) {
        super(name, age);
        this.subject = subject;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d, Subject: %s, Teacher ID: %d", super.getName(), super.getAge(), subject, ID);
    }

	public boolean equals(Teacher other) {
    		return this.ID == other.ID;
	}

}
