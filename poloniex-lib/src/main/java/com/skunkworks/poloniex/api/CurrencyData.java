package com.skunkworks.poloniex.api;

/**
 * stole on 18.07.17.
 */
public class CurrencyData {
    private int id;
    private String name;
    private String txFee;
    private int minConf;
    private String depositAddress;
    private boolean disabled;
    private boolean delisted;
    private boolean frozen;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTxFee() {
        return txFee;
    }

    public void setTxFee(String txFee) {
        this.txFee = txFee;
    }

    public int getMinConf() {
        return minConf;
    }

    public void setMinConf(int minConf) {
        this.minConf = minConf;
    }

    public String getDepositAddress() {
        return depositAddress;
    }

    public void setDepositAddress(String depositAddress) {
        this.depositAddress = depositAddress;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public boolean isDelisted() {
        return delisted;
    }

    public void setDelisted(boolean delisted) {
        this.delisted = delisted;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public void setFrozen(boolean frozen) {
        this.frozen = frozen;
    }

    @Override
    public String toString() {
        return "CurrencyData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", txFee='" + txFee + '\'' +
                ", minConf=" + minConf +
                ", depositAddress='" + depositAddress + '\'' +
                ", disabled=" + disabled +
                ", delisted=" + delisted +
                ", frozen=" + frozen +
                '}';
    }
}
