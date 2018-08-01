package com.example.hasanzian.tourguide.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.hasanzian.tourguide.Adapters.TourAdaptor;
import com.example.hasanzian.tourguide.InformationDetailsActivity;
import com.example.hasanzian.tourguide.R;
import com.example.hasanzian.tourguide.datamModel.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Information about place
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
        //Jhansi info
        list.add((new Model(getString(R.string.jhansi_str), getString(R.string.place_to_visit_10), R.drawable.jhansi, 3,
                getString(R.string.jhansi_best_time_visit_str),
                getString(R.string.jhansi_str_name),
                getString(R.string.state_up_str),
                getString(R.string.peak_season_jhansi),
                getString(R.string.trip_time_1_2_days),
                getString(R.string.jhansi_weather_str))));
        //orchaa
        list.add((new Model(getString(R.string.orchha_str), getString(R.string.place_to_visit_3),
                R.drawable.orcha_place_compress, 3,
                getString(R.string.jhansi_best_time_visit_str),
                getString(R.string.nearest_city_orchha_str),
                getString(R.string.orchaa_state_str),
                getString(R.string.peak_season_orchha_str),
                getString(R.string.orchha_trip_duration),
                getString(R.string.orchha_waether_str))));
        //khajuraho
        list.add((new Model(getString(R.string.khajuraho_str), getString(R.string.place_to_visit_3), R.drawable.khujaro, 3,
                getString(R.string.khajuraho_best_time_visi_strt),
                getString(R.string.khajuraho_nearest_city_str),
                getString(R.string.khajuraho_state_str),
                getString(R.string.khajuraho_peak_season_str),
                getString(R.string.khajuraho_trip_duration),
                getString(R.string.khajuraho_weather_str))));

        //chitrakoot
        list.add((new Model(getString(R.string.chitrakoot_str), getString(R.string.place_to_visit_6), R.drawable.chiratkoot, 3,
                getString(R.string.khajuraho_best_time_visi_strt),
                getString(R.string.khajuraho_nearest_city_str),
                getString(R.string.state_up_str),
                getString(R.string.khajuraho_peak_season_str),
                getString(R.string.khajuraho_trip_duration),
                getString(R.string.khajuraho_weather_str))));

        //khajuraho repeat
        list.add((new Model(getString(R.string.khajuraho_str), getString(R.string.place_to_visit_3), R.drawable.khujaro, 3,
                getString(R.string.khajuraho_best_time_visi_strt),
                getString(R.string.khajuraho_nearest_city_str),
                getString(R.string.khajuraho_state_str),
                getString(R.string.khajuraho_peak_season_str),
                getString(R.string.khajuraho_trip_duration),
                getString(R.string.khajuraho_weather_str))));

        //Jhansi info repeat
        list.add((new Model(getString(R.string.jhansi_str), getString(R.string.place_to_visit_10), R.drawable.jhansi, 3,
                getString(R.string.jhansi_best_time_visit_str),
                getString(R.string.jhansi_str_name),
                getString(R.string.state_up_str),
                getString(R.string.peak_season_jhansi),
                getString(R.string.trip_time_1_2_days),
                getString(R.string.jhansi_weather_str))));

        final TourAdaptor adaptor = new TourAdaptor(getActivity(), list);
        listView.setAdapter(adaptor);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                Intent infoIntent = new Intent(getActivity(), InformationDetailsActivity.class);
                Model current = adaptor.getItem(position);

                infoIntent.putExtra(getString(R.string.bestTimeKey), current.getBestTimeToVisit());
                infoIntent.putExtra(getString(R.string.season_key), current.getPeakSeason());
                infoIntent.putExtra(getString(R.string.TripdurationKey), current.getTripDuration());
                infoIntent.putExtra(getString(R.string.state_key), current.getState());
                infoIntent.putExtra(getString(R.string.weather_key), current.getWeather());
                infoIntent.putExtra(getString(R.string.nearest_key), current.getNearestCity());
                infoIntent.putExtra(getString(R.string.placeNameKey), current.getPlaceName());
                infoIntent.putExtra(getString(R.string.placeImageKey), current.getImageResource());

                startActivity(infoIntent);
            }
        });

        return rootView;
    }
}
