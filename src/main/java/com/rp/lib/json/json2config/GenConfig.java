package com.rp.lib.json.json2config;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GenConfig {
    public static void main(String args[]) throws IOException {
        Map configMap = ConfigUtil.readConfig("src\\main\\resources\\config.json");
        String zkhost = configMap.get("zkHost").toString();
        System.out.println("zkhost: "+zkhost);
    }
}
