package com.jmk.edu.sendbundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonSending = (Button) findViewById(R.id.buttonSending);
        buttonSending.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        TextView editTextSending=(EditText) findViewById(R.id.editTextSending);
        String message=((EditText) findViewById(R.id.editTextSending)).getText().toString();


        if(v.getId()==R.id.buttonSending){
        Bundle bundle=new Bundle();
        bundle.putString("message",message);
        Intent intent=new Intent(this, BundleActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    }
}
