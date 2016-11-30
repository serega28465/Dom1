package core.java7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Politeh[] politeh = Politeh.values();

		System.out.println("Оберіть критерій пошуку студентів:");
		System.out.println("Ім'я 1");
		System.out.println("Вік 2");
		System.out.println("Факультет 3");
		System.out.println("Рейтинг 4");
		System.out.println("Стать 5");
		System.out.println("Для виходу натисніть 0");

		switch (sc.next()) {

		case "1": {
			for (int i = 0; i < politeh.length; i++) {
				System.out.println(politeh[i]);
				break;
			}
			
				
			
			}
		case "2": {
			for (int i = 0; i < politeh.length; i++) {
				System.out.println(politeh[i].getAge());
			}
			break;
			//int ord = month.ordinal();
			//System.out.println(Month.values()[ord].name());
		}	
			
		case"3":{
			for (int i = 0; i < politeh.length; i++) {
				System.out.println(Faculty.values()[i]);
			}
			
			break;
			
		}
		
		case"4":{
			for (int i = 0; i < politeh.length; i++) {
				System.out.println(Rating.values()[i]);
			}
			break;
		}
		case"5":{
			for (int i = 0; i < politeh.length; i++) {
				System.out.println(Gender.values()[i]);
			}
			break;
		}
		
		case "0":{
			System.exit(0);
		}
		default:{
			System.exit(0);
		}
		}

	}

}
