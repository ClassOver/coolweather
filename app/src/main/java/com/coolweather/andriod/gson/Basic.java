package com.coolweather.andriod.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/12/7.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }
}
