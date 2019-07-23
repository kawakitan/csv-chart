package com.github.kawakitan.csvchart.interfaces.web.controller;

public class ChartData {

	private final String x;
	private final Double y;

	/**
	 * @param x
	 * @param y
	 */
	public ChartData(String x, Double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public String getX() {
		return x;
	}

	public Double getY() {
		return y;
	}

}
