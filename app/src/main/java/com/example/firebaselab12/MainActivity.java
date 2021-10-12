package com.example.firebaselab12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // declare Buttons
    private Button bAddGame, bShowImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Button: upload game
        //
        bAddGame = (Button) findViewById(R.id.bAddGame);
        bAddGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAddGame();
            }
        });

        // Button: show Game
        //
        bShowImages = (Button) findViewById(R.id.bShowGame);
        bShowImages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showGame();
            }
        });

    }

    private void showAddGame(){
        Intent intent = new Intent(MainActivity.this, AddGame.class);
        MainActivity.this.startActivity(intent);
    }

    private void showGame(){
        Intent intent = new Intent(MainActivity.this, ShowGame.class);
        MainActivity.this.startActivity(intent);
    }
}