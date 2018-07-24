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
 * Created by hasanZian on 20-07-2018.
 */

public class TabOneFragment extends Fragment{

    public TabOneFragment(){}

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tabfour, container, false);

        ListView listView = rootView.findViewById(R.id.list);
        List<Model> list = new ArrayList<>();
        list.add((new Model("Fragment","1")));
        list.add((new Model("jhansi","jhansi info")));
        list.add((new Model("jhansi","jhansi info")));
        list.add((new Model("jhansi","jhansi info")));
        list.add((new Model("jhansi","jhansi info")));
        list.add((new Model("jhansi","jhansi info")));
        TourAdaptor adaptor = new TourAdaptor(getActivity(),list);
        listView.setAdapter(adaptor);


        return rootView;
    }
}
