package com.gress.gerobakdorong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class CUSTUMER extends AppCompatActivity {
    EditText editTextemail;
    EditText editTextpassword;

    TextInputLayout textInputLayoutEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custumer);
    }
}
