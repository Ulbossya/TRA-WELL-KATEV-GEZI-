package com.example.xiago;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MallFragment extends Fragment {


    public MallFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mall, container, false);

        view.findViewById(R.id.bumall).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri website = Uri.parse("https://instagram.com/burabai_mall?igshid=YmMyMTA2M2Y=");
                Intent intent = new Intent(Intent.ACTION_VIEW, website);
                startActivity(intent);
            }
        });

        view.findViewById(R.id.shymma).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri website = Uri.parse("https://instagram.com/shymkentplaza?igshid=YmMyMTA2M2Y=");
                Intent intent = new Intent(Intent.ACTION_VIEW, website);
                startActivity(intent);
            }
        });


        view.findViewById(R.id.almama).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri website = Uri.parse("https://instagram.com/mega_center?igshid=YmMyMTA2M2Y=");
                Intent intent = new Intent(Intent.ACTION_VIEW, website);
                startActivity(intent);
            }
        });

        return view;
    }
}