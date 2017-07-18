package com.skunkworks.poloniex.api;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

import static org.junit.Assert.assertNotNull;

/**
 * stole on 17.07.17.
 */
public class Volume24hTest {
    private static final Logger log = Logger.getLogger(Volume24hTest.class.getName());

    @Test
    public void volume24hGet() throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        Volume24h volume24h = restTemplate.getForObject(Volume24h.getUrl(), Volume24h.class);
        assertNotNull("volume24h", volume24h);
        log.info(volume24h.toString());
    }
}
