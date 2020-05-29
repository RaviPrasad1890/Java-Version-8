package com.ravi.version_8.DrivingClass;

import com.ravi.version_8.Model.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSorting {
    public static void main (String[] args){
        List<Employee> empList=new ArrayList<>();
        empList.add(new Employee(200,"Ravi"));
        empList.add(new Employee(400,"Sunny"));
        empList.add(new Employee(300,"Deepak"));
        empList.add(new Employee(500,"Sonu"));

        System.out.println("Before sorting: "+empList);

        Collections.sort(empList,(e1,e2)->(e1.getId()<e2.getId())?-1:(e1.getId()>e2.getId())?1:0);

        System.out.println("After sorting: "+empList);

    }
}
