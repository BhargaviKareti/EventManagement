package com.example.cse;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class RegistrationScreen extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button register;

    Button  hme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_screen);
        password = findViewById(R.id.edittextPassword);
        username = findViewById(R.id.edittextUsername);
        register = findViewById(R.id.Registor);
        hme = findViewById(R.id.Home);
        username.addTextChangedListener(loginTextWatcher);
        password.addTextChangedListener(loginTextWatcher);
        hme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intn = new Intent(RegistrationScreen.this, HomeScreen.class);
                startActivity(intn);
            }
        });
        register = findViewById(R.id.Registor);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegistrationScreen.this, LoginScreen.class);
                startActivity(intent);
            }
        });
    }

        private TextWatcher loginTextWatcher =new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String usernameInput = username.getText().toString().trim();
                String passwordInput = password.getText().toString().trim();

                register.setEnabled(!usernameInput.isEmpty() && !passwordInput.isEmpty() );

            }


            @Override
            public void afterTextChanged(Editable editable) {

            }

        };

    }

