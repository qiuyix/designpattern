package com.arfront.designpattern.principle.dependenceinversion;


public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("在学习FE课程");
    }

}
