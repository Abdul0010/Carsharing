package com.example.abdulqader.alfalzah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SearchActivity extends AppCompatActivity {
    private MaterialBetterSpinner spinner;
    private static final String[] paths = {"المكلا", "الديس","تريم","سيون" ,"الحامي"};
    MaterialBetterSpinner materialBetterSpinner ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ButterKnife.bind(this);
        spinner = (MaterialBetterSpinner)findViewById(R.id.material_spinner2);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SearchActivity.this,
                android.R.layout.simple_dropdown_item_1line,paths);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        materialBetterSpinner = (MaterialBetterSpinner)findViewById(R.id.material_spinner1);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(SearchActivity.this, android.R.layout.simple_dropdown_item_1line, paths);

        materialBetterSpinner.setAdapter(adapter2);
       // spinner.setOnItemSelectedListener(SearchActivity.this);
    }

    @OnClick(R.id.search)
    public void search(){

        Intent intent= new Intent(SearchActivity.this,CarLlistActivity.class);
        startActivity(intent);
    }
}
