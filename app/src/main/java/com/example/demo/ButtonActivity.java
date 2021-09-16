package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    private Button btn4;

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        btn4 = findViewById(R.id.btn_v4);
        btn4.setOnClickListener(view->{
            Toast.makeText(ButtonActivity.this,"第四个按钮被点击了！",Toast.LENGTH_SHORT).show();
        });
        textView = findViewById(R.id.btn_view);
        textView.setOnClickListener(view->{
            Toast.makeText(ButtonActivity.this, "TextView被点击了！", Toast.LENGTH_SHORT).show();
        });
    }

    public void showToast(View view){
        Toast.makeText(ButtonActivity.this,"第三个按钮被点击了！",Toast.LENGTH_SHORT).show();
    }
}