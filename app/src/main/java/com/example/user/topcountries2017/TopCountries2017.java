package com.example.user.topcountries2017;

import java.util.ArrayList;

/**
 * Created by user on 09/08/2017.
 */

public class TopCountries2017 {

    private ArrayList<Country> list;

    public TopCountries2017() {
        list = new ArrayList<Country>();
        list.add(new Country(1, "Canada"));
        list.add(new Country(2, "Columbia"));
        list.add(new Country(3, "Finland"));
        list.add(new Country(4, "Dominica"));
        list.add(new Country(5, "Nepal"));
        list.add(new Country(6, "Bermuda"));
        list.add(new Country(7, "Mongolia"));
        list.add(new Country(8, "Oman"));
        list.add(new Country(9, "Myanmar"));
        list.add(new Country(10, "Ethiopia"));

    }

    public ArrayList<Country> getList() {
        return new ArrayList<Country>(list);
    }
}
