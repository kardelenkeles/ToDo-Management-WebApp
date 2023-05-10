<%@include file="common/navigation.jspf" %>
<%@include file="common/header.jspf" %>
<body>
<div class="container">
    <h1>Enter Todo Details</h1>
    <form:form method="post" modelAttribute="todo">
        <fieldset class="mb-3">
            <form:label path="desc">Desc:</form:label>
            <form:input type="text" path="desc" required="required"/>
            <form:errors path="desc" cssClass="text-warning"/>
        </fieldset>
        <fieldset class="mb-3">
            <form:label path="targetDate">Target Date:</form:label>
            <form:input type="text" path="targetDate" required="required"/>
            <form:errors path="targetDate" cssClass="text-warning"/>
        </fieldset>
        <form:input type="hidden" path="id"/>
        <form:input type="hidden" path="done"/>
        <input type="submit" class="btn btn-danger"/>
    </form:form>
</div>
<%@include file="common/footer.jspf" %>
<script type="text/javascript">
    $('#targetDate').datepicker({
        format: 'yyyy-mm-dd'
    });
</script>
</body>
</html>