package com.example.plugin6;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.RelativeLayout;

public class PluginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout root = new RelativeLayout(this);
        root.setBackgroundColor(Color.BLUE);
        Button button = new Button(this);
        button.setText("I'm Plugin Activity");
        root.addView(button);
        setContentView(root);
    }
}
