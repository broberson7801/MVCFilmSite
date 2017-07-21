package com.skilldistillery.film.data;

import java.util.ArrayList;
import java.util.List;

public class Film {
	private int fimlId;
	private String title;
	private String description;
	private int releaseYear;
	private double length;
	private String rating;
	private List<Actor> listOfActors;

	public List<Actor> getListOfActors() {
		return new ArrayList<>(listOfActors); // Defensive copy
	}

	public void setListOfActors(List<Actor> listOfActors) {
		this.listOfActors = new ArrayList<>(listOfActors); // Defensive copy
	}

	public Film(int fimlId, String title, String description, int releaseYear, double length, String rating,
			List<Actor> listOfActors) {
		super();
		this.fimlId = fimlId;
		this.title = title;
		this.description = description;
		this.releaseYear = releaseYear;
		this.length = length;
		this.rating = rating;
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

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public Film() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Film [fimlId=" + fimlId + ", title=" + title + ", description=" + description + ", releaseYear="
				+ releaseYear + ", length=" + length + ", rating=" + rating + "]";
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

	public boolean addActor(Actor actor) {
		if (listOfActors == null) {
			listOfActors = new ArrayList<>();
		}
		return listOfActors.add(actor);
	}

	public boolean removeActor(Actor actor) {
		if (listOfActors != null) {
			return listOfActors.remove(actor);

		} else {
			return false;
		}
	}

}
