package com.internship.springtest2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.internship.springtest2.dao.MovieDao;
import com.internship.springtest2.vo.MovieVo;

@Service("ms")
public class MovieService {
	
	@Autowired
	private MovieDao movieRepository;
	
	public List<MovieVo> selectMovie(){
		
		List<MovieVo> members = new ArrayList<>(); 
		movieRepository.findAll().forEach(e -> members.add(e));
		// movieRepository.delete(entity);
		return members;
		
	}
	
}
