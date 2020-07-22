package com.example.mslab.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mslab.Model.homeInfo;
import com.example.mslab.R;

import java.util.ArrayList;

public class homeInfoAdapter extends RecyclerView.Adapter<homeInfoAdapter.MyViewHolder> {

    ArrayList<homeInfo> data;
    Context context;

    public homeInfoAdapter(ArrayList<homeInfo> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public homeInfoAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_infohome, parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull homeInfoAdapter.MyViewHolder holder, int position) {
        holder.img.setImageResource(data.get(position).getImg());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.imageInfo);
        }
    }
}
