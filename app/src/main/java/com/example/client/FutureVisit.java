package com.example.client;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FutureVisit extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.future_visit);

        ListView lvCards = (ListView) findViewById(R.id.list_cards);
        FutureAdapter adapter = new FutureAdapter(this);

        lvCards.setAdapter(adapter);
        adapter.addAll(new FutureModal(R.drawable.wiprologo, R.string.mercury, R.string.mercury_sub),
                new FutureModal(R.drawable.wiprologo, R.string.venus, R.string.venus_sub),
                new FutureModal(R.drawable.wiprologo, R.string.earth, R.string.earth_sub),
                new FutureModal(R.drawable.wiprologo, R.string.mars, R.string.mars_sub),
                new FutureModal(R.drawable.wiprologo, R.string.jupiter, R.string.jupiter_sub),
                new FutureModal(R.drawable.wiprologo, R.string.pluto, R.string.pluto_sub));
    }
}
