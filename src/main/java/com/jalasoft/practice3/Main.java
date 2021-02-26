package com.jalasoft.practice3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Main {

    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();

        countries.add("Bolivia");
        countries.add("Argentina");
        countries.add("Argelia");
        countries.add("Angola");
        countries.add("Portugal");
        countries.add("Italia");
        countries.add("Australia");

        countries.stream()
                .filter(country -> country.startsWith("A"))
                .filter(country -> country.length() > 5 && country.length() % 2 == 0)
                .forEach(System.out::println);

    }
}
