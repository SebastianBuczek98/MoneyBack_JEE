<%--
  Created by IntelliJ IDEA.
  User: Sebastian
  Date: 16.03.2020
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <style>
      table, th, td {
        border: 1px solid black;
      }
    </style>
  </head>
  <body>
    <h1>MoneyBack App</h1>
    <form action="http://localhost:8080/MoneyBackBase_war_exploded//Data">
      <table>
        <tr>
          <th>NAME</th>
          <th>MONEY SPENT</th>
        </tr>
        <tr>
          <td><input type="text" id="name0" name="name0"></td>
          <td><input type="text" id="moneySpent0" name="moneySpent0"></td>
        </tr>
        <tr>
          <td><input type="text" id="name1" name="name1"></td>
          <td><input type="text" id="moneySpent1" name="moneySpent1"></td>
        </tr>
        <tr>
          <td><input type="text" id="name2" name="name2"></td>
          <td><input type="text" id="moneySpent2" name="moneySpent2"></td>
        </tr>
        <tr>
          <td><input type="text" id="name3" name="name3"></td>
          <td><input type="text" id="moneySpent3" name="moneySpent3"></td>
        </tr>
      </table>
      <input type="submit" value="Go" />
    </form>
  </body>
</html>
