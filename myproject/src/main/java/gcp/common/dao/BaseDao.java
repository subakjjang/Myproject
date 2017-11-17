package gcp.common.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface BaseDao<T> {
	
	public Object selectOne(String queryId, Object object);
}
