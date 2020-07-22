package com.example.mslab.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mslab.Model.Home;
import com.example.mslab.R;

import java.util.ArrayList;

public class homeAdapter extends RecyclerView.Adapter<homeAdapter.MyViewHolder> {

    ArrayList<Home> dataHome;
    Context context;

    public homeAdapter(ArrayList<Home> data, Context context) {
        this.dataHome = data;
        this.context = context;
    }

    @NonNull
    @Override
    public homeAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_home, parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull homeAdapter.MyViewHolder holder, int position) {
        holder.tv1.setText(dataHome.get(position).getJudul());
        holder.tv2.setText(dataHome.get(position).getDeskripsi());

    }

    @Override
    public int getItemCount() {
        return dataHome.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv1, tv2;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv1 = itemView.findViewById(R.id.judulInfo);
            tv2 = itemView.findViewById(R.id.descInfo);
        }
    }
}
