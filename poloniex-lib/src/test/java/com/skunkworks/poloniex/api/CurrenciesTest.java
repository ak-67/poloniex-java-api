package com.skunkworks.poloniex.api;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

import static org.junit.Assert.assertNotNull;

/**
 * stole on 18.07.17.
 */
public class CurrenciesTest {
    private static final Logger log = Logger.getLogger(CurrenciesTest.class.getName());

    @Test
    public void currenciesGet() throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        Currencies currencies = restTemplate.getForObject(Currencies.getUrl(), Currencies.class);
        assertNotNull("currencies", currencies);
        log.info(currencies.toString());
    }
}
