package com.example.user.topcountries2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopCountries2017Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.countries_list);

        TopCountries2017 topCountries2017 = new TopCountries2017();
        ArrayList<Country> list = topCountries2017.getList();

        TopCountries2017Adapter countryAdapter = new TopCountries2017Adapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(countryAdapter);
    }

    public void getCountry(View listItem) {
        Country country = (Country) listItem.getTag();
        Log.d("Country is " , country.getName());
    }
}
