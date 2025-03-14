class Employee {
    String name;
    private String EmpId;
    private int salary;

    Employee(String name, String EmpId, int salary) {
        this.name = name;
        this.EmpId = EmpId;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name : " + this.name);
        System.out.println("EmpId : " + this.EmpId);
        System.out.println("Salary : " + this.salary);
    }
}

class Intern extends Employee {
    Intern(String name, String EmpId, int salary) {
        super(name, EmpId, salary);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, String EmpId, int salary, String programmingLanguage) {
        super(name, EmpId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + this.programmingLanguage);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, String EmpId, int salary, int teamSize) {
        super(name, EmpId, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + this.teamSize);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        // Create Employee objects
        Employee employee1 = new Employee("John Doe", "E1001", 50000);
        Intern intern1 = new Intern("Jane Smith", "I2001", 20000);
        Developer developer1 = new Developer("Alice Johnson", "D3001", 80000, "Java");
        Manager manager1 = new Manager("Bob Williams", "M4001", 120000, 10);

        // Display Employee details
        System.out.println("Employee 1 Details:");
        employee1.displayDetails();

        System.out.println("\nIntern 1 Details:");
        intern1.displayDetails();

        System.out.println("\nDeveloper 1 Details:");
        developer1.displayDetails();

        System.out.println("\nManager 1 Details:");
        manager1.displayDetails();
    }
}