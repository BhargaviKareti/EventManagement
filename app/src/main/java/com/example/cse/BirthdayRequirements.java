package com.example.cse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class BirthdayRequirements extends AppCompatActivity {
    CheckBox c1,c2,c3;
    TextView t;
    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_requirements);


        c1=findViewById(R.id.chair);
        c2=findViewById(R.id.balloon);
        c3=findViewById(R.id.chocolates);
        t=findViewById(R.id.id_text);
        b1=findViewById(R.id.okk);
        b2=findViewById(R.id.skipp);
        b3=findViewById(R.id.id_next);
        b4=findViewById(R.id.id_back);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BirthdayRequirements.this,Payment.class);
                startActivity(intent);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BirthdayRequirements.this,Payment.class);
                startActivity(intent);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BirthdayRequirements.this,Payment.class);
                startActivity(intent);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BirthdayRequirements.this,UserScreen .class);
                startActivity(intent);

            }
        });




    }
}