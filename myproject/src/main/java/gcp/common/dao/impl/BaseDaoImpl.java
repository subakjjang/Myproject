package gcp.common.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import gcp.common.dao.BaseDao;

@Repository("dao")
public class BaseDaoImpl<T> implements BaseDao<T> {
	
	private static final Logger logger = LoggerFactory.getLogger(BaseDaoImpl.class);
	
	@Autowired
	private SqlSessionTemplate sqlSession; // oracle
	
	
	@Override
	public Object selectOne(String queryId, Object object) {
		return sqlSession.selectOne(queryId, object);
	}
	
	@Override
	public int selectCount(String queryId, Object object) {
		return sqlSession.selectOne(queryId, object);
	}
	
	@Override
	public List<?> selectList(String queryId, Object object){
		return sqlSession.selectList(queryId, object);
	}
	
	@Override
	public int update(String queryId, Object object) {
		return sqlSession.update(queryId, object);
	}

	@Override
	public int delete(String queryId, Object object) {
		return sqlSession.delete(queryId, object);
	}
	
	@Override
	public int insert(String queryId, Object object) throws Exception {
		int retVal = 0;
		try {
			retVal = sqlSession.insert(queryId, object);
		} catch (DataAccessException dae) {
			logger.error("****** DataAccessException : {} ", dae.getMessage());
			throw dae;
		} catch (Exception e) {
			logger.error("****** Exception : {}", e.getMessage());
			throw e;
		}
		return retVal;
	}
	   
}
