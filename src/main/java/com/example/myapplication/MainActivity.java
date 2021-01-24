package com.example.myapplication;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.telecom.Call;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.List;

import android.widget.ListAdapter;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;


public class MainActivity extends AppCompatActivity {
    private List<Group> groupList = new ArrayList<>();





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initGroups();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        GroupAdapter adapter = new GroupAdapter(groupList);
        recyclerView.setAdapter(adapter);



    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_group:
                Toast.makeText(this,"",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, AddActivity.class);
                startActivity(intent);
                MainActivity.this.finish();
                break;
            case R.id.delete_group:
                Toast.makeText(this,"",Toast.LENGTH_SHORT).show();
                break;
            case R.id.out_group:
                Toast.makeText(this,"",Toast.LENGTH_SHORT).show();
                break;
                default:
        }
        return true;
    }


    private void initGroups(){
        Group group1 = new Group("Group1","Founder1",R.drawable.p_1);
        groupList.add(group1);
        Group group2 = new Group("Group2","Founder2",R.drawable.p_2);
        groupList.add(group2);
        Group group3 = new Group("Group3","Founder3",R.drawable.p_3);
        groupList.add(group3);
        Group group4 = new Group("Group4","Founder4",R.drawable.p_4);
        groupList.add(group4);


    }





}