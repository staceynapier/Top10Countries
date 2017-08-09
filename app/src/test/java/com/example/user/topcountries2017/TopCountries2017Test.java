package com.example.user.topcountries2017;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 09/08/2017.
 */

public class TopCountries2017Test {

    @Test
    public void hasListTest(){
        TopCountries2017 topCountries = new TopCountries2017();
        assertEquals(10, topCountries.getList().size());
    }


}
