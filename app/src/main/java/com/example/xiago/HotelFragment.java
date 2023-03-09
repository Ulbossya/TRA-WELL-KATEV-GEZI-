package com.example.xiago;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HotelFragment extends Fragment {

    public HotelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hotel, container, false);


        view.findViewById(R.id.shymkenthot).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri website = Uri.parse("https://shymkentboysktl.edupage.org/");
                Intent intent = new Intent(Intent.ACTION_VIEW, website);
                startActivity(intent);
            }
        });


        view.findViewById(R.id.almatyhot).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri website = Uri.parse("https://alkiz.edupage.org");
                Intent intent = new Intent(Intent.ACTION_VIEW, website);
                startActivity(intent);
            }
        });



        view.findViewById(R.id.burabayhot).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri website = Uri.parse("https://www.instagram.com/it_mektep/");
                Intent intent = new Intent(Intent.ACTION_VIEW, website);
                startActivity(intent);
            }
        });


        view.findViewById(R.id.turkistanhot).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri website = Uri.parse("https://2gis.kz/turkestan/search/%D0%9A%D1%82%D0%BB");
                Intent intent = new Intent(Intent.ACTION_VIEW, website);
                startActivity(intent);
            }
        });


        return view;
    }
}