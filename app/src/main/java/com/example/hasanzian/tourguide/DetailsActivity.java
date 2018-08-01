package com.example.hasanzian.tourguide;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class DetailsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_more_details);
        ImageView imageView = findViewById(R.id.backgroundImage);
        TextView placeName = findViewById(R.id.title);
        TextView info = findViewById(R.id.description);

        YoYo.with(Techniques.SlideInLeft)
                .duration(2000).playOn(findViewById(R.id.title));

        YoYo.with(Techniques.SlideInUp)
                .duration(2700).playOn(findViewById(R.id.description));

        Bundle bundle = getIntent().getExtras();
        String titleFromList = bundle.getString(getString(R.string.t_key));
        String infoFromList = bundle.getString(getString(R.string.i_key));
        int idFromList = bundle.getInt(getString(R.string.id_image_key));

        Typeface typeface = Typeface.createFromAsset(this.getAssets(), "font/OpenSans-SemiBold.ttf");
        placeName.setTypeface(typeface);

        Typeface openSansRegular = Typeface.createFromAsset(this.getAssets(), "font/OpenSans-Regular.ttf");
        info.setTypeface(openSansRegular);

        placeName.setText(titleFromList);
        info.setText(infoFromList);
        imageView.setImageResource(idFromList);

    }


}
