public class Main {
    public static void main(String[] args) {

        PC[] pcs1 = { new PC(101, "Windows 11", 16, 512), new PC(102, "Ubuntu", 8, 256) };
        PC[] pcs2 = { new PC(201, "Windows 10", 8, 500), new PC(202, "Linux", 16, 1024) };
        
        Lab lab1 = new Lab("AI Lab", "Mr. Usman", pcs1);
        Lab lab2 = new Lab("Networking Lab", "Ms. Aisha", pcs2);

        Person inCharge1 = new Person("Prof. Ahmed Ali", "Head of CS Department");

        Department dept1 = new Department("Computer Science", inCharge1, new Lab[]{lab1, lab2});

        Campus comsats = new Campus("COMSATS Lahore", "Dr. Ali Khan", "1-KM Defence Road, Lahore", new Department[]{dept1});

        comsats.displayCampus();
    }
}
