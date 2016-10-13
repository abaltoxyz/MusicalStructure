package com.android.kbaltodano.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the View that shows the "Now Playing" category
        View nowPlaying = findViewById(R.id.category_player);

        //Set a click listener on that View
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the "Now Playing" View is clicked
            @Override
            public void onClick(View view) {
                Intent playerIntent = new Intent(MainActivity.this, PlayerActivity.class);
                startActivity(playerIntent);
            }
        });

        //Find the View that shows the "Catalog" category
        View catalog = findViewById(R.id.category_catalog);

        //Set a click listener on that View
        catalog.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the "Catalog" View is clicked
            @Override
            public void onClick(View view) {
                Intent catalogIntent = new Intent(MainActivity.this, CatalogActivity.class);
                startActivity(catalogIntent);
            }
        });

        //Find the View that shows the "Podcasts" category
        View podcasts = findViewById(R.id.category_podcasts);

        //Set a click listener on that View
        podcasts.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the "Podcasts" View is clicked
            @Override
            public void onClick(View view) {
                Intent podcastsIntent = new Intent(MainActivity.this, PodcastActivity.class);
                startActivity(podcastsIntent);
            }
        });

        //Find the View that shows the "Settings" category
        View settings = findViewById(R.id.category_settings);

        //Set a click listener on that View
        settings.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the "Settings" View is clicked
            @Override
            public void onClick(View view) {
                Intent settingsIntent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(settingsIntent);
            }
        });
    }
}
