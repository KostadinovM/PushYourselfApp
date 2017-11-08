package com.example.user.andproject;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Schedule extends AppCompatActivity {

    Toolbar toolbar;
    TextView textIfEmpty;
    DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.appBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeAsUpIndicator(R.mipmap.ic_dehaze_white_24dp);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        textIfEmpty = (TextView) findViewById(R.id.textIfEmpty);


        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView n = (NavigationView) findViewById(R.id.navigation);
        n.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.drawer_menu_settings:
                        Toast.makeText(Schedule.this, "Settings", Toast.LENGTH_SHORT).show();

                }
                mDrawerLayout.closeDrawers();  // CLOSE DRAWER
                return true;
            }
        });


        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_exercises:
                                Toast.makeText(Schedule.this, "Exercises", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.action_schedules:
                                Toast.makeText(Schedule.this, "Schedule", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.action_achievements:
                                Toast.makeText(Schedule.this, "Achivements", Toast.LENGTH_SHORT).show();
                                break;
                        }
                        return false;
                    }
                });

        final ArrayList<Exercises> arrayList = new ArrayList<>();
        arrayList.add(new Exercises(R.drawable.plank, "Plank"));
        ExercisesAdapter exercisesAdapter = new ExercisesAdapter(this, arrayList);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(exercisesAdapter);
        if(arrayList.size()==0)
        {
            textIfEmpty.setText("No added exercises to the schedule");
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            // THIS IS YOUR DRAWER/HAMBURGER BUTTON
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);  // OPEN DRAWER
                return true;

        }
        return super.onOptionsItemSelected(item);
    }

}
