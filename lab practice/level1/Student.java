public class Student {
    static String universityName = "Global University";
    static int totalStudents = 0;

    final int rollNumber;
    String name;
    String grade;

    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101, "A");
        Student s2 = new Student("Bob", 102, "B");

        if (s1 instanceof Student) {
            System.out.println("Name: " + s1.name);
            System.out.println("Roll Number: " + s1.rollNumber);
            System.out.println("Grade: " + s1.grade);
            System.out.println("University: " + universityName);
        }

        if (s2 instanceof Student) {
            System.out.println("Name: " + s2.name);
            System.out.println("Roll Number: " + s2.rollNumber);
            System.out.println("Grade: " + s2.grade);
            System.out.println("University: " + universityName);
        }

        displayTotalStudents();
    }
}
