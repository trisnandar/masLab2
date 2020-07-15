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

        data.add(new Grup(R.mipmap.iclabbbiru,"dd","dd"));
        data.add(new Grup(R.mipmap.iclabbbiru,"dd","dd"));
        data.add(new Grup(R.drawable.ic_home,"dd","dd"));
        rAdapter.notifyDataSetChanged();
        return view;

    }
}
