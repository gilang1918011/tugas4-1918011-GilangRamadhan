package com.example.pertemuan4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.pertemuan4.R;
import com.example.pertemuan4.item;
import com.example.pertemuan4.itemAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private itemAdapter adapter;
    private ArrayList<item> itemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = (RecyclerView) findViewById(R.id.recycleview);
        adapter = new itemAdapter(itemArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        itemArrayList = new ArrayList<>();
        itemArrayList.add(new item("Chicago Bulls", "NBA", "Lonzo Ball",R.drawable.CB));
        itemArrayList.add(new item("Golden State Bulls", "NBA", "Steph Curry",R.drawable.GSW));
        itemArrayList.add(new item("Los Angles", "NBA", "Lebron James",R.drawable.LA));
        itemArrayList.add(new item("Miami Heat", "NBA", "Butler",R.drawable.MH));
        itemArrayList.add(new item("Toronto Raptors", "NBA", "Siakam",R.drawable.TP));
        itemArrayList.add(new item("Utah Jazz", "NBA", "Clarkson",R.drawable.UJ));
        itemArrayList.add(new item("Clippers", "NBA", "Leonard",R.drawable.clipers));
    }
}
