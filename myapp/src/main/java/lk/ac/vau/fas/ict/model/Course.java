package lk.ac.vau.fas.ict.model;

public class Course {

    private String courseId;
    private String name;
    private int credit;

    public Course(String courseId, String name, int credit) {
        this.courseId = courseId;
        this.name = name;
        this.credit = credit;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

}
