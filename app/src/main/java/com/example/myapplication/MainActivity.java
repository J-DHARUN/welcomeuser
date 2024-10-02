package com.example.myapplication;

import android.os.Bundle; import android.view.View;

import android.widget.Button;

import android.widget.EditText;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {



    EditText editName;

    TextView result;

    Button buttonSubmit;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        editName = (EditText) findViewById(R.id.editName);

        result = (TextView) findViewById(R.id.tvResult);

        buttonSubmit = (Button) findViewById(R.id.buttonSubmit);


        buttonSubmit.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                String name = editName.getText().toString();

                result.setText("Welcome \t" + name );
            }
        });
    }
}



