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
Release Year   
    <select name="releaseYear">
   <% for(int i = 1986; i<=2017; i++){%>
   
    	<option>		<%=i %> </option>
    <%}%>
    </select><br>
Language ID
<select name="languageId">
	<% for(int i = 1; i<=6; i++){%>
   
    	<option>		<%=i %> </option>
    <%}%>

</select><br>
Rental Duration<input type ="text" name="rentalDuration"><br>
Rental Rate<input type ="text"name="rentalRate"><br>
Length<input type ="text" name="length"><br>
Replacement Cost<input type ="text"name="replacementCost"><br>
Rating
<select name="rating">
   
    	<option>	G</option>
    	<option>	PG</option>
    	<option>	NC17</option>
    	<option>	PG13</option>
    	<option>	R</option>

</select><br>

Special Features<br><br>
<input TYPE=checkbox name= "specialFeatures" VALUE="Behind the Scenes"> Behind the Scenes <BR>
<input TYPE=checkbox name="specialFeatures" VALUE="Deleted Scenes"> Deleted Scenes <BR>
<input TYPE=checkbox name="specialFeatures" VALUE="Trailers"> Trailers <BR>
<input TYPE=checkbox name="specialFeatures" VALUE="Commentaries"> Commentaries <BR><br>
<input type="submit" value="SUBMIT FILM!">
</form>
<div id="film-added">
	<c:choose>
		<c:when test="${! empty film}">
		<h2>Film Successfully Added</h2>
			<p>${film.filmId}, ${film.title}, ${film.description}, ${film.releaseYear} ${film.languageId}, ${film.rentalDuration},
				${film.rentalRate}, ${film.length}, ${film.replacementCost}, ${film.rating}, ${film.specialFeatures} </p>
		</c:when>
	</c:choose>
</div>
<div id="film-deleted">
<h1>DELETE A FILM</h1>
<h3>Enter The ID Of The Film To Be Deleted</h3>
<form action ="deleteFilm.do">
<input type="text" name="filmId">
<input type="submit" value="DELETE">
</form>
</div>
<h1>UPDATE A FILM</h1>
<div>
<h3>Enter The ID Of The Film To Be Updated</h3>
<form action="updateFilm.do">
<input type="text" name ="film">
</form>
</div>

</body>
</html>