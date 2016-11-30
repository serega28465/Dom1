package core.java7;

import static core.java7.Rating.*;
import static core.java7.Gender.*;
import static core.java7.Faculty.*;

public enum Politeh {
	PAVLO(18,IKNI,A,MALE), OLENA(20,PRAVO,C,FEMALE), MIHAILO(21,IKNI,B,MALE),
	PETRO(19,ACHITECTURA,B,MALE), NATALYA(21,ACHITECTURA,C,FEMALE), MARIA(17,ACHITECTURA,A,FEMALE),
	VOLODIMIR(22,IKNI,B,MALE), VALERIJ(18,IKNI,E,MALE), OLEXANDR(21,GEODESIA,A,MALE),
	OLEKSIJ(18,GEODESIA,B,MALE), IRINA(19,PRAVO,A,FEMALE), ANDRIJ(18,PRAVO,C,MALE),
	AHMED(19,ECONOMIKA,D,MALE),SEIDAMET(20,ECONOMIKA,C,MALE), IGOR(21,PRAVO,D,MALE),
	SERGII(17,PRAVO,B,MALE), IVAN(18,IKNI,E,MALE);
	
	
	private final int age;
	
	private Faculty faculty;
	
	private Rating rating;
	
	private Gender gender;

	private Politeh(int age, Faculty faculty, Rating rating, Gender gender) {
		this.age = age;
		this.faculty = faculty;
		this.rating = rating;
		this.gender = gender;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	
	
	
}
