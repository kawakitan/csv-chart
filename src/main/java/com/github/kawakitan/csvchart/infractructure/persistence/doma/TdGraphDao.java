package com.github.kawakitan.csvchart.infractructure.persistence.doma;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

@Dao
@ConfigAutowireable
public interface TdGraphDao {

	@Select
	List<TdGraph> selectByCategoryAndKey(String category, String key);
}
