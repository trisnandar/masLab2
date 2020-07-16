package com.example.mslab.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mslab.Model.newJob;
import com.example.mslab.R;

import java.util.ArrayList;

public class newJobAdapter extends RecyclerView.Adapter<newJobAdapter.MyViewHolder> {

    ArrayList<newJob> data;
    Context context;

    public newJobAdapter(ArrayList<newJob> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public newJobAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_newjob_asisten, parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull newJobAdapter.MyViewHolder holder, int position) {
        holder.tv1.setText(data.get(position).getJudul());
        holder.tv2.setText(data.get(position).getDeskripsi());
        holder.tv3.setText(data.get(position).getDeadline());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv1, tv2, tv3;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv1 = itemView.findViewById(R.id.namaTugas);
            tv2 = itemView.findViewById(R.id.descTugas);
            tv3 = itemView.findViewById(R.id.deadline);
        }
    }
}
