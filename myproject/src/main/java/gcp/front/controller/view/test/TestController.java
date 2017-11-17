package gcp.front.controller.view.test;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import gcp.component.test.model.Test;
import gcp.component.test.service.TestService;


/**
 * Handles requests for the application home page.
 */
@Controller("front")
@RequestMapping("front/test/home")
public class TestController {
	
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	private TestService testService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ModelAndView home(Locale locale,  HttpServletRequest req) {
		
		ModelAndView model = new ModelAndView("test/home");
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addObject("serverTime", formattedDate );
		
		
		Test info = testService.getTestInfo();
		
		model.addObject("testInfo", info );
		
		return model;
	}
	
	
	
}
