package com.example.hasanzian.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class InformationDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_details);
        TextView tripDuration = findViewById(R.id.trip_duration);
        TextView nearestCity = findViewById(R.id.nearest_city);
        TextView state = findViewById(R.id.state);
        TextView peakSeason = findViewById(R.id.peak_season);
        TextView weather = findViewById(R.id.weather);
        TextView bestTimeToVisit = findViewById(R.id.best_time_to_visit);
        TextView headerText = findViewById(R.id.headertext);
        ImageView imageView = findViewById(R.id.toolbarImage);

        Bundle bundle = getIntent().getExtras();

        String durationStr = bundle.getString(getString(R.string.TripdurationKey));
        String nearestCityStr = bundle.getString(getString(R.string.nearest_key));
        String stateStr = bundle.getString(getString(R.string.state_key));
        String peakSeasonStr = bundle.getString(getString(R.string.season_key));
        String weatherStr = bundle.getString(getString(R.string.weather_key));
        String bestTimeVisitStr = bundle.getString(getString(R.string.bestTimeKey));
        String headerStr = bundle.getString(getString(R.string.placeNameKey));
        int placeImage = bundle.getInt(getString(R.string.placeImageKey));

        tripDuration.setText(durationStr);
        nearestCity.setText(nearestCityStr);
        state.setText(stateStr);
        peakSeason.setText(peakSeasonStr);
        weather.setText(weatherStr);
        bestTimeToVisit.setText(bestTimeVisitStr);
        headerText.setText(headerStr);
        imageView.setImageResource(placeImage);
    }
}
