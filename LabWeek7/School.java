class School {
    private String name;
    private String address;
    private Principal principal;
    private ClassRoom[] classRooms;
    private int classRoomCount = 0;
    
    public School(String name, String address, Principal principal) {
        this.name = name;
        this.address = address;
        this.principal = principal;
        this.classRooms = new ClassRoom[10]; 
    }
    
    public void addClassRoom(ClassRoom classRoom) {
        if (classRoomCount < classRooms.length) {
            classRooms[classRoomCount] = classRoom;
            classRoomCount++;
        } else {
            System.out.println("School is full! No more classrooms can be added.");
        }
    }
    
    public void displayDetails() {
        System.out.println("School Name: " + name + ", Address: " + address + ", Principal: " + principal);
        System.out.println("Classrooms:");
        for (int i = 0; i < classRoomCount; i++) {
            classRooms[i].displayDetails();
        }
    } 
} 
