package com.sv15.cryptomarket;

/**
 * Created by Dell on 03-Feb-18.
 */

public class List_Item {
    private String coin_name;
    private String coin_rate;
    private String coin_change;

    public List_Item(String coin_name, String coin_rate, String coin_change) {
        this.coin_name = coin_name;
        this.coin_rate = coin_rate;
        this.coin_change = coin_change;
    }

    public String getCoin_name() {
        return coin_name;
    }

    public String getCoin_rate() {
        return coin_rate;
    }

    public String getCoin_change() {
        return coin_change;
    }
}
