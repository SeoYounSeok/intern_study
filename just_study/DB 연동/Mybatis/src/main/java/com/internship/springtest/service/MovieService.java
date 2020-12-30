package com.internship.springtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.internship.springtest.dao.MovieDao;
import com.internship.springtest.vo.MovieVo;

@Service("ms")
public class MovieService {
	@Autowired
	private MovieDao mapper;
	
	public List<MovieVo> getMovie() throws Exception {
		return mapper.selectMovie();
		
	}
}
