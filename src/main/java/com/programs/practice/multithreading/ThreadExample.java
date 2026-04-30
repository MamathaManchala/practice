package com.programs.practice.multithreading;

public class ThreadExample extends Thread {
        private String task;

    ThreadExample(String task) {
            this.task = task;
        }

        public void run() {
            System.out.println(task + " is being prepared by " +
                    Thread.currentThread().getName());
        }
        }
