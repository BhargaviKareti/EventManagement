package com.example.cse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class  LoginScreen extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button log;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        username=findViewById(R.id.edittextUsername);
        password=findViewById(R.id.edittextPssword);
        log=findViewById(R.id.id_log);
        back=findViewById(R.id.id_HOME);
        username.addTextChangedListener(loginTextWatcher);
        password.addTextChangedListener(loginTextWatcher);




        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginScreen.this, UserScreen.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginScreen.this, HomeScreen.class);
                startActivity(intent);
            }
        });

    }
    private TextWatcher loginTextWatcher=new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String usernameInput = username.getText().toString().trim();
            String passwordInput = password.getText().toString().trim();

            log.setEnabled(!usernameInput.isEmpty() && !passwordInput.isEmpty());

        }


        @Override
        public void afterTextChanged(Editable editable) {

        }

    };


}