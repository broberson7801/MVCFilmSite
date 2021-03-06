package com.skilldistillery.film.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.film.data.Actor;
import com.skilldistillery.film.data.Film;
import com.skilldistillery.film.data.FilmDAO;

@Controller
public class FilmController {

	@Autowired
	private FilmDAO dao;

	@RequestMapping(path = "home.do")
	public ModelAndView home() {
		return new ModelAndView("WEB-INF/views/home.jsp");
	}

	@RequestMapping(path = "getTitle.do")
	public ModelAndView getFilmTitleById(@RequestParam(name = "filmId") Integer filmId) {
		String viewName = "WEB-INF/views/home.jsp";
		ModelAndView mv = new ModelAndView(viewName);
		Film title = dao.getFilmTitleById(filmId);
		mv.addObject("filmTitle", title);
		mv.addObject("filmId", filmId);
		return mv;
	}

	@RequestMapping(path = "getTitleByKeyword.do")
	public ModelAndView getFilmByKeyword(@RequestParam(name = "searchId") String keyword) {
		String viewName = "WEB-INF/views/home.jsp";
		ModelAndView mv = new ModelAndView(viewName);
		List<Film> titleList = dao.getFilmByKeyword(keyword);
		mv.addObject("keyword", keyword);
		mv.addObject("filmTitleList", titleList);
		return mv;

	}

	@RequestMapping(path = "getActorBasedOnFilmName.do")
	public ModelAndView getActorBasedOnFilmName(@RequestParam(name = "filmName") String filmName) {
		String viewName = "WEB-INF/views/home.jsp";
		ModelAndView mv = new ModelAndView(viewName);
		List<Actor> actorList = dao.actorBasedOnFilmName(filmName);
		mv.addObject("actorList", actorList);
		return mv;

	}
	
	@RequestMapping(path="getFilmBasedOnActorName.do")
	public ModelAndView getFilmBasedOnActorName(@RequestParam(name="actorName") String actorName) {
		String viewName = "WEB-INF/views/home.jsp";
		ModelAndView mv = new ModelAndView(viewName);
		List<Film> filmList = dao.filmBasedOnActorName(actorName);
		mv.addObject("filmList", filmList);		
		return mv;
	}
	@RequestMapping(path="addFilm.do")
	public ModelAndView addFilm(Film film ) {
		String viewName = "WEB-INF/views/AddFilm.jsp";
		ModelAndView mv = new ModelAndView(viewName);
		
			
		dao.addFilm(film);
		mv.addObject("film", film);
		mv.addObject("id", film.getFilmId());
		return mv;
	}
	@RequestMapping(path="addFilmForm.do")
	public ModelAndView addFilmForm() {
		String viewName = "WEB-INF/views/AddFilm.jsp";
		ModelAndView mv = new ModelAndView(viewName);
		return mv;
	}
	
	@RequestMapping(path="deleteFilm")
	public ModelAndView deleteFilm(Integer filmId) {
		String viewName = "WEB-INF/views/AddFilm.jsp";
		dao.deleteFilm(filmId);
		ModelAndView mv = new ModelAndView(viewName);
		return mv;
	}
	
	
	@RequestMapping(path="goToEditForm.do")
	public ModelAndView goToEditForm(@RequestParam(name="id") int id) {
		String viewName = "WEB-INF/views/AddFilm.jsp";
		ModelAndView mv = new ModelAndView(viewName);
		Film film = dao.getFilmTitleById(id);
		mv.addObject("edit", film);
		
		return mv;
	}
	
	@RequestMapping(path="updateFilm.do")
	public ModelAndView updateFilm(Film film) {
		System.out.println("In Update Film in Controller");
		String viewName="WEB-INF/views/AddFilm.jsp";
		ModelAndView mv = new ModelAndView(viewName);
		dao.updateFilm(film);
		mv.addObject("filmUpdate", film);
		return mv;
	}

}
