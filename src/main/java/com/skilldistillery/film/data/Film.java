package com.skilldistillery.film.data;

import java.util.List;

public class Film {
	private int fimlId;
	private String title;
	private String description;
	private int releaseYear;
	private int languageId;
	private int rentalDuration;
	private double rental_rate;
	private double length;
	private double replacementCost;
	private List<String> specialFeatures;

	public enum Rating {
		PG, G, NC17, PG13, R
	};

	private List<Actor> listOfActors;

	public Film() {
		super();
	}

	public Film(int fimlId, String title, String description, int releaseYear, int languageId, int rentalDuration,
			double rental_rate, double length, double replacementCost, List<String> specialFeatures,
			List<Actor> listOfActors) {
		super();
		this.fimlId = fimlId;
		this.title = title;
		this.description = description;
		this.releaseYear = releaseYear;
		this.languageId = languageId;
		this.rentalDuration = rentalDuration;
		this.rental_rate = rental_rate;
		this.length = length;
		this.replacementCost = replacementCost;
		this.specialFeatures = specialFeatures;
		this.listOfActors = listOfActors;
	}

	public int getFimlId() {
		return fimlId;
	}

	public void setFimlId(int fimlId) {
		this.fimlId = fimlId;
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

	public double getRental_rate() {
		return rental_rate;
	}

	public void setRental_rate(double rental_rate) {
		this.rental_rate = rental_rate;
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

	public List<String> getSpecialFeatures() {
		return specialFeatures;
	}

	public void setSpecialFeatures(List<String> specialFeatures) {
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
		result = prime * result + fimlId;
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
		if (fimlId != other.fimlId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Film fimlId: " + fimlId + ", title: " + title + ", description: " + description + ", releaseYear: "
				+ releaseYear + ", languageId: " + languageId + ", rentalDuration: " + rentalDuration + ", rental_rate: "
				+ rental_rate + ", length: " + length + ", replacementCost: " + replacementCost + ", specialFeatures: "
				+ specialFeatures + ", listOfActors: " + listOfActors;
	}
	
	

}