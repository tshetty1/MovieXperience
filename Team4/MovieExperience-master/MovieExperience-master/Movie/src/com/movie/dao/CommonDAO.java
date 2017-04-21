package com.movie.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;


import com.movie.model.Moviesearch;

public abstract class CommonDAO {
	private SqlSessionFactory sqlSessionFactory;
	public CommonDAO(){
		sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
	}
	
	public abstract List<Moviesearch> selectList(String str);

}
