<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
	<META http-equiv=content-type content=text/html;charset=iso-8859-9>
	<META http-equiv=content-type content=text/html;charset=windows-1254>
	<META http-equiv=content-type content=text/html;charset=x-mac-turkish>

  <title>Adres Defteri</title>
  
 <link rel="stylesheet" type="text/css" 
 		href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>

<div id="wrapper">
	<div id="header">
		<h2>Adres Defteri</h2>
	</div>
</div>

<div id="container">
	<div id="content">
	
		<input type="button" value="Kişi Ekle" 
				onclick="window.location.href='kisiEklemeFormu'; return false;"
				class="add-button"
			/>
		
		
		<table>
		
			<tr>
				<th>İsim</th>
				<th>Soyisim</th>
				<th>Adres</th>
				<th>Email</th>
				<th>Telefon</th>
				<th>Güncelle / Sil</th>
			</tr>
			
		<c:forEach var="kisiler" items="${kisiler}">
		
		<c:url var="guncelleLink" value="/guncellemeFormuGoster">
			<c:param name="kisiId" value="${kisiler.id}"></c:param>
		</c:url>
		
		<c:url var="silLink" value="/sil">
			<c:param name="kisiId" value="${kisiler.id}"></c:param>
		</c:url>
   	<tr>
      <td>${kisiler.isim}</td>
      <td>${kisiler.soyisim}</td>
      <td>${kisiler.adres}</td>
      <td>${kisiler.email}</td>
      <td>${kisiler.telefon}</td>
      <td>
      	<a href="${guncelleLink}">Güncelle</a>
      	|
      	<a href="${silLink}"
      		onclick="if(!(confirm('Silmek istediğinize emin misiniz?'))) return false">Sil</a>
      </td>
      
      
    </tr>
   	</c:forEach>		
		</table>
	</div>
</div>

</body>
</html>