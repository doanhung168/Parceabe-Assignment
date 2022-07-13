package com.doanhung.parceable.view;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.doanhung.parceable.R;
import com.doanhung.parceable.model.Worker;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = findViewById(R.id.tvInfo);
        textView.setText(((Worker) getIntent().getParcelableExtra("key")).toString());
    }
}