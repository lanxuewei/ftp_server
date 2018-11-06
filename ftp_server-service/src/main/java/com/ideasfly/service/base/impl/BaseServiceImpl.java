package com.ideasfly.service.base.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import com.ideasfly.common.model.Page;
import com.ideasfly.common.utils.UtilPage;
import com.ideasfly.common.utils.UtilReflection;
import com.ideasfly.dao.base.BaseMyMapper;
import com.ideasfly.service.base.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * 通用BaseServiceImpl
 * 
 * @author LJ
 */
public class BaseServiceImpl<D extends BaseMyMapper<T>, T> implements BaseService<T> {
	
	private static Logger logger = LoggerFactory.getLogger(BaseServiceImpl.class);

	@Autowired
	public D mapper;

	@Override
	public int add(T record) {
		return this.mapper.insertSelective(record);
	}

	@Override
	public T queryById(Object id) {
		return id != null ? this.mapper.selectByPrimaryKey(id) : null;
	}

	@Override
	public int queryCount(T record) {
		return record != null ? this.mapper.selectCount(record) : 0;
	}

	@Override
	public List<T> queryList(T record) {
		return record != null ? this.mapper.select(record) : null;
	}
	@Override
	public T queryOne(T record) {
		return record != null ? this.mapper.selectOne(record) : null;
	}

	@Override
	public List<T> queryAll() {
		return this.mapper.selectAll();
	}

	@Override
	public Page<T> queryPage(Integer pageIndex, Integer pageSize, T record) {
		List<T> list = this.mapper.select(record);
		if (list != null) {
			return new Page<T>(pageIndex, pageSize, list.size(), UtilPage.getPageList(list, pageIndex, pageSize));
		}
		return new Page<T>(pageIndex, pageSize, 0, null);
	}

	@Override
	@SuppressWarnings("unchecked")
	public T queryOneByField(String fieldName, Object value) {
		try {
			if(StringUtils.isNotBlank(fieldName) && value!=null){
				ParameterizedType pt = (ParameterizedType) getClass().getGenericSuperclass();
				Class<T> entityClazz = (Class<T>) pt.getActualTypeArguments()[1];
				Object obj = entityClazz.newInstance();
				if (UtilReflection.setFieldValue(obj, fieldName, value)) {
					List<T> list = this.mapper.select((T) obj);
					if (list != null && list.size() > 0) {
						return list.get(0);
					}
				}
			}
		} catch (Exception e) {
			logger.error("根据实体的字段名和字段值查询异常：{}", e);
		}
		return null;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<T> queryByField(String fieldName, Object value) {
		try {
			if(StringUtils.isNotBlank(fieldName) && value!=null){
				ParameterizedType pt = (ParameterizedType) getClass().getGenericSuperclass();
				Class<T> entityClazz = (Class<T>) pt.getActualTypeArguments()[1];
				Object obj = entityClazz.newInstance();
				if (UtilReflection.setFieldValue(obj, fieldName, value)) {
					return this.mapper.select((T) obj);
				}
			}
		} catch (Exception e) {
			logger.error("根据实体的字段名和字段值查询List异常：{}", e);
		}
		return null;
	}

	@Override
	public int modify(T record) {
		return record != null ? this.mapper.updateByPrimaryKeySelective(record) : 0;
	}

	@Override
	public int update(T record) {
		return record != null ? this.mapper.updateByPrimaryKey(record) : 0;
	}

	@Override
	public int deleteById(Object id) {
		return id != null ? this.mapper.deleteByPrimaryKey(id) : 0;
	}

	@Override
	public int delete(T record) {
		return record != null ? this.mapper.delete(record) : 0;
	}

}
