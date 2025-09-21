import java.util.ArrayList;
import java.util.List;

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

    public void enrollCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
        }
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void showCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        if (courses.isEmpty()) {
            System.out.println("None");
        } else {
            for (Course c : courses) {
                System.out.println("- " + c.getName());
            }
        }
    }
}

class Professor {
    private String name;
    private List<Course> coursesTeaching;

    public Professor(String name) {
        this.name = name;
        this.coursesTeaching = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void assignProfessor(Course course) {
        if (!coursesTeaching.contains(course)) {
            coursesTeaching.add(course);
            course.setProfessor(this);
        }
    }

    public List<Course> getCoursesTeaching() {
        return coursesTeaching;
    }

    public void showCoursesTeaching() {
        System.out.println("Courses taught by Professor " + name + ":");
        if (coursesTeaching.isEmpty()) {
            System.out.println("None");
        } else {
            for (Course c : coursesTeaching) {
                System.out.println("- " + c.getName());
            }
        }
    }
}

class Course {
    private String name;
    private Professor professor;  // aggregation: professor assigned to course
    private List<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            // Also make sure student has this course (done in enrollCourse)
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public void showStudents() {
        System.out.println("Students enrolled in " + name + ":");
        if (students.isEmpty()) {
            System.out.println("None");
        } else {
            for (Student s : students) {
                System.out.println("- " + s.getName());
            }
        }
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Professor p1 = new Professor("Dr. Smith");
        Professor p2 = new Professor("Dr. Johnson");

        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Physics");

        // Assign professors to courses
        p1.assignProfessor(c1);
        p2.assignProfessor(c2);

        // Students enroll in courses
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c2);

        // Display
        System.out.println();
        s1.showCourses();
        s2.showCourses();

        System.out.println();
        p1.showCoursesTeaching();
        p2.showCoursesTeaching();

        System.out.println();
        c1.showStudents();
        c2.showStudents();
    }
}
