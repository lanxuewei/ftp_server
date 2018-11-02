package com.ideasfly.dao.base;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;


/**
 * @author lanxuewei Create in 2018/10/26 20:43
 * Description: mybatis的基础Mapper
 */
public interface BaseMyMapper<T> extends Mapper<T>,MySqlMapper<T>{

}
