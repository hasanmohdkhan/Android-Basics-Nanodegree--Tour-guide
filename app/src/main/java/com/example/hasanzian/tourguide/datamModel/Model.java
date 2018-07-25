package com.example.hasanzian.tourguide.datamModel;

/**
 * Created by hasanZian on 21-07-2018.
 */

public class Model {
    private String mPlaceName;
    private String mPlaceInfo;
    private int mImageResource = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Model(String mPlaceName, String mPlaceInfo) {
        this.mPlaceName = mPlaceName;
        this.mPlaceInfo = mPlaceInfo;
    }

    public Model(String mPlaceName, String mPlaceInfo, int mImageResource) {
        this.mPlaceName = mPlaceName;
        this.mPlaceInfo = mPlaceInfo;
        this.mImageResource = mImageResource;
    }

    public String getPlaceName() {
        return mPlaceName;
    }

    public String getPlaceInfo() {
        return mPlaceInfo;
    }

    public int getImageResource() {
        return mImageResource;
    }

    public boolean hasImage(){
        return  mImageResource != NO_IMAGE_PROVIDED;
    }
}
