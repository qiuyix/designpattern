package com.arfront.designpattern.command;

public class Test {
    public static void main(String[] args) {
        CourseVideo courseVideo = new CourseVideo("课程1");

        OpenCourseVideoCommand openCourseVideoCommand = new OpenCourseVideoCommand(courseVideo);

        CloseCourseVideoCommand closeCourseVideoCommand = new CloseCourseVideoCommand(courseVideo);


        Staff staff = new Staff();

        staff.addCommand(openCourseVideoCommand);
        staff.addCommand(closeCourseVideoCommand);

        staff.executeCommands();
    }
}
