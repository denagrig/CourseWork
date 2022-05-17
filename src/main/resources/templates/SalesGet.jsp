<html>
<head>
    <title>Sales</title>
</head>
<body>
<!--/*@thymesVar id="list" type="java.util.List<MyProject.entities.GoodsEntity>"*/-->
<p>&nbsp;</p>
<p>&nbsp;</p>
<h2 style="font-size:50px; text-align: center;"> Goods table </h2>

<div style="text-align: center;">
    <table border="1" style="font-size:30px; display: inline-block;" class = "table table-striped">
        <colgroup>
            <col span="1" style="background:#7cb61c">
            <col style="background-color:#ffd300">
            <col style="background-color:#ffd300">
            <col style="background-color:#ffd300">
        </colgroup>
        <tr>
            <th>Id</th>
            <th>Good_Id</th>
            <th>Good_Count</th>
            <th>Create_Date</th>
        </tr>

        <tr th:each="sales : ${list}">
            <td th:text="${sales.getId}"></td>
            <td th:text="${sales.getGoodId}"></td>
            <td th:text="${sales.getGoodCount}"></td>
            <td th:text="${sales.getCreateDate}"></td>
        </tr>
    </table>
</div>
</body>
<h1 style="text-align: center;"><a href="http://localhost:8080/sales/">Обратно к Sales</a></h1>
<h1 style="text-align: center;"><a href="http://localhost:8080/">На главную страницу</a></h1>
</html>