package com.skunkworks.poloniex.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * stole on 18.07.17.
 */
public class Currencies {
    private static final String URL = "https://poloniex.com/public?command=returnCurrencies";
    @JsonProperty("currencies")
    private Map<String, CurrencyData> currencies;

    @JsonCreator
    public Currencies(Map<String, CurrencyData> currencies) {
        this.currencies = currencies;
    }

    public Map<String, CurrencyData> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(Map<String, CurrencyData> currencies) {
        this.currencies = currencies;
    }

    public static String getUrl() {
        return URL;
    }

    @Override
    public String toString() {
        return "Currencies{" +
                "currencies=" + currencies +
                '}';
    }
}
