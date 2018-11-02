/**
 * Copyright (c) 2017-2018 DeepWise All Rights Reserved.
 * http://www.deepwise.com
 */
package com.ideasfly;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author lanxuewei Create in 2018/10/10 10:45
 * Description: service 启动类
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.ideasfly.dao"})
public class FtpServerServiceApplication {

    private static final Logger logger = LoggerFactory.getLogger(FtpServerServiceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(FtpServerServiceApplication.class);
        logger.info("================FtpServer Service App  SUCCESS===========");
    }
}
