package com.rp.lib.json.json2object;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rp.lib.json.pojo.Car;

import java.io.IOException;

public class GenCarObject {

    public static void main(String[] args) throws IOException {
        String json = "{ \"color\" : \"Black\", \"type\" : \"BMW\" }";
        ObjectMapper objectMapper = new ObjectMapper();
        Car car = objectMapper.readValue(json, Car.class);

        //https://www.cnblogs.com/yucfeng/p/8932089.html
        //note: 用readValue 從 JSON 建立的 object 本身需要有建構子，否則會拋出異常 InvalidDefinitionException

        System.out.println("Car: "+car.toString());
        System.out.println(car.getColor());
        System.out.println(car.getType());
    }
}
