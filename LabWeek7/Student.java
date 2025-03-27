public class Student extends Person {
    private int rollNumber;

    public Student(String name, int age, int rollNumber) {
        super(name, age);  
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d, Rollnumber: %d", getName(), getAge(), rollNumber);
    }
}
