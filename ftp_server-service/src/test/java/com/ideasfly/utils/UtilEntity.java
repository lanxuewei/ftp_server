/**
 * Copyright (c) 2017-2018 DeepWise All Rights Reserved.
 * http://www.deepwise.com
 */
package com.ideasfly.utils;

import com.ideasfly.common.utils.UtilString;
import com.ideasfly.dao.entity.User;

/**
 * @author lanxuewei Create in 2018/11/6 19:59
 * Description: util entity
 */
public class UtilEntity {

    /**
     * 获得一个用户
     * @return user
     */
    public static User getUser() {
        User user = new User();
        user.setUserName(UtilString.getUUID());
        user.setPassword(UtilString.getUUID());
        user.setImg(UtilString.getUUID());
        user.setDes(UtilString.getUUID());
        user.setRealName(UtilString.getUUID());
        return user;
    }
}
