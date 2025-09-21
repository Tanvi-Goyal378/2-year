// Abstract class Employee
abstract class Employee {
    private String employeeId;
    private String name;
    private double baseSalary;

    public Employee(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getEmployeeId() { return employeeId; }
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { 
        if (baseSalary >= 0) {
            this.baseSalary = baseSalary;
        }
    }

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Base Salary: ₹" + baseSalary);
    }

    public abstract double calculateSalary();
}

// Interface Department
interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

// FullTimeEmployee subclass
class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(String employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary(); // fixed salary for full-time
    }

    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return department != null ? department : "No Department Assigned";
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + getDepartmentDetails());
        System.out.println("Calculated Salary: ₹" + calculateSalary());
    }
}

// PartTimeEmployee subclass
class PartTimeEmployee extends Employee implements Department {
    private int workHours;
    private double hourlyRate;
    private String department;

    public PartTimeEmployee(String employeeId, String name, double hourlyRate, int workHours) {
        super(employeeId, name, 0);
        this.hourlyRate = hourlyRate;
        this.workHours = workHours;
    }

    public int getWorkHours() { return workHours; }
    public void setWorkHours(int workHours) { 
        if(workHours >= 0) this.workHours = workHours;
    }

    public double getHourlyRate() { return hourlyRate; }
    public void setHourlyRate(double hourlyRate) {
        if(hourlyRate >= 0) this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * workHours;
    }

    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return department != null ? department : "No Department Assigned";
    }

    @Override
    public void displayDetails() {
        System.out.println("ID: " + getEmployeeId() + ", Name: " + getName() + ", Hourly Rate: ₹" + hourlyRate + ", Work Hours: " + workHours);
        System.out.println("Department: " + getDepartmentDetails());
        System.out.println("Calculated Salary: ₹" + calculateSalary());
    }
}

// Run example
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        FullTimeEmployee fte = new FullTimeEmployee("E001", "Alice", 50000);
        fte.assignDepartment("IT");

        PartTimeEmployee pte1 = new PartTimeEmployee("E002", "Bob", 200, 80);
        pte1.assignDepartment("HR");

        PartTimeEmployee pte2 = new PartTimeEmployee("E003", "Charlie", 150, 60);
        pte2.assignDepartment("Sales");

        employees[0] = fte;
        employees[1] = pte1;
        employees[2] = pte2;

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("---------------------");
        }
    }
}
