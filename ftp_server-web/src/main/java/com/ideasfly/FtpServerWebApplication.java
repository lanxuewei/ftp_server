package com.ideasfly; /**
 * Copyright (c) 2017-2018 DeepWise All Rights Reserved.
 * http://www.deepwise.com
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lanxuewei Create in 2018/10/10 10:21
 * Description: web 启动类
 */
@SpringBootApplication
@RestController
public class FtpServerWebApplication {

    private static final Logger logger = LoggerFactory.getLogger(FtpServerWebApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(FtpServerWebApplication.class);
        logger.info("================FtpServer Web App  SUCCESS===========");
    }

    // test
    @RequestMapping(value = "/", produces = "text/plain;charset=UTF-8")
    String index(){
        return "Hello UtilsApplication!";
    }

}
