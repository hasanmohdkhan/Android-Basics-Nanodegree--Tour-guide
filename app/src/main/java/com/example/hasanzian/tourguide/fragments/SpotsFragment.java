package com.example.hasanzian.tourguide.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.hasanzian.tourguide.Adapters.TourAdaptor;
import com.example.hasanzian.tourguide.R;
import com.example.hasanzian.tourguide.datamModel.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hasanZian on 21-07-2018.
 */

public class SpotsFragment extends Fragment{

    public SpotsFragment(){}

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_spot, container, false);

        ListView listView = rootView.findViewById(R.id.list);
        List<Model> list = new ArrayList<>();
        list.add((new Model(getString(R.string.orchha_str),getString(R.string.orcha_info),R.drawable.orcha_place_compress)));
        list.add((new Model(getString(R.string.jhansi_str),getString(R.string.Jhansi_info),R.drawable.jhansi)));
        list.add((new Model(getString(R.string.khajuraho_str),getString(R.string.khajuraho_info),R.drawable.khujaro)));
        list.add((new Model(getString(R.string.chitrakoot_str),getString(R.string.chittrakoot_str),R.drawable.chiratkoot)));

        TourAdaptor adaptor = new TourAdaptor(getActivity(),list);
        listView.setAdapter(adaptor);


        return rootView;
    }
}
