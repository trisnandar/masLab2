package com.example.mslab.Page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mslab.Model.Grup;
import com.example.mslab.R;
import com.example.mslab.Adapter.grupAdapter;

import java.util.ArrayList;

public class groupPage extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter rAdapter;
    private RecyclerView.LayoutManager layoutManager;
    ArrayList<Grup> data = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.group_fragment,container,false);
        recyclerView = view.findViewById(R.id.recylceView);

        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        rAdapter = new grupAdapter(data,getContext());
        recyclerView.setAdapter(rAdapter);

        data.add(new Grup(R.mipmap.man,"Yudha Islami Sulistya","Iclabs.2017.0007"));
        data.add(new Grup(R.mipmap.woman,"Kasmira","Iclabs.2017.0010"));
        data.add(new Grup(R.mipmap.man,"Ikraam Ar Razaaq","Iclabs.2017.0013"));
        data.add(new Grup(R.mipmap.woman,"Erika Apriliyani","Iclabs.2017.0015"));
        data.add(new Grup(R.mipmap.woman,"Nurul A'ayunisa","Iclabs.2017.0008"));
        data.add(new Grup(R.mipmap.man,"Taufik Baharsyah","Iclabs.2017.0002"));
        data.add(new Grup(R.mipmap.man,"La Saiman","Iclabs.2017.0005"));
        rAdapter.notifyDataSetChanged();
        return view;

    }
}
