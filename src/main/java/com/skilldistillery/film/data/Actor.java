package com.skilldistillery.film.data;

import java.util.List;

public class Actor {

	private int id;
	private String firstName;
	private String lastName;
	private List<Film> filmList;
	private List<Integer> filmsPerformed;

	public List<Integer> getFilmsPerformed() {
		return filmsPerformed;
	}

	public void setFilmsPerformed(List<Integer> filmsPerformed) {
		this.filmsPerformed = filmsPerformed;
	}

	public Actor(int id, String firstName, String lastName, List<Film> filmList, List<Integer> filmsPerformed) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.filmList = filmList;
		this.filmsPerformed = filmsPerformed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Film> getFilmList() {
		return filmList;
	}

	public void setFilmList(List<Film> filmList) {
		this.filmList = filmList;
	}

	@Override
	public String toString() {
		return "Actor id: " + id + ", firstName: " + firstName + ", lastName: " + lastName + ", filmList: " + filmList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Actor other = (Actor) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public Actor() {
		super();
		// TODO Auto-generated constructor stub
	}

}
