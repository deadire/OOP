public class Main {
    public static void main(String[] args) {
        Principal principal = new Principal("Semee Shafqat", 55, 22);
        School school = new School("Beaconhouse", "Valencia Town, Lahore", principal);

        Teacher teacher1 = new Teacher("Jairus Abraham", 42, "Chemistry", 101);
        ClassRoom class1 = new ClassRoom("Chemistry", "CHM101", teacher1);

        Student student1 = new Student("Rumaan", 16, 1);
        Student student2 = new Student("Ali", 17, 2);

        class1.addStudent(student1);
        class1.addStudent(student2);

        school.addClassRoom(class1);

        school.displayDetails();
        class1.displayDetails();
    }
}
