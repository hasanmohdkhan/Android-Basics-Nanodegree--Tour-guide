package com.example.hasanzian.tourguide.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.hasanzian.tourguide.Adapters.TourAdaptor;
import com.example.hasanzian.tourguide.R;
import com.example.hasanzian.tourguide.datamModel.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Direction Fragment
 */

public class DirectionFragment extends Fragment {

    public DirectionFragment() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_spot, container, false);

        ListView listView = rootView.findViewById(R.id.list);
        List<Model> list = new ArrayList<>();
        list.add((new Model(getString(R.string.jhansi_str_name), getString(R.string.click_to_view_map_str), R.drawable.jhansi_map, 2)));
        list.add((new Model(getString(R.string.orchha_str), getString(R.string.click_to_view_map_str), R.drawable.orchaa_map, 2)));
        list.add((new Model(getString(R.string.khajuraho_str), getString(R.string.click_to_view_map_str), R.drawable.khujaraho_map, 2)));
        list.add((new Model(getString(R.string.chitrakoot_str), getString(R.string.click_to_view_map_str), R.drawable.chitrakoot_map, 2)));

        TourAdaptor adaptor = new TourAdaptor(getActivity(),list);
        listView.setAdapter(adaptor);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    String str_location = getString(R.string.jhansi_str_name);
                    String map = getString(R.string.urlformap) + str_location;
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                    startActivity(i);
                }
                if (position == 1) {
                    String str_location = getString(R.string.orchha_str);
                    String map = getString(R.string.urlformap) + str_location;
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                    startActivity(i);
                }

                if (position == 2) {
                    String str_location = getString(R.string.khajuraho_str);
                    String map = getString(R.string.urlformap) + str_location;
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                    startActivity(i);
                }
                if (position == 3) {
                    String str_location = getString(R.string.chitrakoot_str);
                    String map = getString(R.string.urlformap) + str_location;
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                    startActivity(i);
                }
            }
        });


        return rootView;

    }
}
