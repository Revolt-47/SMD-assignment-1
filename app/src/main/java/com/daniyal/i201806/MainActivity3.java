package com.daniyal.i201806;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    private Spinner spinnerCountry;
    private Spinner spinnerCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        // Initialize spinners
        spinnerCountry = findViewById(R.id.spinnerCountry);
        spinnerCity = findViewById(R.id.spinnerCity);

        // Create arrays for spinner data
        String[] countryOptions = {"Select Country", "Country 1", "Country 2", "Country 3"};
        String[] cityOptions = {"Select City", "City 1", "City 2", "City 3"};

        // Create ArrayAdapter with the spinner data arrays
        ArrayAdapter<String> countryAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, countryOptions);
        ArrayAdapter<String> cityAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, cityOptions);

        // Specify the layout to use when the list of choices appears
        countryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Set the adapters to the spinners
        spinnerCountry.setAdapter(countryAdapter);
        spinnerCity.setAdapter(cityAdapter);

        // Set the initial selection to the placeholder option
        spinnerCountry.setSelection(0);
        spinnerCity.setSelection(0);

        // Spinner item click listener (optional)
        spinnerCountry.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedCountry = (String) parentView.getSelectedItem();
                if (!selectedCountry.equals("Select Country")) {
                    Toast.makeText(getApplicationContext(), "Selected Country: " + selectedCountry, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // Do nothing
            }
        });
    }
}