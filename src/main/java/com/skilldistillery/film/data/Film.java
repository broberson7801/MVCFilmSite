package com.skilldistillery.film.data;

import java.util.Calendar;
import java.util.List;

public class Film {
	
	private int filmId;
	private String title;
	private String description;
	//private int releaseYear calendar.set(Calendar.YEAR);
	private int releaseYear = Calendar.YEAR;
	private int languageId;
	private int rentalDuration;
	private double rentalRate;
	private double length;
	private double replacementCost;
	private String rating;
	private String specialFeatures;
	private List<Actor> listOfActors;
	public Film() {
		super();
	}

	public Film(int filmId, String title, String description, int releaseYear, int languageId, int rentalDuration,
			double rentalRate, double length, double replacementCost, String rating, String specialFeatures) {
		super();
		this.filmId = filmId;
		this.title = title;
		this.description = description;
		this.releaseYear = releaseYear;
		this.languageId = languageId;
		this.rentalDuration = rentalDuration;
		this.rentalRate = rentalRate;
		this.length = length;
		this.replacementCost = replacementCost;
		this.rating = rating;
		this.specialFeatures = specialFeatures;

	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public int getFilmId() {
		return filmId;
	}

	public void setFimlId(int fimlId) {
		this.filmId = fimlId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public int getLanguageId() {
		return languageId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}

	public int getRentalDuration() {
		return rentalDuration;
	}

	public void setRentalDuration(int rentalDuration) {
		this.rentalDuration = rentalDuration;
	}

	public double getRentalRate() {
		return rentalRate;
	}

	public void setRentalRate(double rentalRate) {
		this.rentalRate = rentalRate;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getReplacementCost() {
		return replacementCost;
	}

	public void setReplacementCost(double replacementCost) {
		this.replacementCost = replacementCost;
	}

	public String getSpecialFeatures() {
		return specialFeatures;
	}

	public void setSpecialFeatures(String specialFeatures) {
		this.specialFeatures = specialFeatures;
	}

	public List<Actor> getListOfActors() {
		return listOfActors;
	}

	public void setListOfActors(List<Actor> listOfActors) {
		this.listOfActors = listOfActors;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + filmId;
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
		Film other = (Film) obj;
		if (filmId != other.filmId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Film filmId: " + filmId + ", title: " + title + ", description: " + description + ", releaseYear: "
				+ releaseYear + ", languageId: " + languageId + ", rentalDuration: " + rentalDuration
				+ ", rentalRate: " + rentalRate + ", length: " + length + ", replacementCost: " + replacementCost
				+ ", rating: " + rating + ", specialFeatures: " + specialFeatures + ", listOfActors: " + listOfActors;
	}

}