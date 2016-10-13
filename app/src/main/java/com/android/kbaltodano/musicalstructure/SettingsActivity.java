package com.android.kbaltodano.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        //Find the View that shows the "Home" button
        View homeButton = findViewById(R.id.home_button);

        //Set a click listener on that View
        homeButton.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the "Home" button is clicked
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(SettingsActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        //Find the View that shows the "Now Playing" button
        View nowPlayingButton = findViewById(R.id.now_playing_button);

        //Set a click listener on that View
        nowPlayingButton.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the "Now Playing" button is clicked
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(SettingsActivity.this, PlayerActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

        //Find the View that shows the "Catalog" button
        View catalogButton = findViewById(R.id.catalog_button);

        //Set a click listener on that View
        catalogButton.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the "Catalog" button is clicked
            @Override
            public void onClick(View view) {
                Intent catalogIntent = new Intent(SettingsActivity.this, CatalogActivity.class);
                startActivity(catalogIntent);
            }
        });

        //Find the View that shows the "Podcasts" button
        View podcastsButton = findViewById(R.id.podcasts_button);

        //Set a click listener on that View
        podcastsButton.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the "Podcasts" button is clicked
            @Override
            public void onClick(View view) {
                Intent podcastsIntent = new Intent(SettingsActivity.this, PodcastActivity.class);
                startActivity(podcastsIntent);
            }
        });
    }
}
