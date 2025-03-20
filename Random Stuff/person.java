public class person {

    private String name;
    private int age;
    private String address;
    private String phoneNumber;

    public person() {
        this.name = "Unknown";
        this.age = 0;
        this.address = "Not Provided";
        this.phoneNumber = "Not Provided";
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
        this.address = "Not Provided";
        this.phoneNumber = "Not Provided";
    }

    public person(String name, int age, String address, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
    }

    public static void main(String[] args) {
        person person1 = new person();  
        person person2 = new person("Ahmed", 20);
        person person3 = new person("Rumaan", 19, "Valencia", "0309-5409329");  

     
        System.out.println("Person 1 Info:");
        person1.displayInfo();
        System.out.println("\nPerson 2 Info:");
        person2.displayInfo();
        System.out.println("\nPerson 3 Info:");
        person3.displayInfo();
    }
}
