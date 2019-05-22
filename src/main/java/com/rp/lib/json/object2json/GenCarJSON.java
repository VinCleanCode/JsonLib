package com.rp.lib.json.object2json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rp.lib.json.pojo.Car;

import java.io.File;
import java.io.IOException;

public class GenCarJSON {

    public static void main(String args[]) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Car car = new Car("yellow","renault");
        objectMapper.writeValue(new File("target/car.json"),car);
    }

}
