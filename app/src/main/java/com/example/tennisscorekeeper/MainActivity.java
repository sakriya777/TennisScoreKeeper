package com.example.tennisscorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView SideAPointText;
    private TextView SideBPointText;
    private TextView SideASet1Text;
    private TextView SideBSet1Text;
    private TextView SideASet2Text;
    private TextView SideBSet2Text;
    private TextView SideASet3Text;
    private TextView SideBSet3Text;
    private TextView SideASet4Text;
    private TextView SideBSet4Text;
    private TextView SideASet5Text;
    private TextView SideBSet5Text;
    private Button AButtonAddPoint;
    private Button BButtonAddPoint;

    public static int SideAPoints = 0;
    public static int SideBPoints = 0;

    public static int SideAAdvantage = 0;
    public static int SideBAdvantage = 0;

    public static int CurrentSet = 1;

    public static int SideASet1 = 0;
    public static int SideASet2 = 0;
    public static int SideASet3 = 0;
    public static int SideASet4 = 0;
    public static int SideASet5 = 0;

    public static int SideBSet1 = 0;
    public static int SideBSet2 = 0;
    public static int SideBSet3 = 0;
    public static int SideBSet4 = 0;
    public static int SideBSet5 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SideAPointText = findViewById(R.id.sideAScore);
        SideBPointText = findViewById(R.id.sideBScore);

        AButtonAddPoint = findViewById(R.id.addpointsidea);
        BButtonAddPoint = findViewById(R.id.addpointsideb);

        SideASet1Text = findViewById(R.id.sideaset1);
        SideASet2Text = findViewById(R.id.sideaset2);
        SideASet3Text = findViewById(R.id.sideaset3);
        SideASet4Text = findViewById(R.id.sideaset4);
        SideASet5Text = findViewById(R.id.sideaset5);

        SideBSet1Text = findViewById(R.id.sidebset1);
        SideBSet2Text = findViewById(R.id.sidebset2);
        SideBSet3Text = findViewById(R.id.sidebset3);
        SideBSet4Text = findViewById(R.id.sidebset4);
        SideBSet5Text = findViewById(R.id.sidebset5);
    }
    public void AAddPoint(View view){
        if(SideAPoints == 0){
            SideAPoints = SideAPoints + 15;
            SideAPointText.setText(Integer.toString(SideAPoints));
        }
        else if(SideAPoints == 15){
            SideAPoints = SideAPoints + 15;
            SideAPointText.setText(Integer.toString(SideAPoints));
        }
        else if(SideAPoints == 30){
            SideAPoints = SideAPoints + 10;
            SideAPointText.setText(Integer.toString(SideAPoints));
        }
        else if(SideAPoints == 40 && SideBPoints < 40){
            SideAAdvantage = 0;
            SideBAdvantage = 0;
            SideAPoints = 0;
            SideBPoints = 0;
            SideAPointText.setText("0");
            SideBPointText.setText("0");
            SideASet1 = SideASet1 + 1;
            if(CurrentSet == 1){
                SideASet1Text.setText(Integer.toString(SideASet1));
            }
        }
        else if(SideAPoints == 40 && SideBPoints == 40){
            SideAAdvantage = 1;
            SideBAdvantage = 0;
            SideAPointText.setText("AD");
            SideBPointText.setText("");
        }
        else if(SideBAdvantage == 1){
            SideAPointText.setText("AD");
            SideBPointText.setText("");
        }
        else if(SideAAdvantage == 1){
            SideAAdvantage = 0;
            SideBAdvantage = 0;
            SideAPoints = 0;
            SideBPoints = 0;
        }
    }
    public void BAddPoint(View view){
        if(SideBPoints == 0){
            SideBPoints = SideBPoints + 15;
            SideBPointText.setText(Integer.toString(SideBPoints));
        }
        else if(SideBPoints == 15){
            SideBPoints = SideBPoints + 15;
            SideBPointText.setText(Integer.toString(SideBPoints));
        }
        else if(SideBPoints == 30){
            SideBPoints = SideBPoints + 10;
            SideBPointText.setText(Integer.toString(SideBPoints));
        }
        else if(SideBPoints == 40 && SideAPoints < 40){
            SideBAdvantage = 0;
            SideAAdvantage = 0;
            SideAPoints = 0;
            SideBPoints = 0;
            SideAPointText.setText("0");
            SideBPointText.setText("0");
            SideBSet1 = SideBSet1 + 1;
            if(CurrentSet == 1){
                SideBSet1Text.setText(Integer.toString(SideBSet1));
            }
        }
        else if(SideAPoints == 40 && SideBPoints == 40){
            SideBAdvantage = 1;
            SideAAdvantage = 0;
            SideBPointText.setText("AD");
            SideAPointText.setText("");
        }
        else if(SideAAdvantage == 1){
            SideBPointText.setText("AD");
            SideAPointText.setText("");
        }
    }
    public void ResetPoint(View view){
        SideBPoints = 0;
        SideAPoints = 0;
        SideAPointText.setText("0");
        SideBPointText.setText("0");
    }
    public void ResetSet(View view){
        CurrentSet = 1;

        SideASet1 = 0;
        SideASet2 = 0;
        SideASet3 = 0;
        SideASet4 = 0;
        SideASet5 = 0;

        SideBSet1 = 0;
        SideBSet2 = 0;
        SideBSet3 = 0;
        SideBSet4 = 0;
        SideBSet5 = 0;

        SideASet1Text.setText("0");
        SideASet2Text.setText("0");
        SideASet3Text.setText("0");
        SideASet4Text.setText("0");
        SideASet5Text.setText("0");

        SideBSet1Text.setText("0");
        SideBSet2Text.setText("0");
        SideBSet3Text.setText("0");
        SideBSet4Text.setText("0");
        SideBSet5Text.setText("0");
    }
}