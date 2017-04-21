package com.movie.dao;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.movie.model.Moviesearch;

public class SearchmovieDAO extends CommonDAO{
	public SqlSessionFactory sqlSessionFactory;
	
	public  SearchmovieDAO(String environment){
		sqlSessionFactory = new MyBatisConnectionFactory(environment).getSqlSessionFactory();
	}

public List<Moviesearch> selectList(String searchmovie){
	searchmovie = "%"+searchmovie+"%";
	SqlSession session = sqlSessionFactory.openSession();
	
	try {
		@SuppressWarnings("unchecked")
		List<Moviesearch> list = session.selectList("Searchmovie.getmoviesearch",searchmovie);
		return list;
	} finally {
		session.close();
	}
}
}