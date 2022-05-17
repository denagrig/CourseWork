<!DOCTYPE HTML>
<html>
<head>
    <title>Sales</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<h3 style="text-align: left;">Добавить новую запись о продажах</h3>
<h3><form style="text-align: left;" action="http://localhost:8080/sales/save" method="GET">
    good id =
    <input type="number" name="goodId" step="1">
    good count =
    <input type="number" name="goodCount" step="1">
    create date =
    <input type="datetime-local" name="createDate" step="0.001">
    <input type="submit">
</form></h3>
<h3 style="text-align: left"> Поиск продаж по названию товара
    <form action="http://localhost:8080/sales/get/name" method="GET">
        name =
        <input type="text" name="name">
        <input type="submit">
    </form>
</h3>
<h3 style="text-align: left"> Поиск продаж по Id товара
    <form action="http://localhost:8080/sales/get/id" method="GET">
        id =
        <input type="number" name="id" step="1">
        <input type="submit">
    </form>
</h3>
<h3 style="text-align: left;">Вывести все записи о продажах
    <form action="http://localhost:8080/sales/get/all" method="GET">
        <input type="submit">
    </form>
</h3>

<h3 style="text-align: left;">&nbsp;</h3>
<h3 style="text-align: left;">Удалить по Id
    <form action="http://localhost:8080/sales/delete/id" method="GET">
        id =
        <input type="text" name="id" step="1">
        <input type="submit">
    </form>
</h3>
<h3 style="text-align: left;">Удалить все продажи
    <form action="http://localhost:8080/sales/delete/all" method="GET">
        <input type="submit">
    </form></h3>
<body>
<h1 style="text-align: center;"><a href="http://localhost:8080/">На главную страницу</a></h1>
</body>
</html>