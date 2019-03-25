package com.version2.swordsandsorcery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class characterSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_selection);

        ImageButton homeButton = findViewById(R.id.home_button);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(characterSelection.this, main_menu.class));
            }
        });


        // all character selection buttons will send to character creation if there isn't a value there
        ImageButton character1 = findViewById(R.id.character1);
        character1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(characterSelection.this, characterCreationOverview.class));
            }
        });

        ImageButton character2 = findViewById(R.id.character2);
        character1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(characterSelection.this, characterCreationOverview.class));
            }
        });

        ImageButton character3 = findViewById(R.id.character3);
        character1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(characterSelection.this, characterCreationOverview.class));
            }
        });

        ImageButton character4 = findViewById(R.id.character4);
        character1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(characterSelection.this, characterCreationOverview.class));
            }
        });

        ImageButton character5 = findViewById(R.id.character5);
        character1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(characterSelection.this, characterCreationOverview.class));
            }
        });

        ImageButton character6 = findViewById(R.id.character6);
        character1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(characterSelection.this, characterCreationOverview.class));
            }
        });

        ImageView background = (ImageView) findViewById(R.id.backgroundImg);
        int imageResource = getResources().getIdentifier("@drawable/parchment", null, this.getPackageName());
        background.setImageResource(imageResource);
        background.setScaleType(ImageView.ScaleType.FIT_XY);
    }
}
