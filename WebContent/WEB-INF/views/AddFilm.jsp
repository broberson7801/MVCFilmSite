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

<c:if test="${edit != null }">

<h1>EDIT A FILM</h1><br>
<form action="updateFilm.do">
Film ID: <input type="hidden" name="filmId" value="${edit.filmId}">${edit.filmId}<br>
Title: <input type="text" name="title" value="${edit.title}"><br>
Description<input type ="text" name="description" value="${edit.description}"><br>
Release Year<input type="text" name="releaseYear" value="${edit.releaseYear}"><br>
Language ID<input type="text" name="languageId" value="${edit.languageId}"><br>
Rental Duration<input type ="text" name="rentalDuration" value="${edit.rentalDuration}"><br>
Rental Rate<input type ="text"name="rentalRate" value="${edit.rentalRate}"><br>
Length<input type ="text" name="length" value="${edit.length}"><br>
Replacement Cost<input type ="text" name="replacementCost" value="${edit.replacementCost}"><br>
Rating
<select name="rating" value="${edit.rating}">
   
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

<input type="submit" value="EDIT FILM!">

</form>
</c:if>
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
</body>
</html>