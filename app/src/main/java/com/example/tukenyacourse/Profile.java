package com.example.tukenyacourse;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity {

    public TextView Name;
    public TextView RegNo;
    public TextView Email;
    public TextView Password;
    public TextView Department;
    public TextView CourseUnit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Name=(TextView)findViewById(R.id.textView2);
        RegNo=(TextView)findViewById(R.id.textView4);
        Email=(TextView)findViewById(R.id.textView3);
        Password=(TextView)findViewById(R.id.textView5);
        Department=(TextView)findViewById(R.id.textView6);
        CourseUnit=(TextView)findViewById(R.id.textView7);

        Intent intent = getIntent();
        if (intent.hasExtra("student")){
            Student student = intent.getParcelableExtra("student");
            Name.setText(student.getName());
            RegNo.setText(student.getRegNo());
            Email.setText(student.getEmail());
            Password.setText(student.getPassword());
            Department.setText(student.getDepartment());
            CourseUnit.setText(student.getCourseUnit());
        }
        intent.removeExtra("student");
    }
}
