package com.example.sam.musclefitness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button btnuserprofile, btnpastworkoutsessions, btnmaps, btngyminstructors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


       btnuserprofile = findViewById(R.id.btnuserprofile);
       btnpastworkoutsessions = findViewById(R.id.btnpastworkoutsessions);
       btnmaps = findViewById(R.id.btnmaps);
       btngyminstructors = findViewById(R.id.btngyminstructors);

       btnuserprofile.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(Main2Activity.this,UserProfileActivity.class));
           }
       });









    }
}
