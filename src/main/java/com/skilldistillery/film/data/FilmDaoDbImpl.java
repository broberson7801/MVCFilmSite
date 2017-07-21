package com.skilldistillery.film.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilmDaoDbImpl implements FilmDAO {
	private static String url = "jdbc:mysql://localhost:3306/sdvid";
	private String user = "student";
	private String pass = "student";

	public FilmDaoDbImpl() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.err.println("Error loading MySQL Driver!!!");
		}
	}

	@Override
	public String getFilmTitleById(int id) {
		String title = null;
		try {
			Connection conn = DriverManager.getConnection(url, user, pass);
			String sql = "SELECT title FROM film WHERE id = ?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				title = rs.getString(1);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return title;
	}

	@Override
	public List<String> getFilmByKeyword(String keyword) {

		List<String> titleList = new ArrayList<>();
		keyword = "%".concat(keyword).concat("%");
		try {
			Connection conn = DriverManager.getConnection(url, user, pass);
			String sql = "SELECT title FROM film WHERE  LIKE ?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, keyword);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				String tempTitle = rs.getString(1);
				titleList.add(tempTitle);

			}

			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return titleList;
	}

	@Override
	public List<Film> filmBasedOnActorName(String actorName) {
		List<Film> titleList = new ArrayList<>();
		List<Actor> actorList = new ArrayList<>();
		try {
			Connection conn = DriverManager.getConnection(url, user, pass);
			String sqlFilm = " SELECT id, title, description, release_year, length, rating from film WHERE id IN(SELECT film_id from film_actor WHERE actor_id IN(SELECT id from actor where first_name = ?))";

			PreparedStatement stmtFilm = conn.prepareStatement(sqlFilm);

			stmtFilm.setString(1, actorName);
			ResultSet rsF = stmtFilm.executeQuery();

			while (rsF.next()) {
				Film film = new Film();
				film.setFimlId(rsF.getInt(1));
				film.setTitle(rsF.getString(2));
				film.setDescription(rsF.getString(3));
				film.setReleaseYear(rsF.getInt(4));
				film.setLength(rsF.getDouble(5));
				film.setRating(rsF.getString(6));
				film.setListOfActors(actorList);
				titleList.add(film);
			}

			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return titleList;

	}

	@Override
	public List<Actor> actorBasedOnFilmName(String filmName) {
		List<Film> titleList = new ArrayList<>();
		List<Actor> actorList = new ArrayList<>();
		try {
			Connection conn = DriverManager.getConnection(url, user, pass);
			String sqlActorsInFilm = "SELECT id, first_name, last_name FROM actor WHERE id IN (SELECT actor_id FROM film_actor WHERE film_id IN(SELECT id from film where title = ?))";

			PreparedStatement stmtActors = conn.prepareStatement(sqlActorsInFilm);

			stmtActors.setString(1, filmName);
			ResultSet rsA = stmtActors.executeQuery();
			while (rsA.next()) {

				Actor actor = new Actor();
				actor.setId(rsA.getInt(1));
				actor.setFirstName(rsA.getString(2));
				actor.setLastName(rsA.getString(3));
				actor.setFilmList(titleList);
				System.out.println(actor);
				actorList.add(actor);

			}

			rsA.close();
			stmtActors.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return actorList;
	}
	
	public void addFilm(Film film) {
		
	}

}
