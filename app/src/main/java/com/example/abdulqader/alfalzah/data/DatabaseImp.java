package com.example.abdulqader.alfalzah.data;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.abdulqader.alfalzah.model.cars;

@Database(entities = {cars.class},version = 2,exportSchema = false)
public abstract class DatabaseImp extends RoomDatabase {
    public abstract DatabaseInterface database();
}
