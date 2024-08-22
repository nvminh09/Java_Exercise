package OOP.Course;

public class OnlineCourse extends Course {
    private String platform;
    private int duration;
    public OnlineCourse(String courseName, String instructor, int credits, String platform, int duration) {
        super(courseName, instructor, credits);
        this.platform = platform;
        this.duration = duration;
    }
    public String getPlatform() {
        return platform;
    }
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();;
        System.out.println("Platform: " + platform);
        System.out.println("Duration: " + duration + " weeks");
    }
    public boolean isEligibleForCertificate() {
        return duration >= 10;
    }

}
