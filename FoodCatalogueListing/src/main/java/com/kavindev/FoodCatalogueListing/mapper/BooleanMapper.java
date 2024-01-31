package com.kavindev.FoodCatalogueListing.mapper;

public class BooleanMapper {

    public String booleanToString(boolean value) {
        return value ? "true" : "false";
    }

    public boolean stringToBoolean(String value) {
        return "true".equalsIgnoreCase(value);
    }
}
