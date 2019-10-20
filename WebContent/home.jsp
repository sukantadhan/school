<%@page import="java.util.stream.Collectors"%>
<%@ page import="com.dhan.sukanta.school.utils.*"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>

<div style="margin-top: 20px; height:30px;margin-left: auto; padding-right: 100px;margin-right:auto;"><span style="float:right;"><a href="logout">Logout</a></span></div>
	<div
		style="margin-top: 80px; padding-top:10px; padding-bottom:50px; margin-left: auto; margin-right: auto; background-color: #eee; display: block; width: 500px;">

			<h3 style="padding-left:50px;">Welcome,
			<%
			Cookie cookie = null;
			Cookie[] cookies = null;
			cookies = request.getCookies();
			String username = "username";
			List<Cookie> cookieList = Arrays.stream(cookies).filter(c -> username.equals(c.getName()))
					.collect(Collectors.toList());
			String uname = cookieList.get(0).getValue();
			ProcessUser process = new ProcessUser();
			String name = process.getName(uname);
			//response.getWriter().print(name);
		%>

			<%
				out.print(name);
			%>

		</h3>



		<%
			MarksProcessor markProcessor = new MarksProcessor();
			StudentResult resultObject = markProcessor.getMarks(uname);
			Map<String, Integer> marks = resultObject.getMarks();
			Iterator<String> markKeySet = marks.keySet().iterator();
		%>
		<h4 style="padding-left:50px;">Roll No: <% out.print(resultObject.getRoll()); %></h4>
		<div style="padding-left:50px;">		
		<table  border="1" width="400">

			<%
				while (markKeySet.hasNext()) {
					String subject = markKeySet.next();
			%>
			<tr>
				<td>
					<%
						out.print(subject);
					%>

				</td>
				<td>
					<%
						out.print(marks.get(subject));
					%>
				</td>
			</tr>
			<%
				}
			%>

			<tr>
				<td><b>Total</b></td>
				<td><b>
					<%
						out.print(resultObject.getTotalMark());
					%>
					</b>
				</td>
			</tr>

		</table>
		<br/>
		<span><a href="#">Download Marksheet</a></span>
</div>
	</div>
</body>
</html>