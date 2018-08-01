package com.example.hasanzian.tourguide.datamModel;

/**
 * This class is a pojo class.
 */
public class Model {
    private static final int NO_IMAGE_PROVIDED = -1;
    private String mPlaceName;
    private String mPlaceInfo;
    private int mImageResource = NO_IMAGE_PROVIDED;
    // 2 for food, 3 for info
    private int mFragmentCode;
    private String mBestTimeToVisit;
    private String mNearestCity;
    private String mState;
    private String mPeakSeason;
    private String mTripDuration;
    private String mWeather;


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


    public Model(String mPlaceName, String mPlaceInfo, int mImageResource, int mFragmentCode, String mBestTimeToVisit, String mNearestCity, String mState, String mPeakSeason, String mTripDuration, String mWeather) {
        this.mPlaceName = mPlaceName;
        this.mPlaceInfo = mPlaceInfo;
        this.mImageResource = mImageResource;
        this.mFragmentCode = mFragmentCode;
        this.mBestTimeToVisit = mBestTimeToVisit;
        this.mNearestCity = mNearestCity;
        this.mState = mState;
        this.mPeakSeason = mPeakSeason;
        this.mTripDuration = mTripDuration;
        this.mWeather = mWeather;
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

    public int getFragmentCode() {
        return mFragmentCode;
    }

    public String getBestTimeToVisit() {
        return mBestTimeToVisit;
    }

    public String getNearestCity() {
        return mNearestCity;
    }

    public String getState() {
        return mState;
    }

    public String getPeakSeason() {
        return mPeakSeason;
    }

    public String getTripDuration() {
        return mTripDuration;
    }

    public String getWeather() {
        return mWeather;
    }
}
