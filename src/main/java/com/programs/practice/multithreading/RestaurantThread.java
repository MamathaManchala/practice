package com.programs.practice.multithreading;

public class RestaurantThread {
        public static void main(String[] args) {
            Thread t1 = new ThreadExample("Pasta");
            Thread t2 = new ThreadExample("Salad");
            Thread t3 = new ThreadExample("Dessert");
            Thread t4 = new ThreadExample("Rice");

            t1.start();
            t2.start();
            t3.start();
            t4.start();
        }
    }
