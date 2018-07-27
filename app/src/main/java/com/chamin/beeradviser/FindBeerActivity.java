package com.chamin.beeradviser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class FindBeerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFindBeer(View view){
        TextView brands= (TextView) findViewById(R.id.brands);
        brands.setText("Gottle of geer");
        Spinner color= (Spinner) findViewById(R.id.color);
        String beerType= String.valueOf(color.getSelectedItem());
        brands.setText(beerType);
    }
}
