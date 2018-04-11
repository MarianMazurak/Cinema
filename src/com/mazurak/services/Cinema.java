package com.mazurak.services;

import java.util.ArrayList;
import java.util.List;

import com.mazurak.pojo.Film;

public class Cinema {

	private List<Film> listOfFilm;
	private Film film;

	public Cinema() {
		this.listOfFilm = new ArrayList<>();
		this.film = film;
	}
	

	public Film getFilm() {
		return film;
	}


	public void setFilm(Film film) {
		this.film = film;
	}


	public List<Film> getListOfFilm() {
		return listOfFilm;
	}

	public void setListOfFilm(List<Film> listOfFilm) {
		this.listOfFilm = listOfFilm;
	}

	@Override
	public String toString() {
		return "Cinema [listOfFilm=" + listOfFilm + "]";
	}

}
