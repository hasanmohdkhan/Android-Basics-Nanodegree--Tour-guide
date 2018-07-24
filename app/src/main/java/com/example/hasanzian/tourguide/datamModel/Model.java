package com.example.hasanzian.tourguide.datamModel;

/**
 * Created by hasanZian on 21-07-2018.
 */

public class Model {
    private String mPlaceName;
    private String mPlaceInfo;

    public Model(String mPlaceName, String mPlaceInfo) {
        this.mPlaceName = mPlaceName;
        this.mPlaceInfo = mPlaceInfo;
    }

    public String getPlaceName() {
        return mPlaceName;
    }

    public String getPlaceInfo() {
        return mPlaceInfo;
    }
}
