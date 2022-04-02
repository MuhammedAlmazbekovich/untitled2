package com.company;

public class Person {
    private String name;
    private int age;
    private String statusInTheFamily;

    public Person(String name, int age, String statusInTheFamily) {
        this.name = name;
        this.age = age;
        this.statusInTheFamily = statusInTheFamily;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStatusInTheFamily() {
        return statusInTheFamily;
    }

    public void setStatusInTheFamily(String statusInTheFamily) {
        this.statusInTheFamily = statusInTheFamily;
    }

    @Override
    public String toString() {
        return statusInTheFamily + "-"+ name + ","+ "возрасть-" +age ;

    }
}
