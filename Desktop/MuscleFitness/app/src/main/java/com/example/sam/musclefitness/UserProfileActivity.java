package com.example.sam.musclefitness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UserProfileActivity extends AppCompatActivity {

    EditText edtfirstname, edtlastname, edtweight, edtheight;
    Button btnsavedata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);


        edtfirstname = findViewById(R.id.edtfirstname);
        edtlastname = findViewById(R.id.edtlastname);
        btnsavedata = findViewById(R.id.btnsavedata);

//        btnuserprofile.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(Main2Activity.this,UserProfileActivity.class));
//            }
//        });
    }
}
