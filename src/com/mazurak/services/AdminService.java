package com.mazurak.services;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mazurak.pojo.CinemaHall;
import com.mazurak.pojo.Film;
import com.mazurak.pojo.Session;

public class AdminService implements FilmService {

	private Cinema cinema;
	private CinemaHall cinemaHall;
	private Film film;
	Scanner scan = new Scanner(System.in);

	public AdminService() {
		this.cinema = new Cinema();
	}
	//
	// public void createFilm(Cinema cinema, Film film) {
	// cinema.getListOfFilm().add(film);
	//
	// }

	public void printServiceMenu() throws IOException  {
		System.out.println("Enter 1 if you want add Film and in which Hall this Film will be act, and Session");
		System.out.println("Enter 2 if you want to remove Film from cinema");
		System.out.println("Enter 3 to see all list film");
		System.out.println("Enter 4 to close Program");

		boolean run = true;
		int choise = scan.nextInt();
		while (run) {

			switch (choise) {
			case 1: {
				createNewFilm();
				choise = scan.nextInt();

			}
				break;

			case 2: {
				removeFilmFromCinema();
				choise = scan.nextInt();

			}
				break;
			case 3: {
				seeListOfFilm();
				choise = scan.nextInt();
			}
				break;
			case 4: {
				System.exit(0);
			}

			default:
				System.out.println("Wrong Enter");
				break;
			}

		}
	}

	public void createNewFilm() throws IOException {
		System.out.println("Enter name of Film , and Hall number and date and time ");
		String nameOfFilm = scan.next();
		cinemaHall = new CinemaHall(scan.nextInt());
		LocalDate date = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());
		LocalTime time = LocalTime.of(scan.nextInt(), scan.nextInt());
		LocalDateTime localDateTime = LocalDateTime.of(date, time);
		System.out.println("You add film : " + nameOfFilm + " in Hall Number " + cinemaHall.getHallNum() + " Date "
				+ localDateTime);
		List<LocalDateTime> localDateTimes = new ArrayList<>();
		localDateTimes.add(localDateTime);
		Session session = new Session(localDateTimes);
		Film film = new Film(nameOfFilm, cinemaHall, session);
		cinema.getListOfFilm().add(film);
		// createFilm(cinema, film);
		System.out.println(cinema);
		System.out.println("Enter Please next step");
		FileWriter fileWriter = new FileWriter("film.txt");
		fileWriter.write(cinema.toString());
		fileWriter.close();

	}

	public void removeFilmFromCinema() {
		System.out.println("Please enter name of film which you want to remove");
		System.out.println(cinema.getListOfFilm());
		System.out.println(cinema.getFilm().getName());
		// String filmName = scan.next();

		// cinema.getListOfFilm().remove(film.);

		// String nameOfFilm = scan.next();

		// if (nameOfFilm.equals(film.getName())) {
		// System.out.println("You remove Film" + film.getName());
		// // cinema.getListOfFilm().remove(0);
		// System.out.println("Enter Please next step");
		// } else {
		// System.out.println("This film doesnt exist");
		// System.out.println("Enter Please next step");
		// }

	}

	public void seeListOfFilm() {
		System.out.println(cinema.getListOfFilm() + " /n");
		System.out.println("Enter next step");
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

}
