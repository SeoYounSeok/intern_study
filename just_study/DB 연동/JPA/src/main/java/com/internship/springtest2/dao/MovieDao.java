package com.internship.springtest2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.internship.springtest2.vo.MovieVo;

@Repository
public interface MovieDao extends JpaRepository<MovieVo, Long>{
	public List<MovieVo> findAll();
//	public List<MovieVo> findBymovie_id(String id);
//	public List<MovieVo> findBymovie_name(String name);
//	public List<MovieVo> findBydirector(String director);
//	public List<MovieVo> findBytypes(String types);

	
}
