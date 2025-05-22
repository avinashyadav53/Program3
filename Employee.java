package program3;
public class Employee {
    private String name;
    private int id;
    private double salary;
    private String depart;

    public Employee(String name, int id, double salary, String depart) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.depart = depart;
    }
    public void dispay() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Depart: " + depart);
    }
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 12345, 50000.0, "Engineering");
        emp.dispay();
    }
}
