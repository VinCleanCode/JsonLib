package com.rp.lib.json.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Map;

class ConfigUtilTest {

    private static final Logger log = LogManager.getLogger();

    @Test
    void readConfigTest() throws IOException {
        Map configMap = ConfigUtil.readConfig("config.json");
        String zkhost = (String) configMap.get("zkHost");
        log.info("zhost: {}",zkhost);
        Assertions.assertEquals("127.0.0.1:2181",zkhost);
    }
}