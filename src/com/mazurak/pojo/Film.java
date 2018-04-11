package com.mazurak.pojo;

public class Film {

	private String name;
	private CinemaHall cinemaHall;
	private Session session;

	public Film(String name, CinemaHall cinemaHall, Session session) {
		this.name = name;
		this.cinemaHall = cinemaHall;
		this.session = session;
	}

	public CinemaHall getCinemaHall() {
		return cinemaHall;
	}

	public void setCinemaHall(CinemaHall cinemaHall) {
		this.cinemaHall = cinemaHall;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Film [name=" + name + ", cinemaHall=" + cinemaHall + ", session=" + session ;
	}
}
