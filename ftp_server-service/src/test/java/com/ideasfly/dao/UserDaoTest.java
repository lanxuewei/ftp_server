/**
 * Copyright (c) 2017-2018 DeepWise All Rights Reserved.
 * http://www.deepwise.com
 */
package com.ideasfly.dao;

import com.ideasfly.common.utils.UtilString;
import com.ideasfly.utils.UtilEntity;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ideasfly.TestBase;
import com.ideasfly.dao.dbservice.user.UserDao;
import com.ideasfly.dao.entity.User;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author lanxuewei Create in 2018/11/1 19:04
 * Description: UserDao Test
 */
public class UserDaoTest extends TestBase {

    private static final Logger logger = LoggerFactory.getLogger(UserDaoTest.class);

    @Autowired
    private UserDao userDao;

    /**
     * 测试是否能调用通dao层测试
     */
    @Test
    @Transactional
    public void insertTest() {
        User user = UtilEntity.getUser();
        int num = userDao.insert(user);
        Assert.assertEquals(1, num);

        User userFromDb = userDao.queryById(user.getId());
        Assert.assertEquals(user.getUserName(), userFromDb.getUserName());
    }

}
