package com.ravi.version_8.Predicate;

public class SoftwareEngineer {
    String name;
    int age;
    boolean isHavingGirlFreind;

    public SoftwareEngineer(String name, int age, boolean isHavingGirlFreind) {
        this.name = name;
        this.age = age;
        this.isHavingGirlFreind = isHavingGirlFreind;
    }

    @Override
    public String toString() {
        return "SoftwareEngineer{" +
                "name='" + name + '\'' +
                '}';
    }
}
