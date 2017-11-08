package com.example.user.andproject;

import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.R.id.list;

public class ExercisesList extends AppCompatActivity {

    ListView list;
    String[] web = {
            "Bicycle Crunch",
            "Vaunch",
            "Reverse Crunch",

    } ;
    Integer[] imageId = {
            R.drawable.bicycle_crunch,
            R.drawable.vaunch,
            R.drawable.reverse_crunch,


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises_list);

        CustomList adapter = new
                CustomList(ExercisesList.this, web, imageId);
        list=(ListView)findViewById(R.id.exerciselist_view);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(ExercisesList.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });


        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavbar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);

    }


}
