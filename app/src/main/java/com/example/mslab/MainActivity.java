package com.example.mslab;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.mslab.Adapter.homeAdapter;
import com.example.mslab.Model.Home;
import com.example.mslab.Page.groupPage;
import com.example.mslab.Page.homePage;
import com.example.mslab.Page.profilPage;
import com.example.mslab.Page.workPage;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//    private RecyclerView recyclerView;
//    private RecyclerView.Adapter rAdapter;
//    private RecyclerView.LayoutManager layoutManager;
//    ArrayList<Home> dataHome = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        View view = inflater.inflate(R.layout.home_fragment,container,false);
//        recyclerView = view.findViewById(R.id.recylceView);
//
//        layoutManager = new LinearLayoutManager(getContext());
//        recyclerView.setLayoutManager(layoutManager);
//
//        rAdapter = new homeAdapter(dataHome,getContext());
//        recyclerView.setAdapter(rAdapter);
//
//        dataHome.add(new Home("Penerimaan Calon Asisten 2020","Jadwal penerimaan calon asisten " +
//                "labfikom umi tahun 2020, dilaksanakan pada :" +
//                "20 maret 2020" +
//                "info selengkapnya"));
//        dataHome.add(new Home("Pelabelan","Kepada setiap koordinator lab agar segera merampungkan" +
//                "pendataan barang lab"));
//        dataHome.add(new Home("Adm","Pengisian berita acara agar dipercepat"));
//        rAdapter.notifyDataSetChanged();
//        return view;

        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new homePage()).commit();
        }

        BottomNavigationView bottomNavigationView = findViewById(R.id.nav_bar);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment fragment = null;

                    switch (item.getItemId()){
                        case R.id.nav_home:
                            fragment = new homePage();
                            break;
                        case R.id.nav_grup:
                            fragment = new groupPage();
                            break;
                        case R.id.nav_work:
                            fragment = new workPage();
                            break;
                        case R.id.nav_profil:
                            fragment = new profilPage();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, fragment).commit();
                    return true;
                }
            };
}