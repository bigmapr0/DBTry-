package com.example.dbtry;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateTODO extends AppCompatActivity {

    EditText todoName;
    EditText todoPrio;
    Button addButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_todo);

        todoName = findViewById(R.id.todo_name);
        todoPrio = findViewById(R.id.todo_prio);
        addButton = findViewById(R.id.add_button);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // com.example.dbtry.Todo save to DB
            }
        });

    }
}
