package com.example.hasanzian.tourguide.fragments;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.hasanzian.tourguide.Adapters.TourAdaptor;
import com.example.hasanzian.tourguide.DetailsActivity;
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
        final View rootView = inflater.inflate(R.layout.fragment_spot, container, false);

        ListView listView = rootView.findViewById(R.id.list);
        List<Model> list = new ArrayList<>();
        list.add((new Model(getString(R.string.orchha_str),getString(R.string.orcha_info),R.drawable.orcha_place_compress)));
        list.add((new Model(getString(R.string.jhansi_str),getString(R.string.Jhansi_info),R.drawable.jhansi)));
        list.add((new Model(getString(R.string.khajuraho_str),getString(R.string.khajuraho_info),R.drawable.khujaro)));
        list.add((new Model(getString(R.string.chitrakoot_str),getString(R.string.chittrakoot_str),R.drawable.chiratkoot)));

        final TourAdaptor adaptor = new TourAdaptor(getActivity(), list);
        listView.setAdapter(adaptor);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent detailIntent = new Intent(getContext(), DetailsActivity.class);

//                Pair<View, String>[] pairs = new Pair[1];
//
//                pairs[0] = new Pair<View, String>(rootView.findViewById(R.id.image), getString(R.string.trans_name));
//
//                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(), pairs);
//                startActivity(detailIntent, options.toBundle());

                Model current = adaptor.getItem(position);
                String title = current.getPlaceName();
                String infoPlace = current.getPlaceInfo();
                int imageId = current.getImageResource();

                detailIntent.putExtra("T", title);
                detailIntent.putExtra("I", infoPlace);
                detailIntent.putExtra("ID", imageId);

                View sharedView = rootView.findViewById(R.id.item);
                String transitionName = getString(R.string.trans_name);

                ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(getActivity(), sharedView, transitionName);
                startActivity(detailIntent, transitionActivityOptions.toBundle());


            }
        });

        return rootView;
    }
}
