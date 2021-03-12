package com.example.tukenyacourse;

public class Course {
        private String name;
        private Department department;
        private Course(){
            //default private constructor
        }
        public Course (String name,Department department){
            this.name=name;
            this.department=department;
        }
        public void setName(String name){
            this.name=name;
        }
        public String setName(){
            return name;
        }


}
