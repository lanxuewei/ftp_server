package com.ideasfly.common.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.github.pagehelper.PageInfo;

/**
 * create by lanxuewei in 2018/4/15 22:29
 * description: 分页查询结果集封装对象
 */
public class Page<T> implements Serializable{

	private static final long serialVersionUID = 5784877030657381945L;

	private static final int PAGE_INDEX = 1;

	private static final int PAGE_SIZE = 10;

	/**
	 * 当前页码默认1
	 */
	private int pageIndex = PAGE_INDEX;
	/**
	 * 每页记录条数
	 */
	private int pageSize = PAGE_SIZE;
	/**
	 * 分页数据
	 */
	private List<T> rows;
	/**
	 * 总记录数
	 */
	private long total; 
	/**
	 * 总页数
	 */
	private long pageCount; 
	/**
	 * 是否有下一页
	 */
	private boolean hasNext; 
	/**
	 * 是否有上一页
	 */
	private boolean  hasPrevious; 

	/**
	 * 构造方法
	 */
	public Page() {
		this(PAGE_INDEX, PAGE_SIZE, 0, new ArrayList<T>());
	}

	/**
	 * 构造方法
	 * @param pageIndex 当前页码
	 * @param pageSize 每页记录条数
	 * @param total 总记录数
	 * @param rows 分页数据
	 */
	public Page(int pageIndex, int pageSize, long total, List<T> rows) {
		this.pageIndex = pageIndex;
		this.pageSize = pageSize;
		this.total = total;
		this.pageCount = total / pageSize + ((total % pageSize) > 0 ? 1 : 0);
		this.hasNext = pageIndex < pageCount;
		this.hasPrevious = pageIndex > 1;
		this.rows = rows;
	}
	
	
	/**
	 * 构造方法
	 * 只试用PageHelper插件查出来的List数据分页
	 * @param rows 分页数据
	 */
	public Page(List<T> rows) {
		PageInfo<T> pageInfo = new PageInfo<>(rows);
		this.pageIndex = pageInfo.getPageNum();
		this.pageSize = pageInfo.getPageSize();
		this.total = pageInfo.getTotal();
		this.pageCount = total / pageSize + ((total % pageSize) > 0 ? 1 : 0);
		this.hasNext = pageIndex < pageCount;
		this.hasPrevious = pageIndex > 1;
		this.rows = rows;
	}


	public int getPageSize() {
		return pageSize;
	}
	public int getPageIndex() {
		return pageIndex;
	}
	public List<T> getRows() {
		return rows;
	}
	public long getTotal() {
		return total;
	}
	public long getPageCount() {
		return pageCount;
	}

	public boolean isHasNext() {
		return hasNext;
	}

	public boolean isHasPrevious() {
		return hasPrevious;
	}
	
}
