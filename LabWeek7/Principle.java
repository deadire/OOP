class Principal {
    private String name;
    private int age;
    private int experience;

    public Principal(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return name + " (Age: " + age + ", Experience: " + experience + " years)";
    }
}
