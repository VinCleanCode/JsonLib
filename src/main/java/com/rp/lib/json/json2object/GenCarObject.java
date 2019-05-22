package com.rp.lib.json.json2object;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rp.lib.json.pojo.Car;

import java.io.IOException;

public class GenCarObject {

    public static void main(String args[]) throws IOException {
        String json = "{ \"color\" : \"Black\", \"type\" : \"BMW\" }";
        ObjectMapper objectMapper = new ObjectMapper();
        Car car = objectMapper.readValue(json, Car.class);
    }
}
