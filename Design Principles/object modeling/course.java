// ✅ All imports must be at the very top of the file
import java.util.ArrayList;
import java.util.List;

// ---------------------------------
// Course Class
// ---------------------------------
class Course {
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.enrollInCourse(this); // maintain bidirectional relationship
        }
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
}

// ---------------------------------
// Student Class
// ---------------------------------
class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.enrollStudent(this); // maintain bidirectional relationship
        }
    }

    public List<Course> getCourses() {
        return courses;
    }
}

// ---------------------------------
// School Class
// ---------------------------------
class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public List<Student> getStudents() {
        return students;
    }
}

// ---------------------------------
// Main Class (No 'public' since file is Course.java)
// ---------------------------------
class Main {
    public static void main(String[] args) {
        // Create Courses
        Course math = new Course("Math");
        Course science = new Course("Science");
        Course history = new Course("History");

        // Create Students
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        // Create School
        School greenwood = new School("Greenwood High");

        // Add Students to School
        greenwood.addStudent(alice);
        greenwood.addStudent(bob);

        // Enroll Students in Courses
        alice.enrollInCourse(math);
        alice.enrollInCourse(science);
        bob.enrollInCourse(science);
        bob.enrollInCourse(history);

        // Display Student Courses
        System.out.println(alice.getName() + "'s Courses:");
        for (Course c : alice.getCourses()) {
            System.out.println("- " + c.getCourseName());
        }

        System.out.println(bob.getName() + "'s Courses:");
        for (Course c : bob.getCourses()) {
            System.out.println("- " + c.getCourseName());
        }

        // Display Course Enrollments
        System.out.println("Students in Science:");
        for (Student s : science.getEnrolledStudents()) {
            System.out.println("- " + s.getName());
        }

        // Display Students in School
        System.out.println("Students in " + greenwood.getName() + ":");
        for (Student s : greenwood.getStudents()) {
            System.out.println("- " + s.getName());
        }
    }
}

