package com.arfront.designpattern.principle.demeter;



public class Boss {

    public void commandCheckNumber(Manager teamLeader){
        teamLeader.checkNumberOfEmployee();
    }

}
