<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h2>Ajouter un �tudiant :</h2>
    <form action="etuddd" method="post">
        ID : <input type="text" name="id"><br>
        Nom : <input type="text" name="nom"><br>
        Pr�nom : <input type="text" name="prenom"><br>
        �ge : <input type="number" name="age"><br>
        <input type="submit" value="Ajouter">
    </form>

    <h2>�tudiants existants :</h2>
    <table border="1">
    <thead>
        <tr>
            <th>ID</th>
            <th>Nom</th>
            <th>Pr�nom</th>
            <th>�ge</th>
        </tr>
        </thead>
         <thead>
         <c:ForEach items="${newStudent}" var="etud">
        <tr>
            <td>${etud.id }</td>
            <td>${etud.nom }</td>
            <td>${etud.prenom }</td>
            <td>${etud.age }</td>
             
        </tr>
        </thead>
       
            </c:ForEach>
    </table>
</body>
</html>