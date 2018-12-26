package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Air {

    public Basic basic;

    public Update update;

    public String status;
    @SerializedName("air_now_city")
    public AQICity aqiCity;

}
