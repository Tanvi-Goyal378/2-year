public class Course {
    String courseName;
    int duration; // in months
    double fee;
    static String instituteName = "ABC Institute";

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " months, Fee: $" + fee);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 3, 500);
        Course c2 = new Course("Python", 4, 600);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        System.out.println("Institute: " + Course.instituteName);

        Course.updateInstituteName("XYZ Academy");
        System.out.println("Updated Institute: " + Course.instituteName);
    }
}
