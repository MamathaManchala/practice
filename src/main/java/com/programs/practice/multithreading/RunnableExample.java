package com.programs.practice.multithreading;

public class RunnableExample implements Runnable {
    private String task;

    RunnableExample(String task) {
        this.task = task;
    }

    public void run() {
        System.out.println(task + " is being prepared by " +
                Thread.currentThread().getName());
    }
}
