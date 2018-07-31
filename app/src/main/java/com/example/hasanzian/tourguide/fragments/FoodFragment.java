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

public class FoodFragment extends Fragment {
    public FoodFragment() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_food, container, false);

        ListView listView = rootView.findViewById(R.id.list);
        List<Model> list = new ArrayList<>();
        list.add((new Model(getString(R.string.haveli_restaurant_str), getString(R.string.haveli_address_str), R.drawable.haveli, 2)));
        list.add((new Model(getString(R.string.baker_factory_str), getString(R.string.baker_factory_address_str), R.drawable.baker, 2)));
        list.add((new Model(getString(R.string.ramraja_str), getString(R.string.ramraja_address_str), R.drawable.rajaram, 2)));
        list.add((new Model(getString(R.string.safari_str), getString(R.string.safari_address_str), R.drawable.safari, 2)));
        list.add((new Model(getString(R.string.temple_str), getString(R.string.temple_address_str), R.drawable.temple, 2)));

        TourAdaptor adaptor = new TourAdaptor(getActivity(),list);
        listView.setAdapter(adaptor);


        return rootView;
    }
}
