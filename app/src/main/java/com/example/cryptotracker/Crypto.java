
package com.example.cryptotracker;

public class Crypto {
    private String name;
    private String value;
    private String change;
    private int icon;

    public Crypto(String name, String value, String change, int icon) {
        this.name = name;
        this.value = value;
        this.change = change;
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public String getChange() {
        return change;
    }

    public int getIcon() {
        return icon;
    }
}
