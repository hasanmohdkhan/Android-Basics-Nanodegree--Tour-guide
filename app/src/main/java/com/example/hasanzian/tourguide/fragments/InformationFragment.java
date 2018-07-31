package com.example.hasanzian.tourguide.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.hasanzian.tourguide.Adapters.TourAdaptor;
import com.example.hasanzian.tourguide.R;
import com.example.hasanzian.tourguide.datamModel.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hasanZian on 20-07-2018.
 */

public class InformationFragment extends Fragment {

    public InformationFragment() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_info, container, false);

        GridView listView = rootView.findViewById(R.id.list);
        List<Model> list = new ArrayList<>();
        list.add((new Model(getString(R.string.jhansi_str), "10 place to visit", R.drawable.jhansi, 3)));
        list.add((new Model(getString(R.string.orchha_str), "3 place to visit", R.drawable.orcha_place_compress, 3)));
        list.add((new Model(getString(R.string.khajuraho_str), "3 place to visit", R.drawable.khujaro, 3)));
        list.add((new Model(getString(R.string.chitrakoot_str), "6 place to visit", R.drawable.chiratkoot, 3)));
        list.add((new Model(getString(R.string.khajuraho_str), "3 place to visit", R.drawable.safari, 3)));
        list.add((new Model(getString(R.string.chitrakoot_str), "6 place to visit", R.drawable.temple, 3)));
        TourAdaptor adaptor = new TourAdaptor(getActivity(),list);
        listView.setAdapter(adaptor);


        return rootView;
    }
}
