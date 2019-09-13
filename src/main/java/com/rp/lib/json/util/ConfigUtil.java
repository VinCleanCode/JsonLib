package com.rp.lib.json.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rp.lib.json.json2config.GenConfig;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.apache.logging.log4j.core.util.Loader.getClassLoader;

public class ConfigUtil {

    public static Map readConfig(String fileName) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        File configFile = new File(getClassLoader().getResource(fileName).getFile());
        HashMap configMap = objectMapper.readValue(configFile, HashMap.class);

        return configMap;
    }
}
