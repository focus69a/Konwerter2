package com.wj.pl33111.konwerter2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;
<<<<<<< HEAD
<<<<<<< HEAD
//testowy tekst powinie znalezc sie w branch 1
//dodatkowy tekst do branch 1
=======
//testowy tekst
>>>>>>> parent of 13628cf... zapis tekstu testowego do branch 1
=======
//testowy tekst
>>>>>>> parent of 13628cf... zapis tekstu testowego do branch 1
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonCovnMilesToKm = (Button) findViewById(R.id.buttonMiles2Km);
        buttonCovnMilesToKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textBoxMiles = (EditText) findViewById(R.id.editTextMiles);
                EditText textBoxKm = (EditText) findViewById(R.id.editTextKm);
                double vMiles = Double.valueOf(textBoxMiles.getText().toString());
                double vKm = vMiles / 0.62137;

                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxKm.setText(formatVal.format(vKm));
            }
                                               });

        Button buttonCovnKmToMiles = (Button) findViewById(R.id.buttonKm2Miles);
        buttonCovnKmToMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            EditText textBoxMiles = (EditText) findViewById(R.id.editTextMiles);
            EditText textBoxKm = (EditText) findViewById(R.id.editTextKm);
            double vKm = Double.valueOf(textBoxKm.getText().toString());
            double vMiles = vKm * 0.62137;

            DecimalFormat formatVal = new DecimalFormat("##.##");
            textBoxMiles.setText(formatVal.format(vMiles));
                   }

              });
    }
}
