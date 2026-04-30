package com.programs.practice.collection;

import java.util.Iterator;
import java.util.Map;

public class HashMap {
    public static void main(String[] args) {

            Map<Integer, String> map = new java.util.HashMap<>();

            map.put(1, "Apple");
            map.put(2, "Banana");
            map.put(3, "Mango");

            System.out.println(map);//{1=Apple, 2=Banana, 3=Mango}
            System.out.println("map: " + map.get(3));


            for(Map.Entry<Integer, String> entry: map.entrySet()){
                System.out.println("Key: " + entry.getKey());
                System.out.println("Value :" + entry.getValue());
            }

            for(Integer key: map.keySet()){
                System.out.println("Key:"+ key);
            }

        for(String value: map.values()){
            System.out.println("Value:"+ value);
        }

        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        map.forEach((key,value) -> {
            System.out.println(key + " " + value);
        });

        }
}
