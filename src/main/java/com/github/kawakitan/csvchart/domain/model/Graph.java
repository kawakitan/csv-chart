package com.github.kawakitan.csvchart.domain.model;

import java.util.List;

public class Graph {

	private final String category;
	private final String key;

	/**
	 * @param category
	 * @param key
	 */
	public Graph(final String category, final String key) {
		super();
		this.category = category;
		this.key = key;
	}

	public final List<Data> getDatas(final GraphRepository repository) {

		List<Data> dest = repository.findByCategoryAndKey(category, key);

		return dest;
	}
}
