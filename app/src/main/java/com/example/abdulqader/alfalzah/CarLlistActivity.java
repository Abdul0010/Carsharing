package com.example.abdulqader.alfalzah;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.abdulqader.alfalzah.adapter.MyAdapter;
import com.example.abdulqader.alfalzah.data.DatabaseImp;
import com.example.abdulqader.alfalzah.model.cars;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CarLlistActivity extends AppCompatActivity {

    private static final String DATABASENAME="Rilekdatabase";
    private DatabaseImp databaseImp;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    @BindView(R.id.carlist)RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_llist);
        ButterKnife.bind(this);


        mRecyclerView.setHasFixedSize(true);
        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        List<cars> carsList= new ArrayList<>();
        databaseImp= Room.databaseBuilder(
                getApplicationContext(),
                DatabaseImp.class,
                DATABASENAME)
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration().build();
        carsList=databaseImp.database().getAllcars();
        for (int i = 0; i < carsList.size(); i++) {

        }
        mAdapter = new MyAdapter(carsList,this);
        mRecyclerView.setAdapter(mAdapter);
    }
}
