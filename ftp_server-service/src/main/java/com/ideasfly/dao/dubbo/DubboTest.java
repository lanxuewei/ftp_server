/**
 * Copyright (c) 2017-2018 DeepWise All Rights Reserved.
 * http://www.deepwise.com
 */
package com.ideasfly.dao.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
import com.ideasfly.api.DubboTestRemote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author lanxuewei Create in 2018/10/22 10:02
 * Description: dubbo test
 */
@Service
public class DubboTest implements DubboTestRemote {

    private static final Logger Logger = LoggerFactory.getLogger(DubboTest.class);

    @Override
    public String helloWord() {
        return "helloWorld";
    }
}
