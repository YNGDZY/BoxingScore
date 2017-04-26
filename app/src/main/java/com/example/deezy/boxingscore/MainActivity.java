package com.example.deezy.boxingscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import static com.example.deezy.boxingscore.R.string.blue;
import static com.example.deezy.boxingscore.R.string.red;

public class MainActivity extends AppCompatActivity {

    public int blueScore = 0;
    public int redScore = 0;
    public int round = 1;
    public int blueKOS = 0;
    public int redKOS = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Button red1 = (Button) findViewById(R.id.red_1);
        red1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redScore = redScore + 1;
            }
        });
        Button red2 = (Button) findViewById(R.id.red_2);
        red2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redScore = redScore + 2;
            }
        });
        Button red3 = (Button) findViewById(R.id.red_3);
        red3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redScore = redScore + 3;
            }
        });


        Button redKO = (Button) findViewById(R.id.red_ko);
        redKO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redKOS = redKOS + 1;
            }
        });
        Button blue1 = (Button) findViewById(R.id.blue_1);
        blue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blueScore = blueScore + 1;
            }
        });
        Button blue2 = (Button) findViewById(R.id.blue_2);
        blue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blueScore = blueScore + 2;
            }
        });
        Button blue3 = (Button) findViewById(R.id.blue_3);
        blue3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blueScore = blueScore + 3;
            }
        });

        Button blueKO = (Button) findViewById(R.id.blue_ko);
        blueKO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blueKOS = blueKOS + 1;
            }
        });



        Button nextRound = (Button) findViewById(R.id.nextRound);
        nextRound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                round = round + 1;
                TextView redScoreT = (TextView) findViewById(R.id.redScore);
                TextView blueScoreT = (TextView) findViewById(R.id.blueScore);
                TextView roundNum = (TextView) findViewById(R.id.round_number);
                redScoreT.setText(String.valueOf(redScore));
                blueScoreT.setText(String.valueOf(blueScore));
                roundNum.setText(String.valueOf(round));
                TextView redKON = (TextView) findViewById(R.id.redKON);
                redKON.setText(String.valueOf(redKOS));
                TextView blueKON = (TextView) findViewById(R.id.blueKON);
                blueKON.setText(String.valueOf(blueKOS));
            }
        });

    }
}
