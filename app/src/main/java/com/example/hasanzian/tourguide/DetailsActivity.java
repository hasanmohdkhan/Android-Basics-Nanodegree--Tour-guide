package com.example.hasanzian.tourguide;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
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
                .duration(1700).playOn(findViewById(R.id.title));

        YoYo.with(Techniques.SlideInUp)
                .duration(1700).playOn(findViewById(R.id.description));

        Bundle bundle = getIntent().getExtras();
        String titleFromList = bundle.getString("T");
        String infoFromList = bundle.getString("I");
        int idFromList = bundle.getInt("ID");

        placeName.setText(titleFromList);
        info.setText(infoFromList);
        imageView.setImageResource(idFromList);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }


}
