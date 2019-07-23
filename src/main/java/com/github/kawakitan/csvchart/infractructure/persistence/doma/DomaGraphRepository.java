package com.github.kawakitan.csvchart.infractructure.persistence.doma;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.github.kawakitan.csvchart.domain.model.Data;
import com.github.kawakitan.csvchart.domain.model.GraphRepository;

@Repository
public class DomaGraphRepository implements GraphRepository {

	@Autowired
	private TdGraphDao tdGraphDao;

	@Override
	public List<Data> findByCategoryAndKey(final String category, final String key) {
		final List<Data> datas = new ArrayList<Data>();

		final List<TdGraph> records = tdGraphDao.selectByCategoryAndKey(category, key);
		records.forEach(r->datas.add(cnv(r)));

		return datas;
	}

	private Data cnv(final TdGraph src) {
		final Data dest = new Data(src.getDateTime(), src.getValue());
		return dest;
	}
}
