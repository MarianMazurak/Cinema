package com.mazurak.services;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class UserService implements FilmService {

	private Scanner scan = new Scanner(System.in);

	@Override
	public void printServiceMenu() throws FileNotFoundException {

		System.out.println("Enter 1 if you want see all Session in this day ");
		System.out.println("Enter 2 if you want to see all film session");
		System.out.println("Enter 3 to see all list film");
		System.out.println("Enter 4 to close Program");
		boolean run = true;
		while (run) {
			int choise = scan.nextInt();
			switch (choise) {
			case 1: {
			}
				break;
			case 2: {

			}
				break;
			case 3: {
				printAllListFilm();
			}
				break;

			default:
				System.out.println("Incorect enter ");
				break;
			}

		}
	}

	
	
	
	
	public void printAllListFilm() throws FileNotFoundException {
		FileReader fileReader = new FileReader("film.txt");
		scan = new Scanner(fileReader);
		while (scan.hasNextLine()) {
			System.out.println(scan.nextLine());
		}
	}

}
