package com.company;

public class Main {

    public static void main(String[] args) {
        //Intro
    System.out.println("Hello, and welcome back.");
    System.out.println(" ");
        // Facts
    double hour = 18.0, minute = 53.0, second = 40.0;
    double hour1 = 20.0, minute1 = 06.0, second1 = 35.0;
    double Totaltime = 86400.0;
    double Sinsmidnight = ((second + (minute * 60)) + (hour * 3600)) * 100 / Totaltime;
    double remainingtomidninght = (((60 - second) * 60) + (24-1-hour)*3600) * 100 / Totaltime;
    double oldtime = (second - 60 * minute - 60 * hour);
    double newtime = (second1 + 60 * minute1 + 60 * hour1);

        //Clock
    System.out.print("The current time is: ");
    System.out.print(hour);
    System.out.print(":");
    System.out.print(minute);
    System.out.println(".");
        //Number of seconds remaining of the day.
    System.out.print("Number of Seconds passed today: ");
    System.out.println(hour * 60 + minute * 60);
    System.out.print("Number of seconds remaining: ");
    System.out.println(hour * 60 - minute * 60);
        //Percantage.
    System.out.print("The percentage of the day that has passed: ");
    System.out.println(Sinsmidnight);
    System.out.print("The percentage of the day that are remaining: ");
    System.out.println(remainingtomidninght);
        //Current time changes
    System.out.print("seconds that have passed working on this: ");
    System.out.print(newtime - oldtime);
    System.out.println(" seconds.");
    }
}
