<!DOCTYPE HTML>
<html>
<head>
    <title>Warehouse 1</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<h3 style="text-align: left;">Добавить новую товар на склад</h3>
<h3><form style="text-align: left;" action="http://localhost:8080/warehouse1/save" method="GET">
    good id =
    <input type="number" name="GoodId" step="1">
    good count =
    <input type="number" name="GoodCount" step="1">
    <input type="submit">
</form></h3>
<h3 style="text-align: left"> Поиск товара на складе по id
    <form action="http://localhost:8080/warehouse1/get/id" method="GET">
        id =
        <input type="number" name="id" step="1">
        <input type="submit">
    </form>
</h3>
<h3 style="text-align: left">  Поиск товара на складе по названию
    <form action="http://localhost:8080/warehouse1/get/name" method="GET">
        name =
        <input type="text" name="name">
        <input type="submit">
    </form>
</h3>
<h3 style="text-align: left;">Вывести все товары со склада 1
    <form action="http://localhost:8080/warehouse1/get/all" method="GET">
        <input type="submit">
    </form>
</h3>

<h3 style="text-align: left;">&nbsp;</h3>
<h3 style="text-align: left;">Удалить товар со склада 1 по Id
    <form action="http://localhost:8080/warehouse1/delete/id" method="GET">
        id =
        <input type="text" name="id" step="1">
        <input type="submit">
    </form>
</h3>
<h3 style="text-align: left;">Удалить все товары со склада 1
    <form action="http://localhost:8080/warehouse1/delete/all" method="GET">
        <input type="submit">
    </form></h3>
<body>
<h1 style="text-align: center;"><a href="http://localhost:8080/">На главную страницу</a></h1>
</body>
</html>