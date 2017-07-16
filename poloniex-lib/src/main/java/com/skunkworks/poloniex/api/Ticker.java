package com.skunkworks.poloniex.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * stole on 16.07.17.
 */
public class Ticker {
    public static final String URL = "https://poloniex.com/public?command=returnTicker";

    @JsonProperty("coinPairs")
    private Map<String, TickerData> coinPairs;

    @JsonCreator
    public Ticker(Map<String, TickerData> coinPairs) {
        this.coinPairs = coinPairs;
    }

    public Map<String, TickerData> getCoinPairs() {
        return coinPairs;
    }

    public void setCoinPairs(Map<String, TickerData> coinPairs) {
        this.coinPairs = coinPairs;
    }

    @Override
    public String toString() {
        return "Ticker{" +
                "coinPairs=" + coinPairs +
                '}';
    }
}
