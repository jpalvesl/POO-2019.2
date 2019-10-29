package com.gmail.jpalvesl;

import java.nio.file.Path;
import java.util.*;

public class CitiesProcessor implements Iterable<City> {
    private Set<City> citiesSet = new HashSet<>();


    public Set<City> buildSetOfCities( Path filePath ){

    }



    @Override
    public Iterator iterator() {
        return citiesSet.iterator();
    }
}
