package com.eprogrammerz.examples.testing.junitCalender;

/**
 * Created by 542596 on 3/1/2017.
 */
public class Application {
    public static void main(String[] args) {
        DateManipulator dateManipulator = new DateManipulator();
//        dateManipulator.setCalendar(Calendar.getInstance());
        Schedule schedule = dateManipulator.getTodaySchedule();
        System.out.println(schedule);
    }
}
