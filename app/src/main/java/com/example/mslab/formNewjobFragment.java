package com.example.mslab;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link formNewjobFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class formNewjobFragment extends Fragment {

    private TextInputLayout textInputLayout;
    private AutoCompleteTextView dropDowntext;
//    private ArrayAdapter<String> adapter;
    List<String> nama;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public formNewjobFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment formNewjobFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static formNewjobFragment newInstance(String param1, String param2) {
        formNewjobFragment fragment = new formNewjobFragment();
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
        View view = inflater.inflate(R.layout.fragment_form_newjob,container,false);

        textInputLayout = view.findViewById(R.id.text_input_layout);
        dropDowntext = view.findViewById(R.id.dropdown_text);
//        nama = new ArrayList<>();
//
//        nama.add("Yudha Islami Sulistya");
//        nama.add("Kasmira");
//        nama.add("Ikraam Ar Razaaq");
//        nama.add("Ericha Apriliyani");

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(formNewjobFragment.this, R.id.dropdown_text, nama);

        String[] items = new String[]{
                "Yudha Islami sulistya",
                "Kasmira",
                "Ericha Apriliyani",
                "Ikraam Ar Razaaq",
                "La Saiman"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(formNewjobFragment.this, R.layout.dropdown_asisten, items);

        dropDowntext.setAdapter(adapter);
        // Inflate the layout for this fragment
        return view;
    }
}