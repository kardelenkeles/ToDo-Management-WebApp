<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
    <head>
        <title>Todos</title>
    </head>
    <body>
    <div>Welcome ${name}</div>
    <hr>
    <h1>Your todos</h1>
    <table>
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
    </body>
</html>