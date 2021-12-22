package com.example.logging.test;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LogTest {

    @Value("${loop.n}")
    private int n;

    @Value("${print.string}")
    private String outString;

    private Logger LOGGER = LoggerFactory.getLogger(LogTest.class);

    @PostConstruct
    public void init(){

        for (int i = 0; i < n; i++) {
            LOGGER.info(outString);
        }
    }
    
}
