package com.example.dbtry;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

class TODOAdapter extends RecyclerView.Adapter<TODOAdapter.ViewHolder> {

    List<Todo> todos;

    public TODOAdapter(List<Todo> todos) {
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
        viewHolder.todoPrio.setText(todos.get(i).getTodoPrio());
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
