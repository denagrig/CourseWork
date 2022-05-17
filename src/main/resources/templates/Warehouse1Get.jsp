<html>
<head>
    <title>Warehouse 1</title>
</head>
<body>
<!--/*@thymesVar id="list" type="java.util.List<MyProject.entities.GoodsEntity>"*/-->
<p>&nbsp;</p>
<p>&nbsp;</p>
<h2 style="font-size:50px; text-align: center;"> Goods table </h2>

<div style="text-align: center;">
    <table border="1" style="font-size:30px; display: inline-block;" class = "table table-striped">
        <colgroup>
            <col span="1" style="background:#7cb61c"><!-- С помощью этой конструкции задаем цвет фона для первых двух столбцов таблицы-->
            <col style="background-color:#ffd300">
            <col style="background-color:#ffd300"><!-- Задаем цвет фона для следующего (одного) столбца таблицы-->
        </colgroup>
        <tr>
            <th>Id</th>
            <th>Good_Id</th>
            <th>Good_Count</th>
        </tr>

        <tr th:each="warehouse1 : ${list}">
            <td th:text="${warehouse1.getId}"></td>
            <td th:text="${warehouse1.getGoodId}"></td>
            <td th:text="${warehouse1.getGoodCount}"></td>
        </tr>
    </table>
</div>
</body>
<h1 style="text-align: center;"><a href="http://localhost:8080/sales/">Обратно к Warehouse 1</a></h1>
<h1 style="text-align: center;"><a href="http://localhost:8080/">На главную страницу</a></h1>
</html>