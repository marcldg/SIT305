package com.example.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private static DecimalFormat df = new DecimalFormat("0.00");

    Spinner spinner1;
    EditText editTextTextPersonName4;

    TextView textView;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;

    ImageButton imageButton5;
    ImageButton imageButton6;
    ImageButton imageButton7;
    ImageButton imageButton8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner1 = findViewById(R.id.spinner1);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.units, R.layout.unit_spinner);
        adapter.setDropDownViewResource(R.layout.unit_dropdown_list);

        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(this);

        editTextTextPersonName4 = findViewById(R.id.editTextTextPersonName4);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);

        imageButton5 = findViewById(R.id.imageButton5);
        imageButton6 = findViewById(R.id.imageButton6);
        imageButton7 = findViewById(R.id.imageButton7);
        imageButton8 = findViewById(R.id.imageButton8);


        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String unitSelected = spinner1.getSelectedItem().toString();
                if(unitSelected.equals("Celsius")){
                    if (TextUtils.isEmpty(editTextTextPersonName4.getText().toString())){
                        Toast.makeText(MainActivity.this, "Empty fields are not allowed please enter a digit !", Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        try{
                            double degToFahrenheit = (((Double.parseDouble(editTextTextPersonName4.getText().toString())) * 1.8) + 32);
                            double degToKelvin = ((Double.parseDouble(editTextTextPersonName4.getText().toString())) + 273.15);
                            textView.setText(df.format(degToFahrenheit));
                            textView2.setText(df.format(degToKelvin));
                            textView3.setText("");
                        }
                        catch (Exception e){
                            Toast.makeText(MainActivity.this, "Characters are not allowed please enter a digit !", Toast.LENGTH_LONG).show();
                        }
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Please select the correct conversion icon !", Toast.LENGTH_LONG).show();
                }
            }
        });

        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String unitSelected = spinner1.getSelectedItem().toString();
                if(unitSelected.equals("Kilograms")){
                    if (TextUtils.isEmpty(editTextTextPersonName4.getText().toString())){
                        Toast.makeText(MainActivity.this, "Empty fields are not allowed please enter a digit !", Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        try{
                            double kgToGrams = ((Double.parseDouble(editTextTextPersonName4.getText().toString())) * 1000);
                            double kgToPounds = ((Double.parseDouble(editTextTextPersonName4.getText().toString())) * 2.205);
                            double kgToOnce = ((Double.parseDouble(editTextTextPersonName4.getText().toString())) * 35.274);

                            textView.setText(df.format(kgToGrams));
                            textView2.setText(df.format(kgToPounds));
                            textView3.setText(df.format(kgToOnce));
                        }
                        catch (Exception e){
                            Toast.makeText(MainActivity.this, "Characters are not allowed please enter a digit !", Toast.LENGTH_LONG).show();
                        }
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Please select the correct conversion icon !", Toast.LENGTH_LONG).show();
                }
            }
        });

        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String unitSelected = spinner1.getSelectedItem().toString();
                if(unitSelected.equals("Litre")){
                    if (TextUtils.isEmpty(editTextTextPersonName4.getText().toString())){
                        Toast.makeText(MainActivity.this, "Empty fields are not allowed please enter a digit !", Toast.LENGTH_LONG).show();
                }
                    else {
                        try {
                            double litreToCm3 = ((Double.parseDouble(editTextTextPersonName4.getText().toString())) * 1000);
                            double litreToml = ((Double.parseDouble(editTextTextPersonName4.getText().toString())) * 1000);
                            double litreToGal = ((Double.parseDouble(editTextTextPersonName4.getText().toString())) / 3.785);

                            textView.setText(df.format(litreToCm3));
                            textView2.setText(df.format(litreToml));
                            textView3.setText(df.format(litreToGal));
                        } catch (Exception e) {
                            Toast.makeText(MainActivity.this, "Characters are not allowed please enter a digit !", Toast.LENGTH_LONG).show();
                        }
                }
                }
                else{
                    Toast.makeText(MainActivity.this, "Please select the correct conversion icon !", Toast.LENGTH_LONG).show();
                }
            }
        });

        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String unitSelected = spinner1.getSelectedItem().toString();
                if(unitSelected.equals("Metre")){
                    if (TextUtils.isEmpty(editTextTextPersonName4.getText().toString())){
                        Toast.makeText(MainActivity.this, "Empty fields are not allowed please enter a digit !", Toast.LENGTH_LONG).show();
                    }
                    else {
                        try{
                            double metreToCm = ((Double.parseDouble(editTextTextPersonName4.getText().toString())) * 100);
                            double metreToFoot = ((Double.parseDouble(editTextTextPersonName4.getText().toString())) * 3.281);
                            double metreToInch = ((Double.parseDouble(editTextTextPersonName4.getText().toString())) * 39.37);

                            textView.setText(df.format(metreToCm));
                            textView2.setText(df.format(metreToFoot));
                            textView3.setText(df.format(metreToInch));
                        }
                        catch (Exception e){
                            Toast.makeText(MainActivity.this, "Characters are not allowed please enter a digit !", Toast.LENGTH_LONG).show();
                        }
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Please select the correct conversion icon !", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String toastText = parent.getItemAtPosition(position).toString();
        Toast.makeText(MainActivity.this, toastText + " selected", Toast.LENGTH_LONG).show();

        switch (toastText){
            case"Celsius":
                editTextTextPersonName4.setText("");
                textView.setText("");
                textView2.setText("");
                textView3.setText("");
                textView4.setText("Fahrenheit (F)");
                textView5.setText("Kelvin (K)");
                textView6.setText("");
                break;
            case"Kilograms":
                editTextTextPersonName4.setText("");
                textView.setText("");
                textView2.setText("");
                textView3.setText("");
                textView4.setText(" grams (g)");
                textView5.setText(" pounds (lb)");
                textView6.setText(" ounces (oz)");
                break;
            case"Metre":
                editTextTextPersonName4.setText("");
                textView.setText("");
                textView2.setText("");
                textView3.setText("");
                textView4.setText(" centimetres (cm)");
                textView5.setText(" feet (ft)");
                textView6.setText(" inch (in)");
                break;
            case"Litre":
                editTextTextPersonName4.setText("");
                textView.setText("");
                textView2.setText("");
                textView3.setText("");
                textView4.setText(" centimetre cube (cm3)");
                textView5.setText(" millilitre (ml)");
                textView6.setText(" gallon (gal)");
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}