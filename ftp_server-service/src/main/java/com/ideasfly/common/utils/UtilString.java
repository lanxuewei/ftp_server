/**
 * Copyright (c) 2017-2018 DeepWise All Rights Reserved.
 * http://www.deepwise.com
 */
package com.ideasfly.common.utils;

import java.util.UUID;

/**
 * @author lanxuewei Create in 2018/11/1 19:20
 * Description: String Utils
 */
public class UtilString {

    /**
     * 私有构造器
     */
    private UtilString() {
    }

    /**
     * get uuid
     * @return uuid
     */
    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
