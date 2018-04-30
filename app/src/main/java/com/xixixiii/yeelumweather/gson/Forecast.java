package com.xixixiii.yeelumweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xixixiii on 2018/4/29.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp_max")
    public String max;

    @SerializedName("tmp_min")
    public String min;

    @SerializedName("cond_txt_d")
    public String info;

}
