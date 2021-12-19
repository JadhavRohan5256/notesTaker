<%@page import="com.notesInserting.Notes"%>
<%@page import="org.hibernate.query.Query"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.helper.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/header.css" rel="stylesheet">
<link href="css/update.css" rel="stylesheet">
<style>
	
</style>
</head>
<body>
	<%@include file="header.jsp" %>
	<section class="middleSection container">
        <form action="updateSave" method="post">
        <%
        	int noteId = (Integer)request.getAttribute("noteId");
        	Session s = Connection.getFactory().openSession();
        	Query query = s.createQuery("from Notes where noteId =:id");
        	query.setParameter("id",noteId);
        	Notes result = (Notes)query.uniqueResult();
        	
        %>
        	<input type="hidden" name="noteId" value="<%=result.getNoteId() %>" /disable>
            <div class="box">
                <label for="title">Title</label>
                <input type="text" name="title" id="title" value="<%=result.getTitle() %>">
            </div>
            <div class="box">
                <label for="content">Your Content</label>
                <textarea name="content" id="content" placeholder="Write your content...."><%=result.getContent() %></textarea>
            </div>
            <div class="btn">
            	<div class="save">
               		<input type="submit" value="Save" id="submit">
            	</div>
	            <div class="icon">
	               <a href='<%="delete?noteId=" + result.getNoteId() %>'>delete</a>
	            </div>
            </div>
        </form>
    </section>
</body>
</html>