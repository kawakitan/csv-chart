package com.github.kawakitan.csvchart.domain.model;

import java.util.List;

public interface GraphRepository {

	List<Data> findByCategoryAndKey(String category, String key);
}
