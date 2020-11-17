package com.ravi.version_8.Predicate;

import java.util.function.Predicate;

public class SoftwareEngineerAllowedInPub {
    public static void main(String[] args){
        SoftwareEngineer[] listOfEngineers={new SoftwareEngineer("Ravi",29,false),
        new SoftwareEngineer("Jadeja",25,true),
        new SoftwareEngineer("Chahal",17,true)};

        Predicate<SoftwareEngineer> isAllowed= se->se.age>18&&se.isHavingGirlFreind;

        for(SoftwareEngineer se:listOfEngineers){
           if(isAllowed.test(se)){
               System.out.println(se.name);
           }
        }
    }
}
