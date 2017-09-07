package com.happok.cloudnotes.orm.dialect;

/**
 * 数据库方言抽象类
 *
 * @author 杨智
 * @email yangoscer@163.com
 * @date 2017年8月8日 上午11:09:57
 */
public abstract class Dialect {

	/**
	 * 得到分页sql
	 * 
	 * @param sql
	 * @param offset
	 * @param limit
	 * @return
	 */
	public abstract String getLimitString(String sql, int offset, int limit);

	/**
	 * 得到分页sql
	 * 
	 * @param sql
	 * @return
	 */
	public abstract String getCountString(String sql);

}
