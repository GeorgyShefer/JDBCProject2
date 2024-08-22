package org.example.db_top;

import java.util.Date;

public class Subscription {
    private int studentId;
    private int courseId;
    private Date subcriptionDate;

    public Subscription() {
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public Date getSubcriptionDate() {
        return subcriptionDate;
    }

    public void setSubcriptionDate(Date subcriptionDate) {
        this.subcriptionDate = subcriptionDate;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "studentId: " + studentId +
                ", courseId: " + courseId +
                ", subcriptionDate: " + subcriptionDate +
                '}';
    }
}
