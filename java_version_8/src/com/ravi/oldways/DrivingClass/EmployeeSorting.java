package com.ravi.oldways.DrivingClass;

import com.ravi.oldways.Impl.EmployeeComparator;
import com.ravi.oldways.Model.Employee;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSorting {
    public static void main(String[] args){
        List<Employee> empList=new ArrayList<>();
        empList.add(new Employee(200,"Ravi"));
        empList.add(new Employee(400,"Sunny"));
        empList.add(new Employee(300,"Deepak"));
        empList.add(new Employee(500,"Sonu"));

        System.out.println("Before sorting: "+empList);

        Collections.sort(empList,new EmployeeComparator());

        System.out.println("After sorting: "+empList);
    }
}
