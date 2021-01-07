package com.arfront.designpattern.principle.dependenceinversion;


public class JavaCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("在学习Java课程");
    }
}
