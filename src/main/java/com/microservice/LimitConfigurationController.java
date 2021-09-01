package com.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.bean.LimitConfiguration;

/**
 * @author riskumar12
 *
 */
@RestController
public class LimitConfigurationController {
	
	/**
	 * 
	 */
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfiguration()
	{
		return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
	}
	

}
