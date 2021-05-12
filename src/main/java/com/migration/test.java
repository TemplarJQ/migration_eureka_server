package com.migration;

import java.util.Date;

public class test {
    public static void main(String[] args) throws InterruptedException {
        Date date = new Date();

        Thread.sleep(10);

        Date date1 = new Date();

        System.out.println(date1.getTime() - date.getTime());
    }
}
