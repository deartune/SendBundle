package com.jmk.edu.sendbundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BundleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle);
        Bundle bundle=getIntent().getExtras();
        TextView Receive1=(TextView)findViewById(R.id.Receive1);


        Receive1.setText(bundle.getString("message","no"));
    }
}
