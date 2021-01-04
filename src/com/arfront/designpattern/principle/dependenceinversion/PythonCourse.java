package com.arfront.designpattern.principle.dependenceinversion;


public class PythonCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Geely在学习Python课程");
    }
}
