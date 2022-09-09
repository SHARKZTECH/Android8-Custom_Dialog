package com.example.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginDial=findViewById(R.id.loginDial);
        loginDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                View view1=getLayoutInflater().inflate(R.layout.login_layout,null);

                EditText email=view1.findViewById(R.id.email);
                EditText password=view1.findViewById(R.id.password);
                Button loginbtn=view1.findViewById(R.id.login);

                loginbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "Email: "+email.getText().toString()+"Password: "+password.getText().toString() , Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setView(view1);
                AlertDialog dialog=builder.create();
                dialog.show();
            }
        });
    }
}