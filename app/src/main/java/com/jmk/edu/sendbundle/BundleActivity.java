package com.jmk.edu.sendbundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BundleActivity extends AppCompatActivity implements View.OnClickListener {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle);
        Bundle bundle=getIntent().getExtras();
        EditText Receive1=(EditText) findViewById(R.id.Receive1);
        Receive1.setText(bundle.getString("message","no"));



        Button buttonSending = (Button) findViewById(R.id.buttonSending);
        buttonSending.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        EditText Receive2=(EditText) findViewById(R.id.Receive2);
        String message1=((EditText) findViewById(R.id.Receive1)).getText().toString();
        String message2=((EditText) findViewById(R.id.Receive2)).getText().toString();

        if(v.getId()==R.id.buttonSending){
            Bundle bundle1=new Bundle();
            bundle1.putString("message",message1+"추가 메시지: "+message2);
            Intent intent=new Intent(this, BundleActivity1.class);
            intent.putExtras(bundle1);
            startActivity(intent);
    }
}}
