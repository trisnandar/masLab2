package com.example.mslab.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mslab.Model.Grup;
import com.example.mslab.R;

import java.util.ArrayList;

public class grupAdapter extends RecyclerView.Adapter<grupAdapter.MyViewHolder>{
    ArrayList<Grup> data;
    Context context;

    public grupAdapter(ArrayList<Grup> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public grupAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_grup, parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull grupAdapter.MyViewHolder holder, int position) {
        holder.img.setImageResource(data.get(position).getFoto());
        holder.tv1.setText(data.get(position).getNamaAs());
        holder.tv1.setText(data.get(position).getIdAs());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView tv1, tv2;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.foto);
            tv1 = itemView.findViewById(R.id.namaAsisten);
            tv2 = itemView.findViewById(R.id.idAsisten);

        }
    }
}
