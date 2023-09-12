package com.bryle_sanico.listviewactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
public class FullScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);

        int selectedIcon = getIntent().getIntExtra("selectedIcon", 0);
        setBackground(selectedIcon);
    }

    private void setBackground(int resourceId) {
        ImageView backgroundImageView = findViewById(R.id.backgroundImageview);
        backgroundImageView.setImageResource(resourceId);
    }
}


