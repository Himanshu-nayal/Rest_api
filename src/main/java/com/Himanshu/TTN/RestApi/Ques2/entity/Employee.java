package com.Himanshu.TTN.RestApi.Ques2.entity;


import javax.validation.constraints.Size;

public class Employee {
    @Size(min = 4, message = "Name should be of atleast 4 characters!")
    private String name;
    private long id;
    private int age;
    public Employee(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    public Employee(String name, long id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
}
