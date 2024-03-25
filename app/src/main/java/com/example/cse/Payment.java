package com.example.cse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Payment extends AppCompatActivity {
    private EditText amount;
    private EditText cvv;
    private Button b1;
    Button b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        amount=findViewById(R.id.edittextAmount);
        cvv=findViewById(R.id.edittextcvv);

        b1=findViewById(R.id.id_done);
        b2=findViewById(R.id.id_before);
        amount.addTextChangedListener(loginTextWatcher);
        cvv.addTextChangedListener(loginTextWatcher);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Payment.this,Paymentdone.class);
                startActivity(intent);
            }
        });
      b2.setOnClickListener(new View.OnClickListener() {
            @  Override
            public void onClick(View view) {
                Intent intent = new Intent(Payment.this,BirthdayRequirements.class);
                startActivity(intent);
            }
        });
    }
        private TextWatcher loginTextWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String usernameInput = amount.getText().toString().trim();
                String passwordInput = cvv.getText().toString().trim();

                b1.setEnabled(!usernameInput.isEmpty()&& !passwordInput.isEmpty() );

            }


            @Override
            public void afterTextChanged(Editable editable) {

            }

        };

    }
