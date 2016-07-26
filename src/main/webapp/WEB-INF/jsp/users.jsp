<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<table class="table table-bordered table-hover table-striped">

<thead>
	<tr>
		<th>user name</th>
	</tr>
</thead>
<tbody>
	<c:forEach items="${usersWoW}" var="userWoW">
		<tr>
			<td>${userWoW.name}</td>
		</tr>
	</c:forEach>
</tbody>

</table>