package com.github.kawakitan.csvchart.domain.model;

import java.util.Date;

public class Data {

	private final Date dateTime;
	private final Double value;

	/**
	 * @param dateTime
	 * @param value
	 */
	public Data(Date dateTime, Double value) {
		super();
		this.dateTime = dateTime;
		this.value = value;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public Double getValue() {
		return value;
	}

}
