/**
 * Copyright (c) 2017-2018 DeepWise All Rights Reserved.
 * http://www.deepwise.com
 */
package com.ideasfly.service.user.impl;

import com.ideasfly.dao.dbservice.user.UserDao;
import com.ideasfly.dao.entity.User;
import com.ideasfly.dao.mapper.user.UserMapper;
import com.ideasfly.service.base.impl.BaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lanxuewei Create in 2018/11/6 19:46
 * Description: User Service impl
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User> {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;


}
