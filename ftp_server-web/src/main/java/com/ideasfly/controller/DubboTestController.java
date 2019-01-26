/**
 * Copyright (c) 2017-2019 DeepWise All Rights Reserved.
 * http://www.deepwise.com
 */
package com.ideasfly.controller;

import com.ideasfly.model.response.ReturnCodeAndMsgEnum;
import com.ideasfly.model.response.ReturnValue;
import com.ideasfly.supports.ftp_server.DubboTestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lanxuewei Create in 2019/1/26 14:15
 * Description: 
 */
@RestController
@RequestMapping(value = "/dubbo")
public class DubboTestController {

    @Autowired
    private DubboTestApi dubboTestApi;

    /**
     * description: dubbo 相关测试
     * @return com.ideasfly.model.response.ReturnValue
     * @author lanxuewei 2019/1/26 14:27
     */
    @RequestMapping(value = "/test")
    public ReturnValue<String> dubboTest() {
        return new ReturnValue<>
                (ReturnCodeAndMsgEnum.Success, dubboTestApi.getDubboTestRemote().helloWord());
    }
}
