<%@include file="common/navigation.jspf" %>
<%@include file="common/header.jspf"%>
<html>
<head>
    <title>List Todos Page</title>
</head>
<body>
<div class="container">
    <h1>Your todos</h1>
    <table class="table">
        <thead>
        <tr>
            <th>Description</th>
            <th>Target Date</th>
            <th>Is Done?</th>
            <th></th>
            <th></th>
        </tr>
        </thead>
        <c:forEach items="${todos}" var="todo">
            <tr>
                <th>${todo.desc}</th>
                <th>${todo.targetDate}</th>
                <th>${todo.done}</th>
                <th><a href="delete-todo?id=${todo.id}" class="btn btn-danger">Delete</a></th>
                <th><a href="update-todo?id=${todo.id}" class="btn btn-success">Update</a></th>
            </tr>
        </c:forEach>
    </table>
    <a href="add-todo" class="btn btn-info">Add ToDo</a>
</div>
</body>
<%@include file="common/footer.jspf" %>
</html>