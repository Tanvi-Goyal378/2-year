public class SchoolRoles {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Sharma", 40, "Mathematics");
        Student student = new Student("Amit", 16, "10th Grade");
        Staff staff = new Staff("Mrs. Kapoor", 35, "Administration");

        teacher.displayRole();
        System.out.println("Name: " + teacher.name);
        System.out.println("Age: " + teacher.age);
        System.out.println("Subject: " + teacher.subject + "\n");

        student.displayRole();
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println("Grade: " + student.grade + "\n");

        staff.displayRole();
        System.out.println("Name: " + staff.name);
        System.out.println("Age: " + staff.age);
        System.out.println("Department: " + staff.department);
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Role: Teacher");
    }
}

class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Role: Student");
    }
}

class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println("Role: Staff");
    }
}
