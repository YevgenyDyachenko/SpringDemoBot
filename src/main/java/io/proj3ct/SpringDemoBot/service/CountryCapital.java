package io.proj3ct.SpringDemoBot.service;

import java.util.HashMap;
import java.util.Map;

public class CountryCapital {
    private static final Map<String, String> countriesToCapitals = new HashMap<>();

    static {
        countriesToCapitals.put("Afghanistan", "Kabul");
        countriesToCapitals.put("Albania", "Tirana");
        countriesToCapitals.put("Algeria", "Algiers");
        countriesToCapitals.put("Ghana", "Accra");
        countriesToCapitals.put("UAE", "Abu Dhabi");
        countriesToCapitals.put("Nigeria", "Abuja");
        countriesToCapitals.put("Ethiopia", "Addis Ababa");
        countriesToCapitals.put("Yemen", "Sana'a");
        countriesToCapitals.put("Jordan", "Amman");
        countriesToCapitals.put("Netherlands", "d" +
                "Amsterdam");
        countriesToCapitals.put("Andorra", "Andorra la Vella");
        countriesToCapitals.put("Turkey", "Ankara");
        countriesToCapitals.put("Madagascar", "Antananarivo");
        countriesToCapitals.put("Samoa", "Apia");
        countriesToCapitals.put("Turkmenistan", "Ashgabat");
        countriesToCapitals.put("Kazakhstan", "Astana");
        countriesToCapitals.put("Greece", "Athens");
        countriesToCapitals.put("Iraq", "Baghdad");
        countriesToCapitals.put("Azerbaijan", "Baku");
        countriesToCapitals.put("Thailand", "Bangkok");
        countriesToCapitals.put("China", "Beijin");
        countriesToCapitals.put("Lebanon", "Beirut");
        countriesToCapitals.put("Serbia", "Belgrade");
        countriesToCapitals.put("Germany", "Berlin");
        countriesToCapitals.put("Colombia", "Bogota");
        countriesToCapitals.put("Brazil", "Brasilia");
        countriesToCapitals.put("Congo", "Brazzaville");
        countriesToCapitals.put("Slovakia", "Bratislava");
        countriesToCapitals.put("Belgium", "Brussels");
        countriesToCapitals.put("Romania", "Bucharest");
        countriesToCapitals.put("Hungary", "Budapest");
        countriesToCapitals.put("Argentina", "Buenos Aires");
        countriesToCapitals.put("Egypt", "Cairo");
        countriesToCapitals.put("Australia", "Canberra");
        countriesToCapitals.put("Venezuela", "Caracas");
        countriesToCapitals.put("Wales", "Cardiff");
        countriesToCapitals.put("Montenegro", "Podgorica");
        countriesToCapitals.put("Moldova", "Chisinau");
        countriesToCapitals.put("Guinea", "Conakry");
        countriesToCapitals.put("Denmark", "Copenhagen");
        countriesToCapitals.put("Senegal", "Dakar");
        countriesToCapitals.put("Qatar", "Doha");
        countriesToCapitals.put("Ireland", "Dublin");
        // Add more countries and their capitals here
    }

    public String getCapital(String country) {
        country = country.substring(0, 1).toUpperCase() + country.substring(1).toLowerCase();
        return countriesToCapitals.get(country);
    }
}