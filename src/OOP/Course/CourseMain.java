package OOP.Course;
public class CourseMain {
    public static void main(String[] args) {
        Course course = new Course("Java Programming", "John Doe", 3);
        course.displayCourseDetails();
        System.out.println();

        OnlineCourse onlineCourse = new OnlineCourse("Advanced Java", "Dr. Peter Weeks", 4, "Coursera", 12);
        onlineCourse.displayCourseDetails();
        System.out.println("Eligible for certificate: " + onlineCourse.isEligibleForCertificate());
    }
}