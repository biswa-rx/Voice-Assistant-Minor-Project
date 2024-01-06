package com.example.demo.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.demo.R;

public class SplashScreen extends AppCompatActivity {

    Button chatMode,voiceMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        chatMode = findViewById(R.id.chat_mode);
        voiceMode = findViewById(R.id.voice_mode);

        chatMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SplashScreen.this, ChatModeActivity.class));
            }
        });
        voiceMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SplashScreen.this, VoiceModeActivity.class));
            }
        });
    }
}