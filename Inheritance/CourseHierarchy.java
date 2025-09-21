public class CourseHierarchy {
    public static void main(String[] args) {
        PaidOnlineCourse poc = new PaidOnlineCourse("Java Programming", "6 weeks", "Udemy", true, 4999.0, 20.0);
        System.out.println("Course Name: " + poc.courseName);
        System.out.println("Duration: " + poc.duration);
        System.out.println("Platform: " + poc.platform);
        System.out.println("Is Recorded: " + poc.isRecorded);
        System.out.println("Course Fee: ₹" + poc.fee);
        System.out.println("Discount: " + poc.discount + "%");
        System.out.println("Final Price: ₹" + poc.getFinalPrice());
    }
}

class Course {
    String courseName;
    String duration;

    Course(String courseName, String duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, String duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String courseName, String duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    double getFinalPrice() {
        return fee - (fee * discount / 100);
    }
}
