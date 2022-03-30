<%@page import="java.util.List"%>
<%@page import="blog.model.Post"%>
<%@page import="blog.persistence.PostDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reign Blog</title>

<!--  CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link href="./css/style.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
</head>
<body>
<div class="container">
<h3 class="pb-4 mb-4 fst-italic border-bottom">Posts from French Royalty <i class="fa-solid fa-crown"></i></i></h3>
<%
List<Post> list = (List<Post>) request.getAttribute("list");
for (Post post : list) {%>
	<article class="blog-post">
       <h2 class="blog-post-title"><%=post.getTitle()%></h2>
       <p class="blog-post-meta"><a href="#">@<%=post.getAuthor()%></a><br></p>
       <p><%out.print(post.getText());%> </p>
     </article>
<%}%>
</div>

</body>
</html>

<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>