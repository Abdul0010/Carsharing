package com.example.abdulqader.alfalzah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.BindView;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);



    }
    @OnClick(R.id.driver)
    public void Driver(){
        Intent intent=new Intent(HomeActivity.this,AddCarActivity.class);
        startActivity(intent);

    }

    @OnClick(R.id.passangers)
    public void passangers(){

        Intent intent=new Intent(HomeActivity.this,SearchActivity.class);
        startActivity(intent);
    }
}
