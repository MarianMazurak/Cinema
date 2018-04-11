package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mazurak.services.AdminService;
import com.mazurak.services.FilmService;
import com.mazurak.services.UserService;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);

		List<Person> list = new ArrayList<>();
		Person p = new Person("Igor", new Pet("cat"));
		list.add(p);
		System.out.println(list);

		String name = scan.next();
		if (name.equals(p.getPet().getPetNAme())) {
			list.remove(p);
		}

		System.out.println(list);
		printMenu();

		int choise = scan.nextInt();
		FilmService filmService = returnService(choise);
		filmService.printServiceMenu();
	}

	private static void printMenu() {
		System.out.println("Enter 1 if you Admin");
		System.out.println("Enter 2 if you User");
		System.out.println("\nPlease make you choise");
	}

	private static FilmService returnService(int choise) {

		if (choise == 1) {
			System.out.println("You are Admin\n");
			return new AdminService();
		} else if (choise == 2) {
			System.out.println("You are User");
			return new UserService();
		} else
			System.out.println("Yoe Enter incorrect number");
		
		return null;
	}

}
