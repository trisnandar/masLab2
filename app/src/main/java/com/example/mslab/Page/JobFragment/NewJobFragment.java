package com.example.mslab.Page.JobFragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mslab.Adapter.newJobAdapter;
import com.example.mslab.Model.Grup;
import com.example.mslab.Model.Home;
import com.example.mslab.Model.newJob;
import com.example.mslab.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NewJobFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NewJobFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter rAdapter;
    private RecyclerView.LayoutManager layoutManager;
    ArrayList<newJob> data = new ArrayList<>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public NewJobFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment NewJobFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static NewJobFragment newInstance(String param1, String param2) {
        NewJobFragment fragment = new NewJobFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_new_job,container,false);
        recyclerView = view.findViewById(R.id.recylceView);

        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        rAdapter = new newJobAdapter(data,getContext());
        recyclerView.setAdapter(rAdapter);

        data.add(new newJob("Pelabelan","Kepada setiap koordinator lab agar segera merampungkan " +
                "pendataan barang lab","2020/08/18"));
        data.add(new newJob("Adm","Pengisian berita acara agar dipercepat","2020/07/28"));
        rAdapter.notifyDataSetChanged();
        return view;
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_new_job, container, false);
    }
}