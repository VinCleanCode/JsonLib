package com.rp.lib.json.json2config;

import com.rp.lib.json.util.ConfigUtil;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class GenConfig {
    public static void main(String[] args) throws IOException {

        Map configMap = ConfigUtil.readConfig("config.json");
        String zkhost = configMap.get("zkHost").toString();
        System.out.println("zkhost: "+zkhost);
    }
}
