package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {

    public String data;
    @SerializedName("tmp_max")
    public String tmpMax;
    @SerializedName("tmp_min")
    public String tmpMin;
    @SerializedName("cond_txt_d")
    public String condDay;



}
