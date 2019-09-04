package com.remijonathan.burgercaloriecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RadioGroup pattyRadioGroup;
    private CheckBox proscuittoBox;
    private RadioGroup cheeseRadioGroup;
    private SeekBar sauceSeekBar;
    private TextView calorieTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pattyRadioGroup = findViewById(R.id.meatGroup);
        proscuittoBox = findViewById(R.id.proscuittoCheckBox);
        cheeseRadioGroup = findViewById(R.id.chesseGroup);
        sauceSeekBar = findViewById(R.id.sauceSeekBar);
        calorieTextView = findViewById(R.id.calorieTextView);


    }

    private RadioGroup.OnCheckedChangeListener foodListener = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int radioID) {
            switch (radioID)  {
                case R.id.beefRadio:
                    //Do Something
                    break;
                case R.id.lambRadio:
                    //Do Something
                    break;
                case R.id.ostrichRadio:
                    //Do Something
                    break;
                case R.id.cheddarRadio:
                    //Do Something
                    break;
                case R.id.provoloneRadio:
                    //Do Something
                    break;
            }
        }
    };

    private View.OnClickListener baconListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(((CheckBox)view).isChecked()){
                //Do Something
            }else {
                //Do Something Else
            }
        }
    };

    private SeekBar.OnSeekBarChangeListener sauceListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
            //Do Something
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            //Do Something
        }
    };
}
