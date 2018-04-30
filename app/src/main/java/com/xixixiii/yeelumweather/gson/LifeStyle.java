package com.xixixiii.yeelumweather.gson;

import com.google.gson.annotations.SerializedName;

import org.litepal.crud.DataSupport;

/**
 * Created by xixixiii on 2018/4/29.
 */

public class LifeStyle {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public carWash carWash;

    @SerializedName("drsg")
    public DressSuggestion dressSuggestion;

    public Sport sport;

    public class Comfort {

        @SerializedName("brf")
        public String simpleInfo;

        @SerializedName("txt")
        public String info;

    }

    public class carWash {

        @SerializedName("brf")
        public String simpleInfo;

        @SerializedName("txt")
        public String info;

    }

    public class DressSuggestion {

        @SerializedName("brf")
        public String simpleInfo;

        @SerializedName("txt")
        public String info;

    }

    public class Sport {

        @SerializedName("brf")
        public String simpleInfo;

        @SerializedName("txt")
        public String info;
    }

}
