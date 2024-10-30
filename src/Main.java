public class Main {
    public static void main(String[] args) {
        // student object
        Student student = new Student("126555", "Dominik", "Kudela", 20);

        // employee object
        Employee employee = new Employee("Jozef", "Mrkva", 56);

        System.out.println(student.getInfo());
        System.out.println(employee.getInfo());
    }
}