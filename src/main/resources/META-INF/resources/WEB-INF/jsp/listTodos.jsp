<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
    <title>List Todos Page</title>
</head>
<body>
<div class="container">
    <h1>Your todos</h1>
    <table class="table">
        <thead>
        <tr>
            <th>id</th>
            <th>Description</th>
            <th>Target Date</th>
            <th>Is Done?</th>
        </tr>
        </thead>
        <c:forEach items="${todos}" var="todo">
            <tr>
                <th>${todo.id}</th>
                <th>${todo.desc}</th>
                <th>${todo.targetDate}</th>
                <th>${todo.done}</th>
            </tr>
        </c:forEach>
    </table>
    <a href="add-todo" class="btn btn-success">Add ToDo</a>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</div>
</body>
</html>