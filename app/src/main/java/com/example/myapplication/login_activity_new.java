package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class login_activity_new extends AppCompatActivity {

    private Button signInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_new);

        signInButton = (Button) findViewById(R.id.sign_in_button);
        signInButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                EditText emailText = (EditText)findViewById(R.id.login_email);
                String emailString = emailText.getText().toString();
                EditText passwordText = (EditText)findViewById(R.id.login_email);
                String passwordString = emailText.getText().toString();

                if(emailString.equals("admin") && passwordString.equals("admin")){
                    Intent intent = new Intent(v.getContext(), r1Activity.class);
                    startActivity(intent);
                }

            }
        });
    }
}