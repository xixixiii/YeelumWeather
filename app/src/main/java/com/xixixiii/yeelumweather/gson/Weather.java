package com.xixixiii.yeelumweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by xixixiii on 2018/4/29.
 */

public class Weather {

    public String status;

    public Basic basic;

    public Update update;

    public Now now;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
