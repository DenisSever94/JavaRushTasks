package com.javarush.task.pro.task16.task1616;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.TreeSet;

public class Solution {

    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());
        System.out.println(getBeijingDateTime());
    }

    static TreeSet<String> getSortedZones() {
        TreeSet<String> zones = new TreeSet<>();
        for (String zone : ZoneId.getAvailableZoneIds()) {
            zones.add(String.valueOf(zone));
        }

        return zones;
    }

    static ZonedDateTime getBeijingDateTime() {

        return ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
    }
}
