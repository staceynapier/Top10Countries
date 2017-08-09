package com.example.user.topcountries2017;

/**
 * Created by user on 09/08/2017.
 */

public class Country {

    private int ranking;
    private String name;

    public Country(Integer ranking, String name){

        this.ranking = ranking;
        this.name = name;

    }

    public Integer getRanking() {
        return ranking;
    }

    public String getName() {
        return name;
    }
}
