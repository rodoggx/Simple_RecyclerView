package com.example.simplerecyclerview;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    private ArrayList<String> mStrings;

    private MyAdapter mMyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStrings = new ArrayList<>();
        mStrings.add("Edwin");
        mStrings.add("Libu");
        mStrings.add("Aldo");
        mStrings.add("Mike");
        mStrings.add("Chris");

        mMyAdapter = new MyAdapter(mStrings);

        //create new class that contains recyclerview custom adaptor

       mRecyclerView = (RecyclerView) findViewById(R.id.mRecycler);
       mRecyclerView.setAdapter(mMyAdapter);
       mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    public void doSnackbar(View view) {
        Snackbar snackbar = Snackbar
                .make(view, "Welcome to the TerrorDome", Snackbar.LENGTH_SHORT);

        snackbar.show();
    }
}
