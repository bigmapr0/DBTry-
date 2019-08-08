package com.example.dbtry;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

class TODOAdapter extends RecyclerView.Adapter<TODOAdapter.ViewHolder> {

    ArrayList<Todo> todos;

    public TODOAdapter(ArrayList<Todo> todos) {
        this.todos = todos;
    }

    @NonNull
    @Override
    public TODOAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.todo_row, viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TODOAdapter.ViewHolder viewHolder, int i) {
        viewHolder.todoPrio.setText(Integer.toString(todos.get(i).getTodoPrio()));
        viewHolder.todoName.setText(todos.get(i).getTodoName());


    }

    @Override
    public int getItemCount() {
        return todos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView todoPrio;
        public TextView todoName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            todoPrio = itemView.findViewById(R.id.todo_prio);
            todoName = itemView.findViewById(R.id.todo_name);
        }
    }
}
