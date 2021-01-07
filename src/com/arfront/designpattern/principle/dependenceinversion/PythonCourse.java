package com.arfront.designpattern.principle.dependenceinversion;


public class PythonCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("在学习Python课程");
    }
}
