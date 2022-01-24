package com.example.a2lesson4.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.a2lesson4.model.TaskModel;

@Database(entities = {TaskModel.class}, version = 1)
public abstract class AppDataBase extends RoomDatabase {
    public abstract TaskDao taskDao();
}