package com.skilldistillery.film.data;

import java.util.List;

public class Film {

	private Integer filmId;
	private String title;
	private String description;
	private Integer releaseYear;
	private Integer languageId;
	private Integer rentalDuration;;
	private Double rentalRate;
	private Double length;
	private Double replacementCost;
	private String rating;
	private String specialFeatures;
	private List<Actor> listOfActors;

	public Film() {
		super();
	}

	public Film(Integer filmId, String title, String description, Integer releaseYear, Integer languageId, Integer rentalDuration,
			Double rentalRate, Double length, Double replacementCost, String rating, String specialFeatures) {
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

	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public Integer getFilmId() {
		return filmId;
	}

	public void setFimlId(Integer fimlId) {
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

	public Integer getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}

	public Integer getLanguageId() {
		return languageId;
	}

	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}

	public Integer getRentalDuration() {
		return rentalDuration;
	}

	public void setRentalDuration(Integer rentalDuration) {
		this.rentalDuration = rentalDuration;
	}

	public Double getRentalRate() {
		return rentalRate;
	}

	public void setRentalRate(Double rentalRate) {
		this.rentalRate = rentalRate;
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
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
				+ releaseYear + ", languageId: " + languageId + ", rentalDuration: " + rentalDuration + ", rentalRate: "
				+ rentalRate + ", length: " + length + ", replacementCost: " + replacementCost + ", rating: " + rating
				+ ", specialFeatures: " + specialFeatures + ", listOfActors: " + listOfActors;
	}

}