package com.example.dbtry;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Todo {
    public Todo(int todoPrio, String todoName) {
        this.todoPrio = todoPrio;
        this.todoName = todoName;
    }

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "todo_prio")
    private int todoPrio;

    @ColumnInfo(name = "todo_name")
    private String todoName;

    public int getId() {
        return id;
    }

    public int getTodoPrio() {
        return todoPrio;
    }

    public String getTodoName() {
        return todoName;
    }
}
