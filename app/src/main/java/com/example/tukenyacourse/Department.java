package com.example.tukenyacourse;

public class Department {
    private String name, classCode;
    public Department(String name,String code){
        this.name=name;
        this.classCode = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getName() {
        return name;
    }

    public String getClassCode() {
        return classCode;
    }

}
