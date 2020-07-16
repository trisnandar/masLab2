package com.example.mslab.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mslab.Model.prosesJob;
import com.example.mslab.R;

import java.util.ArrayList;

public class prosesJobAdapter extends RecyclerView.Adapter<prosesJobAdapter.MyViewHolder>{
    ArrayList<prosesJob> data;
    Context context;

    public prosesJobAdapter(ArrayList<prosesJob> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public prosesJobAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_prosesjob, parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull prosesJobAdapter.MyViewHolder holder, int position) {
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

            tv1 = itemView.findViewById(R.id.judulJob);
            tv2 = itemView.findViewById(R.id.descJob);
            tv3 = itemView.findViewById(R.id.progres);

        }
    }
}
