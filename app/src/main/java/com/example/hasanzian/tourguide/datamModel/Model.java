package com.example.hasanzian.tourguide.datamModel;

/**
 * Created by hasanZian on 21-07-2018.
 */

public class Model {
    private static final int NO_IMAGE_PROVIDED = -1;
    private String mPlaceName;
    private String mPlaceInfo;
    private int mImageResource = NO_IMAGE_PROVIDED;
    // 2 for food, 3 for info
    private int mFragmentCode;

    public Model(String mPlaceName, String mPlaceInfo) {
        this.mPlaceName = mPlaceName;
        this.mPlaceInfo = mPlaceInfo;
    }

    public Model(String mPlaceName, String mPlaceInfo, int mImageResource) {
        this.mPlaceName = mPlaceName;
        this.mPlaceInfo = mPlaceInfo;
        this.mImageResource = mImageResource;
    }

    public Model(String mPlaceName, String mPlaceInfo, int mImageResource, int mFragmentCode) {
        this.mPlaceName = mPlaceName;
        this.mPlaceInfo = mPlaceInfo;
        this.mImageResource = mImageResource;
        this.mFragmentCode = mFragmentCode;
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

    public int getmFragmentCode() {
        return mFragmentCode;
    }
}
