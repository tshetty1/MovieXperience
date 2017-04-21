package com.movie.dao;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.movie.model.Login;
import com.movie.model.Moviesearch;
import com.movie.model.Seatselection;
import com.movie.model.Signup;
import com.movie.model.Theatermoviesearch;

public class TmoviesearchDAO extends CommonDAO{
	public SqlSessionFactory sqlSessionFactory;
	
	public TmoviesearchDAO(String environment){
		sqlSessionFactory = new MyBatisConnectionFactory(environment).getSqlSessionFactory();
	}

public List<Theatermoviesearch> selectList(Theatermoviesearch Tmoviesearch){
	SqlSession session = sqlSessionFactory.openSession();
	
	try {
		@SuppressWarnings("unchecked")
		List<Theatermoviesearch> list = session.selectList("Theatermovieserach.getAllMM",Tmoviesearch);
		/*List<Theatermoviesearch> list1 = session.selectList("Theatermovieserach.getAllMMM",Tmoviesearch);*/
		return list;
	} finally {
		session.close();
	}
}

public List<Theatermoviesearch> selectListTheatre(Theatermoviesearch Tmoviesearch){
	SqlSession session = sqlSessionFactory.openSession();
	
	try {
		@SuppressWarnings("unchecked")
		List<Theatermoviesearch> list = session.selectList("Theatermovieserach.getAllMT",Tmoviesearch);
		return list;
	} finally {
		session.close();
	}
}
public List<Theatermoviesearch> selectListTh(Theatermoviesearch Tmoviesearch){
	SqlSession session = sqlSessionFactory.openSession();
	
	try {
		@SuppressWarnings("unchecked")
		List<Theatermoviesearch> list = session.selectList("Theatermovieserach.getAllT",Tmoviesearch);
		return list;
	} finally {
		session.close();
	}
}

public List<Theatermoviesearch> selectListThm(Theatermoviesearch Tmoviesearch){
	SqlSession session = sqlSessionFactory.openSession();
	
	try {
		@SuppressWarnings("unchecked")
		List<Theatermoviesearch> list = session.selectList("Theatermovieserach.getAllM",Tmoviesearch);
		return list;
	} finally {
		session.close();
	}
}

/*seat selection based on seat availability*/

public List<Seatselection> selectListseat(Seatselection seat){
	SqlSession session = sqlSessionFactory.openSession();
	
	try {
		@SuppressWarnings("unchecked")
		List<Seatselection> list = session.selectList("Seatselection.getAllS",seat);
		return list;
	} finally {
		session.close();
	}
}

/*seat selectionDAO*/
public void insert(Seatselection seat){
	SqlSession session = sqlSessionFactory.openSession();
	
	try {
		/*@SuppressWarnings("unchecked")*/
		String[] seatNo = seat.getSeats().split(",");
		
		for(String seats: seatNo){
			
			seat.setSeats(seats.replace("'", ""));
			session.insert("Seatselection.insert", seat);
			
		}
		
		/*session.insert("Seatselection.insert", seat);*/
		
		
		
		/*List<Theatermoviesearch> list = session.selectList("Theatermovieserach.",Tmoviesearch);*/
		session.commit();
		/*return list;*/
		
	} finally {
		session.close();
	}
}

/*display cost*/
public List<Seatselection> selectListcost(Seatselection seat){
	SqlSession session = sqlSessionFactory.openSession();
	
	try {
		@SuppressWarnings("unchecked")
		List<Seatselection> list = session.selectList("Seatselection.getAllC",seat);
		return list;
	} finally {
		session.close();
	}
}


@Override
public List<Moviesearch> selectList(String str) {
	// TODO Auto-generated method stub
	return null;
}

}

