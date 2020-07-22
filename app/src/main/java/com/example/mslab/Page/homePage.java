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

import com.example.mslab.Adapter.homeAdapter;
import com.example.mslab.Adapter.homeInfoAdapter;
import com.example.mslab.Model.Home;
import com.example.mslab.Model.homeInfo;
import com.example.mslab.R;

import java.util.ArrayList;

public class homePage extends Fragment {

    private RecyclerView recyclerView1, recyclerView2;
    private RecyclerView.Adapter rAdapter, rAdapter2;
    private RecyclerView.LayoutManager layoutManager;
    ArrayList<Home> dataHome = new ArrayList<>();
    ArrayList<homeInfo> data = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment,container,false);
        recyclerView2 = view.findViewById(R.id.recylceView2);
//        recyclerView1 = view.findViewById(R.id.recylceView1);

        layoutManager = new LinearLayoutManager(getContext());
        recyclerView2.setLayoutManager(layoutManager);
//        recyclerView1.setLayoutManager(layoutManager);

        rAdapter = new homeAdapter(dataHome,getContext());
//        rAdapter2 = new homeInfoAdapter(data,getContext());

        recyclerView2.setAdapter(rAdapter);
//        recyclerView1.setAdapter(rAdapter2);

        dataHome.add(new Home("Penerimaan Calon Asisten 2020","Jadwal penerimaan calon asisten " +
                "labfikom umi tahun 2020, dilaksanakan pada :" +
                "20 maret 2020" +
                "info selengkapnya"));
        dataHome.add(new Home("Pelabelan","Kepada setiap koordinator lab agar segera merampungkan" +
                "pendataan barang lab"));
        dataHome.add(new Home("Adm","Pengisian berita acara agar dipercepat"));
        rAdapter.notifyDataSetChanged();

//        data.add(new homeInfo(R.mipmap.coolhue));
//        data.add(new homeInfo(R.mipmap.iclabiru));
//        rAdapter2.notifyDataSetChanged();
        return view;
    }
}
