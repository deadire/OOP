class ClassRoom {
    private String className;
    private String classCode;
    private Teacher teacher;
    private Student[] students;
    private int studentCount = 0;

    public ClassRoom(String className, String classCode, Teacher teacher) {
        this.className = className;
        this.classCode = classCode;
        this.teacher = teacher;
        this.students = new Student[5];
    }

    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
        } else {
            System.out.println("Classroom is full!");
        }
    }

    public void displayDetails() {
        System.out.println("Class Name: " + className + ", Class Code: " + classCode + ", Teacher: " + teacher);
        System.out.println("Students:");
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i]);
        }
    } 
}

