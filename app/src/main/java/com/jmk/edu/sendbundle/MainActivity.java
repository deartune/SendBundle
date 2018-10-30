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
        TextView editTextColor=(EditText) findViewById(R.id.editTextColor);
        String message1=((EditText) findViewById(R.id.editTextColor)).getText().toString();
        TextView editTextSeason=(EditText) findViewById(R.id.editTextSeason);
        String message2=((EditText) findViewById(R.id.editTextSeason)).getText().toString();

        if(v.getId()==R.id.buttonSending){
        Bundle bundle=new Bundle();
        bundle.putString("message","모국어:" +message+ " 색깔: "+ message1+" 계절: "+message2);
        Intent intent=new Intent(this, BundleActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    }
}
