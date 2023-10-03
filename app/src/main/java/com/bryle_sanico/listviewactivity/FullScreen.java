package com.bryle_sanico.listviewactivity;
import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;


public class FullScreen extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);
        int selectedIcon = getIntent().getIntExtra("selectedIcon", 0);
        setBackground(selectedIcon);

        // Initialize MediaPlayer
        int audioResource = getAudioResource(selectedIcon);
        if (audioResource != 0) {
            mediaPlayer = MediaPlayer.create(this, audioResource);
            mediaPlayer.setLooping(false); // Set whether the audio should loop or not
            mediaPlayer.start(); // Start playing the audio
        }
    }

    private void setBackground(int resourceId) {
        ImageView backgroundImageView = findViewById(R.id.backgroundImageview);
        backgroundImageView.setImageResource(resourceId);
    }

    private int getAudioResource(int resourceId) {
        int audioResource = 0; // Default value for no matching audio resource
        if (resourceId == R.drawable.anime1) {
            audioResource = R.raw.rudy;
        }

        if (resourceId == R.drawable.anime2) {
            audioResource = R.raw.roxy;
        }

        if (resourceId == R.drawable.anime3) {
            audioResource = R.raw.eris;
        }

        if (resourceId == R.drawable.anime4) {
            audioResource = R.raw.sylphie;
        }

        if (resourceId == R.drawable.anime5) {
            audioResource = R.raw.zenith;
        }

        if (resourceId == R.drawable.anime6) {
            audioResource = R.raw.zanoba;
        }

        if (resourceId == R.drawable.anime7) {
            audioResource = R.raw.ruejerd;
        }

        if (resourceId == R.drawable.anime8) {
            audioResource = R.raw.orsted;
        }

        if (resourceId == R.drawable.anime9) {
            audioResource = R.raw.kishirika;
        }

        if (resourceId == R.drawable.anime10) {
            audioResource = R.raw.aisha;
        }
        return audioResource;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Release the MediaPlayer when the activity is destroyed to free up resources
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
