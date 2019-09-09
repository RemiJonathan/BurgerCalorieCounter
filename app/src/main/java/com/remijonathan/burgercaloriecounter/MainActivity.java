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
    private Burger burger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pattyRadioGroup = findViewById(R.id.meatGroup);
        proscuittoBox = findViewById(R.id.proscuittoCheckBox);
        cheeseRadioGroup = findViewById(R.id.chesseGroup);
        sauceSeekBar = findViewById(R.id.sauceSeekBar);
        calorieTextView = findViewById(R.id.calorieTextView);
        burger = new Burger();
        registerChangeListener();
        displayCalories();

    }

    private RadioGroup.OnCheckedChangeListener foodListener = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int radioID) {
            switch (radioID)  {
                case R.id.beefRadio:
                    burger.setPattyCal(Burger.BEEF);
                    break;
                case R.id.lambRadio:
                    burger.setPattyCal(Burger.LAMB);
                    break;
                case R.id.ostrichRadio:
                    burger.setPattyCal(Burger.OSTRICH);
                    break;
                case R.id.cheddarRadio:
                    burger.setCheeseCal(Burger.ASIAGO);
                    break;
                case R.id.provoloneRadio:
                    burger.setCheeseCal(Burger.CREME_FRAICHE);
                    break;
            }
            displayCalories();


        }

    };

    private View.OnClickListener baconListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(((CheckBox)view).isChecked()){
                burger.setProscuittoCal(Burger.PROSCUITTO);
            }else {
                burger.clearProscuittoCalories();
            }
            displayCalories();
        }
    };

    private SeekBar.OnSeekBarChangeListener sauceListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
            burger.setSauceCal(seekBar.getProgress());
            displayCalories();
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            //Do Something
        }

    };

    private void displayCalories(){
        String calorieText = "Calories: " + burger.getTotalCalories();
        calorieTextView.setText(calorieText);
    }

    private void registerChangeListener(){
        pattyRadioGroup.setOnCheckedChangeListener(foodListener);
        proscuittoBox.setOnClickListener(baconListener);
        cheeseRadioGroup.setOnCheckedChangeListener(foodListener);
        sauceSeekBar.setOnSeekBarChangeListener(sauceListener);
    }
}
