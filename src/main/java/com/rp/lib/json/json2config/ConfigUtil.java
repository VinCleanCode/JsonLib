package com.rp.lib.json.json2config;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ConfigUtil {

    public static Map readConfig(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        HashMap configMap = objectMapper.readValue(new File(filePath),HashMap.class);
        return configMap;
    }
}
