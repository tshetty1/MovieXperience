package com.movie.controller;
import java.util.List;
import com.movie.model.Moviesearch;
import com.movie.model.Seatselection;
import com.movie.dao.SearchmovieDAO;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.movie.dao.CommonDAO;
import com.movie.dao.GenresearchDAO;
import com.movie.dao.LoginDAO;
import com.movie.dao.SignUpDAO;
import com.movie.dao.TheatersearchzipDAO;
import com.movie.dao.TmoviesearchDAO;
import com.movie.model.Login;
import com.movie.model.Signup;
import com.movie.model.Theatermoviesearch;
@Controller
@SessionAttributes("Theatermoviesearch")
public class HelloController {

	@RequestMapping(value = "/",method= RequestMethod.GET)
	public ModelAndView helloWorld() {

		ModelAndView model = new ModelAndView("Homepage");
		model.addObject("msg","hello world");

		return model;
	}
	
	/*controller for signup page*/
	@RequestMapping(value = "/SignupPage", method= RequestMethod.GET)
	public ModelAndView Signup() {

		ModelAndView model = new ModelAndView("SignupPage");
		model.addObject("msg","hello world");

		return model;
	}
	/*controller for signup success page*/
		@RequestMapping(value = "/SignupSuccesshome", method= RequestMethod.POST)
		public ModelAndView SignupSuccessform(@ModelAttribute("signup1") Signup signup1 ) {

			
			SignUpDAO sd = new SignUpDAO("development");
			sd.insert(signup1);
			
			ModelAndView model = new ModelAndView("homepageaftersignin");
			/*model.addObject("headermessage","hello world");*/

			return model;	
}
		/*Controller for login page*/
		
		@RequestMapping(value = "/Loginpage", method= RequestMethod.GET)
		public ModelAndView Loginpage() {

			ModelAndView model = new ModelAndView("Loginpage");
			/*model.addObject("msg","hello world");*/

			return model;
		}
		/*controller for signup success page*/
		@RequestMapping(value = "/LoginSuccesspage", method= RequestMethod.POST)
		public ModelAndView LoginSuccessform(@ModelAttribute("login") Login login ,HttpSession ses,HttpServletRequest req) {

			ModelAndView model=null;
			ses=req.getSession(true);
			
			LoginDAO log = new LoginDAO("development");
			login = log.selectLogin(login);
			ses.setAttribute("emailId", login.getEmailid());
			if(login!=null){
				
				 model = new ModelAndView("homepageaftersignin");
					model.addObject("headermsg","Login successful");
					
			}
			else
			{
				
				model = new ModelAndView("Loginpage");
				model.addObject("headerMessage","Login details invalid! Please try again");
				
			}
			return model;
			
			
}
		/*controller for Home experience page*/
		@RequestMapping(value="/homeeperience", method = RequestMethod.POST)
		public ModelAndView LoginSuccesspage() {
			
			
			
			ModelAndView model = new ModelAndView("HomeXperience");

			return model;

		}	
		
		@RequestMapping(value = "/Moviesearchresult", method= RequestMethod.GET)
		public ModelAndView searchmovie(HttpServletRequest request) {
			StringBuffer sb= new StringBuffer();
			CommonDAO msd =null;
			String searchString =null;
			String searchmovie = request.getParameter("moviename");
			String searchGenre = request.getParameter("genre");
	
			if(searchmovie!=null && !searchmovie.isEmpty()){
				msd = new SearchmovieDAO("development");
				searchString=searchmovie;
			}
			else if(searchGenre!=null && !searchGenre.isEmpty()){
				
				msd = new GenresearchDAO("development") ;
				searchString=searchGenre;
			}
			
			
			List<Moviesearch> m1 =msd.selectList(searchString);
			/*int count=1;*/
			sb.append("<table>");
			for(Moviesearch m: m1){
				sb.append("<tr>");
					sb.append("<td>Movie :"+ m.getMoviename()+"</td>");
					
					/*sb.append("<td> ") ;
					sb.append("<a href="+"/viewProfile?emailId="+m.getEmailId()+">");
					sb.append(m.getMemberLastName()+", "+m.getmemberFirstName());	*/
					/*sb.append("</a>");*/
					sb.append("<td>");
					sb.append("<a href="+ m.getMovielink()+">"+  "Click here </a>");
					
					sb.append("</td>");
				sb.append("</tr>");
				
				/*count++;*/
			}
			/*count--;*/			
			sb.append("</table>");
			ModelAndView model = new ModelAndView("Moviesearchresult");
			model.addObject("moviesearchmsg",sb.toString());
			return model;
		}
		/*@RequestMapping(value = "/Dropdownmovieresult", method= RequestMethod.GET)
		public ModelAndView Dropdownsearchmovie(HttpServletRequest request) {
			StringBuffer sb= new StringBuffer();
			SearchmovieDAO md = new SearchmovieDAO();
			String searchmovie = request.getParameter("moviename");*/
		
