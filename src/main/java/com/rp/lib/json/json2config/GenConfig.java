package com.rp.lib.json.json2config;

import com.rp.lib.json.util.ConfigUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class GenConfig {
    public static void main(String[] args) throws IOException {
        Map configMap = ConfigUtil.readConfig("config.json");
        String zkhost = configMap.get("zkHost").toString();
        String collection = configMap.get("collection").toString();
        System.out.println("zkhost: "+zkhost);
        System.out.println("collectin:"+collection);

        Object arrayObj = configMap.get("intArray");
        ArrayList numArray = (ArrayList) arrayObj;
        System.out.println("array:"+arrayObj.toString());

        System.out.println(numArray.get(0));
        System.out.println((Integer)numArray.get(0)+(Integer)numArray.get(1));


        Object stringArrayObj = configMap.get("stringArray");
        ArrayList stringArray = (ArrayList) stringArrayObj;

        System.out.println(stringArray.get(0).toString()+stringArray.get(1).toString());

        ArrayList hybridObj = (ArrayList) configMap.get("hybrid");
        hybridObj.forEach(value -> System.out.print(value));
        int i = (int) hybridObj.get(0);
        System.out.println(i);
    }
}
