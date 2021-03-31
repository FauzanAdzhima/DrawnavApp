package com.example.drawnavapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.drawnavapp.R;

import java.sql.BatchUpdateException;

public class LoginActivity extends AppCompatActivity {

    ImageButton login;
    EditText user, pass;

    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.relative_login);

        login = (ImageButton) findViewById(R.id.btnLogin);
        user = (EditText) findViewById(R.id.etUser);
        pass = (EditText) findViewById(R.id.etPass);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(pass.getText().toString().toUpperCase().equals("TEST1"))
                {
                    login_sukses();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Password salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void login_sukses() {
        String user_login = user.getText().toString();
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("USERNAME", user_login);
        startActivity(i);
    }
}
