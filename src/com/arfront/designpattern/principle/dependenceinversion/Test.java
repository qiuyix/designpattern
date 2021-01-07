package com.arfront.designpattern.principle.dependenceinversion;


public class Test {

    //v1
//    public static void main(String[] args) {
//        Ming ming = new Ming();
//        ming.studyJavaCourse();
//        ming.studyFECourse();
//    }

    //v2
//    public static void main(String[] args) {
//        Ming ming = new Ming();
//        ming.studyImoocCourse(new JavaCourse());
//        ming.studyImoocCourse(new FECourse());
//        ming.studyImoocCourse(new PythonCourse());
//    }

    //v3
//    public static void main(String[] args) {
//        Ming ming = new Ming(new JavaCourse());
//        geely.studyImoocCourse();
//    }
    public static void main(String[] args) {
        Ming ming = new Ming();
        ming.setiCourse(new JavaCourse());
        ming.studyCourse();

        ming.setiCourse(new FECourse());
        ming.studyCourse();

    }


}
