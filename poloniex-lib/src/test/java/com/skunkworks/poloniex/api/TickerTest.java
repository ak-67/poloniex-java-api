package com.skunkworks.poloniex.api;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

import static org.junit.Assert.assertNotNull;

/**
 * stole on 17.07.17.
 */
public class TickerTest {
    private static final Logger log = Logger.getLogger(TickerTest.class.getName());

    @Test
    public void tickerGet() throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        Ticker ticker = restTemplate.getForObject(Ticker.getUrl(), Ticker.class);
        assertNotNull("ticker", ticker);
        log.info(ticker.toString());
    }
}
