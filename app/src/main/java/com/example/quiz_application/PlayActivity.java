package com.example.quiz_application;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        CardView phy = findViewById(R.id.tech_card);
        // Set a click listener on that View
        phy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phyIntent = new Intent(PlayActivity.this, TechnicalActivity.class);
                startActivity(phyIntent);
            }
        });

        CardView chem = findViewById(R.id.gk_card);
        // Set a click listener on that View
        chem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chemIntent = new Intent(PlayActivity.this, AptitudeActivity.class);
                startActivity(chemIntent);
            }
        });

        CardView bio = findViewById(R.id.apti_card);
        // Set a click listener on that View
        bio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bioIntent = new Intent(PlayActivity.this, GeneralKnowledgeActivity.class);
                startActivity(bioIntent);
            }
        });

        CardView more = findViewById(R.id.more_card);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "Patience is the key";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
    }
}