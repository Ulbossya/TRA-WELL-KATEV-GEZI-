package com.example.xiago;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RestaurantFragment extends Fragment {

    public RestaurantFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_restaurant, container, false);



        view.findViewById(R.id.sandyqshym).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri website = Uri.parse("https://instagram.com/sandyq_restaurant?igshid=YmMyMTA2M2Y=");
                Intent intent = new Intent(Intent.ACTION_VIEW, website);
                startActivity(intent);
            }
        });



        view.findViewById(R.id.sandyqalmat).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri website = Uri.parse("https://instagram.com/sandyq_restaurant?igshid=YmMyMTA2M2Y=");
                Intent intent = new Intent(Intent.ACTION_VIEW, website);
                startActivity(intent);
            }
        });
        view.findViewById(R.id.cafeasia).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri website = Uri.parse("https://instagram.com/asia_burabai_mall?igshid=YmMyMTA2M2Y=");
                Intent intent = new Intent(Intent.ACTION_VIEW, website);
                startActivity(intent);
            }
        });


        view.findViewById(R.id.sandyqturkistan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri website = Uri.parse("https://instagram.com/sandyq_restaurant?igshid=YmMyMTA2M2Y=");
                Intent intent = new Intent(Intent.ACTION_VIEW, website);
                startActivity(intent);
            }
        });


        return view;

    }
}