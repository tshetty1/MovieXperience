package com.movie.dao;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.movie.model.Moviesearch;
import com.movie.model.Theatermoviesearch;

public class TheatersearchzipDAO extends CommonDAO{
	public SqlSessionFactory sqlSessionFactory;
	
	public TheatersearchzipDAO(String environment){
		sqlSessionFactory = new MyBatisConnectionFactory(environment).getSqlSessionFactory();
	}

public List<Theatermoviesearch> selectList(Theatermoviesearch Tmoviesearch){
	SqlSession session = sqlSessionFactory.openSession();
	
	try {
		@SuppressWarnings("unchecked")
		List<Theatermoviesearch> list = session.selectList("Theatermovieserach.getAllT",Tmoviesearch);
		return list;
	} finally {
		session.close();
	}
}
/*public List<Theatermoviesearch> selectList(Theatermoviesearch Tmoviesearch){
	SqlSession session = sqlSessionFactory.openSession();
	
	try {
		@SuppressWarnings("unchecked")
		List<Theatermoviesearch> list = session.selectList("Theatermovieserach.getAllM",Tmoviesearch);
		return list;
	} finally {
		session.close();
	}
}*/

@Override
public List<Moviesearch> selectList(String str) {
	// TODO Auto-generated method stub
	return null;
}}
