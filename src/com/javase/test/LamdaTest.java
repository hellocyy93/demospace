package com.javase.test;


import com.java.beans.City;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LamdaTest {
    public static void main(String[] args) {
        List<City> list = new ArrayList<>();
        list.add(new City("深圳","004","鸟都",100.0f));
        list.add(new City("北京","001","帝都",200));
        list.add(new City("上海","002","魔都",300));
        list.add(new City("广州","003","花都",400));
        list.add(new City("东莞","003","sex都",500));
        for (City city : list) {
            System.out.println(city.toString());
        }

       /* System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        List<City> newList = list.stream().filter(city -> city.getCode().equals("003")).sorted(Comparator.comparing(City::getCode).reversed())
                .collect(Collectors.toList());
        newList.forEach(System.out::println);*/
      /*  Map<String, List<City>> maps = list.stream().collect(Collectors.groupingBy(City::getCode));
        for (Map.Entry<String, List<City>> entry : maps.entrySet()) {
            for (City city : entry.getValue()) {
                System.out.println(city);
            }
            System.out.println("===================================");
            Date date = new Date();
        }*/
        System.out.println("===================================");
        List<City> listNew = list.stream().sorted(Comparator.comparing(City::getCode).
                thenComparing(Comparator.comparing(City::getHousePrice).reversed())).collect(Collectors.toList());
        listNew.forEach(System.out::println);
    }
}
