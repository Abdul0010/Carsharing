package com.example.abdulqader.alfalzah.data;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;
import com.example.abdulqader.alfalzah.model.cars;

import java.net.CacheRequest;
import java.util.List;

@Dao
public interface DatabaseInterface {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void InsertCarsDetails(cars profile);

    @Query("Select * from cars where id =:id")
    cars getCardetails(int id);

    @Query("Select * from cars")
    List<cars> getAllcars();
    @Update
    void updateProfileDetails(cars car);


}
