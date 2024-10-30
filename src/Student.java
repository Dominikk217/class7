class Student implements Person {
    private String studentID;
    private String name;
    private String surname;
    private int age;

    public Student(String studentID, String name, String surname, int age) {
        this.studentID = studentID;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String getInfo() {
        return "Student ID: " + studentID + ", Name: " + name + " " + surname + ", Age: " + age;
    }
}