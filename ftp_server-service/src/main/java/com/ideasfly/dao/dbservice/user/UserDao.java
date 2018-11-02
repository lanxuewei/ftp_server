/**
 * Copyright (c) 2017-2018 DeepWise All Rights Reserved.
 * http://www.deepwise.com
 */
package com.ideasfly.dao.dbservice.user;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.ideasfly.dao.base.BaseDao;
import com.ideasfly.dao.entity.User;
import com.ideasfly.dao.mapper.user.UserMapper;

/**
 * @author lanxuewei Create in 2018/11/1 19:09
 * Description: UserDao
 */
@Repository
public class UserDao extends BaseDao<UserMapper, User> {

}
