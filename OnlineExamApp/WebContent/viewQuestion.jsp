<%@page import="com.lti.model.Option"%>
<%@page import="java.util.List"%>
<%@page import="com.lti.model.Question"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "AnswerCheckServlet">
<%
	Question nextQuestion = (Question)session.getAttribute("nextQs");
%>
<h2>Q. <%= nextQuestion.getQuestion() %></h2>
<%
	int opNo = 0;
	List<Option> ops = nextQuestion.getOptions();
	for(Option op: ops){
%>
	<input type = "radio" name = "op" value = "<%= opNo++ %>" /> <%= op.getOption() %><br />
<%
	}
%>
<br/>
<button type = "submit">Next Question</button>
</form>
<!--<a href = "QuestionLoaderServlet">Next Question</a>-->
</body>
</html>