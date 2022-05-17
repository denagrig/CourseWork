<!DOCTYPE HTML>
<html>
<head>
    <title>Goods</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<h1 style="font-size: 1pt;">&nbsp;</h1>
<h1 style="font-size:50px; text-align: center;">Goods</h1>
<p style="font-size: 2pt;">&nbsp;</p>
<h3 style="text-align: left;">Добавить новый товар</h3>
<h3><form style="text-align: left;" action="http://localhost:8080/goods/save" method="GET">
    Название =
    <input type="text" name="GoodsName">
    Очередность =
    <input type="number" name="Priority" step="0.1">
    <input type="submit">
</form></h3>
<p style="text-align: left">&nbsp;</p>
<h3 style="text-align: left"> Поиск товара по названию
    <form action="http://localhost:8080/goods/get/name" method="GET">
        name =
        <input type="text" name="name">
        <input type="submit">
    </form>
</h3>

<h3 style="text-align: left;">Вывести все товары
    <form action="http://localhost:8080/goods/get/all" method="GET">
        <input type="submit">
    </form>
</h3>

<h3 style="text-align: left;">Вывести все товары и отсортировать по очередности
    <form action="http://localhost:8080/goods/get/priority" method="GET">
        <input type="submit">
    </form>
</h3>

<h3 style="text-align: left;">&nbsp;</h3>
<h3 style="text-align: left;">Удалить по Id
    <form action="http://localhost:8080/goods/delete/id" method="GET">
        id =
        <input type="text" name="id" step="1">
        <input type="submit">
    </form>
</h3>
<h3 style="text-align: left;">Удалить все товары
    <form action="http://localhost:8080/goods/delete/all" method="GET">
        <input type="submit">
    </form></h3>
<body>
<h1 style="text-align: center;"><a href="http://localhost:8080/">На главную страницу</a></h1>
</body>
</html>