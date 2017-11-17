package gcp.common.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gcp.common.dao.BaseDao;

@Repository("dao")
public class BaseDaoImpl<T> implements BaseDao<T> {
	
	@Autowired
	private SqlSessionTemplate sqlSession; // oracle
	
	
	@Override
	public Object selectOne(String queryId, Object object) {
		return sqlSession.selectOne(queryId, object);
	}
}
