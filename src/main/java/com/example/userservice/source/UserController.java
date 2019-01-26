package com.example.userservice.source;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@RestController
public class UserController
{
    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Value("${flag}")
    private String flag;

    @RequestMapping(value = "/user/test", method = RequestMethod.GET)
    public String test()
    {
        logger.info("flag is {}", flag);
        return flag;
    }
}