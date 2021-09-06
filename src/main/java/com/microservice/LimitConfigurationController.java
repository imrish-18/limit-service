package com.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.bean.LimitConfiguration;

// TODO: Auto-generated Javadoc
/**
 * The Class LimitConfigurationController.
 *
 * @author riskumar12
 */
@RestController
public class LimitConfigurationController {
	
	/** The configuration. */
	@Autowired
	private Configuration configuration;
	
	/**
	 * Retrieve limits from configuration.
	 *
	 * @return the limit configuration
	 */
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfiguration()
	{
		return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
	}
	

}
