package com.arfront.designpattern.principle.demeter;

import java.util.ArrayList;
import java.util.List;


public class Manager {
    public void checkNumberOfEmployee(){
        List<Employee> employeeList = new ArrayList<Employee>();
        for(int i = 0 ;i < 20;i++){
            employeeList.add(new Employee());
        }
        System.out.println("当前职员数量是："+employeeList.size());
    }

}
