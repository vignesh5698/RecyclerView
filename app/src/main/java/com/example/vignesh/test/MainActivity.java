package com.example.vignesh.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    String[] Fname,Dname;
    int[] imgres= {R.drawable.a,R.drawable.antiviru,R.drawable.aa,R.drawable.cute,R.drawable.f0832e0dceabddcb93dbbfe142ffd3b9,
            R.drawable.group3,R.drawable.marioicon,R.drawable.sonic};
    ArrayList<DataProvider> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        arrayList=new ArrayList<DataProvider>();
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.recycler);
        Fname=getResources().getStringArray(R.array.film);
        Dname=getResources().getStringArray(R.array.director);
        int i=0;
        for (String name:Fname){
            DataProvider dataProvider=new DataProvider(imgres[i],name,Dname[i]);
            arrayList.add(dataProvider);
            i++;
        }

        adapter=new RecyclerAdapter(arrayList);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
