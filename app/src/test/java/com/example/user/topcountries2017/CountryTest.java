package com.example.user.topcountries2017;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 09/08/2017.
 */

public class CountryTest {

    Country country;

    @Before
    public void before(){
        country = new Country(1, "Canada");
    }

    @Test
    public void hasRankingTest() {
        assertEquals(1, country.getRanking());
    }

    @Test
    public void hasName() {
        assertEquals("Canada", country.getName());
    }

}
