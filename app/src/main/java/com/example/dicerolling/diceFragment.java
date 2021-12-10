package com.example.dicerolling;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class diceFragment extends Fragment {

    RadioGroup radioGroup;
    RadioButton radioButton4;
    RadioButton radioButton6;
    RadioButton radioButton8;
    RadioButton radioButton10;
    RadioButton radioButton12;
    RadioButton radioButton20;

    private Button dice1Btn;
    private Button dice2Btn;
    private TextView textView;
    int maxValue;
    int randomValue;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       // super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        // Inflate the layout for this fragment
        View myLayout =  inflater.inflate(R.layout.fragment_dice, container, false);

        radioGroup=myLayout.findViewById(R.id.radioGroup);
        radioButton4=myLayout.findViewById(R.id.side4Rb);
        radioButton6=myLayout.findViewById(R.id.side6Rb);
        radioButton8=myLayout.findViewById(R.id.side8Rb);
        radioButton10=myLayout.findViewById(R.id.side10Rb);
        radioButton12=myLayout.findViewById(R.id.side12Rb);
        radioButton20=myLayout.findViewById(R.id.side20Rb);

        dice1Btn=myLayout.findViewById(R.id.dice1Btn);
        dice2Btn=myLayout.findViewById(R.id.dice2Btn);
        textView=myLayout.findViewById(R.id.resultTxt);

        int selectedId=radioGroup.getCheckedRadioButtonId();

        if(selectedId==R.id.side4Rb){
            maxValue=4;
        }else if(selectedId==R.id.side6Rb){
            maxValue=6;
        }
        else if(selectedId==R.id.side8Rb){
            maxValue=8;
        }
        else if(selectedId==R.id.side10Rb){
            maxValue=10;
        }
        else if(selectedId==R.id.side12Rb){
            maxValue=12;
        }
        else if(selectedId==R.id.side20Rb){
            maxValue=20;
        }

        dice1Btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View v) {
                int selectedId=radioGroup.getCheckedRadioButtonId();

                if(selectedId==R.id.side4Rb){
                    maxValue=4;
                }else if(selectedId==R.id.side6Rb){
                    maxValue=6;
                }
                else if(selectedId==R.id.side8Rb){
                    maxValue=8;
                }
                else if(selectedId==R.id.side10Rb){
                    maxValue=10;
                }
                else if(selectedId==R.id.side12Rb){
                    maxValue=12;
                }
                else if(selectedId==R.id.side20Rb){
                    maxValue=20;
                }
                randomValue=(int)(Math.random()*maxValue)+1;
                textView.setText(String.format("%d", randomValue));
            }
        });

        dice2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId=radioGroup.getCheckedRadioButtonId();

                if(selectedId==R.id.side4Rb){
                    maxValue=4;
                }else if(selectedId==R.id.side6Rb){
                    maxValue=6;
                }
                else if(selectedId==R.id.side8Rb){
                    maxValue=8;
                }
                else if(selectedId==R.id.side10Rb){
                    maxValue=10;
                }
                else if(selectedId==R.id.side12Rb){
                    maxValue=12;
                }
                else if(selectedId==R.id.side20Rb){
                    maxValue=20;
                }
                randomValue=(int)(Math.random()*maxValue)+1;
                textView.setText(""+randomValue);
            }
        });

       return myLayout;
    }
}