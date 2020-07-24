package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    List<FoodData> myFoodList;
    FoodData mFoodData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this,1);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        myFoodList = new ArrayList<>();

        mFoodData = new FoodData("Ayam Tangkap","Ini Ayam Tangkap",R.drawable.ayam_tangkap);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Mie Aceh","Ini Mie Aceh",R.drawable.mie_aceh);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Karee Kameng","Ini Karee Kameng",R.drawable.karee_kameng);
        myFoodList.add(mFoodData);

        MyAdapter myAdapter = new MyAdapter(MainActivity.this,myFoodList);
        mRecyclerView.setAdapter(myAdapter);
    }
}
