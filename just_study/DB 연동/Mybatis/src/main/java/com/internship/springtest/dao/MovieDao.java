package com.internship.springtest.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.internship.springtest.vo.MovieVo;

@Mapper
public interface MovieDao {
	public List<MovieVo> selectMovie() throws Exception;
}
