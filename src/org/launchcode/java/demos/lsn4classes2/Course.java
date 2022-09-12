package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;


public class Course {

    private String topic;
    private org.launchcode.java.demos.lsn3classes1.Teacher instructor;
    private ArrayList<org.launchcode.java.demos.lsn3classes1.Student> enrolledStudents;
    public Course(String topic, org.launchcode.java.demos.lsn3classes1.Teacher instructor, ArrayList enrolledStudents){
        this.topic = topic;
        this.instructor = instructor;
        this.enrolledStudents = enrolledStudents;

    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public org.launchcode.java.demos.lsn3classes1.Teacher getInstructor() {
        return instructor;
    }

    public void setInstructor(org.launchcode.java.demos.lsn3classes1.Teacher instructor) {
        this.instructor = instructor;
    }

    public ArrayList<org.launchcode.java.demos.lsn3classes1.Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<org.launchcode.java.demos.lsn3classes1.Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
}

