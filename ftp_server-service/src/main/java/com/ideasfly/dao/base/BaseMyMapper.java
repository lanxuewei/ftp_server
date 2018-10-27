package com.ideasfly.dao.base;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 
 * @ClassName: BaseMyMapper 
 * @Description: mybatis的基础Mapper
 * @author LJ 
 * @date 2018年3月8日 下午5:24:55 
 * @param <T>
 */
public interface BaseMyMapper<T> extends Mapper<T>,MySqlMapper<T>{

}
