package com.lubaszak.utils;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang3.StringUtils;


import java.util.HashMap;
import java.util.Map;

public enum Activity {

    VERY_LOW,
    LOW,
    MEDIUM,
    HIGH;

    public static Map<String, Activity> namesMap = new HashMap<>();

    static {
        namesMap.put("veryLow", VERY_LOW);
        namesMap.put("low", LOW);
        namesMap.put("medium", MEDIUM);
        namesMap.put("high", HIGH);

    }



}
