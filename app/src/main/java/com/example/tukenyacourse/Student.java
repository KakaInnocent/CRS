package com.example.tukenyacourse;

import android.os.Parcel;
import android.os.Parcelable;

public class Student implements Parcelable {
    private String name,regNo,email,password,department,courseUnit;

    public Student(String name, String regNo, String email, String password, String department, String courseUnit) {
        this.name = name;
        this.regNo = regNo;
        this.email = email;
        this.password = password;
        this.department = department;
        this.courseUnit = courseUnit;
    }

    protected Student(Parcel in) {
        name = in.readString();
        regNo = in.readString();
        email = in.readString();
        password = in.readString();
        department = in.readString();
        courseUnit = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(regNo);
        dest.writeString(email);
        dest.writeString(password);
        dest.writeString(department);
        dest.writeString(courseUnit);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCourseUnit() {
        return courseUnit;
    }

    public void setCourseUnit(String courseUnit) {
        this.courseUnit = courseUnit;
    }
}
