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
	<form action="getTitle.do">
		<input type="text" name="filmId" value="${filmId}"> <input
			type="submit" value="Look Up Film">
	</form>
	<c:choose>
		<c:when test="${filmTitle !=null }">
			<h3>${filmTitle.title }</h3>
		</c:when>
	</c:choose>
	<form action="getTitleByKeyword.do">
		<input type="text" name="searchId" value="${keyword}"> <input
			type="submit" value="Search By Keyword">
	</form>
	<form action="getActorBasedOnFilmName.do">
		<input type="text" name="filmName" value="${filmName}"> <input
			type="submit" value="Get Actors By Film Name">
		<c:choose>
			<c:when test="${actorList != null}">
				<c:forEach items="${actorList}" var="actor">
					<ul>
						<li>${actor.lastName},${actor.firstName}</li>
					</ul>
				</c:forEach>
			</c:when>
		</c:choose>
	</form>
	<c:choose>
		<c:when test="${filmTitleList !=null}">
			<c:forEach items="${filmTitleList}" var="title">
				<ul>
					<li>${title}</li>
				</ul>
				<form action="goToEditForm.do">
					<input type="hidden" name="id" value="${title.filmId }"/>
					<input type="submit"  value="Edit"/>
				</form>
			</c:forEach>
		</c:when>
	</c:choose>
	<form action="getFilmBasedOnActorName.do">
		<input type="text" name="actorName" value="${actorName}"> <input type="submit"
			value="Get Film By Actor First Name">
	</form>
	<c:choose>
		<c:when test="${filmList != null }">
			<c:forEach items="${filmList}" var="actor">
				<ul>
					<li>${actor.title},${actor.description}</li>
				</ul>
			</c:forEach>
		
		</c:when>
	</c:choose>
	<form action="addFilmForm.do">
	<input type="submit" value="Add Or Delete A Film"  /> 
    </form>
    
    
 
</body>
</html>