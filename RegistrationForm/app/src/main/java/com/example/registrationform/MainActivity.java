package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onRegisterBtnClick(View view) {
        TextView txtFirstName = findViewById(R.id.txtFirstName);
        TextView txtLastName = findViewById(R.id.txtLastName);
        TextView txtEmail = findViewById(R.id.txtEmail);

        EditText edtTextFirstName = findViewById(R.id.edtTextFirstName);
        EditText edtTextLastName = findViewById(R.id.edtTxtLastName);
        EditText edtTextEmail = findViewById(R.id.edtTextEmail);

        txtFirstName.setText("First Name: " + edtTextFirstName.getText().toString());
        txtLastName.setText("Last Name: " + edtTextLastName.getText().toString());
        txtEmail.setText("Email: " + edtTextEmail.getText().toString());
    }
}