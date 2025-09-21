import java.util.ArrayList;
import java.util.List;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void workIndependently() {
        System.out.println(name + " is working independently of any department.");
    }
}

class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class University {
    private String name;
    private List<Department> departments;
    private List<Faculty> faculties;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void listDepartments() {
        if (departments.isEmpty()) {
            System.out.println("No departments in " + name);
        } else {
            System.out.println("Departments in " + name + ":");
            for (Department dept : departments) {
                System.out.println("- " + dept.getName());
            }
        }
    }

    public void listFaculties() {
        if (faculties.isEmpty()) {
            System.out.println("No faculties in " + name);
        } else {
            System.out.println("Faculties associated with " + name + ":");
            for (Faculty faculty : faculties) {
                System.out.println("- " + faculty.getName());
            }
        }
    }

    public void deleteUniversity() {
        System.out.println("Deleting university: " + name);
        departments.clear();
    }
}

class UniversityModel {
    public static void main(String[] args) {
        Faculty f1 = new Faculty("Dr. Alice");
        Faculty f2 = new Faculty("Dr. Bob");

        f1.workIndependently();
        f2.workIndependently();

        University uni = new University("Tech University");

        uni.addDepartment("Computer Science");
        uni.addDepartment("Mechanical Engineering");

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        System.out.println("\n--- Before Deleting University ---");
        uni.listDepartments();
        uni.listFaculties();

        uni.deleteUniversity();

        System.out.println("\n--- After Deleting University ---");
        uni.listDepartments();
        uni.listFaculties();

        System.out.println("\n--- Faculty Still Exist ---");
        f1.workIndependently();
        f2.workIndependently();
    }
}
