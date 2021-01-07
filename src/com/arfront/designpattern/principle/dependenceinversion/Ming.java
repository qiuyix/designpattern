package com.arfront.designpattern.principle.dependenceinversion;


public class Ming {

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    private ICourse iCourse;



    public void studyCourse(){
        iCourse.studyCourse();
    }






}
