package com.movie.dao;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.movie.model.Moviesearch;

public class GenresearchDAO extends CommonDAO{
	public SqlSessionFactory sqlSessionFactory; 
	
	public GenresearchDAO(String environment){
		sqlSessionFactory = new MyBatisConnectionFactory(environment).getSqlSessionFactory();
	}

public List<Moviesearch> selectList(String searchGenre){
	searchGenre = "%"+searchGenre+"%";
	SqlSession session = sqlSessionFactory.openSession();
	
	try {
		@SuppressWarnings("unchecked")
		List<Moviesearch> list = session.selectList("SearchGenre.getgenresearch",searchGenre);
		return list;
	} finally {
		session.close();
	}
}}