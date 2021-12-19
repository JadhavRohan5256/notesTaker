<%@ page isErrorPage="false" errorPage="error.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JavaScript Demo</title>
    <link href="css/header.css" rel="stylesheet">
    <link href="css/index.css" rel="stylesheet">
</head>
<body>
    <%@ include file="header.jsp" %>
     <section class="middleSection container">
        <form action="notes" method="post">
            <div class="box">
                <label for="title">Title</label>
                <input type="text" name="title" id="title">
            </div>
            <div class="box">
                <label for="content">Your Content</label>
                <textarea name="content" id="content" placeholder="Write your content...."></textarea>
            </div>
            <div class="box">
                <input type="submit" value="Add" id="submit">
            </div>
        </form>
    </section>
</body>
</html>