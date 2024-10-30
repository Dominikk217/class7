class Employee implements Person {
    private String name;
    private String surname;
    private int age;

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // calculating years to retirement
    public int yearsToRetirement() {
        return 62 - age;
    }

    @Override
    public String getInfo() {
        return "Employee Name: " + name + " " + surname + ", Age: " + age + ", Years to Retirement: " + yearsToRetirement();
    }
}