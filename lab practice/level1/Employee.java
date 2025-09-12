public class Employee {
    static String companyName = "TechCorp";
    static int totalEmployees = 0;

    final int id;
    String name;
    String designation;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 101, "Developer");
        Employee e2 = new Employee("Bob", 102, "Manager");

        if (e1 instanceof Employee) {
            System.out.println("Name: " + e1.name);
            System.out.println("ID: " + e1.id);
            System.out.println("Designation: " + e1.designation);
            System.out.println("Company: " + companyName);
        }

        if (e2 instanceof Employee) {
            System.out.println("Name: " + e2.name);
            System.out.println("ID: " + e2.id);
            System.out.println("Designation: " + e2.designation);
            System.out.println("Company: " + companyName);
        }

        displayTotalEmployees();
    }
}
