/**
 * Copyright (c) 2017-2018 DeepWise All Rights Reserved.
 * http://www.deepwise.com
 */
package com.ideasfly.dao;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ideasfly.TestBase;
import com.ideasfly.common.utils.StringUtils;
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
        User user = getUser();
        int num = userDao.insert(user);
        logger.info("num = {}", num);

        User userFromDb = userDao.queryById(user.getId());
        logger.info("userFromDb = {}", userFromDb);
    }

    /**
     * 获得用户
     * @return user
     */
    private User getUser() {
        User user = new User();
        user.setUserName(StringUtils.getUUID());
        user.setPassword(StringUtils.getUUID());
        user.setImg("D:\\logo.png");
        user.setDes("这个人太懒了，什么都没有说。");
        user.setRealName("lanxuewei");
        return user;
    }
}
