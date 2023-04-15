<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Генерация таблиц</title>
</head>
<body>
<form action='hello-servlet' method='post'>
  <h1>Генерация таблиц</h1>
  <p>Название таблицы: <input type='text' name='header' size='20'/></p>
  <p>Кол-во строк: <input type='text' name='rows' size='20'/></p>
  <p>Кол-во таблиц: <input type='text' name='columns' size='20'/></p>
  <p>Введить цвет: <input type='text' name='color' size='20'/></p>
  <input type='submit' value='Создать'/>
</form>
</body>
</html>