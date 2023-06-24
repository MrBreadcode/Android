package com.example.labb1;

import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class Fragment_Armentrout_2016 extends Fragment {

    private ImageView image1;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.fragment_armentrout_2016);
        image1 = (ImageView) image1.findViewById(R.id.armentrout_2016);
        image1.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.armentrout_2016));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_armentrout_2016, container, false);
    }
}