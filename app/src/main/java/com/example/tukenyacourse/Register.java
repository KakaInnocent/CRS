package com.example.tukenyacourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Register extends AppCompatActivity {
    private EditText Name;
    private EditText RegNo;
    private EditText Email;
    private EditText Password;
    private EditText Department;
    public Button Register;
    String course;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Name = findViewById(R.id.editTextTextPersonName);
        RegNo = findViewById(R.id.regno);
        Email = findViewById(R.id.email);
        Password = findViewById(R.id.password);
        Department = findViewById(R.id.department);
        Spinner courseUnit = findViewById(R.id.course_unit);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.course, android.R.layout.simple_spinner_dropdown_item);
        courseUnit.setAdapter(adapter);
        courseUnit.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                course = parent.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //something is always selected
            }
        });

        Register = findViewById(R.id.reg_btn);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Student student = new Student(Name.getText().toString(),
                        RegNo.getText().toString(),
                        Email.getText().toString(),
                        Password.getText().toString(),
                        Department.getText().toString(),
                        "");
                Intent intent = new Intent(Register.this, Profile.class);
                intent.putExtra("student", student);

                startActivity(intent);


            }
        });

    }

}
