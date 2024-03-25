package com.example.cse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class UserScreen extends AppCompatActivity {
    CheckBox c1,c2,c3,c4,c5;
    TextView t;
    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_screen);


        c1=findViewById(R.id.ch1);
        c2=findViewById(R.id.ch2);
        c3=findViewById(R.id.ch3);
        c4=findViewById(R.id.ch4);
        c5=findViewById(R.id.ch5);
        t=findViewById(R.id.id_cake);
        b1=findViewById(R.id.ok);
        b2=findViewById(R.id.skip);
        b3=findViewById(R.id.next);
        b4=findViewById(R.id.back);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(UserScreen.this,BirthdayRequirements .class);
                startActivity(intent);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(UserScreen.this,BirthdayRequirements.class);
                startActivity(intent);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(UserScreen.this,BirthdayRequirements .class);
                startActivity(intent);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(UserScreen.this,LoginScreen .class);
                startActivity(intent);

            }
        });


    }
}