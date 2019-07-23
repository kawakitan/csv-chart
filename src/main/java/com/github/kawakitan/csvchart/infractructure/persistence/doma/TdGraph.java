package com.github.kawakitan.csvchart.infractructure.persistence.doma;

import java.util.Date;

import org.seasar.doma.Entity;
import org.seasar.doma.Table;
import org.seasar.doma.jdbc.entity.NamingType;

@Entity(immutable=true, naming=NamingType.SNAKE_LOWER_CASE)
@Table(name = "td_graph")
public class TdGraph {

	private final String category;
	private final String key;
	private final Date dateTime;
	private final Double value;

	/**
	 * @param category
	 * @param key
	 * @param dateTime
	 * @param value
	 */
	public TdGraph(String category, String key, Date dateTime, Double value) {
		super();
		this.category = category;
		this.key = key;
		this.dateTime = dateTime;
		this.value = value;
	}

	public String getCategory() {
		return category;
	}

	public String getKey() {
		return key;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public Double getValue() {
		return value;
	}

}
