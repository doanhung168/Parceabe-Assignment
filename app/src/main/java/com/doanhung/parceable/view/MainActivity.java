package com.doanhung.parceable.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.doanhung.parceable.R;
import com.doanhung.parceable.model.Worker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Worker worker = new Worker();
        worker.setName("Hung");
        worker.setAge(18);
        worker.setSalary(2000);

        Button btnPass = findViewById(R.id.btnPassParceableObject);
        btnPass.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("key", worker);
            startActivity(intent);
        });
    }
}