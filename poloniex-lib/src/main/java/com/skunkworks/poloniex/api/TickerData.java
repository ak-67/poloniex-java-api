package com.skunkworks.poloniex.api;

import java.math.BigDecimal;

/**
 * stole on 16.07.17.
 */
public class TickerData {
    private int id;
    private String last;
    private String lowestAsk;
    private String highestBid;
    private String percentChange;
    private String baseVolume;
    private String quoteVolume;
    private boolean isFrozen;
    private String high24hr;
    private String low24hr;

    private BigDecimal lastBD;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getLowestAsk() {
        return lowestAsk;
    }

    public void setLowestAsk(String lowestAsk) {
        this.lowestAsk = lowestAsk;
    }

    public String getHighestBid() {
        return highestBid;
    }

    public void setHighestBid(String highestBid) {
        this.highestBid = highestBid;
    }

    public String getPercentChange() {
        return percentChange;
    }

    public void setPercentChange(String percentChange) {
        this.percentChange = percentChange;
    }

    public String getBaseVolume() {
        return baseVolume;
    }

    public void setBaseVolume(String baseVolume) {
        this.baseVolume = baseVolume;
    }

    public String getQuoteVolume() {
        return quoteVolume;
    }

    public void setQuoteVolume(String quoteVolume) {
        this.quoteVolume = quoteVolume;
    }

    public boolean isFrozen() {
        return isFrozen;
    }

    public void setFrozen(boolean frozen) {
        isFrozen = frozen;
    }

    public String getHigh24hr() {
        return high24hr;
    }

    public void setHigh24hr(String high24hr) {
        this.high24hr = high24hr;
    }

    public String getLow24hr() {
        return low24hr;
    }

    public void setLow24hr(String low24hr) {
        this.low24hr = low24hr;
    }

    public BigDecimal getLastBD() {
        if (lastBD == null) {
            lastBD = new BigDecimal(last);
        }
        return lastBD;
    }

    @Override
    public String toString() {
        return "TickerData{" +
                "id=" + id +
                ", last='" + last + '\'' +
                ", lowestAsk='" + lowestAsk + '\'' +
                ", highestBid='" + highestBid + '\'' +
                ", percentChange='" + percentChange + '\'' +
                ", baseVolume='" + baseVolume + '\'' +
                ", quoteVolume='" + quoteVolume + '\'' +
                ", isFrozen=" + isFrozen +
                ", high24hr='" + high24hr + '\'' +
                ", low24hr='" + low24hr + '\'' +
                '}';
    }
}
