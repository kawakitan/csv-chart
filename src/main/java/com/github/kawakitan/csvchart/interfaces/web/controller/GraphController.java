package com.github.kawakitan.csvchart.interfaces.web.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.github.kawakitan.csvchart.domain.model.Data;
import com.github.kawakitan.csvchart.domain.model.Graph;
import com.github.kawakitan.csvchart.domain.model.GraphRepository;

@Controller
public class GraphController {
	
	@Autowired
	private GraphRepository graphRepository;
	
	private SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

	@RequestMapping(path="/", method= RequestMethod.GET)
	public ModelAndView index(final ModelAndView mv) {

		final Graph graph = new Graph("TEST", "A");
		final List<Data> ds = graph.getDatas(graphRepository);

		final List<ChartData> data = new ArrayList<ChartData>();
		ds.forEach(d -> {
			ChartData dd = new ChartData(SDF.format(d.getDateTime()), d.getValue());
			data.add(dd);
		});

		mv.addObject("graph", graph);
		mv.addObject("data", data);

		mv.setViewName("index");
		return mv;
	}
}
