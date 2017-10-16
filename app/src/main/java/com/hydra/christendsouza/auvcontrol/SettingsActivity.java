package com.hydra.christendsouza.auvcontrol;

import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class SettingsActivity extends AppCompatActivity {
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        b=(Button)findViewById(R.id.kill_button);
        b.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
    }
}
