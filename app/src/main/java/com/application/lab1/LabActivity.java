package com.application.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LabActivity extends AppCompatActivity {

    public void clickFunc(View view) {
        EditText myTextField = (EditText) findViewById(R.id.editTextTextPersonName);
        String str = myTextField.getText().toString();

        //Toast.makeText(LabActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();

        goToActivity2(str);

    }

    public void goToActivity2(String s){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message",s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}