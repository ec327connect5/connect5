package com.example.connectfive;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.connectfive.R;
import com.example.connectfive.game;

public class MainActivity extends AppCompatActivity {
    //board size
    final static int size = 15;
    private Context context;

    //imageview array
    private ImageView[][] cells = new ImageView[size][size];

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startGame();
                //newGame();
                //designGame();
            }

        });

    }
    void startGame(){
        Intent intent = new Intent(this, game.class);
        startActivity(intent);
    }
/*
        void newGame(){
            Intent intent = new Intent(this, game.class);
            startActivity(intent);
        }
*/
        private void designGame(){
            //creates layout parameters
            int cellSize = Math.round(ScreenWidth()/size);
            LinearLayout.LayoutParams lprow = new LinearLayout.LayoutParams(cellSize*size, cellSize);
            LinearLayout.LayoutParams lpcell = new LinearLayout.LayoutParams(cellSize, cellSize);

            LinearLayout linBoardGame = findViewById(R.id.linBoardGame);



        }

    private float ScreenWidth(){
        Resources resources = context.getResources();
        DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.widthPixels;
    }

}