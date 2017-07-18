package com.skunkworks.poloniex.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * stole on 17.07.17.
 */
public class Volume24h {
    private static final String URL = "https://poloniex.com/public?command=return24hVolume";

    @JsonProperty("volumes")
    private Map<String, Volume24hData> volumes;

    @JsonCreator
    public Volume24h(Map<String, Volume24hData> volumes) {
        this.volumes = volumes;
    }

    public Map<String, Volume24hData> getVolumes() {
        return volumes;
    }

    public void setVolumes(Map<String, Volume24hData> volumes) {
        this.volumes = volumes;
    }

    public static String getUrl() {
        return URL;
    }

    @Override
    public String toString() {
        return "Volume24h{" +
                "volumes=" + volumes +
                '}';
    }
}
