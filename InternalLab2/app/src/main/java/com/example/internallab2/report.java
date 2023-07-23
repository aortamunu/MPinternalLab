package com.example.internallab2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class report extends Activity {
    TextView FirstName;
    TextView LastName;
    TextView Gender;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.report);

        FirstName = (TextView)findViewById(R.id.firstNameValueView);
        LastName = (TextView)findViewById(R.id.lastNameValueView);
        Gender = (TextView)findViewById(R.id.GenderValueView);
        Intent form = getIntent();
        String firstNameValueSubmitted = getIntent().getStringExtra("FirstName");
        String lastNameValueSubmitted = getIntent().getStringExtra("LastName");
        String genderValueSubmitted = getIntent().getStringExtra("Gender");
        FirstName.setText(firstNameValueSubmitted);
        LastName.setText(lastNameValueSubmitted);
        Gender.setText(genderValueSubmitted);

    }
}


