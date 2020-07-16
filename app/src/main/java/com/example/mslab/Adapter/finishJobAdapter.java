package com.example.mslab.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mslab.Model.finishJob;
import com.example.mslab.R;

import java.util.ArrayList;

public class finishJobAdapter extends RecyclerView.Adapter<finishJobAdapter.MyViewHolder>{
    ArrayList<finishJob> data;
    Context context;

    public finishJobAdapter(ArrayList<finishJob> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public finishJobAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_finishjob, parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull finishJobAdapter.MyViewHolder holder, int position) {
        holder.tv1.setText(data.get(position).getJudul());
        holder.tv2.setText(data.get(position).getDeskripsi());
        holder.tv3.setText(data.get(position).getProgres());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv1, tv2, tv3;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv1 = itemView.findViewById(R.id.titleJob);
            tv2 = itemView.findViewById(R.id.desJob);
            tv3 = itemView.findViewById(R.id.progress);

        }
    }
}
