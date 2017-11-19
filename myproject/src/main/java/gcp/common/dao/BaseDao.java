package gcp.common.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface BaseDao<T> {
	
	public Object selectOne(String queryId, Object object);

	public List<?> selectList(String queryId, Object object);

	public int selectCount(String queryId, Object object);

	public int update(String queryId, Object object);

	public int delete(String queryId, Object object);

	public int insert(String queryId, Object object) throws Exception;
}
