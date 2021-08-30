package com.dongmingdi.springboot;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;

@SpringBootTest
class SpringBoot04WebCrudApplicationTests {

    Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Test
    void contextLoads() throws FileNotFoundException {
        logger.info(ResourceUtils.getURL("classpath:").getPath());
    }

    @Test
    void test1() {
        logger.info("aaa");
    }

}
