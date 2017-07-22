<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>ADD A FILM</h1><br>
<form action="addFilm.do">
Title<input type ="text" name="title"><br>
Description<input type ="text" name="description"><br>
Release Year<input type ="text"name="releaseYear"><br>
Language ID<input type ="text" name="languageId"><br>
Rental Duration<input type ="text" name="rentalDuration"><br>
Rental Rate<input type ="text"name="rentalRate"><br>
Length<input type ="text" name="length"><br>
Replacement Cost<input type ="text"name="replacementCost"><br>
Rating<input type ="text" name="rating"><br>
Special Features<input type ="text" name="specialFeatures"><br>
<input type="submit" value="SUBMIT FILM!">
</form>
<div id="film_added">
	<c:choose>
		<c:when test="${! empty film}">
		<div>
		<h2>Film Successfully Added</h2>
			<p>${film.title}, ${film.description}, ${film.releaseYear} ${film.languageId}, ${film.rentalDuration},
				${film.rentalRate}, ${film.length}, ${film.replacementCost}, ${film.rating}, ${film.specialFeatures} </p>
		</div>
		</c:when>
	</c:choose>
</div>
</body>
</html>