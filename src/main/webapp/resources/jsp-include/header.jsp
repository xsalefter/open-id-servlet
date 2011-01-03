<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Welcome to Open ID Application</title>
    <link rel="stylesheet" href="<c:url value='/resources/css/global.css' />" type="text/css"></link>
    <script type="text/javascript" src="<c:url value='/resources/js/global.js' />"></script>
</head>

<body>
    <h1>Open ID Application</h1>
    <span>
        <a href="<c:url value='/home' />">Home</a> &nbsp;
        <a href="<c:url value='/choose?providerId=google' />">Google Login</a> &nbsp;
        <a href="<c:url value='/choose?providerId=yahoo!' />">Yahoo! Login</a> &nbsp;
    </span>