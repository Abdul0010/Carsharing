package com.example.abdulqader.alfalzah;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.navigation);
     //   bottomNavigationView.setVisibility(View.GONE);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                selectFragment(item);

//                switch (item.getItemId()){
//
//                    case R.id.action_item1:
//                        fra1 selectedFragment = null;
//
//                        selectedFragment = fra1.newInstance();
//                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//                        transaction.replace(R.id.frame_layout, selectedFragment);
//                        transaction.commit();
//                        break;
//                    case R.id.action_item2:
//                        fra2 selectedFragment2 = null;
//                         selectedFragment2= fra2.newInstance();
//                        FragmentTransaction transaction2 = getSupportFragmentManager().beginTransaction();
//                        transaction2.replace(R.id.frame_layout, selectedFragment2);
//                        transaction2.commit();
//                        break;
//                    case R.id.action_item3:
//                        fra3 selectedFragment3 = null;
//
//                        selectedFragment3 = fra3.newInstance();
//                        FragmentTransaction transaction3 = getSupportFragmentManager().beginTransaction();
//                        transaction3.replace(R.id.frame_layout, selectedFragment3);
//                        transaction3.commit();
//                        break;
                //}

                return false;            }
        });
    }
    protected void selectFragment(MenuItem item) {

        item.setChecked(true);

        switch (item.getItemId()) {
            case R.id.action_item1:
                // Action to perform when Home Menu item is selected.
                pushFragment(new fra1());
                break;
            case R.id.action_item2:
                // Action to perform when Bag Menu item is selected.
                pushFragment(new fra2());
                break;
            case R.id.action_item3:
                // Action to perform when Account Menu item is selected.
                pushFragment(new fra3());
                break;
        }



    }



    protected void pushFragment(Fragment fragment) {

        if (1 == 2) {
            Toast.makeText(this, "Login Required", Toast.LENGTH_SHORT).show();
        } else {
            if (fragment == null)
                return;

            FragmentManager fragmentManager = getFragmentManager();
            if (fragmentManager != null) {
                android.app.FragmentTransaction ft = fragmentManager.beginTransaction();
                if (ft != null) {
                    ft.replace(R.id.frame_layout, fragment);
                    ft.commit();
                }
            }
        }
    }

}
