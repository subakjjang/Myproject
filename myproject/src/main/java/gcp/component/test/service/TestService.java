package gcp.component.test.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import gcp.common.service.BaseService;
import gcp.component.test.model.Test;

@Service
public class TestService extends BaseService{
	
	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(TestService.class);

	
	/**
	 * TEST
	 * @return
	 */
	public Test getTestInfo(){
		return (Test) dao.selectOne("test.test.getTestInfo", null);
	}

}
