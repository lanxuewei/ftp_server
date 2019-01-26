/**
 * Copyright (c) 2017-2019 DeepWise All Rights Reserved.
 * http://www.deepwise.com
 */
package com.ideasfly.supports.ftp_server;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ideasfly.api.DubboTestRemote;

/**
 * @author lanxuewei Create in 2019/1/26 14:10
 * Description: 
 */
@Component
public class DubboTestApi {

    @Reference
    private DubboTestRemote dubboTestRemote;

    public DubboTestRemote getDubboTestRemote() {
        return dubboTestRemote;
    }

    public void setDubboTestRemote(DubboTestRemote dubboTestRemote) {
        this.dubboTestRemote = dubboTestRemote;
    }
}
