package com.example.coursework2b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btntapme;
    TextView changecolor;
    TextView colorcode;
    private int BUTTON_STATE = 0;
    private final int BUTTON_STATE_ONE = 0;
    private final int BUTTON_STATE_TWO = 1;
    private final int BUTTON_STATE_THREE = 2;
    private final int BUTTON_STATE_FOUR = 3;
    private final int BUTTON_STATE_FIVE = 4;

    int Count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        changecolor=findViewById(R.id.changecolor);
        colorcode=findViewById(R.id.colorcode);
        btntapme=findViewById(R.id.tapme);

        btntapme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (BUTTON_STATE==BUTTON_STATE_ONE){
                    changecolor.setText("COLOR:");
                    changecolor.setTextColor(getResources().getColor(R.color.yellow));
                    colorcode.setText("D8A91B");
                    colorcode.setTextColor(getResources().getColor(R.color.yellow));
                    BUTTON_STATE =BUTTON_STATE_TWO;
                }
                else if (BUTTON_STATE==BUTTON_STATE_TWO){
                    changecolor.setText("COLOR:");
                    changecolor.setTextColor(getResources().getColor(R.color.blue));
                    colorcode.setTextColor(getResources().getColor(R.color.blue));
                    colorcode.setText("#004A57");
                    BUTTON_STATE =BUTTON_STATE_THREE;

                }
                else if (BUTTON_STATE ==BUTTON_STATE_THREE){
                    changecolor.setText("COLOR:");
                    changecolor.setTextColor(getResources().getColor(R.color.green));
                    colorcode.setTextColor(getResources().getColor(R.color.green));
                    colorcode.setText("#5D8500");
                    BUTTON_STATE =BUTTON_STATE_FOUR;
                }
                else if (BUTTON_STATE ==BUTTON_STATE_FOUR){
                    changecolor.setText("COLOR:");
                    changecolor.setTextColor(getResources().getColor(R.color.colorAccent));
                    colorcode.setTextColor(getResources().getColor(R.color.colorAccent));
                    colorcode.setText("#D81B60");
                    BUTTON_STATE =BUTTON_STATE_FIVE;
                }
                else if (BUTTON_STATE ==BUTTON_STATE_FIVE){
                    changecolor.setText("COLOR:");
                    changecolor.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    colorcode.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    colorcode.setText("#00574B");
                    BUTTON_STATE =BUTTON_STATE_ONE;


                }
            }
        });
    }
}