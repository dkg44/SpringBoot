<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ViewCustomer</title>
</head>
<body>
<%-- This is JSP comment 
<h1> View Customer Details</h1>
<h2> Details as submitted as follows: </h2>
<h4> Customer ID : ${cid} </h4>
<h4> Customer Name : ${cname} </h4>
<h4> Customer Email : ${cemail} </h4>
--%>
<h1> View Customer Details</h1>
<h2> Details as submitted as follows: </h2>
<form action="getdetails" method ="post">
<input type="number" name="cid">
<input type="submit" value="submit">

</body>
</html>