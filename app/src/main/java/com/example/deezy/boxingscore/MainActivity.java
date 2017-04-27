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
                updateRST(redScore);
            }
        });
        Button red2 = (Button) findViewById(R.id.red_2);
        red2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redScore = redScore + 2;
                updateRST(redScore);
            }
        });
        Button red3 = (Button) findViewById(R.id.red_3);
        red3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redScore = redScore + 3;
                updateRST(redScore);
            }
        });


        final Button redKO = (Button) findViewById(R.id.red_ko);
        redKO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redKOS = redKOS + 1;
                updateRKON(redKOS);
            }
        });
        Button blue1 = (Button) findViewById(R.id.blue_1);
        blue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blueScore = blueScore + 1;
                updateBST(blueScore);
            }
        });
        Button blue2 = (Button) findViewById(R.id.blue_2);
        blue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blueScore = blueScore + 2;
                updateBST(blueScore);
            }
        });
        Button blue3 = (Button) findViewById(R.id.blue_3);
        blue3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blueScore = blueScore + 3;
                updateBST(blueScore);
            }
        });

        Button blueKO = (Button) findViewById(R.id.blue_ko);
        blueKO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blueKOS = blueKOS + 1;
                updateBKON(blueKOS);
            }
        });



        Button nextRound = (Button) findViewById(R.id.nextRound);
        nextRound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                round = round + 1;
                updateRound(round);

            }
        });

        Button reset = (Button) findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redScore = 0;
                blueScore = 0;
                redKOS = 0;
                blueKOS = 0;
                round = 1;
                updateRST(redScore);
                updateBST(blueScore);
                updateRKON(redKOS);
                updateBKON(blueKOS);
                updateRound(round);

            }
        });



    }

    public void updateRST(int redScore){
        TextView redScoreT = (TextView) findViewById(R.id.redScore);
        redScoreT.setText(String.valueOf(redScore));
    }
    public void updateBST(int blueScore){
        TextView blueScoreT = (TextView) findViewById(R.id.blueScore);
        blueScoreT.setText(String.valueOf(blueScore));
    }
    public void updateRKON(int redKOS){
        TextView redKON = (TextView) findViewById(R.id.redKON);
        redKON.setText(String.valueOf(redKOS));
    }
    public void updateBKON(int blueKOS){
        TextView blueKON = (TextView) findViewById(R.id.blueKON);
        blueKON.setText(String.valueOf(blueKOS));

    }
    public void updateRound(int round){
        TextView roundNum = (TextView) findViewById(R.id.round_number);
        roundNum.setText(String.valueOf(round));
    }
}


