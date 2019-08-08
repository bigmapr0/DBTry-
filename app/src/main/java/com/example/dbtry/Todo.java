package com.example.dbtry;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Todo {
    public Todo(String todoPrio, String todoName) {
        this.todoPrio = todoPrio;
        this.todoName = todoName;
    }

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "todo_prio")
    private String todoPrio;

    @ColumnInfo(name = "todo_name")
    private String todoName;

    public int getId() {
        return id;
    }

    public String getTodoPrio() {
        return todoPrio;
    }

    public String getTodoName() {
        return todoName;
    }

    public void setId(int id) {
        this.id = id;
    }
}
