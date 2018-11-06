/**
 * Copyright (c) 2017-2018 DeepWise All Rights Reserved.
 * http://www.deepwise.com
 */
package com.ideasfly.service;

import com.ideasfly.TestBase;
import com.ideasfly.common.utils.UtilString;
import com.ideasfly.dao.entity.User;
import com.ideasfly.service.user.UserService;
import com.ideasfly.utils.UtilEntity;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author lanxuewei Create in 2018/11/6 19:54
 * Description: User Service test
 */
public class UserServiceTest extends TestBase {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceTest.class);

    @Autowired
    private UserService userService;

    /**
     * 测试service是否可通
     */
    @Test
    public void createUserTest() {
        User user = UtilEntity.getUser();

    }

}
