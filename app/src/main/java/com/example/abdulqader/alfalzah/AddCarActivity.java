package com.example.abdulqader.alfalzah;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.abdulqader.alfalzah.data.DatabaseImp;

import butterknife.BindView;
import fr.ganfra.materialspinner.MaterialSpinner;

public class AddCarActivity extends AppCompatActivity {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Button time;
    @BindView(R.id.name)EditText name;
    @BindView(R.id.number)EditText no_of_seats;
    @BindView(R.id.in_time)EditText moving_time;
    @BindView(R.id.in_date)EditText moving_date;
    @BindView(R.id.charge)EditText charges;
    @BindView(R.id.contact)EditText contact;
    @BindView(R.id.from)MaterialSpinner from;
    @BindView(R.id.to)MaterialSpinner to_des;
    @BindView(R.id.add)Button add;
    private static final String DATABASENAME="Rilekdatabase";

    private DatabaseImp databaseImp;
    private int mYear, mMonth, mDay, mHour, mMinute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


}
