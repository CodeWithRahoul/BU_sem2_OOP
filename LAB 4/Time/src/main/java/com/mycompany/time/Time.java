

package com.mycompany.time;


import java.util.Scanner;
import java.time.LocalDateTime;

public class Time {
    
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
    private int second;
    
    // Default Constructor
    public Time() {
        LocalDateTime now = LocalDateTime.now();
        this.year = now.getYear();
        this.month = now.getMonthValue();
        this.day = now.getDayOfMonth();
        this.hour = now.getHour();
        this.minute = now.getMinute();
        this.second = now.getSecond();
    }
    
        // Overloaded Constructor (Year, Month, Day)
    public Time(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    // Overloaded Constructor (Year, Month, Day, Hour, Minute, Second)
    public Time(int year, int month, int day, int hour, int minute, int second) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
        // Setters
    public void setYear(int year) { this.year = year; }
    public void setMonth(int month) { this.month = month; }
    public void setDay(int day) { this.day = day; }
    public void setHour(int hour) { this.hour = hour; }
    public void setMinute(int minute) { this.minute = minute; }
    public void setSecond(int second) { this.second = second; }

    // Getters
    public int getYear() { return year; }
    public int getMonth() { return month; }
    public int getDay() { return day; }
    public int getHour() { return hour; }
    public int getMinute() { return minute; }
    public int getSecond() { return second; }
    
    public String displayDateTime() {
        return String.format("%04d-%02d-%02d %02d:%02d:%02d",
                year, month, day, hour, minute, second);
    }
    
    public static void main(String[] args) {
        Time dt1 = new Time(); 
        System.out.println("Current Date and Time: " + dt1.displayDateTime());

        Time dt2 = new Time(2022, 10, 20); 
        System.out.println("Specified Date: " + dt2.displayDateTime());

        Time dt3 = new Time(2022, 10, 20, 14, 30, 0); 
        System.out.println("Specified Date and Time: " + dt3.displayDateTime());
    }
    
}

