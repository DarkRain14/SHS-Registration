package com.alivio.shsregistration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner Superman;
    EditText etLastname,etFirstname,etMiddlename;
    RadioButton rbMale,rbFemale;
    CheckBox cbxReq1, cbxReq2, cbxReq3, cbxReq4;

    String academicProgram, Lastname, Firstname, Middlename, Gender, Requirements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Superman = findViewById(R.id.Superman);
        etLastname = findViewById(R.id.etLastname);
        etFirstname = findViewById(R.id.etFirstname);
        etMiddlename = findViewById(R.id.etMiddlename);
        cbxReq1 = findViewById(R.id.cbxReq1);
        cbxReq2 = findViewById(R.id.cbxReq2);
        cbxReq3 = findViewById(R.id.cbxReq3);
        cbxReq4 = findViewById(R.id.cbxReq4);
    }

    public void submit (View view) {
        academicProgram = Superman.getSelectedItem().toString();
        Lastname = etLastname.getText().toString();
        Firstname = etFirstname.getText().toString();
        Middlename = etMiddlename.getText().toString();
    }


    }
