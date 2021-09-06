package com.microservice.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class LimitConfiguration.
 */
public class LimitConfiguration {

	/** The max. */
	private int max;
	
	/** The min. */
	private int min;
	
	/**
	 * Instantiates a new limit configuration.
	 */
	public LimitConfiguration()
	{
		
	}
	
	/**
	 * Instantiates a new limit configuration.
	 *
	 * @param max the max
	 * @param min the min
	 */
	public LimitConfiguration(int max, int min) {
		super();
		this.max = max;
		this.min = min;
	}
	
	/**
	 * Gets the max.
	 *
	 * @return the max
	 */
	public int getMax() {
		return max;
	}
	
	/**
	 * Sets the max.
	 *
	 * @param max the new max
	 */
	public void setMax(int max) {
		this.max = max;
	}
	
	/**
	 * Gets the min.
	 *
	 * @return the min
	 */
	public int getMin() {
		return min;
	}
	
	/**
	 * Sets the min.
	 *
	 * @param min the new min
	 */
	public void setMin(int min) {
		this.min = min;
	}
	
}
