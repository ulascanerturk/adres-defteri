<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

	<title>Kişi Ekle</title>
	
	<link type="text/css" rel="stylesheet"
			href="${pageContext.request.contextPath}/resources/css/style.css">
			
	<link type="text/css" rel="stylesheet"
			href="${pageContext.request.contextPath}/resources/css/kisi-ekle.css">
</head>

<body>
	<div id="wrapper">
		<div id="header">
			<h2>Adres Defteri</h2>
		</div>
	</div>
	
	<div id="container">
		<h3>Kişi Ekle</h3>
		
		<form:form action="kisiKaydet" modelAttribute="kisiler" method="POST">
		
		<form:hidden path="id"/>
			
			<table>
				<tbody>
					<tr>
						<td><label>İsim:</label></td>
						<td><form:input path="isim"/></td>
					</tr>
					
					<tr>
						<td><label>Soyisim:</label></td>
						<td><form:input path="soyisim"/></td>
					</tr>
					
					<tr>
						<td><label>Adres:</label></td>
						<td><form:input path="adres"/></td>
					</tr>
					
					<tr>
						<td><label>Email:</label></td>
						<td><form:input path="email"/></td>
					</tr>
					
					<tr>
						<td><label>Telefon:</label></td>
						<td><form:input path="telefon"/></td>
					</tr>
					
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Kaydet" class="save"></td>
					</tr>
				</tbody>
			</table>
			
		</form:form>
		<div style="clear; both;"></div>
		<p>
			<a href="${pageContext.request.contextPath}/">Geri</a>
		</p>
	</div>
</body>

</html>