		@RequestMapping(value="/Theaterhomepage", method = RequestMethod.POST)
		public ModelAndView Theaterpageform() {
			
			
			
			ModelAndView model = new ModelAndView("Zipcode");

			return model;

		}	
		
		@RequestMapping(value = "/Theatermoviesearch", method= RequestMethod.GET)
		public ModelAndView Theatermoviesearchform(@ModelAttribute("Tmovie")Theatermoviesearch Tmovie,HttpSession ses,HttpServletRequest req)
		{			
			/*StringBuffer sb= new StringBuffer();*/
			ModelAndView model = new ModelAndView("Tmovielist");
			
			
			
		TmoviesearchDAO tms = new TmoviesearchDAO("development");
		Tmovie.getSearchmovie();
		if("Search_by_movies".equalsIgnoreCase(Tmovie.getSearchmovie()))
		{
		List<Theatermoviesearch> Tmovielist  = tms.selectList(Tmovie);
		
		model.addObject("Tmovielist", tms.selectList(Tmovie));
		
		/*sb.append("<h3> Movies Showing in ZipCode: " + Tmovielist.get(0).getZipcode() + "</h3>");
		sb.append("<table>");
		for(Theatermoviesearch m: Tmovielist){
			sb.append("<tr>");
			sb.append("<td> ");
			sb.append("<a href="+"/Movie/Movietheaterlist?moviename="+ m.getMoviename()+"&zipcode="+ m.getZipcode()+"&Searchmovie="+ Tmovie.getSearchmovie()+"&date="+ m.getDate()+">" +m.getMoviename());
			sb.append("</a>");
			sb.append("</td>");
			sb.append("</tr>");
		}
		sb.append("</table>");*/
		}
		else
		{
			List<Theatermoviesearch> Ttheaterlist  = tms.selectListTh(Tmovie);
			model.addObject("Ttheaterlist", tms.selectListTh(Tmovie));
			/*sb.append("<h3>Theaters in Zipcode:"+Ttheaterlist.get(0).getZipcode()+"</h3>");
			sb.append("<table>");
			for(Theatermoviesearch m: Ttheaterlist){
				sb.append("<tr>");
				sb.append("<td> ");
				sb.append("<a href="+"/Movie/Movietheaterlist?Theatername="+ m.getTheatername()+"&zipcode="+ m.getZipcode()+"&Searchmovie="+ Tmovie.getSearchmovie()+"&date="+ m.getDate()+">" +m.getTheatername());
				sb.append("</a>");
				sb.append("</td>");
				sb.append("</tr>");
			}
			sb.append("</table>");
			}*/
	
			
			/*model.addObject("Tmoviejsp",sb.toString());*/
		}return model;

}
		@RequestMapping(value = "/Movietheaterlist", method= RequestMethod.GET)
		public ModelAndView Movietheaterlistform(@ModelAttribute("Tmovie")Theatermoviesearch Tmovie,HttpSession ses, HttpServletRequest request)
		{	
			ModelAndView model = new ModelAndView("TMtheaterlist");
			/*ses=request.getSession(true);
			ses.setAttribute("movie_id", Tmovie.getMovie_id());
			ses.setAttribute("theater_id", Tmovie.getTheater_id());*/
			TmoviesearchDAO td = new TmoviesearchDAO("development");
			Tmovie.getSearchmovie();
			ses=request.getSession(true);
		
			
			if("Search_by_movies".equalsIgnoreCase((String)request.getParameter("Searchmovie")))
			{
				List<Theatermoviesearch> theatres = td.selectListTheatre(Tmovie);
				ses.setAttribute("movie_id", theatres.get(0).getMovie_id());
				
				ses.setAttribute("Date", theatres.get(0).getDate());
				model.addObject("theatres", td.selectListTheatre(Tmovie));
			}
			else
			{
		
				List<Theatermoviesearch> movies = td.selectListThm(Tmovie);	
				ses.setAttribute("theater_id", movies.get(0).getTheater_id());
				
				ses.setAttribute("Date", movies.get(0).getDate());
				model.addObject("movies", td.selectListThm(Tmovie));
			}
			
			return model;
			
			/*StringBuffer sb= new StringBuffer();
			TmoviesearchDAO td = new TmoviesearchDAO();
			Tmovie.getSearchmovie();
			if("Search_by_movies".equalsIgnoreCase((String)request.getParameter("Searchmovie")))
			{
			
			Tmovie.setMoviename(request.getParameter("moviename"));
			Tmovie.setZipcode(request.getParameter("zipcode"));
			Tmovie.setDate(request.getParameter("date"));
			List<Theatermoviesearch> theatres = td.selectListTheatre(Tmovie);
			sb.append("<table>");
			sb.append("<tr><th><h1>Zipcode:"+theatres.get(0).getZipcode()+"</h1></th></tr>");
			sb.append("<tr>moviename:"+theatres.get(0).getMoviename()+"</tr>");
			sb.append("<tr>date:"+theatres.get(0).getDate()+"</tr>");
			for(Theatermoviesearch m: theatres){
				sb.append("<tr>");
				sb.append("<td> ");
				sb.append("<a href="+"/Movie/TMtheaterlist?Theatername="+ m.getTheatername().replaceAll("\\s+","")+"&zipcode="+ m.getZipcode()+"&moviename="+m.getMoviename()+"&date="+ m.getDate()+">" +m.getTheatername().replaceAll("\\s+",""));
				sb.append("</a>");
				sb.append("</td>");
				sb.append("</tr>");
			}
			sb.append("</table>");
			}
			else
			{
				Tmovie.setTheatername(request.getParameter("Theatername"));
				Tmovie.setZipcode(request.getParameter("zipcode"));
				Tmovie.setDate(request.getParameter("date"));
				List<Theatermoviesearch> theatres = td.selectListThm(Tmovie);
				sb.append("<table>");
				sb.append("<tr><th><h1>Zipcode:"+theatres.get(0).getZipcode()+"</h1></th></tr>");
				sb.append("<tr>Theatername:"+theatres.get(0).getTheatername()+"</tr>");
				sb.append("<tr>date:"+theatres.get(0).getDate()+"</tr>");
				for(Theatermoviesearch m: theatres){
					sb.append("<tr>");
					sb.append("<td> ");
					sb.append("<a href="+"/Movie/TMtheaterlist?moviename="+ m.getMoviename().replaceAll("\\s+","")+"&zipcode="+ m.getZipcode()+"&Theatername="+m.getTheatername().replaceAll("\\s+","")+"&date="+ m.getDate()+">" +m.getMoviename());
					sb.append("</a>");
					sb.append("</td>");
					sb.append("</tr>");
				}
				sb.append("</table>");
				}
			
		ModelAndView model = new ModelAndView("TMtheaterlist");
		model.addObject("TmovieTjsp",sb.toString());
		return model;*/
}


@RequestMapping(value = "/TMtheaterlist", method= RequestMethod.GET)
public ModelAndView TMtheaterlistform(@ModelAttribute("Tmovie")Theatermoviesearch Tmovie, HttpServletRequest req,HttpSession ses)
{			
/*	StringBuffer sb= new StringBuffer();*/
	
	/*Tmovie.setMoviename(req.getParameter("moviename"));
	Tmovie.setZipcode(req.getParameter("zipcode"));
	Tmovie.setDate(req.getParameter("date"));
	Tmovie.setTheatername(req.getParameter("Theatername"));*/
	
	if(req.getParameter("theater_id")!=null)
	{
	ses.setAttribute("theater_id",req.getParameter("theater_id"));
	//ses.setAttribute("movie_id",ses.getAttribute("movie_id"));
	/*ses.setAttribute("movie_id",req.getParameter("movie_id"));*/
	}
	
	else
	{
		ses.setAttribute("movie_id",req.getParameter("movie_id"));
	}
	
	ModelAndView model = new ModelAndView("MovieTheatersummary");
	model.addObject("Tmovie", Tmovie);
	
	return model;
}
@RequestMapping(value="/Seatmap", method = RequestMethod.POST)
public ModelAndView Seatmapform() {
	
	
	
	ModelAndView model = new ModelAndView("Seatmap");

	return model;

}	

@RequestMapping(value="/Seatselection", method = RequestMethod.POST)
public ModelAndView Seatselectionform(@ModelAttribute("seat")Seatselection seat,HttpSession ses,HttpServletRequest req) {
	
	TmoviesearchDAO tms = new TmoviesearchDAO("development");
	ses=req.getSession(true);
	seat.setMovie_id((String)ses.getAttribute("movie_id"));
	seat.setTheater_id((String)ses.getAttribute("theater_id"));
	List<Seatselection> seat1  = tms.selectListseat(seat);
	
	ModelAndView model = new ModelAndView("Seatselection");
	model.addObject("seat1", seat1);
	return model;

}	

@RequestMapping(value="/payment", method = RequestMethod.POST)
public ModelAndView paymentform(@ModelAttribute("seat")Seatselection seat,HttpSession ses,HttpServletRequest req) {
	
	
	
	ses=req.getSession(true);
	
	
	/*ses.getAttribute("theater_id");*/
	
	seat.setDate((String)ses.getAttribute("Date"));
	seat.setEmail_id((String)ses.getAttribute("emailId"));
	seat.setMovie_id((String)ses.getAttribute("movie_id"));
	seat.setTheater_id((String)ses.getAttribute("theater_id"));
	
	seat.setSeats(req.getParameter("seats"));
	TmoviesearchDAO tms = new TmoviesearchDAO("development");
	tms.insert(seat);
	List<Seatselection> cost  = tms.selectListcost(seat);
	ModelAndView model = new ModelAndView("Payment");
	model.addObject("cost", cost.get(0).getCost());
	return model;
	

}	

}
	
	