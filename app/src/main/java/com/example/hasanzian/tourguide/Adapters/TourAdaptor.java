package com.example.hasanzian.tourguide.Adapters;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.hasanzian.tourguide.R;
import com.example.hasanzian.tourguide.datamModel.Model;

import java.util.List;

/**
 * Created by hasan Zian on 21-07-2018.
 */

public class TourAdaptor extends ArrayAdapter<Model> {

    static class ViewHolder {
        private TextView placeName;
        private TextView info;
        private ImageView imageView;

    }


    public TourAdaptor(@NonNull Context context , @NonNull List<Model> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
      View listItemView = convertView;
      ViewHolder holder;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_image_w_text, parent, false);
            holder = new ViewHolder();
            holder.placeName = listItemView.findViewById(R.id.main_tx);
            holder.info = listItemView.findViewById(R.id.sub_tx);
            holder.imageView = listItemView.findViewById(R.id.image);
            listItemView.setTag(holder);
        } else {
            holder = (ViewHolder) listItemView.getTag();
        }

        Model current = getItem(position);


        Typeface typeface = Typeface.createFromAsset(getContext().getAssets(), "font/OpenSans-SemiBold.ttf");
        holder.placeName.setTypeface(typeface);

        Typeface openSansRegular = Typeface.createFromAsset(getContext().getAssets(), "font/OpenSans-Regular.ttf");
        holder.info.setTypeface(openSansRegular);

        holder.placeName.setText(current.getPlaceName());
        holder.info.setText(current.getPlaceInfo());



        if(current.hasImage()){
            Glide.with(getContext()).load(current.getImageResource()).into(holder.imageView);
            holder.imageView.setVisibility(View.VISIBLE);
        }

        else {
            holder.imageView.setVisibility(View.GONE);
        }
      return listItemView;
    }
}
