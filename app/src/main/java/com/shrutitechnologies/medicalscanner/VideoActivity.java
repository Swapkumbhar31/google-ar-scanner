package com.shrutitechnologies.medicalscanner;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        getSupportActionBar().hide();
        Window window = this.getWindow();
        window.setStatusBarColor(getResources().getColor(R.color.textColor));
        window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        videoView = findViewById(R.id.videoView);
        MediaController mediaController= new MediaController(this);
        Uri uri = Uri.parse(String.format("android.resource://%s/%d", getPackageName(), R.raw.sample1));
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();
    }
}
