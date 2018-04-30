package com.xixixiii.yeelumweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xixixiii on 2018/4/29.
 */

public class Now {

//    @SerializedName("fl")
//    public String feelsLike;

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond_txt")
    public String info;

}
