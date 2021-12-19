<%@page import="com.notesInserting.Notes"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page isErrorPage="false" errorPage="error.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JavaScript Demo</title>
    <link href="css/header.css" rel="stylesheet">
    <link href="css/showNotes.css" rel="stylesheet">
</head>
<body>
    <%@ include file="header.jsp" %>
     <section class="container">
		<% 
		  List<Notes> lists = (ArrayList) request.getAttribute("list");
		if(lists != null){
		  for(Notes list:lists) {
		%>
            <div class="box" >
                <div class="img">
		       <a href='<%="update?noteId=" + list.getNoteId() %>'>
                    <img src="https://cdn-icons-png.flaticon.com/512/3075/3075908.png" alt="png" >
		       </a>
                </div>
                <div class="top">
                    <div class="title">
                        <h3><%=list.getTitle() %></h3>
                    </div>
                    <div class="icon">
                        <a href='<%="delete?noteId=" + list.getNoteId() %>'>delete</a>
                    </div>
                </div>
                <div class="content">
                    <p><%=(list.getContent().length() >60)?list.getContent().substring(0,60)+"....":list.getContent() %></p>
                </div>
                <div class="date"><p><%=list.getAddedDate().toLocaleString() %><p></div>
            </div>
            <%
		            }
			}
			else{
			%>
			<h1 style="text-align:center;">No Data</h1>
			<%	
			}
	  		%>
			
            
    </section>
    <script type="js/search.js"></script>
    <script type="js/jquery.js"></script>
</body>
</html>