package com.example.hasanzian.tourguide.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.hasanzian.tourguide.R;
import com.example.hasanzian.tourguide.datamModel.Model;

import java.util.List;

/**
 * Created by hasan Zian on 21-07-2018.
 */

public class TourAdaptor extends ArrayAdapter<Model> {


    public TourAdaptor(@NonNull Context context , @NonNull List<Model> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
      View listItemView = convertView;

      if(listItemView == null){
         listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);

      }

      Model current = getItem(position);
        TextView placeName  = listItemView.findViewById(R.id.place_name_tv);
        TextView info = listItemView.findViewById(R.id.place_info_tv);
        placeName.setText(current.getPlaceName());
        info.setText(current.getPlaceInfo());

        return listItemView;
    }
}
