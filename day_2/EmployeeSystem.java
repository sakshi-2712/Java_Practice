class Employee {
    protected String name;
    protected int id;
    protected String designation;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
    }

    public double calculateSalary() {
        return 0;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
    }
}

class FullTimeEmployee extends Employee {
    private double basicSalary;
    private double hra;
    private double da;

    public FullTimeEmployee(String name, int id, String designation, double basicSalary, double hra, double da) {
        super(name, id, designation);
        this.basicSalary = basicSalary;
        this.hra = hra;
        this.da = da;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + hra + da;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Total Salary: " + calculateSalary());
    }
}


class PartTimeEmployee extends Employee {
    private double hourlyWage;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id, String designation, double hourlyWage, int hoursWorked) {
        super(name, id, designation);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyWage * hoursWorked;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Hourly Wage: " + hourlyWage);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("sakshi", 101, "Software Engineer", 50000, 10000, 5000);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("abc", 102, "Support Staff", 200, 50);

        System.out.println("Full-Time Employee Details:");
        fullTimeEmployee.displayDetails();
        System.out.println();

        System.out.println("Part-Time Employee Details:");
        partTimeEmployee.displayDetails();
    }
}
