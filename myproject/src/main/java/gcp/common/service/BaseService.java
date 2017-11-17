package gcp.common.service;

import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import gcp.common.dao.BaseDao;

@Service
public class BaseService {
	
	@Autowired
	private ApplicationContext context;

	public Object getThis() throws Exception {
		return context.getBean(this.getClass());
		//return new Object();
	}
	
	@Autowired
	@Qualifier("dao")
	protected BaseDao<T>	dao;
}
