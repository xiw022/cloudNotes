package com.happok.cloudnotes.orm.dialect;

/**
 * MySQL数据库方言
 *
 * @author 杨智
 * @email yangoscer@163.com
 * @date 2017年8月8日 上午11:07:12
 */
public class MySql5Dialect extends Dialect {

    protected static final String SQL_END_DELIMITER = ";";

    @Override
    public String getLimitString(String sql, int offset, int limit) {
        return MySql5PageHepler.getLimitString(sql, offset, limit);
    }

    @Override
    public String getCountString(String sql) {
        return MySql5PageHepler.getCountString(sql);
    }
}
