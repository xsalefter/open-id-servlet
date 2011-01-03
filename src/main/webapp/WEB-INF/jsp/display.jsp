<%@include file="/resources/jsp-include/header.jsp" %>

    <h3>Login Result:</h3>
    <table>
        <tr><td>Full Name</td><td>:</td><td>${authentication.fullname}</td></tr>
        <tr><td>Identity</td><td>:</td><td>${authentication.identity}</td></tr>
        <tr><td>Email</td><td>:</td><td>${authentication.email}</td></tr>
        <tr><td>Gender</td><td>:</td><td>${authentication.gender}</td></tr>
        <tr><td>First Name</td><td>:</td><td>${authentication.firstname}</td></tr>
        <tr><td>Last Name</td><td>:</td><td>${authentication.lastname}</td></tr>
    </table>

<%@include file="/resources/jsp-include/footer.jsp" %>