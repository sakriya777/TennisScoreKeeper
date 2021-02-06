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

    public static String SideAAdvantage = "";
    public static String SideBAdvantage = "";

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
            SideAAdvantage = "";
            SideBAdvantage = "";

            SideAPoints = 0;
            SideBPoints = 0;

            SideAPointText.setText("0");
            SideBPointText.setText("0");

            ControlSetA(view);
        }
        else if(SideAPoints == 40 && SideBPoints == 40){
            SideAAdvantage = "AD";
            SideBAdvantage = "";
            SideAPoints = 50;
            SideBPoints = 50;
            SideAPointText.setText(SideAAdvantage);
            SideBPointText.setText(SideBAdvantage);
        }
        else if(SideBAdvantage == "AD" && SideAPoints == 50 && SideBPoints == 50){
            SideAAdvantage = "AD";
            SideBAdvantage = "";
            SideAPointText.setText(SideAAdvantage);
            SideBPointText.setText(SideBAdvantage);
        }
        else if(SideAAdvantage == "AD" && SideAPoints == 50 && SideBPoints == 50){
            SideAAdvantage = "";
            SideBAdvantage = "";
            SideAPoints = 0;
            SideBPoints = 0;
            SideAPointText.setText("0");
            SideBPointText.setText("0");
            ControlSetA(view);
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
            SideAAdvantage = "";
            SideBAdvantage = "";

            SideAPoints = 0;
            SideBPoints = 0;

            SideAPointText.setText("0");
            SideBPointText.setText("0");

            ControlSetB(view);
        }
        else if(SideAPoints == 40 && SideBPoints == 40){
            SideAAdvantage = "";
            SideBAdvantage = "AD";
            SideAPoints = 50;
            SideBPoints = 50;
            SideBPointText.setText(SideBAdvantage);
            SideAPointText.setText(SideAAdvantage);
        }
        else if(SideAAdvantage == "AD"  && SideAPoints == 50 && SideBPoints == 50){
            SideAAdvantage = "";
            SideBAdvantage = "AD";
            SideBPointText.setText(SideBAdvantage);
            SideAPointText.setText(SideAAdvantage);
        }
        else if(SideBAdvantage == "AD" && SideAPoints == 50 && SideBPoints == 50){
            SideAAdvantage = "";
            SideBAdvantage = "";
            SideAPoints = 0;
            SideBPoints = 0;
            SideAPointText.setText("0");
            SideBPointText.setText("0");
            ControlSetB(view);
        }
    }
    public void ControlSetA(View view){
        if(CurrentSet == 1 && (SideASet1>=6 || SideBSet1>=6) && (SideASet1-SideBSet1>=2 || SideBSet1-SideASet1>=2)){
            CurrentSet++;
        }
        if(CurrentSet == 2 && (SideASet2>=6 || SideBSet2>=6) && (SideASet2-SideBSet2>=2 || SideBSet2-SideASet2>=2)){
            CurrentSet++;
        }
        if(CurrentSet == 3 && (SideASet3>=6 || SideBSet3>=6) && (SideASet3-SideBSet3>=2 || SideBSet3-SideASet3>=2)){
            CurrentSet++;
        }
        if(CurrentSet == 4 && (SideASet4>=6 || SideBSet4>=6) && (SideASet4-SideBSet4>=2 || SideBSet4-SideASet4>=2)){
            CurrentSet++;
        }
        if(CurrentSet == 5 && (SideASet5>=6 || SideBSet5>=6) && (SideASet5-SideBSet5>=2 || SideBSet5-SideASet5>=2)){
            CurrentSet++;
        }
        if(CurrentSet == 1){
            SideASet1++;
            SideASet1Text.setText(Integer.toString(SideASet1));
        }
        else if(CurrentSet == 2){
            SideASet2++;
            SideASet2Text.setText(Integer.toString(SideASet2));
        }
        else if(CurrentSet == 3){
            SideASet3++;
            SideASet3Text.setText(Integer.toString(SideASet3));
        }
        else if(CurrentSet == 4){
            SideASet4++;
            SideASet4Text.setText(Integer.toString(SideASet4));
        }
        else if(CurrentSet == 5){
            SideASet5++;
            SideASet5Text.setText(Integer.toString(SideASet5));
        }
    }
    public void ControlSetB(View view){
        if(CurrentSet == 1 && (SideASet1>=6 || SideBSet1>=6) && (SideASet1-SideBSet1>=2 || SideBSet1-SideASet1>=2)){
            CurrentSet++;
        }
        if(CurrentSet == 2 && (SideASet2>=6 || SideBSet2>=6) && (SideASet2-SideBSet2>=2 || SideBSet2-SideASet2>=2)){
            CurrentSet++;
        }
        if(CurrentSet == 3 && (SideASet3>=6 || SideBSet3>=6) && (SideASet3-SideBSet3>=2 || SideBSet3-SideASet3>=2)){
            CurrentSet++;
        }
        if(CurrentSet == 4 && (SideASet4>=6 || SideBSet4>=6) && (SideASet4-SideBSet4>=2 || SideBSet4-SideASet4>=2)){
            CurrentSet++;
        }
        if(CurrentSet == 5 && (SideASet5>=6 || SideBSet5>=6) && (SideASet5-SideBSet5>=2 || SideBSet5-SideASet5>=2)){
            CurrentSet++;
        }
        if(CurrentSet == 1){
            SideBSet1++;
            SideBSet1Text.setText(Integer.toString(SideBSet1));
        }
        else if(CurrentSet == 2){
            SideBSet2++;
            SideBSet2Text.setText(Integer.toString(SideBSet2));
        }
        else if(CurrentSet == 3){
            SideBSet3++;
            SideBSet3Text.setText(Integer.toString(SideBSet3));
        }
        else if(CurrentSet == 4){
            SideBSet4++;
            SideBSet4Text.setText(Integer.toString(SideBSet4));
        }
        else if(CurrentSet == 5){
            SideBSet5++;
            SideBSet5Text.setText(Integer.toString(SideBSet5));
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