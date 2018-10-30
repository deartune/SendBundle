package com.jmk.edu.sendbundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class BundleActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle1);
        Bundle bundle1=getIntent().getExtras();
        TextView tv=(TextView) findViewById(R.id.textView);
        tv.setText(bundle1.getString("message","no"));
    }
}
